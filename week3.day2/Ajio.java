package week3.day2.homeactivity;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.findElement(By.name("searchVal")).sendKeys("bags");	    
		driver.findElement(By.xpath("//span[@class='ic-search']")).submit();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		WebElement items = driver.findElement(By.className("length"));
		System.out.println("The total no of items is :"+items.getText());
		List<WebElement> brands = driver.findElements(By.className("brand"));
		int count = brands.size();
		
		System.out.println(count);
		System.out.println("The brands name are:");
		for (int i = 0; i <brands.size(); i++) {
			
			System.out.println(brands.get(i).getText());
		}
		List<WebElement> bagsname = driver.findElements(By.className("nameCls"));
		int count1 = bagsname.size();
		System.out.println(count1);
		System.out.println("The bag names are :");
		for (int i = 0; i <bagsname.size(); i++) {
			System.out.println(bagsname.get(i).getText());
			
		}
			
			
	}
}

		
		


		
		
		
		
		
		
	
		
		
		
		
		
		

	

	
