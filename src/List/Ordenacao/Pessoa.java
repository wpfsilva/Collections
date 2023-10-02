package List.Ordenacao;

public class Pessoa implements Comparable<Pessoa>{
    private String Nome;
    private int Idade;
    private double Altura;

    public Pessoa(String Nome, int Idade, double Altura)
    {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Altura = Altura;
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(this.Idade, o.getIdade());
    }

    public String getNome()
    {
        return this.Nome;
    }
    public int getIdade()
    {
        return this.Idade;
    }

    public double getAltura()
    {
        return this.Altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome='" + Nome + '\'' +
                ", Idade=" + Idade +
                ", Altura=" + Altura +
                '}';
    }
}
