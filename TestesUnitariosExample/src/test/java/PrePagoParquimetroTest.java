import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class PrePagoParquimetroTest {

    PrePagoParquimetro prePagoParquimetro;

    private Parquimetro mock;

    @BeforeEach
    public void setUp(){
        mock = mock(Parquimetro.class);
        prePagoParquimetro = new PrePagoParquimetro(mock);
    }

    @Test
    void testaDepositoPrePagoValorCorreto(){
        prePagoParquimetro.depositaCredito(20);
        prePagoParquimetro.depositaCredito(20);
        assertEquals(40, prePagoParquimetro.getCredito());
    }

    @Test
    void testaDepositoPrePagoValorNegativo(){
        assertThrows(IllegalArgumentException.class, () -> prePagoParquimetro.depositaCredito(-20));
    }


    @Test
    void testaDepositoPrePagoValorNaoMultiploDeDez(){
        assertThrows(IllegalArgumentException.class, () -> prePagoParquimetro.depositaCredito(12));
    }

    @Test
    void testaPagaTicketTrue() {
        prePagoParquimetro.depositaCredito(200);
        when(mock.emiteTicket()).thenReturn(true);
        assertEquals(prePagoParquimetro.pagaTicket(), true);
        assertEquals(198, prePagoParquimetro.getCredito());

    }

    @Test
    void testaPagaTicketException(){
        assertThrows(IllegalArgumentException.class, () -> prePagoParquimetro.pagaTicket());
    }

}

