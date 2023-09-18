package javaPrograms;

public class IncrementDecrementDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Post increment
		
		int i = 1;  // here value of i =1
	int	j = i++; // here assign value of j first = 1 and then increment value of i by 1 ==> i =2
	
		System.out.println(i);   // print i =2
		System.out.println(j); // print j =1
		
		// pre increment
		
		
		int a = 1;  // here value of a =1
	int	b = ++a; // here value of b = 2 because increment happens first 
	//and then assign value of a ==> a =2
	
		System.out.println(a);   // print a =2
		System.out.println(b); // print b =2
		
		// post decrement
		
		
		int x = 2;  // here value of x = 2
	int	y = x--; // here value of y = 2 and then decrement value of x by 1 ==> x =1
	
		System.out.println(x);   // print i =1
		System.out.println(y); // print j =2
		
	// pre decrement
		
		
		int x1 = 2;  // here value of x1 = 2
	int	y1 = --x1; // here decrement  x1 by 1 and value of y = 1 
	//and then assign value of x1  ==> x1 =1
	
		System.out.println(x1);   // print i =1
		System.out.println(y1); // print j =1
		

	}

}
