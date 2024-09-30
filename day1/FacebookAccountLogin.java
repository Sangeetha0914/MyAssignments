package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.javac.comp.Enter;

public class FacebookAccountLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://en-gb.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement create = driver.findElement(By.linkText("Create new account"));
		create.click();
	    WebElement name = driver.findElement(By.name("firstname"));				
	    name.sendKeys("Test");	    
	    WebElement sname = driver.findElement(By.name("lastname"));
	    sname.sendKeys("Leaf");	   
	    WebElement mob = driver.findElement(By.name("reg_email__"));
	    mob.sendKeys("+91 7252694585");
	    WebElement pwd = driver.findElement(By.id("password_step_input"));
	    pwd.sendKeys("Tester@123");  
	    WebElement date = driver.findElement(By.id("day"));
	    Select datedd=new Select(date);
	    datedd.selectByIndex(13);
	    WebElement month = driver.findElement(By.id("month"));
	    Select monthdd=new Select(month);
	    monthdd.selectByVisibleText("Jan");
	    WebElement year = driver.findElement(By.id("year"));
	    Select yeardd=new Select(year);
	    yeardd.selectByVisibleText("2000");
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	    driver.findElement(By.name("websubmit")).click();
	    
	
		
		
				
		
		
		
		
		

	}


		
	}


