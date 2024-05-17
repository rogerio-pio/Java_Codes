package map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> mapContatos;

    public AgendaContatos(){
        this.mapContatos = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        mapContatos.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!mapContatos.isEmpty()){
            mapContatos.remove(nome);
        }else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }
    public void exibirContatos(){
        if (!mapContatos.isEmpty()){
            System.out.println(mapContatos);
        }else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }
    public Integer pesquisarPorNome(String nome){
        Integer numero = null;
        if (!mapContatos.isEmpty()){
            numero = mapContatos.get(nome);
            if (numero == null){
                System.out.println("Contato não encontrado.");
            }
        }else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numero;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Maria");
        System.out.println("Nome: João - "+ "numero: " + agendaContatos.pesquisarPorNome("João"));
    }
}
