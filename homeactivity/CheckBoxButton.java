package week3.day1.homeactivity;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("User has to click the check button");
	}
	public static void main(String[] args) {
		CheckBoxButton obj3=new CheckBoxButton ();		
		obj3.clickCheckButton();
		obj3.submit();
		
	}
	

}
