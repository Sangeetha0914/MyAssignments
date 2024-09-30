package week2.day2.homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf0914");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Sangeetha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ramanrao");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Soniya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf123@gmail.com");
		WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedd=new Select(state);		
		statedd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//span[text()='Description']"));
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.xpath("//span[text()='Important Note']"));		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Title");

		if(title.contains("opentaps")){
	     System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
			
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
	}
	
		
		
		
		

	
