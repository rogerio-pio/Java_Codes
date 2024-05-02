package set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavras;

    public ConjuntoPalavrasUnicas(){
        this.conjuntoPalavras = new HashSet<>();
    }

    public Set<String> getConjuntoPalavras(){
        return conjuntoPalavras;
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavras.add(palavra);
    }
    public void removerPalavra(String palavra) {
        if (!conjuntoPalavras.isEmpty()) {
            conjuntoPalavras.remove(palavra);
        }else{
            throw new RuntimeException("Conjunto vazio!");
        }
    }
    public boolean verificarPalavra(String palavra){
            return (conjuntoPalavras.contains(palavra));
    }
    public void exibirPalavrasUnicas(){
        if (!conjuntoPalavras.isEmpty()){
            System.out.println(conjuntoPalavras);
        }else {
            throw new RuntimeException("Conjunto vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("Pio");
        conjunto.adicionarPalavra("fome");
        conjunto.adicionarPalavra("Ahoy");

        if(conjunto.verificarPalavra("Pio")){
            System.out.println("A palavra está presente");
        }else {
            System.out.println("A palavra não está presente");
        }
        conjunto.removerPalavra("Pio");
        if(conjunto.verificarPalavra("Pio")){
            System.out.println("A palavra está presente");
        }else {
            System.out.println("A palavra não está presente");
        }
        conjunto.exibirPalavrasUnicas();
    }
}
