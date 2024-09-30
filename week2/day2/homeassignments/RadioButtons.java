package week2.day2.homeassignments;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();
		WebElement radiobutton = driver.findElement(By.xpath("(//label[text()='Hyderabad'])[1]"));
		
		radiobutton.click();
		System.out.println(radiobutton.isEnabled());
		if(radiobutton.isEnabled()) {
			System.out.println("Radio button is enable");
		}else {
			System.out.println("Radio button is not enable");
		}
			
		radiobutton.click();
		
		System.out.println(radiobutton.isSelected());
		if(radiobutton.isSelected()) {
			System.out.println("Radio button is selected ");			
		}else {		
		System.out.println("Radio button is not selected");

	}
		WebElement defaulted = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[4]"));
		boolean selected = defaulted.isEnabled();
		System.out.println(selected);
		WebElement checkSelected = driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-bullet ui-c'])[5]"));
		if(checkSelected.isEnabled()) {
			System.out.println("Already selected");
		}else {
			checkSelected.click();
		}
	}
}

			
		
		
	
	