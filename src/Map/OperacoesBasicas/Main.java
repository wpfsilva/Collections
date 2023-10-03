package Map.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Waldemar",34887933);
        agenda.adicionarContato("Juca",122234423);
        agenda.adicionarContato("Cirilo",7482737);
        agenda.adicionarContato("Cirilo", 8888888);
        agenda.exibirContatos();
        agenda.removerContato("Cirilo");
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Waldemar"));
    }
}
