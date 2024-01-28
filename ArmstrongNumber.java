
//write a java program to find the armstrong number using java
/*armstrong number is a number,which forms the total of same number
 when each of its digit is raised to the power of the number of digits in the number*/

import java.lang.Math;
public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=9474;
		int tempNum=num;
		int count=4;
		int sum=0;
		int digit=0;
		
		while(tempNum!=0) {
			digit=tempNum%10;
			sum+=(Math.pow(digit, count));
			tempNum=tempNum/10;
		}
		if(num==sum)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");
	}

}
