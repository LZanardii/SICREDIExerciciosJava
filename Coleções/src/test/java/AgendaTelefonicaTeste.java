import java.util.Scanner;

public class AgendaTelefonicaTeste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //in
        AgendaTelefonica agenda = new AgendaTelefonica();

        agenda.setAgenda("leonardo", "992767370");
        agenda.setAgenda("lucas","992760427");
        agenda.setAgenda("marcia", "992270674");
        agenda.setAgenda("leandro", "912345678");

        //pesquisando uma chave map (nome)
        System.out.print("Insira o nome da pessoa que você deseja pesquisar: ");
        String nome = sc.nextLine();
        System.out.println(agenda.getNumero(nome));
        System.out.println("Você tem " + agenda.tamanho() + " pessoas na lista");

        //removendo uma chave e seus valores
        System.out.print("Insira o nome da pessoa que você deseja remover do cadastro: ");
        String nomeRemover = sc.nextLine();
        agenda.remover(nomeRemover);
        System.out.println("Você tem " + agenda.tamanho() + " pessoas na lista");

        //pesquisando novamente uma chave map (nome)
        System.out.print("Insira o nome da pessoa que você deseja pesquisar: ");
        String nome3 = sc.nextLine();
        System.out.println(agenda.getNumero(nome3));
        System.out.println("Você tem " + agenda.tamanho() + " pessoas na lista");
    }
}

