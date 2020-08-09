import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFIrstProject {
WebDriver driver;

public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver", "/Users/nawaz/SeleniumDemo/SeleniumTestProject/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.ibm.com");
	driver.manage().window().maximize();
}
	public static void main(String[] args) {
		
		SeleniumFIrstProject obj = new SeleniumFIrstProject();
		obj.launchBrowser();
		


	}

}
