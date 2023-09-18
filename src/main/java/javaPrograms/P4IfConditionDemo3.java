package javaPrograms;

public class P4IfConditionDemo3 {
	
	public static void main(String[] args) {
		
		//declare variables:
		
		int i = 100;
		int j = 200;
		int k = 300;
		
		if(i<j)
		{
			System.out.println("i is less than j");
		}
		
		// Condition2
		
		if(i>j)
		{
			System.out.println("i is greater than j");
		}
		else {
			System.out.println("J is greater than i");
		}
		
		// Condition 3, print the biggest number => nested if else
		
		if((i>j)&&(i>k))   // compound statement
		{
			System.out.println("i is the biggest integer");
			
		}
		else if((j>k)) {
			
			System.out.println("J is the biggest integer");
		}
		
		else {
			
			System.out.println("K is the biggest integer");
			
		}
		
	}

}
