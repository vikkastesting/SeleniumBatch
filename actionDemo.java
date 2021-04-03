import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		WebElement Link_Home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));
		
		Actions action = new Actions(driver);
		String bgcolor = td_Home.getCssValue("BACKGROUND");
		System.out.println("Before hover: " + bgcolor); 
		action.moveToElement(Link_Home).build().perform();
		bgcolor = td_Home.getCssValue("BACKGROUND");
		System.out.println("Before hover: " + bgcolor);
	}

}
