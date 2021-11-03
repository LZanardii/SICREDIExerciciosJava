import java.util.Scanner;

public class ExerciciosMistosTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ExerciciosMistos ex = new ExerciciosMistos();

        System.out.println();
        //Iniciando exercício 1 com input do usuário pelo terminal
        System.out.println("EXERCÍCIO 1: Escreva um método em java que recebe uma String e um número e retorna esta String\n" +
                "concatenada com ela mesma aquele número de veze ");
        System.out.print("Insira a String: ");
        String str = sc.next();
        System.out.print("Insira a quantidade de vezes que ela dere repetir: ");
        int vezes = sc.nextInt();

        ex.concatenaString(str, vezes);

        //Iniciando exercício 2 com input do usuário
        System.out.println();
        System.out.println("EXERCÍCIO 2: Escreva um método em Java que recebe duas strings A e B e retorna quantas ocorrências\n" +
                "de B ocorrem em A.");
        System.out.print("Insira a primeira String: ");
        String first = sc.next();
        System.out.print("Insira a segunda String: ");
        String second = sc.next();

        ex.qtdOcorrencias(first, second);

        System.out.println();
        System.out.println("EXERCÍCIO 3:  ");;
        //Iniciando exercício 3
        int[] x = {1, 6, 3, 0, 8, 4, 1, 7, 3, 4, 3};

        ex.somaTriplas(x,7);

    }
}
