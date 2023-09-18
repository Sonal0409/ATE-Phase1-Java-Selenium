package oopsInheritence;

public class HomePage extends Base{

	/* OverRiding */
	
	public void OpenBrowser()
	{
		System.out.println("Open Default Firefox Browser");
	}
	
	public void HomePage()
	{
		System.out.println("This is Home Page");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		HomePage hp = new HomePage();
		
		/* Overriding concept allows java to call current class menthods instead of base class methods
		 * In case both classes have same name method
		 */
		hp.OpenBrowser();
		hp.login();
		hp.HomePage();
		hp.logout();
		
	

	}

}
