package week3.XPathLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		
		//clicked Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//entered CompanyName
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("GL-Noida");
		
		//entered firstname
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Tejaswi");
		
		//entered lastname
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Rajput");
		
		//entered firstname (local)
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("tejas");
		
		//entered dept. name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		
		//entered desc.
		driver.findElement(By.id("createLeadForm_description")).sendKeys("this is to add lead");
		
		//entered email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("tejaswi.rajput5@gmail.com");
		
		//selected state
		WebElement state=  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateSelect= new Select(state);
		stateSelect.selectByVisibleText("New York");
		
		//clicked create button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		//clicked Edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//clear description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//imp. note field
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Automation course notes are important for QA!!");
		
		//clicked Update button
		driver.findElement(By.id("updateLeadForm_description")).click();
		
		//title of Resulting page
		System.out.println("Title of the Resulting page is: "+driver.getTitle());
		
		//browser window close
		driver.close();
		
		
		
				
		
		
		
		
				
						
		

	}

}
