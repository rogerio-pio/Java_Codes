package set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa (String descricao){
        this.descricao = descricao;
        this.status = false;
    }
    public String getDescricao(){
        return descricao;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" + "descricao='" + descricao + ", status=" + status + '}';
    }
}
