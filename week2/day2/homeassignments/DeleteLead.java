package week2.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9688410017");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();


		driver.findElement(By.linkText("10004")).click();
		driver.findElement(By.linkText("Delete")).click();


		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.name("id")).sendKeys("10004");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.close();
	}

		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		

	
	

	


