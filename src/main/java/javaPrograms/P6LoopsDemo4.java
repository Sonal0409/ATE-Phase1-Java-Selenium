package javaPrograms;

public class P6LoopsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Loops: to perform repetitive task
		
		// While loops, do-while loop and for loop
		
		// To print number 0 to 10
		
		for(int i=0;i<=10;i++)   // local variables
		{
			System.out.println(i);
		
		}

		System.out.println("************************");

		// TO print numbers 10 to 1
		
		for(int i=10;i>=1;i--)    // i= 10 , 9
		{
			
			System.out.println(i);
		}
		
		System.out.println("************************");
		
		//While Loop  == print values from 1 to 10
		
		int a=1;
		while(a<=10)
		{
			System.out.println(a);  //1,2,3 , 4, 5, 6, 7, 8,9,10
			a++;  //11
		}
		
		System.out.println("************************");
		
		
		// do -while
		
		int x=1;
		do
		{
			System.out.println(x);
			x++;
		}
		while(x<=10);
		

	}

}
