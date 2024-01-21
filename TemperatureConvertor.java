package problems;
import java.util.Scanner;

public class TemperatureConvertor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float tempInCelsius;
		float tempInFahrenheit;
		//degree celsius to fahrenheit conversion
		System.out.print("Enter Temperature in Degree Celsius: ");
		tempInCelsius=sc.nextFloat();
		tempInFahrenheit=(tempInCelsius*9/5)+32;
		System.out.print("Enter Temperature in Fahrenheit: ");
		System.out.println(tempInFahrenheit+" °F");
		
		//Fahrenheit to CElsius conversion
		System.out.print("Enter Temperature in Degree Fahrenheit: ");
		tempInFahrenheit=sc.nextFloat();
		tempInCelsius=(tempInFahrenheit-32)*5/9;
		System.out.print("Enter Temperature in Degree Celsius: ");
		System.out.println(tempInCelsius+" °C");
	}
}
