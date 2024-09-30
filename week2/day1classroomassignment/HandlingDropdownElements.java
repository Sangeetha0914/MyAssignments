package week2.day1classroomassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("DemoSalesManager");
		Thread.sleep(5000);		
		user.clear();
		Thread.sleep(3000);
		user.sendKeys("DemoCsr");
		
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
     	WebElement login=driver.findElement(By.className("decorativeSubmit"));
     	login.click();
     	driver.findElement(By.linkText("CRM/SFA")).click();
     	driver.findElement(By.linkText("Leads")).sendKeys("Leads");
     	driver.findElement(By.linkText("Leads")).click();
     	driver.findElement(By.linkText("Create Lead")).click();
     	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
     	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
     	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sanjay");
     	
     			WebElement dd = driver.findElement(By.id("createLeadForm_dataSourceId"));
     			Select obj=new Select(dd);
     			obj.selectByIndex(4);
     			WebElement dd1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
     			Select obj1=new Select(dd1);
     			obj1.selectByVisibleText("Automobile");
     			WebElement dd2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
     			Select obj2=new Select(dd2);
     			obj2.selectByValue("OWN_CCORP");
     			driver.findElement(By.name("submitButton")).click();
     			String title = driver.getTitle();
     			System.out.println("title");
     			if (title.contains("opentaps")) {
     			System.out.println("title is verified");
	} else {
	
		System.out.println("title is not verified");
		driver.close();
	}
	}
	
}



	
	
	 
	


     			
	

		
	
	
	
	
		
	
	
     		
     			
     			
     
     	
     	
     	
     
     
     	
     	
     	
     	
     	
    
     	
     
     	
     	
     	
     	
     
     	
     	
     	
     	
     
     	
     	
     	
     	
     	 
     	
		

	


