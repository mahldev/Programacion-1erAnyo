package examen.repaso;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class BancoTest {

    @Nested
    class Correctos {

        Banco banco;
        Cliente c;

        @BeforeEach
        public void setUp() {
            banco = new Banco(10);
            c = new Cliente("123", null, null, 0);

        }

        @Test
        public void altaClienteTest() {
            assertTrue(banco.getNumElementos() == 0);
            assertTrue(banco.altaCliente(c));
            assertTrue(banco.getNumElementos() == 1);
        }

        @Test
        public void bajaClienteTest() {
            banco.altaCliente(c);
            assertTrue(banco.getNumElementos() == 1);
            assertTrue(banco.bajaCliente(c));
            assertTrue(banco.getNumElementos() == 0);
        }
    }

    @Nested
    class Incorrectos {

        Banco banco;
        Cliente c;

        @BeforeEach
        public void setUp() {
            banco = new Banco(10);
            c = new Cliente("123", null, null, 0);

        }

        @Test
        public void altaClienteTest() {
            banco.altaCliente(c);
            assertFalse(banco.altaCliente(c));
        }

        @Test
        public void bajaClienteTest() {
            assertFalse(banco.bajaCliente(c));
            assert
        }
    }
}
