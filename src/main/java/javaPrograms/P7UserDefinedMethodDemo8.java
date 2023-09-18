package javaPrograms;

public class P7UserDefinedMethodDemo8 {
	
	// NON STATIC METHODS
	
	// method which doesnot return any value
	
	public void login()
	{
		System.out.println("Code for login Page");
	}
	
	// method which return value
	
	public int sum()
	{
		// Example of local variable
		int a = 10;
		int b = 20;
		int result = (a+b);
		return result;
	}
	
	public String testmethod()
	{
		String s = "Selenium";
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P7UserDefinedMethodDemo8 obj1 = new P7UserDefinedMethodDemo8();

		obj1.login();  // prints Code for login Page
		int result = obj1.sum();
		System.out.println (" the output of method sum() is : " + result);
		
		String a = obj1.testmethod();
		System.out.println (" the output of method testmethod() is : " + a);
	}

}
