package assignment3;
import java.util.Scanner;


class Computer_Engg
{
	static int roll;
	Scanner sc=new Scanner(System.in);
	protected String Name;
	protected int Roll_Number;
	protected long GR_Number;
	protected String hobbies;
	//constructor
	Computer_Engg()
	{
		roll++;
		Roll_Number=roll;
	}
	
	public void getGR(int s)
	{
		System.out.println("Enter GR Number of studrnt "+(s+1)+" : ");
		GR_Number=sc.nextLong();
	}
	public void getName(int s)
	{
		System.out.println("Enter Name of Student "+(s+1)+" : ");
		Name=sc.nextLine();
	}
	public void getHobbies()
	{
		System.out.println("Enter student's hobbies");
		hobbies=sc.next();
	}
	
	
}

class Student extends Computer_Engg
{
	private String area_of_interest;
	private int marks;
	public void getMarks(int s)
	{
		System.out.println("Enter Grades of student"+(s+1)+" : ");
		marks=sc.nextInt();
	}
	
	public void getArea_of_interest()
	{
		System.out.println("Enter student's area of interest: ");
		area_of_interest=sc.next();
	}
	public void showData(int s)
	{
		System.out.println("DATA OF Student"+(s+1)+" : ");
		System.out.println("Name of student : "+Name);
		System.out.println("Roll Number : "+Roll_Number);
		System.out.println("GR Number : "+GR_Number);
		System.out.println("HObbies : "+hobbies);
		System.out.println("Area Of Interest : "+area_of_interest);
		System.out.println("Grade : "+marks);
		
	}
	
	
}


public class Inheritance
{

	public static void main(String[] args) 
	{
		int Student_No;
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------------STUDENT INFO---------------------------");
		System.out.println("ENTER NUMBER OF STUDENTS : ");
		Student_No=sc.nextInt();
		
		Student student_obj[]=new Student[Student_No];
		//initializing objects
		for(int n=0;n<Student_No;n++)
		{
			student_obj[n]=new Student();
		}
		
		for(int i=0;i<Student_No;i++)
		{
			System.out.println("--------------------------------------------------------");
			student_obj[i].getName(i);
			student_obj[i].getGR(i);
			student_obj[i].getHobbies();
			student_obj[i].getMarks(i);
			student_obj[i].getArea_of_interest();
			System.out.println("---------------------------------------------------------");
			student_obj[i].showData(i);
			System.out.println("----------------------------------------------------------");
			
		}
		
		System.out.println("----------------------------END------------------------------");
	}
}
