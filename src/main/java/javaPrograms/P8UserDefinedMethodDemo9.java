package javaPrograms;

public class P8UserDefinedMethodDemo9 {
	
	// methods Called without Object
	
   // use static keyword
	
	// We are creating Static methods
	
	public static void login()
	{
		
		System.out.println("Code for login Page");
	}
	
	// method which return value
	
	public static int sum()
	{
		// Example of local variable
		int a = 10;
		int b = 20;
	    int result = (a+b);
		return result;
	}
	
	public static String testmethod()
	{
		String s = "Selenium";
		return (s);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Call methods without creating an object
			login();  // prints Code for login Page
			int result = sum();
			System.out.println (" the output of method sum() is : " + result);
			String a = testmethod();
			System.out.println (" the output of method testmethod() is : " + a);
		}


}
