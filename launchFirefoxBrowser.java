import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class launchFirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		
		String KiteTest = driver.findElement(By.xpath("//div[@class='form-header text-center']//child::h2")).getText();
		System.out.println(KiteTest);
		WebElement userid = driver.findElement(By.cssSelector("input#userid"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		WebElement LoginBtn = driver.findElement(By.cssSelector("button.button-orange.wide"));
		Boolean KiteLogo = driver.findElement(By.xpath("//a[@class='logo kite-logo']//img")).isDisplayed();
		System.out.println(KiteLogo);
		userid.sendKeys("XA0364");
		password.sendKeys("123456789");
		LoginBtn.click();

	}

}
