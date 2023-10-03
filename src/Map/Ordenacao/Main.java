package Map.Ordenacao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args)
    {
        Calendario calendarioEventos = new Calendario();


        calendarioEventos.adicionarEvento(LocalDate.of(2023, Month.OCTOBER, 02),"Evento 01", "Atracao 01");
        calendarioEventos.adicionarEvento(LocalDate.of(2023, Month.DECEMBER, 06),"Evento 02", "Atracao 02");
        calendarioEventos.adicionarEvento(LocalDate.of(2000, Month.AUGUST, 12),"Evento 03", "Atracao 03");
        calendarioEventos.exibirAgenda();
        calendarioEventos.obterProximoEvento();
    }
}
