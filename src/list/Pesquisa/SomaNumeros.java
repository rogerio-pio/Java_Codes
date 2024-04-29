package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros(){
        this.listaNumeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }
    public int calcularSoma(){
        if(!listaNumeros.isEmpty()){
            int soma = 0;
            for (int numero : listaNumeros){
                soma += numero;
            }
            return soma;
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public int encontrarMaiorNumero(){
        if(!listaNumeros.isEmpty()){
            int maior = 0;
            for (int numero:listaNumeros){
                if(maior <=numero ){
                    maior = numero;
                }else {
                    ;
                }
            }
            return maior;
        }else{
            throw new RuntimeException("Lista vazia");
        }
    }
    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!listaNumeros.isEmpty()){
            for(int numero : listaNumeros){
                if(menor > numero){
                    menor = numero;
                }else{
                    ;
                }
            }
            return menor;
        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }
    public List<Integer> exibirNumeros(){
        if (!listaNumeros.isEmpty()){
            return (this.listaNumeros);
        }else{
            throw new RuntimeException("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(15);
        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Lista de numeros: " + somaNumeros.exibirNumeros());
    }
}
