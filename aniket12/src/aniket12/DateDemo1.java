package aniket12;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDemo1 {
public static void main(String[] args) {
		
//	LocalDate date=LocalDate.now();
//		System.out.println("today's date is :"+date);
	
	
//		int day=date.getDayOfMonth();
//		int month=date.getMonthValue();
//		int year=date.getYear();
//		System.out.println("day: "+day+"  month: "+month+"  year: "+year);
	
	
	
//	LocalDate birthday=LocalDate.of(1997,8, 28);
//	System.out.println("my bday is on "+birthday);
	
	
	
	
	
//	LocalDate today=LocalDate.now();
//	LocalDate birthday=LocalDate.of(1997, 8, 28);
//	if(birthday.equals(today))
//	{
//		System.out.println("today is your bday lets celebrate"+birthday +today);
//	}
//	else
//	{
//		System.out.println("No your bday is not today");
//	}
//	
	
	
//	LocalTime c=LocalTime.now();
//	System.err.println("now time is "+c);
	
	
//	LocalTime c=LocalTime.now();
//	LocalTime nt=c.plusHours(5);
//	System.out.println("time is now over"+nt);
	
	
//	LocalDate date=LocalDate.now();
//	LocalDate wik =date.plus(1,ChronoUnit.WEEKS);
//	System.out.println("today date"+date);
//	System.out.println("after 1 week"+wik);
	
//	LocalDate date=LocalDate.now();
//	LocalDate prev=date.minus(1,ChronoUnit.DECADES);
//	LocalDate next=date.plus(1,ChronoUnit.DECADES);
//	System.out.println("curren year"+date);
//	System.out.println("previous 10 year back"+prev);
//	System.out.println("next 10 year"+next);
	
	
//	Clock clock=Clock.systemUTC();
//	System.out.println("Clock :"+clock);
//	
//	Clock defaultClock=Clock.systemDefaultZone();
//	System.out.println("Clock :"+defaultClock);

	
//	LocalDate today=LocalDate.now();
//	
//	LocalDate tommorow=LocalDate.of(2018, 8, 28);
//	if(today.isBefore(tommorow))
//	{
//		System.out.println("TRUE");
//	}
//	if(today.isAfter(tommorow))
//	{
//		System.out.println("TRUE");
//	}
	
	
//	ZoneId zi=ZoneId.of("Asia/Calcutta");
//	LocalDateTime ldt=LocalDateTime.now();
//	ZonedDateTime zdt=ZonedDateTime.of(ldt, zi);
//	System.out.println("Date and Time in pune :"+zdt);
	
	
	
	
//	YearMonth t=YearMonth.now();
//	System.out.printf("The current day",t,t.getMonthValue());
//	YearMonth ce=YearMonth.of(2020, Month.DECEMBER);
//	System.out.println("Your Creadit Card Expiry is :"+ce);
//	
	
//	LocalDate t=LocalDate.now();
//	
//	if(t.isLeapYear())
//	{
//		System.out.printf("The Year is leap year",t);
//	}
//	else
//	{
//		System.out.printf("The Year is not a Leap year ",t);
//	}
//	
	
//	LocalDate my12=LocalDate.of(2015, Month.MAY, 05);
//	
//	LocalDate t=LocalDate.now();
//	
//	Period months=Period.between(t, my12);
//	System.out.println("Months between My Marriage and today :"+months.getMonths());
//
//	
	
	
//	LocalDateTime localDateTime=LocalDateTime.of(2018, Month.APRIL, 10, 11, 30);
//	
//	ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
//	OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, zoneOffset);
//	System.out.println("Local DateTime Zone :"+offsetDateTime);
//
	
	
//	Instant instant =Instant.now();
//	System.out.println("curret time "+instant);
//	
	

//	String date="20160819";
//	
//	LocalDate formatted=LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
//	System.out.printf("The format of %s is %s \t%n",date,formatted);

	String birthday="Aug 28 1997";
//	try
//	{
//		DateTimeFormatter form=DateTimeFormatter.ofPattern("MMM dd yyyy");
//		LocalDate birth=LocalDate.parse(birthday, form);
//		System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
//	}
//	catch (Exception e) {
//		e.printStackTrace();
//	}
	
	LocalDate arrival=LocalDate.now();
	try
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
		String comming=arrival.format(formatter);
		System.out.printf("The Date %s is formatted in %s %n",arrival,comming);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	

	}
}
