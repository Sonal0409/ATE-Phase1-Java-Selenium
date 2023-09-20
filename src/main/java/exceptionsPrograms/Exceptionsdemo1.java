package exceptionsPrograms;

public class Exceptionsdemo1 {

	int a ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Arthemetic exception
		==================================
		int i = 9/0;
		
		// here we are trying to divide a number by 0. ideally this is not a synatx error, but when you execute
		// the program, you will get error at above code line and program stops
		
		System.out.println(i);
		
		 ========================================================================*/
		
		/* Interuppted exception
	      Thread.sleep(2000);  
		
		 Null Pointer exception 
		==============================
		Exceptionsdemo1 obj = new Exceptionsdemo1();
		obj = null; // with this steps we have broken the reference of the object obj.
		// obj is now null.
		System.out.println(obj.a); 
		=========================================================*/
		
		// try catch handling
		
		/* Syntax: 
		 *  try{
		 *  risky code
		 *  }
		 *  catch (ExceptionClassName ref.variable.name)
		 *  {
		 *  handling code
		 *  }
		 *  try and catch will always be written together. 
		 */
		
		try {
			int i = 9/0;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			// OR catch(Exception e)
			// here instead of ArithmeticException, you can give parent class also Exception, if you dont know what is
			// the exception class name.
			// here e is the object that stores, 1. Exception 2. description 3. Stacktrace (error message and line number)
		System.out.println(e);
			
		System.out.println("you cannot divide by zero");
			// Different ways to print exception message:
			e.printStackTrace(); // will print exception, description and message and line number(stacktrace)
			System.out.println(e.toString()); // will print exception and description, - no stack trace
			
		
		System.out.println(e.getMessage()); // will print only message.
		
		}
			
		/* Syntax of finally, this occurs after catch block
			finally {
				
			}
			
			Finally is such a block, this will definitely be executed even if exception occurs or not occurs in 
			try block
			Example of finally block can be, after JSBC connection is made and DB steps are completed, 
			we have to close all the connections with DB, we cna add those statements in finally block.
			*/
		finally {
			System.out.println("I am in finally Block");
		}
			
			
			
			
			
			
		
	}

}
