package Map.Pesquisa;

public class Main {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();


        estoque.adicionarProdutos(111222L,"Produto 1", 3.40, 300);
        estoque.adicionarProdutos(111221L,"Produto 2", 5.40, 300);
        estoque.adicionarProdutos(111224L,"Produto 3", 1.40, 300);
        estoque.adicionarProdutos(111226L,"Produto 4", 7.40, 300);
        estoque.adicionarProdutos(111225L,"Produto 5", 10.40, 300);
        estoque.adicionarProdutos(1112290L,"Produto 6", 200.40, 20);

        estoque.exibirTodosOsProdutos();
        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }
}
