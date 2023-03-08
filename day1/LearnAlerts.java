package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public final class LearnAlerts {
  public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
	Alert alert = driver.switchTo().alert();
	
	//alert.getText();
	alert.sendKeys("Sprite");
	alert.accept();
	
	String name2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
	System.out.println(name2);

}
}
