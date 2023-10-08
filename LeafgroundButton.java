package week3.XPathLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class LeafgroundButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//URL loaded
		driver.get("https://leafground.com/button.xhtml");
		
		//Maximized the browser
		driver.manage().window().maximize();
		
//		- Click on the button with the text ‘Click and Confirm title using XPath
		driver.findElement(By.xpath("//h5[text()='Click and Confirm title.']//following-sibling::button/span[text()='Click']")).click();
		
//		- Verify that the title of the page is ‘dashboard.
		System.out.println(driver.getTitle());
		
//		- Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
		driver.navigate().back();
		boolean isEnabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']//following-sibling::button")).isEnabled();
		if(!isEnabled)
		System.out.println("'Confirm if the button is disabled.' button is Disabled");
		
//		- Find and print the position of the button with the text ‘Submit.’
		String submitPosition=driver.findElement(By.id("j_idt88:j_idt94")).getLocation().toString();
		System.out.println("Submit button position is: "+submitPosition);

		
//		- Find and print the background color of the button with the text ‘Find the Save button color.
		Color findbtnColor=Color.fromString(driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color"));
		System.out.println("'Find the Save button color'"+ " button color is: "+findbtnColor);
		
//		- Find and print the height and width of the button with the text ‘Find the height and width of this button.
		int btnHeight= driver.findElement(By.id("j_idt88:j_idt98")).getSize().getHeight();
		int btnWidth= driver.findElement(By.id("j_idt88:j_idt98")).getSize().getWidth();
		System.out.println("‘Find the height and width of this button."+" button height is "+btnHeight+" width is "+btnWidth);
		
		
//		- Close the browser window.
	    driver.close();	

	}

}
