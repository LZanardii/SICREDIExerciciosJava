public class ElevadorTeste {
    public static void main(String[] args) {

        Elevador el = new Elevador(5,4);

        //testando metodo entra
        System.out.println("TESTE 1");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        el.entraPessoa();
        System.out.println("Pessoas presentes: " + el.getPessoaPresentes());
        el.entraPessoa();
        System.out.println("Pessoas presentes: " + el.getPessoaPresentes());
        el.entraPessoa();
        System.out.println("Pessoas presentes: " + el.getPessoaPresentes());
        el.entraPessoa();
        System.out.println("Pessoas presentes: " + el.getPessoaPresentes());
        el.entraPessoa();
        System.out.println("Pessoas presentes: " + el.getPessoaPresentes());
        el.entraPessoa();
        System.out.println("Pessoas presentes: " + el.getPessoaPresentes());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println();
        //testando metodo sai
        System.out.println("TESTE 2");
        int contador = el.getCapacidadeElevador();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        while (contador >= 0){
            System.out.println("Pessoas presentes antes de sair: " + el.getPessoaPresentes());
            el.saiPessoa();
            System.out.println("Pessoas presentes depois de sair: " + el.getPessoaPresentes());
            contador--;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }


        System.out.println();
        //testando metodo sobe
        System.out.println("TESTE 3");
        int contador2 = 0;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        while (contador2 <= el.getTotalAndares()){
            System.out.println("Andar antes de subir: " + el.getAndarAtual());
            el.sobe();
            System.out.println("Andar depois de subir: " + el.getAndarAtual());
            contador2++;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }


        System.out.println();
        //testando metodo sobe
        System.out.println("TESTE 4");
        int contador3 = el.getTotalAndares();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        while (contador3 >= 0){
            System.out.println("Andar antes de descer: " + el.getAndarAtual());
            el.desce();
            System.out.println("Andar depois de descer: " + el.getAndarAtual());
            contador3--;
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
    }
}
