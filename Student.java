/* WAP in java that calculate the grade of n students based on the marks
 entered by user in each subject */

package assignment1;

import java.util.*;

class StudentGrade{
	int[] marks=new int[5];
	float avg;
	String name;
	int roll_no;
	
	Scanner sc= new Scanner(System.in);
	
	void getData(int s) {
		System.out.print("Enter name of student"+(s+1)+": ");
		name=sc.nextLine();
		System.out.print("Enter roll number: ");
		roll_no=sc.nextInt();
		System.out.print("Enter marks of ADE: ");
		marks[0]=sc.nextInt();
		System.out.print("Enter marks of CAO: ");
		marks[1]=sc.nextInt();
		System.out.print("Enter marks of DM: ");
		marks[2]=sc.nextInt();
		System.out.print("Enter marks of UHV: ");
		marks[3]=sc.nextInt();
		System.out.print("Enter marks of FDS: ");
		marks[4]=sc.nextInt();
	}
	void calAvg(int s) {
		int total=0;
		for(int i=0;i<5;i++)
		{
			 total=total+marks[i];
		}
		avg=(total/5);
		System.out.print("Average marks of student "+(s+1)+" : ");
		System.out.print(avg);
		System.out.print("\n hence grade is: ");
		if(avg>80) {
			System.out.print("A");
		}
		else if(avg>60) {
			System.out.print("B");
		}
		else if (avg>=40) {
			System.out.print("C");
		}
		else {
			System.out.print("D");
		}
	}
	
}


public class Student {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("******* Student Grade Calculating System ********");
		System.out.println("\n \n Enter number of students whose grade is to be calculated: ");
		int n=sc.nextInt();
		StudentGrade[] student=new StudentGrade[n];
		
		for(int i=0;i<n;i++)
		{
			student[i]=new StudentGrade();
			student[i].getData(i);
		    student[i].calAvg(i);
		    System.out.println("\n--------------------------------------------------------------------------");
		}
		System.out.println("------------End-------------------------");
	}
}
