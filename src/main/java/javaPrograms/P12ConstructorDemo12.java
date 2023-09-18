package javaPrograms;

public class P12ConstructorDemo12 {
	/*
	 * Constructor Concept
	 * It is a class entity which is used to define some class features while creating the object
	 * It looks like a method but it is not a method
	 * Constructor name is always class name
	 * Constructor does not return any value.
	 * We don't use static, void or data type with constructor as it is not a function 
	 * There are different types of constructors
	 *  - default constructor
	 *  - Constructor with parameters
	 */
	//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
	
	public P12ConstructorDemo12() {
		//This is default constructor as it has no parameters.
		System.out.println("This is default constructor");
		
	}
	
	public P12ConstructorDemo12(int a) {
		//This is default constructor as it has no parameters.
		System.out.println("This is parameterized constructor");
		System.out.println("The value of i" + a);
		
	}
	
	public P12ConstructorDemo12(int a, int b) {
		//This is default constructor as it has no parameters.
		System.out.println("This is parameterized constructor");
		System.out.println("The value of i" + a);
		System.out.println("The value of b" + b);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// how to call a constructor
		
	// As soon as we create the object of the class, the constructor will be called by default
		
		P12ConstructorDemo12 obj =	new P12ConstructorDemo12(); 
		// as we are not apssing any parameters, it will call default constructor
		// output: This is default constructor
		
	// to call other constructor
		
		P12ConstructorDemo12 obj2 =	new P12ConstructorDemo12(10); 
		
		// as we are a passing a parameter, it will call  constructor with single value
				// output: This is parameterized constructor
		       // The value of i 10
		
	// to call other constructor
		
		P12ConstructorDemo12 obj3 =	new P12ConstructorDemo12(10,20); 
		
		// as we are a passing a parameter, it will call  constructor with 2 value
				// output: This is parameterized constructor
		       // The value of i 10	
		       // the value of b 20
		
		/*
		 * For every class in Java and default constructor is there by default
		 * When you create an object in main method of a class and just run it.. you will see no out put
		 * thats when default constructor got executed.
		 * Action class in Sleenium, you will passing it as 
		 * Action a = new Action(driver)
		 * so Action class has a constructor -single parameter to which you are passign driver object
		 */
		
		
		
		
		
		
		
		
		
		

	}

}
