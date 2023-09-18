package AccessModifierDemo2;

import AccessModifierDemo1.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Scenario1: cannot call outside package as modifier is default
		Access1 obj = new Access1();
		
		System.out.println(obj.hours);
		System.out.println(	obj.mins);  */
		
		// Scenario 2: public modifier
		
		Access1 obj = new Access1();
		System.out.println(obj.name);
		System.out.println(obj.tool);
		
		// Scenario 4: protected modifier
		// add the extends keyword now.
		// but you  will not be abel to call the variables with access 1 class object
		// create a new object for access3 class and then call the variables.
		
		Access3 obj1 = new Access3();
		System.out.println(obj1.x);
		System.out.println(obj1.z);
	}

}
