public class Normal extends Ingresso{

    //construtor
    public Normal(double vlrReais) {
        super(vlrReais);
    }

    //metodos da classe
    public void imprimeIngNormal(){
        System.out.println("Ingresso normal custa: R$ " + super.getVlrReais());
    }
}
