import java.util.ArrayList;
import java.util.List;

public class ExercicioFixacao1 {

    public static void printOpString(List<String> lString, MinhaInterface mi) {
        for (int i = 0; i < lString.size(); i++) {
            System.out.println(mi.processaString(lString.get(i)));
        }
    }

    public static void main(String[] args) {
        ArrayList<String> listS = new ArrayList<>();

        listS.add("leo");
        listS.add("lucas");
        listS.add("marilia");
        listS.add("ana");

        System.out.println("Possui 3 caracteres?");
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");
        printOpString(listS, (String s) -> s.toString() + "," + (s.length() == 3));
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");

        System.out.println();

        System.out.println("Possui 5 caracteres?");
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");
        printOpString(listS, (String s) -> s.toString() + "," + (s.length() == 5));
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");

        System.out.println();

        System.out.println("É igual a String 'leo'?");
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");
        printOpString(listS, (String s) -> s.toString() + "," + (s.equals("leo")));
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");

        System.out.println();

        System.out.println("Possui 's' na palavra?");
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");
        printOpString(listS, (String s) -> s.toString() + "," + (s.contains("s")));
        System.out.println("-=-==-=-=-=-=-=-=-==-=-=-=-=-=-=-==-=-=-=-=-=");
    }
}