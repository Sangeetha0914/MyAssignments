package marathon;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import  org.openqa.selenium.StaleElementReferenceException;
public class PVRCINREMAS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
	    driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();	
	    driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[3]")).click();	  
	    driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[6]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[1]")).click();
	    driver.findElement(By.xpath("//span[text()='Book']")).click();
	    driver.findElement(By.xpath("//button[text()='Accept']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[@id='CL.CLUB|H:4']")).click();
	    WebElement seatNumber = driver.findElement(By.xpath("//div[@class='seat-number']"));
	    System.out.println("Seat Number is :" + seatNumber.getText());
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	    WebElement seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']"));
	   System.out.println("Print the Seat info : " + seatInfo.getText());
	   Thread.sleep(3000)
	   ;WebElement grandTotal = driver.findElement(By.xpath("//span[text()='209.68']"));
	   System.out.println("Grand Total is : " + grandTotal);
	   driver.findElement(By.xpath("//button[text()='Proceed']")).click();
	   driver.findElement(By.xpath("(//div[@class='cross-icon mx-2'])[2]")).click();
	   String currentPageTitle = driver.getTitle();
	   System.out.println("Current Page Title is : " + currentPageTitle);
	   driver.close();
	   	}
	 
	    
	    
	    
	    
	  
	   
	    


     
	   

		

	}


