package week3.day1.homeactivity;

public class LoginPage extends BasePage {
	public void performCommonTasks() {
		System.out.println("Regular activities");
	}
	public static void main(String[] args) {
		LoginPage obj=new LoginPage();
		obj.performCommonTasks();
	}
}


