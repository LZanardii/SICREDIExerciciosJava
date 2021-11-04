public class VIP extends Ingresso{

    //atributos
    double vlrTotalIngVIP;

    //construtor
    public VIP(double vlrReais, double vlrAdicional) {
        super(vlrReais);
        vlrTotalIngVIP = vlrReais + vlrAdicional;
    }

    //metodos da classe
    public double getvlrTotalIngVIP(){
        return vlrTotalIngVIP;
    }


}
