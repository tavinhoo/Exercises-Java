import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // INSTANCIAÇÃO

        LocalDate d01 = LocalDate.now();
        System.out.println("Data-hora local sem hora: " + d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data-hora local com hora: " + d02);

        Instant d03 = Instant.now();
        System.out.println("Instante: " + d03);

        // PEGAR TEXTO ISO 8601 E TRANSFORMAR EM HORA

        LocalDate d04 = LocalDate.parse("2023-01-08");
        System.out.println("Conversão: " + d04);

        LocalDateTime d05 = LocalDateTime.parse("2023-01-08T14:37:26");
        System.out.println("Conversão 2: " + d05.toString());

        // o contrário diss é fazer .toString();

        Instant d06 = Instant.parse("2023-01-08T14:37:26Z");
        System.out.println("Conversão 3: " + d06);

        // instancia de um instante referente ao horario de sp(exemplo), o proposto
        // -03:00
        // indica que este horario esta atrasdo em relação ao GMT, assim ele ira
        // retornar
        // o horário relativo GMT, ou seja +3h
        Instant d07 = Instant.parse("2023-01-08T14:37:26-03:00");
        System.out.println("Horario em Londres: " + d07);

        // Texto no formato cutomizado para virar data-hora

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt);
        System.out.println("Data com dateTimeFormatter: " + d08.toString());

        // LocalDateTime d09 = LocalDateTime.parse("20/07/2022 11:30",
        // DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        // System.out.println("Data com hora e minuto: " + d09.toString());

        // INSTANCIAR DATA A PARTIR DE DADOS ISOLADOS

        LocalDate d10 = LocalDate.of(2023, 1, 8);
        System.out.println(d10.format((DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        LocalDateTime d11 = LocalDateTime.of(2023, 1, 8, 15, 15);
        System.out.println(d11);

        // CONVERTENDO DATA-HORA PARA TEXTO

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // DateTimeFormatter para instant d06

        DateTimeFormatter fmtInstant = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;

        d04 = LocalDate.parse("2022-07-20");

        System.out.println("d04: " + d04.format(fmt));
        System.out.println("d04: " + fmt.format(d04));
        System.out.println("d04: " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d05: " + d05.format(fmt));
        System.out.println("d05: " + d05.format(fmt2));

        System.out.println(fmtInstant.format(d06));

        System.out.println(d05.format(fmt3));
        System.out.println(fmt4.format(d06));

        System.out.println(d05.toString() instanceof String);

        // CONVERTENDO DATA-HORA GLOBAL PARA LOCAL

        // EXEMPLOS:
        LocalDate data1 = LocalDate.parse("2023-01-12");
        LocalDateTime data2 = LocalDateTime.parse("2023-01-12t12:18:26");
        Instant data3 = Instant.parse("2022-07-20T01:30:26Z");

        // PEGA ZONEIDS DISPONPIVEIS
        // for (String id : ZoneId.getAvailableZoneIds()) {
        // System.out.println(id);
        // }

        LocalDate dataLocalConvertida = LocalDate.ofInstant(data3, ZoneId.systemDefault());
        System.out.println(dataLocalConvertida);

        LocalDateTime dataPortugal = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));
        System.out.println(dataPortugal);

        // OBTENDO DADOS DE UMA DATA-HORA LOCAL

        System.out.println("dia: " + data1.getDayOfMonth());
        System.out.println("mes: " + data1.getMonth());
        System.out.println("mes numérico: " + data1.getMonthValue());
        System.out.println("mes: " + data1.getYear());

        System.out.println("000000000000000000000000000000000000000000000000");

        System.out.println("data2 hora: " + data2.getHour());
        System.out.println("data2 hora: " + data2.getDayOfWeek());
        System.out.println("data2 hora: " + data2.getMinute());

        // CALCULOS COM DATA E HORA

        LocalDate pastWeekLocalDate = data1.minusDays(7);
        System.out.println("TODAY: " + data1.getDayOfWeek() + " " + data1);
        System.out.println("ONE WEEK AGO: " + pastWeekLocalDate.getDayOfWeek() + " DATA: " + pastWeekLocalDate);

        LocalDate nextWeekLocalDate = data1.plusDays(7);
        System.out.println("NEXT WEEK: " + nextWeekLocalDate.getDayOfWeek() + " DATA: " + nextWeekLocalDate);

        // COM LOCALDATETIME

        LocalDateTime pastWeekLocalDateTime = data2.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = data2.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        // COM INSTANT

        Instant pastWeekInstant = data3.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = data3.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        // DURAÇÃO

        Duration t1 = Duration.between(pastWeekInstant, nextWeekInstant);
        System.out.println(t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), data1.atStartOfDay());
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, data3);
        System.out.println(t3.toDays());

        Duration t4 = Duration.between(data3, pastWeekInstant);
        System.out.println(t4.toDays());

    }
}
