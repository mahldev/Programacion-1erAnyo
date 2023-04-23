package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static int menu() {
        String[] menu = {
                "Añadir nuevo cliente",
                "Modificar datos",
                "Dar de bajo cliente",
                "Listar los clientes",
                "Salir"
        };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        return sc.nextInt();
    }

    public static Cliente crearCliente() {
        String nombre, numero;

        sc.nextLine();
        System.out.println("Introduzca el nombre");
        nombre = sc.nextLine();
        System.out.println("Introduzca el telefono");
        numero = sc.nextLine();
        return new Cliente(nombre, numero);
    }

    public static void main(String[] args) {

        int option;
        Cliente c;
        Cliente[] clientes;
        ListaClientes lc;
        final String RUTA_GUARDADO = "database.dat";
        String aux;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(RUTA_GUARDADO))) {
            Cliente.setContadorId(in.readInt());
            lc = (ListaClientes) in.readObject();
        } catch (Exception e) {
            lc = new ListaClientes(20);
            System.out.println(e);
        }
        do {
            switch (option = menu()) {
                case 1 -> {
                    System.out.println(lc.agregarCliente(crearCliente())
                            ? "\nSe ha creado correctamente"
                            : "\nNo se ha completado la operacion");
                }
                case 2 -> {
                    System.out.println("\nIntroduzca los datos del cliente a modificar");
                    c = lc.modificarCliente(crearCliente());
                    Cliente.setContadorId(Cliente.getContadorId() - 1);
                    if (c != null) {
                        System.out.print("Introduca el nuevo nombre: ");
                        c.setNombre(sc.nextLine());
                        do {
                            System.out.print("Intruzca el nuevo telefono: ");
                            aux = sc.nextLine();
                        } while (aux.equals(c.getTelefono()));
                    }
                }
                case 3 -> {
                    System.out.println("\nIntrduzca los datos del cliente a dar de baja");
                    System.out.println(lc.eliminarCliente(crearCliente())
                            ? "\nSe ha eliminado correctamente"
                            : "\nNo se ha completado la operacion");
                }
                case 4 -> {
                    for (Cliente listaClientes : lc.listaClientes()) {
                        System.out.println(listaClientes);
                    }
                }
                default -> {
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(RUTA_GUARDADO))) {
                        out.writeInt(Cliente.getContadorId());
                        out.writeObject(lc);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        } while (option <= 4);
    }
}
