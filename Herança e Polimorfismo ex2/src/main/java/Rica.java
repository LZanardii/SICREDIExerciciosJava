import java.util.ArrayList;

public class Rica extends Pessoa{

    ArrayList<String> bensMateriais = new ArrayList<>();

    //construtor
    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade, dinheiro);

    }

    //metodo faz compras
    public void fazCompras(String produto, double vlrCompra) {
        if (vlrCompra <= super.getDinheiro()){
            System.out.println("Você acabou de adquirir um/a " + produto);
            super.gastaDinheiro(vlrCompra);
            System.out.println("Você ainda possui R$ " + super.getDinheiro());
            bensMateriais.add(produto);
        }else{
            System.out.println("Você não tem dinheiro suficiente para comprar este/a " + produto);
        }
        System.out.println();
    }

    public void imprimeBens(){
        for (int i = 0; i < bensMateriais.size(); i++){
            System.out.println("Bem material " + (i + 1) + ": " + bensMateriais.get(i));
        }
        System.out.println();
    }

    @Override
    public String exibeDados() {
        return toString() + "Nome: " + super.getNome() + ", " +
                            "Idade: " + super.getIdade() + ", " +
                            "Dinheiro herdado: " + super.getDinheiro();
    }
}
