package week2.day2.homeassignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		System.out.println("Dashboard");
		if(title.contains("Dashboard")) {
			System.out.println("Title is verified");
			
		}else {
			System.out.println("Title is not verified");
			
		}
		driver.navigate().back();
		WebElement checkButton = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']/following-sibling::button"));
		boolean enabled = checkButton.isEnabled();
		if(enabled==true) {
			System.out.println("confirm button is enabled");
		}else {
			System.out.println("confirm button disabled");
        }
        WebElement position = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
        Point location = position.getLocation();
        System.out.println(location);
        String text = position.getText();
        System.out.println(text);
        position.click();
        WebElement getColor = driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
		String cssValue = getColor.getCssValue("background-color");
		System.out.println(cssValue);
		WebElement saveButtonColor = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save']//parent::button"));
        String cssValue1 = saveButtonColor.getCssValue("background-color");
        System.out.println(cssValue1);
        WebElement htwd = driver.findElement(By.xpath("(//span[text()='Submit'])[2]//parent::button"));
        int height = htwd.getSize().getHeight();
        System.out.println("Height of the button is :"+height);
        int width = htwd.getSize().getWidth();      
        System.out.println("Width of the button is:"+width);
        //driver.close();
        
        
        
	

	

	







	
            
	
}
}

