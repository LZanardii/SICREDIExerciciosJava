public class Pessoa {

    //atributos
    private String nome;
    private int idade;
    private double dinheiro;

    //construtor
    public Pessoa(String nome, int idade, double dinheiro){
        this.nome = nome;
        this.idade = idade;
        this.dinheiro = dinheiro;
    }

    //metodos get
    public String getNome(){return nome;}
    public int getIdade(){return idade;}
    public double getDinheiro(){return dinheiro;}

    //metodos +
    public void gastaDinheiro(double vlr){
        dinheiro-=vlr;
    }

    public void adicionaDinheico(double vlr){
        dinheiro+=vlr;
    }

    public String exibeDados(){
        return toString() + "Nome: " + nome + ", " +
                            "Idade: " + idade + ", " +
                            "Dinheiro acumulado: " + dinheiro;
    }
}
