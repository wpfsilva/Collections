package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;


    public AgendaContatos()
    {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome,int num)
    {
        contatoSet.add(new Contato(nome,num));
    }

    public void exibirContatos()
    {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome)
    {
        Set<Contato> contatos = new HashSet<>();
        for(Contato contato : contatoSet)
        {
            if(contato.getNome().startsWith(nome))
            {
                contatos.add(contato);
            }
        }
        return contatos;
    }

    public Contato atualizarContato(String nome, int novoNum)
    {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet)
        {
            if(contato.getNome().equalsIgnoreCase(nome))
            {
                contato.setNumero(novoNum);
                contatoAtualizado = contato;
                break;
            }
        }
    return contatoAtualizado;
    }

}
