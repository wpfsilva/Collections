package List.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa()
    {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoa(String Nome, int Idade, double Altura)
    {
        pessoaList.add(new Pessoa(Nome,Idade,Altura));
    }

    public List<Pessoa> ordenarPorIdade()
    {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura()
    {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura,new OrdenarPorAltura());
        return pessoasPorAltura;
    }
}
