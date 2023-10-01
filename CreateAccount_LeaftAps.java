package week2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount_LeaftAps {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//URL loaded
		driver.get("http://leaftaps.com/opentaps/");
		//Maximized the browser
		driver.manage().window().maximize();
		//Entered credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//clicked Login
		driver.findElement(By.id("decorativeSubmit")).click();
		//clicked "CRM/SFA"
		driver.findElement(By.linkText("CRM/SFA")).click();
		//clicked Account tab
		driver.findElement(By.id("Accounts")).click();
		//clicked Create Account
		driver.findElement(By.id("Create Account")).click();
		
//		- Enter an account name.
		
//		- Enter a description as "Selenium Automation Tester."
//		- Select "ComputerSoftware" as the industry.
//		- Select "S-Corporation" as ownership using SelectByVisibleText.
//		- Select "Employee" as the source using SelectByValue.
//		- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
//		- Select "Texas" as the state/province using SelectByValue.
//		- Click the "Create Account" button.
//		- Verify that the account name is displayed correctly.
//		- Close the browser window
//		
		
		
		
		

	}

}
