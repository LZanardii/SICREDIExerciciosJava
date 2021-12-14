
public class PrePagoParquimetro {

    Parquimetro parquimetro;

    private int credito;

    public PrePagoParquimetro(Parquimetro parquimetro){
        this.parquimetro = parquimetro;
    }

    public void depositaCredito(int valor) {
        if (valor%10 == 0 && valor >= 1) {
            credito += valor;
        }else
            throw new IllegalArgumentException();
    }

    public boolean pagaTicket(){
        if (credito >= 2){
            parquimetro.insereMoeda(200);
            credito -= 2;
            return parquimetro.emiteTicket();
        }else
            throw new IllegalArgumentException();
    }

    public int getCredito() {
        return credito;
    }
}
