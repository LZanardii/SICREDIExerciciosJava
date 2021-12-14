package contamagicamethodbymethod;

import contamagica.CategoriaContaMagica;
import contamagica.ContaMagica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ContaMagicaRetiradaTest {

    ContaMagica conta;

    @BeforeEach
    public void setUp() throws Exception {
        conta = new ContaMagica("ContaDoLeo");
        conta.deposito(10000);
    }

    @Test
    void retiraZero(){
        conta.retirada(0);
        assertEquals(10000, conta.getSaldo());
    }

    @Test
    void retiraNegativo(){
        conta.retirada(-20);
        assertEquals(10000, conta.getSaldo());
    }

    @Test
    void retiraMaisQueSaldo(){
        conta.retirada(10001);
        assertEquals(10000, conta.getSaldo());
    }

    @Test
    void retiraTotalSaldo(){
        conta.retirada(10000);
        assertEquals(0, conta.getSaldo());
    }

    @Test
    void retiraToValorAleatorio(){
        conta.retirada(1500);
        assertEquals(8500, conta.getSaldo());
    }

    @Test
    void statusRetirandoNegativo(){
        conta.retirada(-20);
        assertEquals(CategoriaContaMagica.SILVER, conta.getStatus());
    }

    @Test
    void statusBaixandoStatusParaGold() throws Exception {
        conta.deposito(200000);
        conta.retirada(200000);
        assertEquals(CategoriaContaMagica.GOLD, conta.getStatus());
    }

    @Test
    void statusBaixandoStatusParaSilver() throws Exception {
        conta.deposito(200000);
        conta.retirada(200000);
        conta.retirada(1);
        assertEquals(CategoriaContaMagica.SILVER, conta.getStatus());
    }



}
