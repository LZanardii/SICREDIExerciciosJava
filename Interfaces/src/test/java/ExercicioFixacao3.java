import java.util.ArrayList;

public class ExercicioFixacao3 {

    public static void rotina(ArrayList<Integer> list, intToStr intToStr) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(intToStr.intToStr(list.get(i)));
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        listInt.add(30);
        listInt.add(10);

        rotina(listInt, (int x) -> "R$ " + String.valueOf(x));

        rotina(listInt, (int x) ->   );
    }

}
