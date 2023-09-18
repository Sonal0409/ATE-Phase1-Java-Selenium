package oopsConcepts;

public class Demo1MethodOverLoading {

	/******************
	METHOD OVERLOADING
	1. When multiple methods has same name in the same class
	2. But methods should have different parameters and different data types 
	3. methods inside a method not allowed 
	*******************/
	
	public  int method1()
	{
		int a=10;
		int sum=a+100;
		
		return sum;
		
	}

	public  int method1(int a, int b)
	{
		
		
		int sum=a+b;
		
		return sum;
		
	}

	public  String method1(String s1, String s2)
	{
	
		return (s1+s2);
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo1MethodOverLoading obj = new Demo1MethodOverLoading();
		
		System.out.println(obj.method1());
		System.out.println(obj.method1(10, 20));
		System.out.println(obj.method1("JAVA", "DEMO"));

	}

}
