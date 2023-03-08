package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/drag.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//driver.findElement(By.xpath(null))
	
	
	//2nd 
    
	WebElement draggable = driver.findElement(By.id("form:drop_header"));
	WebElement destination = driver.findElement(By.id("form:drag_content"));
	
	Actions builder = new Actions(driver);
	builder.dragAndDrop(draggable, destination).perform();
	
	
}
}
