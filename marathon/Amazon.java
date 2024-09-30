package marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement result = driver.findElement(By.xpath("//span[contains(text(),'bags for boys')]"));
		System.out.println("The result page is :"+result.getText());
		WebElement bagpriceresult = driver.findElement(By.xpath("//span[contains(text(), 'results for')]"));
	    System.out.println("The Bag price results"+bagpriceresult.getText());	
		
		driver.findElement(By.xpath("//span[contains(text(),'Safari')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Skybags')]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']/following::span[text()='Safari']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']/following::span[text()='Skybags']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	    driver.findElement(By.xpath("//span[text()='New Arrivals']")).click();
		Thread.sleep(3000);
		WebElement bagname = driver.findElement(By.xpath("//span[contains(text(),'Skybags')]"));
	    System.out.println("Bag name is "+bagname.getText());
		WebElement bagprice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Bag Price is "+bagprice.getText());
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		//driver.close();
		
		
		


		
		
		
		
		
			}

}
