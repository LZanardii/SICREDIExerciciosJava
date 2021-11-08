import java.sql.SQLOutput;
import java.util.ArrayList;

public class ExercicioFixacao2 {

    public static ArrayList<Integer> opListaInt(ArrayList<Integer> list, MinhaInterface2 mi) {

        ArrayList<Integer> novoArray = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            for (int x = i + 1; x < list.size(); x++) {
                novoArray.add(mi.retornaOperacao(list.get(i), list.get(x)));
                break;
            }
        }
        return  novoArray;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listInt = new ArrayList<>();

        listInt.add(10);
        listInt.add(6);
        listInt.add(30);
        listInt.add(40);

        System.out.println("Lista inicial: ");
        System.out.println(listInt);

        System.out.println("\na) Criar uma nova lista onde os novos elementos são o resultado \n" +
                           "da soma dos elementos da lista original agrupados 2 a 2.\n");
        System.out.println(opListaInt(listInt, (int x, int y) -> x + y));

        System.out.println("\nb) Criar uma nova lista onde cada elemento corresponde a média \n" +
                           "de cada dois elementos da lista original.\n");
        System.out.println(opListaInt(listInt, (int x, int y) -> (x + y)/2));

        System.out.println("\nc) Criar uma nova lista contendo de cada par de elementos da lista \n" +
                           "original sempre o maior.\n ");
        System.out.println(opListaInt(listInt, (int x, int y) -> Integer.max(x,y)));

    }
}
