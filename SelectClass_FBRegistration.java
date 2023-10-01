package week2.Assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_FBRegistration {

	public static void main(String[] args) throws InterruptedException {
		// ChromeDriver initialized 
		ChromeDriver driver = new ChromeDriver();
		
		//URL loaded
		driver.get("https://en-gb.facebook.com/");
		
		//window maximized
		driver.manage().window().maximize();
		
		//implicit wait until 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//clicked Create Account
		driver.findElement(By.linkText("Create new account")).click();
		
		//entered values in text fields
		driver.findElement(By.name("firstname")).sendKeys("Tejaswi");
		driver.findElement(By.name("lastname")).sendKeys("Rajput");
		driver.findElement(By.name("reg_email__")).sendKeys("9716150899");
		driver.findElement(By.id("password_step_input")).sendKeys("tejaswiFB@123");
		
		//drop-downs handling
		WebElement day = driver.findElement(By.id("day"));
		Select birth_date=new Select(day);
		birth_date.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("month"));
		Select birth_month=new Select(month);
		birth_month.selectByValue("8");
		   
		WebElement year = driver.findElement(By.id("year"));
		Select birth_year=new Select(year);
		birth_year.selectByValue("1989");
		
		//selecting male radio button
		driver.findElement(By.xpath("//input[@value='2']")).click();
	}
}
