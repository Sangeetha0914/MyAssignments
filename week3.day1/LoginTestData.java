package week3.day1.homeactivity;

public class LoginTestData extends TestData {
	public void enterUsername() {
		
		System.out.println("The username is entered successfully");
	}
	public void enterPassword() {
		System.out.println("Password is entered");
	}
	public static void main(String[] args) {
		LoginTestData obj=new LoginTestData();
		System.out.println(obj.userName);
		System.out.println(obj.password);
		obj.enterUsername();
		obj.enterPassword();	
		obj.enterCredentials();
		obj.navigateToHomePage();
		
		
		
		
		
		
		
		

}
}

