package week1.day2;

public class Browser {

	public static void main(String[] args) {
		
		Browser b= new Browser();
		b.launchBrowser("Browser launched successfully");
		b.loadUrl();
	}
	
	public void launchBrowser(String browserName)
	{
		System.out.println(browserName);
	}
	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}

}
