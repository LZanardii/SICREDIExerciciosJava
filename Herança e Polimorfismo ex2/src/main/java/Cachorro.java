public class Cachorro extends Animal{


    //construtor
    public Cachorro(String nome, String raca){
        super(nome, raca);
    }

    //latir
    public void late(){
        System.out.println(super.getNome() + " está latindo...");
    }


}
