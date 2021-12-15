package mx.edu.j2se.lectures.examples.lecture7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class DateTime {
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		System.out.println(current.getDayOfMonth());
		System.out.println(current.getDayOfWeek());
		System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
	}
}
