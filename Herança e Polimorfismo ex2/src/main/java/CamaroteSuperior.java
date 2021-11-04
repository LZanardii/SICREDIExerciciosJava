public class CamaroteSuperior extends VIP{

    //atributos
    private double vltFinalIngCS;

    //comstrutor
    public CamaroteSuperior(double vlrReais, double vlrAdicional, double vlrAdicional2) {
        super(vlrReais, vlrAdicional);
        vltFinalIngCS = vlrReais + vlrAdicional + vlrAdicional2;
    }

    //metodos da classe
    public double getVltFinalIngCS() {
        return vltFinalIngCS;
    }
}
