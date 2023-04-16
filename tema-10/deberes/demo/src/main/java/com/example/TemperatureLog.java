package com.example;

import java.time.LocalDate;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "temperature_log")
@XmlType(propOrder = { "date", "tempMax", "tempMin" })
@XmlAccessorType(XmlAccessType.FIELD)
public class TemperatureLog {

    private static int c;
    static {
        c = 1;
    }
    @XmlAttribute(name = "id", required = true)
    private int id;
    @XmlElement(name = "fecha")
    private LocalDate date;
    @XmlElement(name = "temperatura_maxima")
    private int tempMax;
    @XmlElement(name = "temperatura_minima")
    private int tempMin;

    public TemperatureLog() {
    }

    public TemperatureLog(String date, int tempMax, int tempMin) {
        this.date = LocalDate.parse(date);
        this.tempMax = tempMax;
        this.tempMin = tempMin;
        this.id = c++;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }

    @Override
    protected TemperatureLog clone() {
        return new TemperatureLog(String.valueOf(this.date), this.tempMax, this.tempMin);
    }

    @Override
    public String toString() {
        return "Fecha de Alta: " + this.date + " - temperatura maxima: " + tempMax
                + " - temperatura minima: " + this.tempMin;
    }
}
