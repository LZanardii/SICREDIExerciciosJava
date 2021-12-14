package contamagica;

public class ContaMagica {

    private final String nome;
    private double saldo;
    private CategoriaContaMagica status;

    public ContaMagica(String nome){
        this.nome = nome;
        saldo = 0;
        status = CategoriaContaMagica.SILVER;
    }

    public String getNomeCliente(){
        return nome;
    }
    public double getSaldo(){
        return saldo;
    }
    public CategoriaContaMagica getStatus(){
        return status;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setStatus(CategoriaContaMagica status) {
        this.status = status;
    }

    private CategoriaContaMagica verificaStatusParaDeposito(double saldo){
        if (saldo >= 50000 && saldo < 200000){
            return CategoriaContaMagica.GOLD;
        }else if (saldo >= 200000) {
            return CategoriaContaMagica.PLATINUM;
        }else
            return CategoriaContaMagica.SILVER;
    }

    private void depositaGold(double valor){
        status = CategoriaContaMagica.GOLD;
        saldo += valor;
        saldo += valor * 0.01;
        if (verificaStatusParaDeposito(saldo) == CategoriaContaMagica.PLATINUM) {
            status = CategoriaContaMagica.PLATINUM;
        }
    }

    private void depositaPlatinum(double valor){
        status = CategoriaContaMagica.PLATINUM;
        saldo += valor;
        saldo += valor * 0.025;
    }

    private void depositaSilver(double valor){
        saldo += valor;
        if (verificaStatusParaDeposito(saldo) == CategoriaContaMagica.GOLD) {
            status = CategoriaContaMagica.GOLD;
        } else if (verificaStatusParaDeposito(saldo) == CategoriaContaMagica.PLATINUM) {
            status = CategoriaContaMagica.PLATINUM;
        }
    }


    public void deposito(double valor) throws Exception {
        if (valor >= 1) {
            if (verificaStatusParaDeposito(saldo) == CategoriaContaMagica.GOLD)
               depositaGold(valor);
            else if (verificaStatusParaDeposito(saldo) == CategoriaContaMagica.PLATINUM)
                depositaPlatinum(valor);
            else
                depositaSilver(valor);
        }else
            throw new Exception();
    }

    public void retirada(double valor) {

        if (saldo >= valor && valor > 0){
            saldo -= valor;
            if (saldo < 100000 && status == CategoriaContaMagica.PLATINUM) {
                status = CategoriaContaMagica.GOLD;
            }else if (saldo < 25000 && status == CategoriaContaMagica.GOLD){
                status  = CategoriaContaMagica.SILVER;
            }
        }
    }
}
