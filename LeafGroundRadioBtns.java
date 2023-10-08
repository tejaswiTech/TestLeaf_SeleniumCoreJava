package week3.XPathLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundRadioBtns {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//launch browser
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//maximize browser
		driver.manage().window().maximize();
		
	    //Selected "Chrome" as "Select 'Your most favourite browser' from the radio buttons"
		driver.findElement(By.xpath("//h5[text()='Your most favorite browser']//following-sibling::div//label[text()='Chrome']")).click();
		
		//Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
		driver.findElement(By.xpath("//h5[text()='UnSelectable']//following-sibling::div//label[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//h5[text()='UnSelectable']//following-sibling::div//label[1]")).click();
		if(!driver.findElement(By.xpath("//h5[text()='UnSelectable']//following-sibling::div//label[1]")).isSelected());
		System.out.println("Browser is now unselected!!");	
		
		
		//Identify the radio button that is initially selected by default.
		String selectedBroswer="";
		boolean browserSelected=false;
		for(int i=1;i<=4;i++)
		{
		   browserSelected= driver.findElement(By.xpath("//h5[text()='Your most favorite browser']//following-sibling::div[@class='grid formgrid']//td["+i+"]/label")).isSelected();
		   if(browserSelected)
           {
	    		selectedBroswer=driver.findElement(By.xpath("//h5[text()='Your most favorite browser']//following-sibling::div[@class='grid formgrid']//td["+i+"]/label")).getText();
	    		System.out.println(selectedBroswer+" browser is selected.");
	    		break;
	    	}
	    	
		}
		
		//Check and select the age group (21-40 Years) if not already selected.
	    if(driver.findElement(By.xpath("//h5[text()='Select the age group (only if not selected)']//following-sibling::div//label[text()='21-40 Years']")).isSelected());
	    System.out.println("21-40 Years checkbox is already selected.");
	    
	    //browser close
	    driver.close();
	    
	}

}
