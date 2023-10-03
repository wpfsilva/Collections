package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome,long cod,double preco, int qtd)
    {
        produtoSet.add(new Produto(nome,cod,preco,qtd));
    }

    public Set<Produto> exibirProdutosPorNome()
    {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco()
    {
        Set<Produto> produtosPorPreco = new TreeSet<>(new sortPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

}
