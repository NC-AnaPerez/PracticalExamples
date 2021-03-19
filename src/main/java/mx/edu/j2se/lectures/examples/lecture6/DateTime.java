package mx.edu.j2se.lectures.examples.lecture6;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTime {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
	}
}
