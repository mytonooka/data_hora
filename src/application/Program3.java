package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Program3 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2023-02-23");
		LocalDateTime d05 = LocalDateTime.parse("2023-02-23T01:30:26");
		Instant d06 = Instant.parse("2023-02-23T01:30:26Z");

		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate lastWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("lastWeekLocalDate = " + lastWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime lastWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("lastWeekLocalDateTime = " + lastWeekLocalDateTime);
		
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant lastWeekInstant = d06.plus(7,ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("lastWeekInstant = " + lastWeekInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
		
	}
}
