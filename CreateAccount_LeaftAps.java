package week2.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_LeaftAps {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		//URL loaded
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximized the browser
		driver.manage().window().maximize();
		//Entered credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//clicked Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//clicked "CRM/SFA"
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//clicked Account link
		driver.findElement(By.linkText("Accounts")).click();
		
		//clicked Create Account
		driver.findElement(By.linkText("Create Account")).click();
		
       //Enter an account name.
		String created_account="tejaswi_QA07";
		driver.findElement(By.id("accountName")).sendKeys(created_account);
		
//		- Enter a description as "Selenium Automation Tester."
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
//		- Select "ComputerSoftware" as the industry.
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select computerIndustry = new Select(industry);
		computerIndustry.selectByValue("IND_SOFTWARE");
		
//		- Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sCorporation = new Select(ownership);
		sCorporation.selectByVisibleText("S-Corporation");
		
//		- Select "Employee" as the source using SelectByValue.
		WebElement datasource = driver.findElement(By.id("dataSourceId"));
		Select leadEmployee = new Select(datasource);
		leadEmployee.selectByValue("LEAD_EMPLOYEE");
		
//		- Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketingCampaignId = driver.findElement(By.id("marketingCampaignId"));
		Select siteeCommerce = new Select(marketingCampaignId);
		siteeCommerce.selectByIndex(5);
		
//		- Select "Texas" as the state/province using SelectByValue.
		WebElement generalStateProvinceGeoId = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(generalStateProvinceGeoId);
		state.selectByValue("TX");
		
//		- Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();

//		- Verify that the account name is displayed correctly, though looks less good because I think, need to read element there on Account screen by Xpath or else.
         Thread.sleep(500);
         driver.findElement(By.className("subMenuButton")).click();
         boolean account_created=driver.findElement(By.id("accountName")).isDisplayed();
         Thread.sleep(500);
         
		if(account_created)
         {
	     System.out.println("Account is created");
	              }
		else
			System.out.println("Account is not created");
		
//		- Close the browser window
		driver.close();
	}

}
