import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arvit 
{

public static void main(String[] args)

{
	System.setProperty("webdriver.chrome.driver", "E:\\\\Vikas Testing Notes\\\\Selenium Files\\\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();

	driver.get("https://www.spicejet.com/");

	driver.manage().window().maximize();	

}

}
