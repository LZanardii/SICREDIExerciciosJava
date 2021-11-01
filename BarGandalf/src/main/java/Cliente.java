//classe responsável por administrar objeto cliente

import java.util.*;

public class Cliente {

    /**ATRIBUTOS*/
    private char genero;
    private String nome;
    private String cpf;
    private int idade;
    private int contadorClientes;

    /**instanciando classe scanner*/
    Scanner sc = new Scanner(System.in);

    /**CONSTRUTOR*/
    public Cliente(String cpf, int idade, String nome, char genero) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;

        //verifica se o input de genero está correto
        if (Character.toUpperCase(genero) == 'M' || Character.toUpperCase(genero) == 'F') {
            this.genero = genero;
        } else {
            while (Character.toUpperCase(genero) != 'M' || Character.toUpperCase(genero) != 'F') {
                System.out.println("Você inseriu uma letra inválida, insira somente 'M' ou 'F'. ");
                genero = sc.next().charAt(0);
                if (Character.toUpperCase(genero) == 'M' || Character.toUpperCase(genero) == 'F') {
                    this.genero = genero;
                    break;
                }
            }
            contadorClientes++;
        }
    }


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public char getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

}
