package List.Pesquisa;

public class Livro {
    private String Titulo;
    private String Autor;
    private int Ano;

    public Livro(String titulo, String autor, int ano) {
        Titulo = titulo;
        Autor = autor;
        Ano = ano;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAno() {
        return Ano;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Ano=" + Ano +
                '}';
    }
}
