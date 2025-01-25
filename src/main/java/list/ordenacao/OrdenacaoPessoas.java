package main.java.list.ordenacao;

public class OrdenacaoPessoas {

    private String nome;
    private int idade;
    private double altura;

    public OrdenacaoPessoas(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura; 
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getAltura(){
        return altura;
    }
    
}
