import java.util.ArrayList;

public class Gerente extends Funcionario{

    ArrayList<Funcionario> coordenados = new ArrayList<>();
    private double salario;

    public Gerente(String nome, int idade, double salario){
            super(nome, idade);
            this.salario = salario;
    }

    public void setCoordenados(Funcionario f){
        coordenados.add(f);
    }

    public double getSalario(){
        return salario;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() +
                ", "+ "Salario: " + salario;
    }

    public void exibeCoordenados(){
        for (int i = 0; i < coordenados.size(); i++){
            System.out.println(coordenados.get(i));
        }
    }
}
