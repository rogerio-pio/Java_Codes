package map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> mapDicionario;

    public Dicionario(){
        mapDicionario = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        mapDicionario.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if (!mapDicionario.isEmpty()){
            mapDicionario.remove(palavra);
        }else {
            System.out.println("Dicionario vazio!");
        }
    }
    public void exibirPalavras(){
        System.out.println(mapDicionario);
    }
    public String pesquisarPorPalavra(String palavra){
        String definicao = null;
        if(!mapDicionario.isEmpty()){
            definicao = mapDicionario.get(palavra);
            if (definicao == null){
                System.out.println("Palavra não encontrada no dicionário.");
            }
        }else {
            System.out.println("Dicionario vazio!");
        }
        return definicao;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        System.out.println("Palavra: java - " + "definicao: " + dicionario.pesquisarPorPalavra("java"));
        dicionario.removerPalavra("java");
        dicionario.exibirPalavras();
    }
}
