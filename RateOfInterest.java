package assignment4;
import java.util.Scanner;

abstract class Bank{
	protected double loanAmount;
	protected double ROI;
	//default constructor
	Bank()
	{
		ROI=0;
		loanAmount=0;
	}
	public void getLoanAmount(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+name+"'s Amount of Loan : ");
		loanAmount=sc.nextDouble();
	}
	abstract void getRateOfInterest(String name);  //abstract method
	
}

class SBI extends Bank{
	public void getRateOfInterest(String name)
	{
		ROI=0.084*loanAmount;
		System.out.println("Rate of Interest for "+name+" over the loan Rs."+loanAmount+" is: RS."+ROI);
	}
}

class HDFC extends Bank{
	public void getRateOfInterest(String name)
	{
		ROI=0.073*loanAmount;
		System.out.println("Rate of Interest for "+name+" over the loan Rs."+loanAmount+" is: RS."+ROI);
	}
}
 class ICICI extends Bank{
	 public void getRateOfInterest(String name)
	 {
		 ROI=0.097*loanAmount;
		 System.out.println("Rate of Interest for "+name+" over the loan Rs."+loanAmount+" is: RS."+ROI);
	 }
 }
 

public class RateOfInterest
{
	public static void main(String[] args)
	{
		SBI Rahul=new SBI();
		HDFC Rohit=new HDFC();
		ICICI Rohan=new ICICI();
		
		Rahul.getLoanAmount("Rahul");
		Rahul.getRateOfInterest("Rahul");
		Rohit.getLoanAmount("Rohit");
		Rohit.getRateOfInterest("Rohit");
		Rohan.getLoanAmount("Rohan");
		Rohan.getRateOfInterest("Rohan");
		
	}
}

