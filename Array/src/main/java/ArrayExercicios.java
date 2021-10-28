public class ArrayExercicios {

    private int[] array; //criando variável array normal
    int[] arrayInvertido; //criando variável array invertido
    private int tamanho; //Criando variável que vai conter o tamanho do array

    //construtor da classe
    public ArrayExercicios(int tamanho) {
        this.array = new int[tamanho];
        arrayInvertido =  new int[tamanho];
        this.tamanho = tamanho;
    }

    //printando o array no terminal
    public void printArrayNormal(){
        System.out.println("O array normal é: ");
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //printando o array no terminal
    public void printArrayInvertido(){
        System.out.println("O array invertido é: ");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(arrayInvertido[i]);
        }
    }

    //setando informações de valores do array
    public void setValores(int inicio, int fim) {
        int contador = 0;
        while (contador <= tamanho - 1) {
            if (inicio <= fim) {
                array[contador] = inicio;
                inicio++;
                contador++;
            } else
                contador++;
        }
    }

    //multiplicando o valor existente em cada posição do arranjo por 10
    public void multiplicandoPorDez() {
        System.out.println("O array multiplicado por 10 é: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = array[i] * 10;
        }
    }

    //invertendo as posições do array
    public void invertendoArray() {
        int contador = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            arrayInvertido[contador] = array[i];
            if (contador < array.length - 1) {
                contador++;
            }
        }
    }

    //cabeçalho para separar os prints de array
    public void cabecalho() {
        for (int i = 0; i <= 24; i++) {
            System.out.print("-=");
        }
        System.out.println("\n");
    }
}

