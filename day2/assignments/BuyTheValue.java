package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class BuyTheValue {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	/* 1. Load https://buythevalue.in/
2. Click on first product (eg: Hamdard Hing - 50GM)
//Handle Frame
3. Close chat widget
4. Enter the pincode 
5. Click on Check
6. Click on ADD TO CART
7. Click on View
8. Click on CHECK OUT
//Handle alert
9. Accept the alert
*/
	
	driver.get("https://buythevalue.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
}
}
