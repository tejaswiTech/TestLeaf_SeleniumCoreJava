package week3.XPathLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		//Entered credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//clicked Login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//clicked "CRM/SFA"
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		//clicked Leads
		driver.findElement(By.linkText("Leads")).click();
		
		
		//clicked Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//First lead captured from the results
		String firstLead=driver.findElement(By.xpath("//div[@unselectable='on']//a[contains(@class,'linktext')][1]")).getText();
		System.out.println("FirstLead is: "+firstLead);

		//clicked firstLead
		driver.findElement(By.xpath("//div[@unselectable='on']//a[contains(@class,'linktext')][1]")).click();
		
		//clicked Delete button
		driver.findElement(By.linkText("Delete")).click();
		
		//clicked Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		
		//Find captured LeadID
		driver.findElement(By.xpath("//label[text()='Lead ID:']//following::input[contains(@class,'x-form-text x-form-field')]")).sendKeys(firstLead);
		
		
		//clicked Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		
		//Message 'No records to display'
		driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println(firstLead+" lead ID is deleted.");
		
		//driver close
		driver.close();
	}

}
