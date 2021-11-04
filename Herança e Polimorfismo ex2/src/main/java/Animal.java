public class Animal {

    //atributos
    private String nome, raca;

    //construtor
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }

    //metodos get
    public String getNome(){ return nome;}
    public String getRaca(){return raca;}

    //metodos +
    public void caminha(){
        System.out.println( nome + " está caminhando...");
    }

    public void come(){
        System.out.println(nome + " está comendo...");
    }

}
