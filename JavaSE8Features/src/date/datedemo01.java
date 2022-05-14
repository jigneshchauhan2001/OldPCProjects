package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Date;

public class datedemo01 {

	public static void main(String[] args) {
		System.out.println("milli secs: " +System.currentTimeMillis());  // Milli Seconds counted from 1970
		System.out.println("minutes: " +System.currentTimeMillis()/1000/60);
		System.out.println("days: " +System.currentTimeMillis()/1000/60/60/24);
		System.out.println("years: " +System.currentTimeMillis()/1000/60/60/24/365);
		System.out.println(1970+52);
		
		// DATE
		Date date = new Date();
		System.out.println(date.getTime());  		// gives in milli seconds from 1900
		System.out.println(date.getYear());         // gets year counted from 1900
		
		
		// LOCAL DATE
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.of(1992, 5, 3));
		
		System.out.println(LocalDate.now().plusDays(2));
		System.out.println(LocalDate.now().plusMonths(2));
		System.out.println(LocalDate.now().plusYears(2));
		
		System.out.println(LocalDate.parse("1995-03-05"));  //parse(converts) character string into LocalDate format
		
		
		// LOCAL DATE TIME 
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDate.now().compareTo(LocalDate.of(2022, 04, 03)));
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		System.out.println(ZonedDateTime.now());
		
		Period period=Period.between(LocalDate.now(), LocalDate.now().plusYears(2).plusDays(20));
		System.out.println(period);
		
		int days=period.getDays();
		int months = period.getMonths();
		int years = period.getYears();
		System.out.println(days);
		System.out.println(months);
		System.out.println(years)
		;
	}
	
}
