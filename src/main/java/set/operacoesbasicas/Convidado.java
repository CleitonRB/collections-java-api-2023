package main.java.set.operacoesbasicas;

public class Convidado {
    
    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }
}
