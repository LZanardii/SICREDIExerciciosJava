import java.util.HashMap;

public class AgendaTelefonica {

    HashMap <String,String> agenda = new HashMap<>();

    public void setAgenda (String nome, String numero){
        agenda.put(nome, numero);
    }

    //método que retorna o valor atrelado a chave solicitada
    public String getNumero (String nome){
        boolean contem = agenda.containsKey(nome);
        if (contem == true){
            System.out.print("O Numero de " + nome + " é: ");
            return agenda.get(nome);
        }else
            System.out.print("OPS! Não conseguimos encontrar o número de ");
            return nome;
    }

    //método que remove a chave e o valor a ela atrelado do map
    public void remover(String nome){
        boolean contem = agenda.containsKey(nome);
        if (contem == true){
            System.out.print("Removendo " + nome);
            System.out.println();
            agenda.remove(nome);
        }else
            System.out.print("OPS! Não conseguimos encontrar " + nome + " em nosso cadastro.");
    }

    //metodo que retorna o tamanho o map
    public int tamanho(){
        return agenda.size();
    }
}






