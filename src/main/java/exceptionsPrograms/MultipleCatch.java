package exceptionsPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Only try block or only catch block or only finally block are not a;;owed
	   It will give error to add catch or finally block
	   Catch without try not allowed
	   finally without try not allowed
		// Multiple Catch block
		// if first catch block is having clas sname as Exception, then we cnanot give 
		// multiple catch block as parent class has already captured all the exceptions
		// but if you will give Arthmetic exception and then another catch block -it will work
		//===========================================
		
		/* Wring Code for multiple catch
		 ========================================
		try {
			int i = 9/0;
			System.out.println(i);
		}
		catch(Exception e) {
					System.out.println(e);
		}
		
		catch(Arithmetic e) {   // this is not allowed as it is child class to Exception class
		
		System.out.println(e);
		}
		=======================================================================================*/
	/*	
		try {
			int i = 9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
					System.out.println(e);
		}
		
		catch( Exception e) {   // this is allowed as it is child class to Exception class
		
		System.out.println(e);
		}
		========================================================================================*/
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Enter a number");
			int num1 = scan.nextInt();
			System.out.println("Enter another number");
			int num2 = scan.nextInt();
			
			int result = num1/num2;
			
			System.out.println("The division of 2 numbers is : " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter a zero in denominator");
		}
		catch(InputMismatchException e) {
			System.out.println("Only Integer values are allowed");
		}
		// Generic catch block should always be written at the bottom
		catch(Exception e) {
			System.out.println("Please enter a valid input");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
