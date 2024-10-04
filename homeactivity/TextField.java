package week3.day1.homeactivity;

public class TextField extends WebElement {
	public void getText() {
		System.out.println("Got the text successfully ");
		
	}
	public static void main(String[] args) {
		TextField obj2=new TextField();
		System.out.println(obj2.text);
		obj2.getText();
		obj2.click();
		obj2.setText();
		
	}

}
