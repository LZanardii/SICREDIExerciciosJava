import java.util.ArrayList;

public class ExerciciosMistos {

    //Escreva um método em java que recebe uma String e um número e retorna esta String
    // concatenada com ela mesma aquele número de vezes.
    public void concatenaString(String str, int vezes) {
        ArrayList<String> finalString = new ArrayList<>();
        for (int i = 0; i <= vezes; i++) {
            finalString.add(str);
        }
        for (int i = 0; i < vezes; i++) {
            System.out.print(finalString.get(i));
        }
        System.out.println();
    }

    //Escreva um método em Java que recebe duas strings A e B e retorna quantas ocorrências
    // de B ocorrem em A.
    public void qtdOcorrencias(String a, String b) {

        if (a.length() < b.length()) {

            System.out.println("Não existem ocorrências pois a segunda STRING é maior que a primeira");

        } else if (a.contains(b)) {

            int contador = 0;

            for (int i = 0; i < a.length(); i++) {
                if (a.contains(b) == true) {
                    int posicaoFinal = a.indexOf(b) + b.length() - 1;
                    a = a.substring(a.indexOf(b), posicaoFinal) + a.substring(posicaoFinal + 1);
                    contador++;
                }
            }
            System.out.println("A String B tem |" + contador + "| ocorrências dentro da String A");
        } else
            System.out.println("A String B não está contida na String A");
    }

    //Escreva um método em Java que encontre todas as triplas que somadas sejam iguais a um dado
    //valor em um arranjo qualquer de inteiros dado por parâmetro.
    public void somaTriplas(int[] arranjo, int somaDesejada) {

        ArrayList<Integer> triplasFinais = new ArrayList<>();

        int soma = 0;

        for (int i = 0; i < arranjo.length - 1; i++) {
            soma += arranjo[i];
            for (int x = i + 1; x < arranjo.length - 1; x++) {
                soma += arranjo[x];
                for (int y = 0; y < arranjo.length - 1; y++) {
                    soma += arranjo[y];
                    if (soma > somaDesejada) {
                        soma -= arranjo[y];
                    } else if (soma < somaDesejada) {
                        soma -= arranjo[y];
                    } else if (soma == somaDesejada) {
                        triplasFinais.add(arranjo[i]);
                        triplasFinais.add(arranjo[x]);
                        triplasFinais.add(arranjo[y]);
                        soma -= arranjo[y];
                    }
                }
                soma -= arranjo[x];
            }
            soma = 0;
        }

        System.out.println("As triplas encontradas que somadas formam o valor |" + somaDesejada + "| formam: ");
        int contador = 0;
        int tamanhoPrint = 3;
        while (contador < triplasFinais.size()){
            for (int i = 0; i < tamanhoPrint; i++) {
                System.out.print(triplasFinais.get(contador + i));
            }
            System.out.println();
            contador = contador + 3;
        }
    }
}







