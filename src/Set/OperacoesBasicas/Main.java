package Set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.addConvidado("Waldemar",0);
        conjunto.addConvidado("Lorena",1);
        conjunto.addConvidado("Mateus",2);
        conjunto.addConvidado("Masada",2);

        conjunto.removerConvidadoPorCodigo(2);
        conjunto.exibirConvidados();
        System.out.println("Existem: " + conjunto.contarConvidados() + " convidados.");
    }
}
