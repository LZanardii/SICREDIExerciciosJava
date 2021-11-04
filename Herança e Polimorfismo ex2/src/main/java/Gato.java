public class Gato extends Animal{

    //contrutor
    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    //miar
    public void mia(){
        System.out.println( super.getNome() +" está miando...");
    }
}
