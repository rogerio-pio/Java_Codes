package list.BasicOdernations;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        Tarefa tarefa = new Tarefa(descricao);
        tarefaList.add(tarefa);
    }

    public void removerTarefa(){

    }

}
