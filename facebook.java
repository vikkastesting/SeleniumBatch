import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8830158607");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12334555");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();

	}

}
