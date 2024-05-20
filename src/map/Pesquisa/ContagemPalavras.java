package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> mapPalavras;
    public ContagemPalavras(){
        this.mapPalavras = new HashMap<>();
    }

    public void adicionarPalavras(String palavra, Integer contagem){
        mapPalavras.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        if (!mapPalavras.isEmpty()){
            mapPalavras.remove(palavra);
        }else {
            throw new RuntimeException("Não existem palavras adicionadas!");
        }
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!mapPalavras.isEmpty()){
            for (int contagem : mapPalavras.values()){
                contagemTotal +=1;
            }
            return contagemTotal;
        }else {
            throw new RuntimeException("Não existem palavras adicionadas");
        }
    }

    public String encontrarPalavrasMaisFrequente(){
        String maisFrequente = null;
        Integer maiorContagem = 0;
        if (!mapPalavras.isEmpty()){
            for (Map.Entry<String, Integer> entry : mapPalavras.entrySet()){
                if (entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    maisFrequente = entry.getKey();
                }
            }
            return maisFrequente;
        }else{
            throw new RuntimeException("Não existem palavras adicionadas!");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);

        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
