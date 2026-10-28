package _1program.model;

import _1program.model.entites.Reservation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    static void main(String[] args) {
        LocalDateTime dataInicio = LocalDateTime.of(2026, 10, 27, 21, 06, 30);
        LocalDateTime dataFim = LocalDateTime.of(2003, 05, 12, 22, 06, 30);

        LocalDate dataInicioS = dataInicio.toLocalDate();
        LocalDate dataFimS = dataFim.toLocalDate();

        Period period = Period.between(dataInicioS, dataFimS);
        System.out.println(period);

        String anos = String.valueOf(period.getYears());
        String meses = String.valueOf(period.getMonths());
        String dias = String.valueOf(period.getDays());

        System.out.printf("A diferença entre as datas é de \n " +
                        "Anos: %s\n" +
                        "Meses: %s\n" +
                        "Dias: %s\n"
                , anos, meses, dias);
    }
}
