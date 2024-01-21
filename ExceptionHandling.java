package problems;

public class ExceptionHandling {

	public static void main(String[] args) {
		int[] string= {0,1,2,3,4,5};
		
		
		//array out of bound exception handling
		try {
			for(int i=0;true;i++)
			{
				System.out.print(string[i]+" ");
			}
		}
		catch(Exception e) {
			System.out.println("ArrayIndexOutOfBoundException");
		}
		finally{
			System.out.println(" exception-1 code ended");
		}
		
		
		//arithmetic exception handling
		
		try
		{
			int c=126/0;
		}
		catch(Exception e) {
			System.out.println("ArithmeticException");
		}
		
		//null pointer exception
		String s=null;
		//s="omkar";
		if(s==null)
		{
			throw new NullPointerException("string is not initialized");
		}
		else{
			System.out.println("length of string is: "+s.length());
		}
		
	}
}
