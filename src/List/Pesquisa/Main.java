package List.Pesquisa;

public class Main
{
    public static void main(String[]args){
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.addLivro("Livro 1", "Autor 1", 2020);
        catalogo.addLivro("Livro 1", "Autor 2", 2021);
        catalogo.addLivro("Livro 2", "Autor 2", 2022);
        catalogo.addLivro("Livro 3", "Autor 3", 2023);
        catalogo.addLivro("Livro 4", "Autor 4", 2023);
        catalogo.addLivro("Livro 5", "Autor 5", 1994);

        System.out.println("List.Pesquisa por autor:");
        System.out.println(catalogo.pesquisarAutor("Autor 2"));
        System.out.println("List.Pesquisa por Intervalo[2020 - 2023]:");
        System.out.println(catalogo.pesquisarPorIntervalo(2020,2023));
        System.out.println("List.Pesquisa por Titulo: ");
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));


    }
}
