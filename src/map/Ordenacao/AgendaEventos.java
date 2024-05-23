package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEventos;

    public AgendaEventos(){
        agendaEventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventos.put(data, new Evento(nome,atracao));
    }
    public void exibirAgenda(){
        if (!agendaEventos.isEmpty()){
            Map<LocalDate, Evento> agendaCrescente = new TreeMap<>(agendaEventos);
            System.out.println(agendaCrescente);
        }else {
            throw new RuntimeException("Agenda vazia!");
        }
    }
    public void obterProximoEvento(){
        LocalDate dataProximo = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : agendaEventos.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximoEvento = entry.getValue();
                dataProximo = entry.getKey();
                break;
            }
        }
        if (proximoEvento!= null){
            System.out.println("O proximo evento é o :" + proximoEvento + "Na data: " + dataProximo + "\n");
        }else {
            System.out.println("Não existem eventos próximos!");
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento( LocalDate.of(2024,8,11),"Bingo", "jogos de bingos com premiação");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
