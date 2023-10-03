package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> Agenda;

    public AgendaContatos() {
        Agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero)
    {
        Agenda.put(nome,numero);
    }

    public void removerContato(String nome)
    {
        if(!Agenda.isEmpty())
        {
            Agenda.remove(nome);
        }
    }

    public void exibirContatos()
    {
        System.out.println(Agenda);
    }

    public Integer pesquisarPorNome(String nome)
    {
        if(!Agenda.isEmpty())
        {
            return Agenda.get(nome);
        }
        return -1;
    }
}
