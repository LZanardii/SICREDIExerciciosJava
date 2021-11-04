public class main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("TESTE 1 CLASSE RICA");
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");
        Rica rica = new Rica("Marcio", 32, 5000);
        rica.fazCompras("patinete", 200);
        rica.fazCompras("televisao", 4800);
        rica.imprimeBens();
        rica.fazCompras("Sofá", 1200);
        System.out.println(rica.exibeDados());
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");

        System.out.println();
        System.out.println("TESTE 2 CLASSE POBRE");
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");
        Pobre pobre = new Pobre("Maick", 19, 200, "Desenvolvedor");
        System.out.println(pobre.exibeDados());
        pobre.trabalha(10, 100);
        System.out.println(pobre.exibeDados());
        pobre.trabalha(2, 200);
        System.out.println(pobre.exibeDados());
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");

        System.out.println();
        System.out.println("TESTE 3 CLASSE NORMAL");
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");
        Normal normal = new Normal(100);
        normal.imprimeIngNormal();
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");

        System.out.println();
        System.out.println("TESTE 4 CLASSE CAMAROTE INFERIOR");
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");
        CamaroteInferior ci = new CamaroteInferior(100,50, "Inferior sub_3");
        ci.imprimeLocalIng();
        System.out.println("O valor total do ingresso com o adicional é: R$ " + ci.getvlrTotalIngVIP());
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");

        System.out.println();
        System.out.println("TESTE 5 CLASSE CAMAROTE SUPERIOR");
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");
        CamaroteSuperior cs = new CamaroteSuperior(100,50, 25);
        System.out.println("O valor total do ingresso com os dois adicionais é: R$ " + cs.getVltFinalIngCS());
        System.out.println("O valor inicial do ingresso é: R$ " + cs.getVlrReais());
        System.out.println("O valor do primeiro adicional financeiro é: R$ " + (cs.getvlrTotalIngVIP() - cs.getVlrReais()));
        System.out.println("O valor do segundo adicional financeio é: R$ " + (cs.getVltFinalIngCS() - cs.getvlrTotalIngVIP()));
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");

        System.out.println();
        System.out.println("TESTE 6 CLASSE ANIMAL E SUAS SUBCLASSES");
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");
        System.out.println("\n" + "Teste DOG");
        Cachorro cachorro = new Cachorro("Faísca", "Salsichinha");
        cachorro.late();
        cachorro.come();
        cachorro.caminha();
        System.out.println("A raça do cachorro é: " + cachorro.getRaca());
        System.out.println("\n" + "Testes CAT");
        Gato gato = new Gato("Bills", "Gato pelado");
        gato.mia();
        gato.come();
        gato.caminha();
        System.out.println("A raça do gato é: " + gato.getRaca());
        System.out.println("=-=-=--=-=-=-=--=-=-=-=--=-=-=-=-=-=-=--=-=-=-=-=-");



    }
}
