/* write a program to display current date and time of system*/

import java.time.LocalTime;
import java.time.LocalDate;
public class DateAndTime {
	public static void main(String[] args) {
		System.out.print("Current Date of System: ");
		System.out.println(LocalDate.now());
		System.out.print("Current time of System: ");
		System.out.println(LocalTime.now());
	}
}
