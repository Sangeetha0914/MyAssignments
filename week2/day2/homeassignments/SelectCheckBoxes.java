package week2.day2.homeassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get(" https://leafground.com/checkbox.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.xpath("//span[text()='Basic']")).click();
driver.findElement(By.xpath("//span[text()='Ajax']")).click();
driver.findElement(By.xpath("//label[text()='Java']")).click();
driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following::div[3]")).click();
driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following::div[3]")).click();
WebElement checkbox = driver.findElement(By.xpath("//span[@class='ui-chkbox-label ui-state-disabled']"));
boolean enabled = checkbox.isEnabled();
System.out.println("disabled");
//Multiple select options

//Select dd=new Select(element);
//List<WebElement> options = dd.getOptions();
//int size = options.size();
//System.out.println(size);
//for(int i=0;i<options.size();i++) {
//Thread.sleep(3000);
//options.get(i).click();
}
	}










	


