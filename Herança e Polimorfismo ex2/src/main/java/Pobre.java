public class Pobre extends Pessoa{

    //atributos
    private String trabalho;

    //construtor
    public Pobre(String nome, int idade, double dinheiro, String trabalho) {
        super(nome, idade, dinheiro);
        this.trabalho = trabalho;
    }

    //metodo get
    public String getTrabalho(){
        return trabalho;
    }

    //metodo trabalha
    public void trabalha(int dias, double salarioDiarioPelosDias){
        super.adicionaDinheico(salarioDiarioPelosDias*dias);
        System.out.println("Agora você possui R$ " + super.getDinheiro());
    }



}
