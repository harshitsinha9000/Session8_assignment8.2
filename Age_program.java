//assignment 8.2 
import java.util.Scanner;



class NegativeAgeException extends Exception
	{
			NegativeAgeException()
			{
			super();
			}
	}


public class Age_program {
	 public int age;
	 static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) throws NegativeAgeException {
		// TODO Auto-generated method stub
		int age;
		Age_program a1 = new Age_program();
		
		System.out.println("Enter your age");
		age=s.nextInt();
		
		if(age<0)
		{
			throw new NegativeAgeException();
		}
	}

}
