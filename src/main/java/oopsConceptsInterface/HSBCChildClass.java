package oopsConceptsInterface;

public class HSBCChildClass implements Bankbase {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call and print variable of interface.
		// we cannot create an object for interface 
		// we will call it using classname.variablename
		// you cannot change the variable value in an interface
		
		System.out.println(Bankbase.min_value);
		
		HSBCChildClass hb = new HSBCChildClass();
		
		hb.login();
		hb.debit();
		hb.AutoLoan();
		hb.logout();
		
		// top casting or synamic polymorphism
		
		Bankbase bb = new HSBCChildClass();
		
		bb.login();
		bb.debit();
		// bb.AutoLoan();  this cannot be called in top casting
		bb.logout();
		
		
	}

	
	// methods of child class
	
	public void AutoLoan() {
		System.out.println("This is AutoLoan Page");
		
	}
	
	@Override
	public void login() {
	System.out.println("This is login Page");
		
	}

	@Override
	public void logout() {
		System.out.println("This is logout Page");
		
	}


	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		System.out.println("This is payment Page");
	}

}
