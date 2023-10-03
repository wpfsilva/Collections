package Set.Ordenacao;

public class Main {
    public static void main(String[] args) {
        CadastroProduto c = new CadastroProduto();

        c.adicionarProduto("Sanduiche",1132324122L , 7.80, 10);
        c.adicionarProduto("Bateria", 112312312L, 2.50, 3);
        c.adicionarProduto("ciburile", 777L, 3.40,1);
        c.adicionarProduto("cacatua", 723234L, 10.40,1);
        System.out.println(c.exibirProdutosPorNome());
        System.out.println(c.exibirProdutosPorPreco());
    }
}
