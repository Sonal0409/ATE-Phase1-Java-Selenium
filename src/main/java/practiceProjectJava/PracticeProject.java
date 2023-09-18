package practiceProjectJava;

import java.util.Scanner;

public class PracticeProject {
	
	// create Overloaded methods with name as Area to calculate area of circle, rectangle and square, 
	
	public void rectangle()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Length:");
		int l = s.nextInt();
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the Width:");
		int w = s1.nextInt();
		System.out.println("The area of rectangle is:" + (l*w));
	}
	
	public void square()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Length for square:");
		int l = s.nextInt();
		
		System.out.println("The area of square is:" + (l*l));
	}
	
	public void circle() {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = s.nextDouble();
		System.out.println("The area of circle is:" + ((22*r*r)/7));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeProject obj = new PracticeProject();
		
		obj.rectangle();
		obj.square();
		obj.circle();
		
	}

}
