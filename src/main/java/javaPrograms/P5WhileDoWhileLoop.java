package javaPrograms;

public class P5WhileDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* WHILE LOOP
		 =====================
		 The Java while loop is used to iterate a part of the program repeatedly 
		 until the specified Boolean condition is true.
		 As soon as the Boolean condition becomes false, the loop automatically stops.
         The while loop is considered as a repeating if statement. 
         If the number of iteration is not fixed, it is recommended to use the while loop.
         Syntax:

while (condition){    
//code to be executed   
I ncrement / decrement statement  
}  
		 */
		
		    int i=1;   
		    while(i<=10){  
		        System.out.println(i);  
		    i++;  
		    }  

	/*  DO WHILE LOOP
	 =================================
	 The Java do-while loop is used to iterate a part of the program repeatedly, 
	 until the specified condition is true. If the number of iteration is not fixed 
	 and you must have to execute the loop at least once, 
	 it is recommended to use a do-while loop.
Java do-while loop is called an exit control loop. 
Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body.
The Java do-while loop is executed at least once because condition is checked after loop body.

Syntax:

do{    
//code to be executed / loop body  
//update statement   
}while (condition);    
	 */
		    
		    int j=1;    
		    do{    
		        System.out.println(j);    
		    j++;    
		    }while(j<=10);   	    
		    
		    
		    
		    
		    
	}

}
