package javaPrograms;

public class P1Variabletype {
	
	String name;
	String x;
	
	public void method1()
	{
		name = "selenium";
		System.out.println(name);
	}
	
	
	public void method2()
	{
		name = "mittal";
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		P1Variabletype obj = new P1Variabletype();
		
		obj.method1();
		obj.method2();
		
	}
}
