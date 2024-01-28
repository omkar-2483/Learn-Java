/*constructor overloading */

package assignment2;
import java.util.*;

public class Covid{
	String name,DOB,blood_grp,test_report,address;
	static int id;
	int patientId,contact,telephone_no,adhar_no;
	
	//default constructor
	public Covid() {
		id++;
		patientId=id;
		System.out.println("Default constructor called");
	}
	//parameterized constructor
	public Covid(String pname,int adhar) {
		id++;
		patientId=id;
		System.out.println("parameterized constructor called");
		name=pname;
		adhar_no=adhar;
	}
	//method to get data
	public void get_data() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of patient: ");
		name=sc.nextLine();
		System.out.println("Enter DOB of patient ");
		DOB=sc.nextLine();
		System.out.println("Enter blood group of patient: ");
		blood_grp=sc.nextLine();
		System.out.println("Enter address of patient: ");
		address=sc.nextLine();
		System.out.println("Enter test report of patient: ");
		test_report=sc.nextLine();
		System.out.println("Enter contact number of patient: ");
		contact=sc.nextInt();
		System.out.println("Enter telephone number of patient: ");
		telephone_no=sc.nextInt();
		System.out.println("Enter adhar number of patient: ");
		adhar_no=sc.nextInt();
		//id++; //already incremented in constructor
		patientId=id;
		System.out.println("ID of patient is : "+patientId);
	}
	
	//method to display data
	public void display_data() {
		System.out.println("name of patient: "+name);
		System.out.println("ID of patient: "+patientId);
		System.out.println("DOB of patient: "+DOB);
		System.out.println("blood group of patient: "+blood_grp);
		System.out.println("address of patient: "+address);
		System.out.println("contact of patient: "+contact);
		System.out.println("telephone numberof patient: "+telephone_no);
		System.out.println("adhar number of patient: "+adhar_no);
		System.out.println("test report of patient: "+test_report);
	}
	
	//main function
	public static void main(String[] args) {
		System.out.println("covid patient management system");
		System.out.println("..........................................................");
		//calling default constructor
		Covid patient1=new Covid();
		System.out.println("for patient 1 : ");
		patient1.display_data();
		System.out.println("...........................................................");
		//calling parameterized constructor
		Covid patient2=new Covid("omkar",8086);
		System.out.println("for patient 2 :");
		patient2.display_data();
		System.out.println("..........................................................");
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enetr number of patients whose data is to be stored: ");
		n=sc.nextInt();
	    Covid[] patients=new Covid[n];
	   
	    patients[0]=patient1;
	    patients[1]=patient2;
	    for(int i=2;i<n;i++) {
	    	System.out.println("for patient "+(i+1));
	    	patients[i]=new Covid();
	    	patients[i].get_data();
	    	patients[i].display_data();
	    	System.out.println(".......................................................");
		  }
	    
	    sc.nextLine();
	    System.out.println("Do you want to search for a specific patient: if yes press y");
	    String l;
	    l=sc.nextLine();
	    if(l.equals("y")) {
	    	do {
	    		int ID;
	    		int j=0;
	    		System.out.println("enter patiet's Id which you want to search: ");
	    		ID=sc.nextInt();
	    		for(int i=0;i<n;i++) {
	    			if(ID==patients[i].patientId) {
	    				System.out.println("patient found...");
	    				patients[i].display_data();
	    				System.out.println("......................................................");
	    				break;
	    			}
	    			else {
	    				j++;
	    			}
	    		}
	    		if(j==n)
	    			System.out.println("patient not found...");
	    		sc.nextLine();
	    		System.out.println("Do you want to search for any more patient? if yes press y,otherwise press no ");
	    		l=sc.nextLine();
	    	}while(l.equals("y"));
	    }
	    System.out.println(".........................END...........................");
	 }
}