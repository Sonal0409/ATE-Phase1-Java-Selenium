package oopsConceptsInterface;

public interface Bankbase {
	
	/*
	 * It is an Interface class
	 * It is only user defined methods
	 * Only name of the method
	 * The skelton of method is implemented in child classes
	 * No static method is allowed in Interface
	 * Interface is concept of OOPS--> which is object oriented
	 * So methods have to called using object, so no static methods
	 * Var values cannot be changed. They are by default static
	 * Interface is abstract in nature
	 */

	String min_value = "1000";
	public void login();
	public void logout();
	public void credit();
	public void debit();
	public void payment();
	
	
}
