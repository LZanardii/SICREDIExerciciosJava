public class Funcionario {

    //atributos
    private String nome;
    private int matricula,idade;

    public Funcionario (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){return nome;}

    public int getIdade(){return idade;}

    public String exibeDados(){
        return toString() + "Nome: " + nome + ", " +
                            "Idade: " + idade;
    }
}
