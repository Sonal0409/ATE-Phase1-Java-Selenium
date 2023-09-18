package javaPrograms;

public class P9UserDefinedMethodDemo10 {
	
	
/******************		

Pass parameters to your method
	
****************/
	
	public static int sum(int a , int b)
	{
	    int result = (a+b);
		return result;
	}
	
	public static int mul(int x, int y)
	{
		
		int r= x*y;
		return r;
	}
	
	public static String concatinate(String s1, String s2)
	{
		
		String s3= s1+s2;
		return s3;
	}
	
	// Pass parameters to a void method
	
	public static void login(String username, String password)
	{
		System.out.println("enter username: " + username);
		System.out.println("enter password: " + password);
	}
	public static void main(String[] args) {

		P9UserDefinedMethodDemo10 obj = new P9UserDefinedMethodDemo10();
		
		int result = sum(10, 20);
		System.out.println(result);
		
		System.out.println( mul(20,30) );
		
		System.out.println( concatinate("Selenium", "training") );

		//static method called without an object
		login("user1","admin@123");
	}

}
