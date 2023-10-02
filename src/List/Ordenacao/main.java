package List.Ordenacao;

public class main {
    public static void main(String[] args) {
        OrdenacaoPessoa pessoasOrdenadas = new OrdenacaoPessoa();

        pessoasOrdenadas.adicionarPessoa("Waldemar", 26, 1.63);
        pessoasOrdenadas.adicionarPessoa("Lorena", 28, 1.59);
        pessoasOrdenadas.adicionarPessoa("Juca", 22, 1.92);
        pessoasOrdenadas.adicionarPessoa("Leandro", 19, 1.77);

        System.out.println(pessoasOrdenadas.ordenarPorIdade());
        System.out.println(pessoasOrdenadas.ordernarPorAltura());
    }
}
