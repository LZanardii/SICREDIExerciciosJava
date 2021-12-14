package contamagicamethodbymethod;

import contamagica.CategoriaContaMagica;
import contamagica.ContaMagica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContaMagicaTest {

    ContaMagica conta1;

    @BeforeEach
    public void setUp() throws Exception {
        conta1 = new ContaMagica("Conta-1");
        conta1.deposito(10000);
    }

    @Test
    void conta1Test() throws Exception {
        conta1.deposito(15000);
        assertEquals(25000, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.SILVER, conta1.getStatus());

        conta1.deposito(25000);
        assertEquals(50000, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.GOLD, conta1.getStatus());

        conta1.deposito(15000);
        assertEquals(65150, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.GOLD, conta1.getStatus());

        conta1.deposito(140000);
        assertEquals(206550, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.PLATINUM, conta1.getStatus());

        conta1.deposito(5000);
        assertEquals(211675, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.PLATINUM, conta1.getStatus());

        conta1.retirada(200000);
        assertEquals(11675, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.GOLD, conta1.getStatus());

        conta1.retirada(200000);
        assertEquals(11675, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.GOLD, conta1.getStatus());

        conta1.deposito(1000);
        assertEquals(12675, conta1.getSaldo());
        assertEquals(CategoriaContaMagica.SILVER, conta1.getStatus());


    }


}
