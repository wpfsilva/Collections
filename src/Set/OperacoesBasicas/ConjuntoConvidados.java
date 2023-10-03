package Set.OperacoesBasicas;
import java.util.HashSet;
import java.util.Set;
public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados()
    {
        this.convidadoSet = new HashSet<>();
    }

    public void addConvidado(String nome,int codigo)
    {
        convidadoSet.add(new Convidado(nome,codigo));
    }

    public void removerConvidadoPorCodigo(int codigo)
    {
        Convidado ConvidadoParaRemover = null;
        for (Convidado c:
             convidadoSet) {
            if(c.getCodigoConvite() == codigo)
            {ConvidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(ConvidadoParaRemover);
    }

    public int contarConvidados()
    {
        return convidadoSet.size();
    }

    public void exibirConvidados()
    {
        System.out.println(convidadoSet);
    }
}
