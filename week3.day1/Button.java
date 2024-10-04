package week3.day1.homeactivity;

public class Button extends WebElement {
	
	public void submit() {
	    System.out.println("Submit done successfully");
	}
	public static void main(String[] args) {
		Button obj1=new Button();
		System.out.println(obj1.text);	
		obj1.submit();
		obj1.click();
		obj1.setText();
		
	}
	

}



