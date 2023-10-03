package Map.Ordenacao;

import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.util.*;

public class Calendario {
    private Map<LocalDate,Evento> eventosMap;

    public Calendario()
    {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao)
    {
        Evento evento = new Evento(nome,atracao);
        eventosMap.put(data,evento);
    }

    public void exibirAgenda()
    {
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento()
    {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate,Evento> entry: eventosTreeMap.entrySet())
        {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
            {
                System.out.println("Próximo Evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }

    }



}
