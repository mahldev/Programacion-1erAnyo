package com.example;

import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static int menu() {
        String[] menu = {
                "Registrar nueva temperatura",
                "Mostrar historial de registro",
                "Salir"
        };
        for (int index = 0; index < menu.length; index++) {
            System.out.println((index + 1) + ". " + menu[index]);
        }
        System.out.print(": ");
        return sc.nextInt();
    }

    private static TemperatureLog newTemperatureLog() {
        String date;
        int tempMax, tempMin;
        sc.nextLine();
        System.out.print("Introduzca los datos correspondiente" +
                "\nfecha: ");
        date = sc.nextLine();
        System.out.print("temperatura maxima: ");
        tempMax = sc.nextInt();
        System.out.print("temperatura minima: ");
        tempMin = sc.nextInt();
        return new TemperatureLog(date, tempMax, tempMin);
    }

    private static void showLogs(TemperatureLog[] logs) {
        for (TemperatureLog temperatureLog : logs) {
            System.out.println(temperatureLog);
        }
    }

    public static void main(String[] args) throws Exception {

        WeatherStation ws = new WeatherStation(10);
        int option = 0;

        while (option < 3) {
            switch ((option = menu())) {
                case 1 -> {
                    System.out.println(ws.addTemperatureLog(newTemperatureLog())
                            ? "Se ha registrado correctamente"
                            : "No se ha compleado el registro");
                }
                case 2 -> {
                    if (ws.getNumberOfLogs() > 0)
                        showLogs(ws.giveAllTemperatureLogs());
                }
                case 3 -> {
                    WeatherStation.saveLogs(ws, "temperaturas.xml");
                }
            }
        }
    }
}
