package javaPrograms;

public class OperatorsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int a = 100;
		
		int b= 200;
		
		String s1="selenium";
		
		String s2= " Batch";
		
//	Operators: Add, increment, compare, concatenate
	//Arithmetic Operators	:Addition +   and concatenation
	// a+b ==> take the value of a, add it to value of variable b
		// c is a variable which is storing the sum of a and b
		// c is storing a number so its datatype is int
		
		int c=a+b;  // 300
		
		System.out.println("the addition of a and b is : " + c);
		
		// whenever + is applied on strings it will just concatinate it
		// ie : join the strings
		
		String s3 = s1+s2;
		
		System.out.println("the concatination of s1 and s2 is : "+" " + s3);
		
		//directly we put the expression in the print statement
		System.out.println(a+b);  //300
		System.out.println(s1+s2); // selenium batch
		
		// store the expression in a third varibale and print it
		
		int x;
		
		x=a+b;
		
		System.out.println(x);
		
		System.out.println(100+200);
		
		System.out.println(a>b); // returns false
		
		// increment(++) and decrement(--) operators	
		// 	increment(++)  ==> this operator when applied on a variable(storing a numner)
			//will increment its value by 1
			
		int i =9;
		System.out.println(i); //9

		System.out.println(	++i);  //10  i =10;
			
		int j = ++i; //  11
		
		System.out.println(j);	
			
	 
		
		
		int z=30;
		
		System.out.println("value f z" + z); //30
		
		System.out.println(" incremented value of z" + ++z);
		
		System.out.println(" incremented value of z" + z++);
		
		int result1= ++z;
		
		System.out.println("the new incremented value is: " + result1);
		
		
		// Assignment: declare an integer vaiable, use decrement operatorr,
		//store it in a new result vaiable and print the result vailable
		// direcly use the operator in print statement
		

		
		
	}

}
