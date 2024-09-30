package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf02");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement dd = driver.findElement(By.name("industryEnumId"));
		Select obj=new Select(dd);
		obj.selectByIndex(3);
		WebElement dd1 = driver.findElement(By.name("ownershipEnumId"));
		Select obj1=new Select(dd1);
		obj1.selectByVisibleText("S-Corporation");
		WebElement dd2 = driver.findElement(By.id("dataSourceId"));
		Select obj2=new Select(dd2);
		obj2.selectByValue("LEAD_EMPLOYEE");
		WebElement dd3 = driver.findElement(By.id("marketingCampaignId"));
		Select obj3=new Select(dd3);
		obj3.selectByIndex(6);
		WebElement dd4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select obj4=new Select(dd4);
		obj4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("Title");
		if(title.contains("opentaps")) {
			System.out.println("Title is verified");
		}else {
			System.out.println("Title is not verified");
			
			
		}
	

		
		

	}

}
