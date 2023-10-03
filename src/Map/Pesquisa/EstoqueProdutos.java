package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod,String nome, double preco, int qtd)
    {
        estoqueProdutosMap.put(cod,new Produto(nome,preco,qtd));
    }

    public void exibirTodosOsProdutos()
    {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque()
    {
        double valorTotal = 0d;
        if(!estoqueProdutosMap.isEmpty())
        {
            for (Produto produto : estoqueProdutosMap.values())
            {
                valorTotal += produto.getPreco()*produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro()
    {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty())
        {
            for(Produto p : estoqueProdutosMap.values())
            {
                if(p.getPreco() > maiorPreco)
                {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

}
