package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos(){
        this.agenda = new HashSet<>();
    }
    public Set<Contato> getAgenda() {
        return agenda;
    }

    public void adicionarContato(String nome, int numero){
        agenda.add(new Contato(numero, nome));
    }
    public void exibirContatos(){
        System.out.println(agenda);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPesquisados = new HashSet<>();
        if(!agenda.isEmpty()){
            for (Contato c : agenda){
                if(c.getNome().equalsIgnoreCase(nome)){
                    contatosPesquisados.add(c);
                }
            }
            return contatosPesquisados;
        }else{
            throw new RuntimeException("Agenda de contatos vazia!");
        }
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtt = null;
        if(!agenda.isEmpty()){
            for (Contato c : agenda){
                if (c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtt = c;
                    break;
                }
            }
            return contatoAtt;
        }else{
            throw new RuntimeException("Agenda vazia!");
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Pio", 999004633);
        agenda.adicionarContato("Rogerio", 759990046);
        agenda.adicionarContato("Pio", 999999999);

        agenda.exibirContatos();
        agenda.pesquisarPorNome("Pio");
        agenda.atualizarNumeroContato("Rogerio", 889990046);
        agenda.exibirContatos();
    }
}
