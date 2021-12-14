package contamagicamethodbymethod;

import contamagica.CategoriaContaMagica;
import contamagica.ContaMagica;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContaMagicaDepositaTest {

    ContaMagica conta;

    @BeforeEach
    public void setUp() throws Exception {
         conta = new ContaMagica("ContaDoLeo");
    }

    @Test
    void testeGetSaldoAntesDeposito(){
        Assertions.assertEquals(0, conta.getSaldo());
    }

    @Test
    void testeGetSaldoDepoisDeposito() throws Exception {
        conta.deposito(100);
        conta.deposito(12.50);
        assertEquals(112.50, conta.getSaldo());
    }

    @Test
    void testeGetSaldoDepoisDeposia1() throws Exception {
        conta.deposito(1);
        assertEquals(1, conta.getSaldo());
        assertEquals(CategoriaContaMagica.SILVER, conta.getStatus());
    }

    /**LANÇANDO EXCEPTION COM LAMBDA*/
    @Test
    void testeGetSaldoDepoisDepositoNegativo() throws Exception {
        Assertions.assertThrows(Exception.class, () -> conta.deposito(-10));
    }

    @Test
    void testeGetStatusDepositoSilverPass() throws Exception {
        conta.deposito(49999);
        Assertions.assertEquals(CategoriaContaMagica.SILVER, conta.getStatus());
    }

    @Test
    void testeGetStatusDepositoGoldPass() throws Exception {
        conta.deposito(50000);
        Assertions.assertEquals(CategoriaContaMagica.GOLD, conta.getStatus());
    }

    @Test
    void testeGetStatusDepositoGoldLimitPass() throws Exception {
        conta.deposito(199999);
        //FICA GOLD POIS E NÃO RECEBE PORCENTAGEM EXTRA POR DEPÓSITO POIS QUANDO REALIZOU O DEPÓSITO O MESMO ERA SILVER
        Assertions.assertEquals(CategoriaContaMagica.GOLD, conta.getStatus());
    }

    @Test
    void testeGetStatusDepositoPlatinumPass() throws Exception {
        conta.deposito(200000);
        //VIRA PLATINUM POIS O CLIENTE RECEBE O BONUS DE 1% QUE ULTRAPASSA ENTÃO OS 200000
        Assertions.assertEquals(CategoriaContaMagica.PLATINUM, conta.getStatus());
    }

    @Test
    void testeGetSaldoDepositoSilverPass() throws Exception {
        conta.deposito(49999);
        Assertions.assertEquals(49999, conta.getSaldo());
    }

    @Test
    void testeGetSaldoDepositoGoldPass() throws Exception {
        conta.deposito(49999);
        conta.deposito(1000);
        conta.deposito(1000);
        Assertions.assertEquals(52009, conta.getSaldo());
    }


    @Test
    void testeGetSaldoDepositoPlatinumPass() throws Exception {
        conta.deposito(199000);
        conta.deposito(2000);
        Assertions.assertEquals(201020, conta.getSaldo());
        //assertEquals(contamagica.CategoriaContaMagica.PLATINUM.getCategoria(), conta.getStatus());
    }

}
