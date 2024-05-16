package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefa;

    public ListaTarefas(){
        this.listaTarefa = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if (!listaTarefa.isEmpty()){
            for (Tarefa t : listaTarefa){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                }
            }listaTarefa.remove(tarefaRemover);
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public void exibirTarefas(){
        if(!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public void contarTarefas(){
        System.out.println("Qtd de tarefas: " + listaTarefa.size());
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> listaConcluidas = new HashSet<>();
        if(!listaTarefa.isEmpty()){
            for (Tarefa t : listaTarefa){
                if (t.getStatus()){
                    listaConcluidas.add(t);
                }
            }
            return listaConcluidas;
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> listaPendentes = new HashSet<>();
        if(!listaTarefa.isEmpty()){
            for (Tarefa t : listaTarefa){
                if(!t.getStatus()){
                    listaPendentes.add(t);
                }
            }
            return listaPendentes;
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public void marcarTarefaConcluida(String descricao){
        if(!listaTarefa.isEmpty()){
            for (Tarefa t : listaTarefa){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setStatus(true);
                    break;
                }
            }
        }else throw new RuntimeException("Lista vazia!");
    }

    public void marcarTarefaPendente(String descricao){
        if (!listaTarefa.isEmpty()){
            for (Tarefa t : listaTarefa){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setStatus(false);
                    break;
                }
            }
        }else {
            throw new RuntimeException("Lista vazia!");
        }
    }
    public void limparListaTarefas(){
        listaTarefa.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Estudar logica");
        lista.adicionarTarefa("Estudar EDA");
        lista.adicionarTarefa("Limpar a casa");

        lista.contarTarefas();
        lista.exibirTarefas();
        lista.removerTarefa("Estudar logica");
        lista.marcarTarefaConcluida("Estudar Java");
        System.out.println(lista.obterTarefasConcluidas());
        System.out.println(lista.obterTarefasPendentes());
        lista.limparListaTarefas();
        lista.exibirTarefas();
    }
}