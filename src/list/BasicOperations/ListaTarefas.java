package list.BasicOperations;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    private List<Tarefa> tarefaList;

    //automaticamente vai criar uma lista vazia quando chamar ListaTarefas
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        tarefaList.add(tarefa);
    }

    public void removerTarefa(String descricao){
        List<Tarefa> TarefasRemover = new ArrayList<>();
        //para toda tarefa t dentro de tarefaList
        for (Tarefa t:tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                TarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(TarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("comprar pao");
        listaTarefas.adicionarTarefa("entregar chave ao Jhon");
        listaTarefas.obterDescricoesTarefas();
    }
}
