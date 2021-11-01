import java.util.*;
public class Bar {

    /**instanciando classe scanner*/
    Scanner sc = new Scanner(System.in);

    /**ATRIBUTOS*/
    private int var = 0; //variável criada para manipular o menu
    private int nroClientesTotais; //variável criada para guardar o numero de pessoas que podem entrar no bar ao mesmo tempo
    ArrayList<Cliente> lstClientes = new ArrayList<Cliente>(); //Lista que contém clientes presentes no bar
    private int contador = 0; //variável responsavel por controlar o controle de index do array lista


    /**CABEÇALHO MENU*/
    //cabeçalho que será printado todas as vezes dentro da estrutura de repetição while
    public void cabecalho() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-=");
        }
        System.out.println();
        System.out.println("             " + "Bar do Gandalf");
        for (int i = 0; i < 20; i++) {
            System.out.print("-=");
        }
        System.out.println();
        System.out.println("    " + "Item 1: Cadastrar cliente;" + "\n" +
                "    " + "Item 2: Consultar CPF;" + "\n" +
                "    " + "Item 3: Consultar nome;" + "\n" +
                "    " + "Item 4: Quantidade de pessoas;" + "\n" +
                "    " + "Item 5: Disrtibuição por gênero;" + "\n" +
                "    " + "Item 6: Listagem clientes presentes;" + "\n" +
                "    " + "Item 7: Registrar saida cliente;" + "\n" +
                "    " + "Item 9: Finalizar dia;");
        for (int i = 0; i < 20; i++) {
            System.out.print("-=");
        }
    }

    /**TAMANHO ARRAYLIST*/
    //método que vai solicitar o tamanho do array 'lista'
    public void setNroClientesTotais(int nroClientes) {
        this.nroClientesTotais = nroClientes;
    }

    /**VERIFICAÇÕES*/
    //Verificando veracidade CPF
    public boolean veracidadeCPF(String cpf) {
        int soma = 0;
        for (int i = 0; i < cpf.length(); i++) {
            int integer = cpf.charAt(i);
            soma += Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        if (soma == 33 | soma == 44 | soma == 55 | soma == 66 | soma == 77 | soma == 88 | soma == 99) {
            return true;
        } else
            System.out.println("CPF inválido...");
        return false;
    }


    /**OPÇÕES DO MENU*/

    //lógica opcao 1 do menu
    public void opcao1(){
        //verifica se ja foi feita a entrada do primeiro cliente
        boolean verificador = false;

        //solicitando informações pessoais cliente para o primeiro cliente
        if (lstClientes.size() == 0) {
            System.out.print("Informe o CPF: ");
            String cpf = sc.next();
            System.out.print("Informe o Nome (utilize a técnica Camel Case. NÃO utilize espaço): ");
            String nome = sc.next();
            System.out.print("Informe a Idade: ");
            int idade = sc.nextInt();
            System.out.print("Informe o Gênero: ");
            char genero = sc.next().charAt(0);

            //validando veracidade do CPF
            if (veracidadeCPF(cpf) == true) {

                //instanciando cliente
                Cliente c = new Cliente(cpf, idade, nome, genero);

                //inserindo sno array sem veririficação
                lstClientes.add(c);
                contador++;
                System.out.println("Primeiro cliente do dia adicionado");

                //alterando variável do menu
                verificador = true;

            }

        //Instanciando novos clientes após o primerio instanciado
        } else if (lstClientes.size() != 0 & verificador == false) {

            //solicitando informações dos demais clientes
            System.out.print("Informe o CPF: ");
            String cpf = sc.next();
            System.out.print("Informe o Nome (utilize a técnica Camel Case. NÃO utilize espaço): ");
            String nome = sc.next();
            System.out.print("Informe a Idade: ");
            int idade = sc.nextInt();
            System.out.print("Informe o Gênero: ");
            char genero = sc.next().charAt(0);

            if (veracidadeCPF(cpf) == true) {

                //instanciando cliente
                Cliente c = new Cliente(cpf, idade, nome, genero);

                //for de verificação na lista
                for (int i = 0; i < lstClientes.size(); i++) {

                    //verificando se não existem cpf que coincidem

                    if (lstClientes.get(i).getCpf().equals(cpf)) {
                        System.out.println("CPF ja existente no sistema...");
                        System.out.print("Digite 1 para volar ao MENU ");
                        sc.next();
                        break;

                    } else {

                        //verifica se o bar não esta lotado, caso não esteja, joga o objeto cliente para o arrayList
                        if (contador < nroClientesTotais) {
                            lstClientes.add(c);
                            contador++;
                            System.out.println("Cliente adicionado");
                            break;
                        } else if (contador == nroClientesTotais) {
                            System.out.println("O bar está lotado");
                            System.out.println("Digite 1 para volar ao MENU");
                            sc.next();
                            break;
                        }
                    }
                }
            }
        }
    }

    //lógica opção 2 do menu
    public void opcao2(){
        System.out.print("Insira o CPF que deseja encontrar: ");
        String nroCPF = sc.next();
        for (int i = 0; i < lstClientes.size(); i++) {
            if (lstClientes.get(i).getCpf().equals(nroCPF)) {
                System.out.println("CPF ENCONTRADO" + "\n" +
                        "Nome: " + lstClientes.get(i).getNome());
                System.out.println("Digite 1 para volar ao MENU");
                sc.next();
                break;
            } else if (i == lstClientes.size() - 1) {
                System.out.println("CPF não encontrado");
                System.out.println("Digite 1 para volar ao MENU");
                sc.next();
                break;
            }
        }
    }

    //lógica opção 3 do menu
    public void opcao3(){
        System.out.print("Insira o NOME que deseja encontrar (Lembre-se de inserir o nome igual ao do cadastro inicial): ");
        String nome = sc.next();

        for (int i = 0; i < lstClientes.size(); i++) {
            if (lstClientes.get(i).getNome().equals(nome)) {
                System.out.println("NOME ENCONTRADO" + "\n" +
                        "CPF: " + lstClientes.get(i).getCpf());
                System.out.println("Digite 1 para volar ao MENU");
                sc.next();
                break;
            } else if (i == lstClientes.size() - 1){
                System.out.println("NOME não encontrado");
                System.out.println("Digite 1 para volar ao MENU");
                sc.next();
                break;
            }
        }
    }

    //lógica opçao 4 do menu
    public void opcao4(){
        if (lstClientes.size() == 0) {
            System.out.println("O bar está vazio");
        } else
            System.out.println("Temos ao todo |" + lstClientes.size() + "| clientes presentes.");
    }

    //lógica opçao 5 do menu
    public void opcao5(){
        int men = 0;
        int girl = 0;

        if (lstClientes.size() == 0) {
            System.out.println("O bar está vazio");
        }else {
            for (int i = 0; i < lstClientes.size(); i++) {
                if (lstClientes.get(i).getGenero() == 'M') {
                    men++;
                } else if (lstClientes.get(i).getGenero() == 'F')
                    girl++;
            }
            System.out.println("Homens: " + men);
            System.out.println("Mulheres: " + girl);
        }
    }

    //lógica opçao 6 do menu
    public void opcao6(){
        if (lstClientes.size() == 0) {
            System.out.println("O bar está vazio");
        }
        for (int i = 0; i < lstClientes.size(); i++) {
            System.out.println("Nome: |" + lstClientes.get(i).getNome() +
                    "| -- CPF: |" + lstClientes.get(i).getCpf() +
                    "| -- Idade: |" + lstClientes.get(i).getIdade() +
                    "| -- Gênero: |" + lstClientes.get(i).getGenero() + "|");
        }
    }

    //lógica opção 7 do menu
    public void opcao7(){
        if (lstClientes.size() == 0) {
            System.out.println("O bar está vazio");
        }else {
            System.out.print("Insira o CPF do cliente: ");
            String cpf = sc.next();
            for (int i = 0; i < lstClientes.size(); i++) {
                if (lstClientes.get(i).getCpf().equals(cpf)) {
                    System.out.println("Revomendo " + lstClientes.get(i).getNome() + "...");
                    lstClientes.remove(i);
                    break;
                }else if (i == lstClientes.size() - 1){
                    System.out.println("CPF nao encontrado");
                    System.out.println("Digite 1 para volar ao MENU");
                    sc.next();
                    break;
                }
            }
        }
    }

    /**MENU*/
    //método que vai inicializar o sistema no main
    public void menu() {

        //setando o numero do array lista e instanciando o array
        System.out.print("Insira o numero de clientes que podem ficar dentro do bar ao mesmo tempo: ");
        nroClientesTotais = sc.nextInt();

        //estrutura de repetição que vai agrupar todas as funcionalidades do sistema
        while (var != 9) {
            cabecalho();
            System.out.print("\n" + "Insira o numero do item desejado: ");
            var = sc.nextInt();

            //opção 1 cabeçalho (cadastrar cliente)
            if (var == 1)
                opcao1();

            //opção 2 cabeçalho (consultar CPF)
            else if (var == 2)
                opcao2();

            //opção 3 cabeçalho (consultar nome)
            else if (var == 3)
                opcao3();

            //opção 4 cabeçalho (quantidade de pessoas)
            else if (var == 4)
                opcao4();

            //opçao 5 do cabeçalho (distribuição por gênero)
            else if (var == 5)
                opcao5();

            //opção 6 (listagem clientes presentes)
            else if (var == 6)
                opcao6();

            //opção 7 menu (registrar saida cliente)
            else if (var == 7)
                opcao7();

        }
    }
}



