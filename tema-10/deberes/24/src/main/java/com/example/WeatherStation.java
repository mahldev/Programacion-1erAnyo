package com.example;

import java.io.FileWriter;
import javax.xml.bind.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "estacion")
@XmlType(propOrder = { "temperatureLogs" })
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherStation {

    @XmlElementWrapper(name = "registros")
    @XmlElement(name = "registro")
    private TemperatureLog[] temperatureLogs;
    @XmlTransient
    private int numberOfLogs;

    public WeatherStation() {
    }

    public WeatherStation(int quantity) {
        temperatureLogs = new TemperatureLog[quantity];
        numberOfLogs = 0;
    }

    public int getNumberOfLogs() {
        return numberOfLogs;
    }

    public boolean addTemperatureLog(TemperatureLog log) {
        if (temperatureLogs.length == numberOfLogs)
            return false;
        temperatureLogs[numberOfLogs++] = log;
        return true;
    }

    public TemperatureLog[] giveAllTemperatureLogs() {
        if (numberOfLogs > 0) {
            TemperatureLog[] newTemperatureLogs = new TemperatureLog[numberOfLogs];
            for (int index = 0; index < numberOfLogs; index++) {
                newTemperatureLogs[index] = temperatureLogs[index].clone();
            }
            return newTemperatureLogs;
        }
        return null;
    }

    public static boolean saveLogs(WeatherStation ws, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(WeatherStation.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(ws, new FileWriter(path));
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
