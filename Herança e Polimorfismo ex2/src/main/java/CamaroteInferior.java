public class CamaroteInferior extends  VIP{

    //atributos
    private String localIng;

    //construtor
    public CamaroteInferior(double vlrReais, double vlrAdicional, String localIng) {
        super(vlrReais, vlrAdicional);
        this.localIng = localIng;
    }

    //métodos da classe
    public String getLocalIng(){
        return localIng;
    }

    public void imprimeLocalIng(){
        System.out.println("O local do seu ingresso é: " + localIng);
    }

}
