package _1program.model;

import _1program.model.entites.Reservation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main {
    static void main(String[] args) {
        Reservation reservation1 = new Reservation(801,
                LocalDateTime.of(2000, 10, 27, 21, 06, 30),
                LocalDateTime.of(2000, 10, 28, 21, 06, 30));

        System.out.println(reservation1);


//        LocalDateTime dataInicio = LocalDateTime.of(2000, 10, 27, 21, 06, 30);
//        LocalDateTime dataFim = LocalDateTime.of(2003, 05, 12, 22, 06, 30);
//
//        LocalDate dataInicioS = dataInicio.toLocalDate();
//        LocalDate dataFimS = dataFim.toLocalDate();
//
//        Period period = Period.between(dataInicioS, dataFimS);
//        System.out.println(period);
//
//        int anos = Math.abs(Integer.parseInt(String.valueOf(period.getYears())));
//        int meses = Math.abs(Integer.parseInt(String.valueOf(period.getMonths())));
//        int dias = Math.abs(Integer.parseInt(String.valueOf(period.getDays())));
//
//        System.out.printf("A diferença entre as datas é de \n " +
//                        "Anos: %s\n" +
//                        "Meses: %s\n" +
//                        "Dias: %s\n"
//                , anos, meses, dias);


    }
}
