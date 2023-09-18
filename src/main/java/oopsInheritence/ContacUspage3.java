package oopsInheritence;

public class ContacUspage3 {

	public void ContactUS() {
		System.out.println("This is Cotatc is Page");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HomePage obj = new HomePage();
		ContacUspage3 obj3 = new ContacUspage3();
		
		obj.OpenBrowser();
		obj.login();
		obj3.ContactUS();
		obj.logout();
		
	Base b1obj	= new HomePage();
/* 
 * This is concept about dynamic polymorphism
 * In this concept we create an Object for child class
 * And we refer it using parent class object
 * In this way b1 can call all methods of base class and common method which is in Child class
 * b1 cannot call unique methods of Homepage. for that we have to create object for home page class exclusively
 * This is also called as top casting
 */
	b1obj.OpenBrowser();
	
	}

}
