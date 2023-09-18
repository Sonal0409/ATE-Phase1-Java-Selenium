package javaPrograms;

import java.util.Scanner;

public class P11ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a decimal value: ");
		a = obj.nextDouble();
        
		int b = (int)a ; // value of double a is now has datatype int
		
		System.out.println("The explicit value is:" + b);
		
		

	}

}
