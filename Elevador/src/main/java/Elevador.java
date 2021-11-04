public class Elevador {

    //atributos
    private int andarAtual; //terreo = 0
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes = 0;

    //construtor
    public Elevador(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
    }

    //métodos get
    public int getAndarAtual(){return andarAtual;}
    public int getTotalAndares(){return  totalAndares;}
    public int getCapacidadeElevador(){return capacidadeElevador;}
    public int getPessoaPresentes(){return pessoasPresentes;}

    //método entra pessoa no elevador
    public void entraPessoa(){
        if (pessoasPresentes < capacidadeElevador){
            pessoasPresentes++;
            System.out.println("Entrando...");
        }else
            System.out.println("O elevador esta lotado");
    }

    //método que retira pessoa do elevador
    public void saiPessoa(){
        if (pessoasPresentes > 0){
            pessoasPresentes--;
            System.out.println("Saindo...");
        }else
            System.out.println("O elevador esta vazio");
    }

    //método que movimenta o elevador (subir)
    public void sobe(){
        if (andarAtual < totalAndares){
            andarAtual++;
            System.out.println("Subindo...");
        }else if (andarAtual == totalAndares){
            System.out.println("O elevador já esta no último andar");
        }
    }

    //método que movimenta o elevador (descer)
    public void desce(){
        if (andarAtual > 0){
            andarAtual--;
            System.out.println("Descendo...");
        }else
            System.out.println("O elevador já está no terreo");
    }

}

