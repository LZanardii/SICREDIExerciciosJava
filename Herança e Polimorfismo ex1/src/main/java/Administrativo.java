import java.util.Scanner;

public class Administrativo extends Assistente {

    Scanner sc = new Scanner(System.in);
    private char turno;

    //construtor com verificação de turno
    public Administrativo(String nome, int idade, int matricula, double salario, Gerente g, char turno) {
        super(nome, idade, matricula, salario, g);
        if (Character.toUpperCase(turno) == 'D' || Character.toUpperCase(turno) == 'N') {
            this.turno = Character.toUpperCase(turno);
        } else {
            while (Character.toUpperCase(turno) != 'D' || Character.toUpperCase(turno) != 'N') {
                System.out.println("Você inseriu uma alternativa inválida, insira somente 'D' ou 'N'. ");
                turno = sc.next().charAt(0);
                if (Character.toUpperCase(turno) == 'D' || Character.toUpperCase(turno) == 'N') {
                    this.turno = Character.toUpperCase(turno);
                    break;
                }
            }
        }
    }

    public double adicionalNoturno(){
        if (turno ==  'N'){
            return (super.getSalario()/100)*5;
        }else
            return 0;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados()
                + ", " + "Turno: " + turno
                + ", " + "Adicional Noturno de 5%: " + adicionalNoturno()
                + ", " + "Salario Final: " + (super.getSalario() + adicionalNoturno());
    }
}
