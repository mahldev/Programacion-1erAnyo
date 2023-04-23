package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ListaClientesTest {

    @Nested
    class SinFallos {

        ListaClientes lc;
        Cliente c;

        @BeforeEach
        public void setUp() {
            c = new Cliente("name", "123");
            lc = new ListaClientes(10);
            lc.agregarCliente(c);
        }

        @Test
        public void agregarClienteTest() {
            assertTrue(lc.agregarCliente(new Cliente(null, null)));
        }

        @Test
        public void esClienteTest() {
            assertEquals(0, lc.esCliente(c));
        }

        @Test
        public void eliminarClienteTest() {
            Cliente[] clientes = new Cliente[lc.getNumElementos()];
            Cliente c2 = new Cliente("name1", "321");
            lc.agregarCliente(c2);
            clientes = lc.listaClientes();
            assertTrue(clientes[0].equals(c));
            assertTrue(lc.eliminarCliente(c));
            clientes = lc.listaClientes();
            assertTrue(clientes[0].equals(c2));
        }

        @Test
        public void listaClienteTest() {
            assertEquals(Cliente[].class, lc.listaClientes().getClass());
        }

        @Test
        public void modificarClienteTest() {
            assertEquals(c, lc.modificarCliente(c));
        }
    }

    @Nested
    class ConFallos {

        ListaClientes lc;
        Cliente c;

        @BeforeEach
        public void setUp() {
            c = new Cliente("name", "123");
            lc = new ListaClientes(10);
            lc.agregarCliente(c);
        }

        @Test
        public void agregarClienteTest() {
            assertFalse(lc.agregarCliente(c));
        }

        @Test
        public void esClienteTest() {
            assertNotEquals(1, lc.esCliente(c));
        }

        @Test
        public void eliminarClienteTest() {
            assertFalse(lc.eliminarCliente(new Cliente(null, null)));
        }

        @Test
        public void listaClienteTest() {
            lc.eliminarCliente(c);
            assertEquals(null, lc.listaClientes());
        }

        @Test
        public void modificarClienteTest() {
            assertEquals(null, lc.modificarCliente(new Cliente(null, null)));
        }
    }
}
