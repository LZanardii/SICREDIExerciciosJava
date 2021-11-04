public class Assistente extends Funcionario{

    private Gerente g;
    private int matricula;
    private double salario;

    public Assistente(String nome, int idade, int matricula, double salario, Gerente g) {
        super(nome, idade);
        this.salario = salario;
        this.matricula = matricula;
        this.g = g;
    }

    public int getMatricula(){
        return matricula;
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados()
                + ", " + "Matricula: " + matricula
                + ", " + "Salario: " + salario
                + ", " + "Gerente: " + g.getNome();

    }
}
