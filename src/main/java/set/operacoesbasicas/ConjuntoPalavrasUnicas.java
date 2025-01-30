package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> palavraUnicaSet;

    public ConjuntoPalavrasUnicas(){
        this.palavraUnicaSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraUnicaSet.add(palavra);
    }

    public void removerPalavra(String palavra){
        if (!palavraUnicaSet.isEmpty()){
            if(palavraUnicaSet.contains(palavra)){
                palavraUnicaSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavraUnicaSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavraUnicaSet.isEmpty()){
            System.out.println(palavraUnicaSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("java");
        conjuntoPalavrasUnicas.adicionarPalavra("phyton");
        conjuntoPalavrasUnicas.adicionarPalavra("javaScript");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("phyton");
        conjuntoPalavrasUnicas.adicionarPalavra("ruby");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("phyton");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("swift");

        System.out.println("A linguagem 'java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("java"));
        System.out.println("A linguagem 'phyton' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("phyton"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
