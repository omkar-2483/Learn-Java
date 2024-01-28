
import java.util.Scanner;

class Data{
	String name;
	String city;
	String has4wheeler;

	Scanner sc=new Scanner(System.in);
	public void getData() {
		try {
			System.out.println("enter your name: ");
			name=sc.next();
			System.out.println("enter your city: ");
			city=sc.next();
			System.out.println("Do you have four wheeler?(enter yes/no): ");
			has4wheeler=sc.next();
		}
		catch(Exception e) {
			System.out.println("Enter correct input");
		}
	}
	
	public void showResult() throws Exception {
		System.out.println("City= "+city);
		if((city.toLowerCase().equals("pune")||city.toLowerCase().equals("mumbai")||city.toLowerCase().equals("banglore")||city.toLowerCase().equals("chennai"))&& has4wheeler.toLowerCase().equals("yes")) {
			System.out.println("criteria matched....");
		}
		else {
			throw new Exception("criteria does not match...");
		}
	}
}

public class ExceptionHandling {
	public static void main(String[] args) throws Exception {
		while(true) {
			Data person=new Data();
		    person.getData();
		    person.showResult();
		}
	}
}
