package List.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {

        ListaTarefas Lista = new ListaTarefas();
        Lista.AdicionarTarefa("Estudar");
        Lista.AdicionarTarefa("Jogar");
        Lista.AdicionarTarefa("Dormir");
        System.out.println("Numero Total : " + Lista.ObterNumTotalDeTarefas());
        Lista.ObterDescricoesTarefas();
        Lista.RemoverTarefa("Jogar");
        System.out.println("Após a Remoção de Jogar.\nNumero Total : " + Lista.ObterNumTotalDeTarefas());
        Lista.ObterDescricoesTarefas();


    }
}