package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    //atributos

    private List<Integer> numeros;

    // construtor

    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int  soma = 0;
            for (Integer numero : numeros)
                soma += numero;
            return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
            if (!numeros.isEmpty()){
                for (Integer numero : numeros){
                    if (numero >= maiorNumero) {
                        maiorNumero = numero;
                    }
                }

            return maiorNumero;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
            if (!numeros.isEmpty()) {
                for (Integer numero : numeros){
                    if (numero <= menorNumero) {
                        menorNumero = numero;
                    }
                }
            
            return menorNumero;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
    }

    public void exibirNumeros(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        //criando uma instancia de classe somaNumeros

        SomaNumeros somaNumeros = new SomaNumeros();

        //adicionando numeros a lista

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        //exibindo a lista de numeros adicionados

        System.out.println("números adicionados: ");
        somaNumeros.exibirNumeros();

        //calculando e exibindo a soma dos numeros na lista

        System.out.println("Soma dos numeros = " + somaNumeros.calcularSoma());

        //encontrando e exibindo o maior numero da lista

        System.out.println("Maior numero da lista: " + somaNumeros.encontrarMaiorNumero());

        //encontrando e exibindo o menor numero da lista

        System.out.println("Menor numero da lista: " + somaNumeros.encontrarMenorNumero());

    } 
}
