package java8Features;

import java.time.LocalDate;

public class DateTimeApi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
	     System.out.println(date);
	     int dd=date.getDayOfMonth();
	     int mm=date.getMonthValue();
	     int yyyy=date.getYear();
	     System.out.println(dd+"/"+mm+"/"+yyyy);
	}

}
