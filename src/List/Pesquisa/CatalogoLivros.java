package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> LivrosList;

    public CatalogoLivros() {
        this.LivrosList = new ArrayList<>();
    }

    public void addLivro(String titulo, String autor, int ano)
    {
        this.LivrosList.add(new Livro(titulo,autor,ano));
    }

    public List<Livro> pesquisarAutor(String autor)
    {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!LivrosList.isEmpty())
        {
            for(Livro l : LivrosList)
            {
                if(l.getAutor().equalsIgnoreCase(autor))
                {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervalo(int anoInicial, int anoFinal)
    {
        List<Livro> livrosPorIntervalo = new ArrayList<>();
        if(!LivrosList.isEmpty())
        {
            for (Livro l: LivrosList) {
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal)
                {
                    livrosPorIntervalo.add(l);
                }
            }
        }
        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo)
    {
        if(!LivrosList.isEmpty())
        {
            for(Livro l : LivrosList)
            {
                if(l.getTitulo().equalsIgnoreCase(titulo))
                {
                    return l;
                }
            }
        }
        return null;
    }

}
