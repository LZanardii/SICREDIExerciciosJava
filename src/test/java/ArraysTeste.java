public class ArraysTeste {
    public static void main(String[] args) {
        //instanciando objeto do tipo ArrayExercicios
        ArrayExercicios array = new ArrayExercicios(20);

        array.printArrayNormal();
        array.cabecalho();
        array.setValores(2,20);
        array.printArrayNormal();
        array.cabecalho();
        array.invertendoArray();
        array.printArrayInvertido();

    }
}
