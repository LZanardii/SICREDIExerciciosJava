public class Tecnico extends Assistente{

    private double bonusSalarial;

    public Tecnico(String nome, int idade, int matricula, double salario, Gerente g, double bonusSalarial){
        super(nome, idade, matricula, salario, g);
        this.bonusSalarial = bonusSalarial;
    }

    public double getSalarioFinal() {
        return super.getSalario() + bonusSalarial;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados()
                     + ", " + "Bonus Salarial: " + bonusSalarial
                     + ", " + "Salario Final: " + getSalarioFinal();
    }
}
