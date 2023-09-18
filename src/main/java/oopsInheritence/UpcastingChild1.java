package oopsInheritence;

public class UpcastingChild1 extends UpCastingBase1{
	
String name;
	
	public void say()
	{
		System.out.println(" This is an Aquatic animal");
	}
	
	public static void doanimalstuff( UpCastingBase1 animal)
	{
		animal.say();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UpCastingBase1 a= new UpcastingChild1();
          
		doanimalstuff(a);
		
		a.say();
	}
}
