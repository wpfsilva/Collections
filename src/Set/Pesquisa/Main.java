package Set.Pesquisa;

public class Main {
    public static void main(String[] args) {
        AgendaContatos a = new AgendaContatos();

        a.exibirContatos();
        a.addContato("Waldemar",1234);
        a.addContato("Juca", 1334);
        a.addContato("Waldemar Eletrica", 1332);
        a.exibirContatos();
        System.out.println(a.pesquisarPorNome("Wal"));

    }
}
