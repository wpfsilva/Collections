package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void AdicionarTarefa(String descricao)
    {
        tarefasList.add(new Tarefas(descricao));
    }

    public void RemoverTarefa(String descricao)
    {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();

        for(Tarefas t : tarefasList)
        {
            if(t.getDescricao().equalsIgnoreCase(descricao))
            {
                tarefasParaRemover.add(t);
            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }

    public int ObterNumTotalDeTarefas()
    {
        return tarefasList.size();
    }

    public void ObterDescricoesTarefas() {
        System.out.println(tarefasList);
    }

}
