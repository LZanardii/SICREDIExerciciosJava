import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParquimetroTest {

    private Parquimetro parq;

    @BeforeEach
    public void setUp() throws Exception {
        parq = new Parquimetro();
        parq.insereMoeda(100);
    }

    @Test
   void testInsereMoeda() {
        parq.insereMoeda(1);
        parq.insereMoeda(5);
        parq.insereMoeda(10);
        parq.insereMoeda(25);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        assertEquals(291, parq.getSaldo());
    }

    @Test
    void testGetSaldo() {
        int actual = parq.getSaldo();
        assertEquals(100, actual);
    }

    @Test
    void testEmiteTicket() {
        parq.insereMoeda(50);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        boolean actual = parq.emiteTicket();
        assertTrue(actual);
    }

    @Test
    void testDevolve() {
        parq.insereMoeda(50);
        parq.insereMoeda(50);
        parq.insereMoeda(100);
        parq.emiteTicket();
        int actual = parq.devolve();
        assertEquals(100, actual);
    }
}
