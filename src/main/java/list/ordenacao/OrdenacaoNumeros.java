package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(numeroAscendente);
            return numeroAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }  
    }

    public List<Integer> ordenarDescendentes(){
        List<Integer> numeroAscendente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            numeroAscendente.sort(Collections.reverseOrder());
            return numeroAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if (!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(99);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarDescendentes());

        ordenacaoNumeros.exibirNumeros();
    }


}
