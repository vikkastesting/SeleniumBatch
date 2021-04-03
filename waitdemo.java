import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8830158607");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12334555");
		
		driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Ne')]")).click();
		//Thread.sleep(10000);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[name='firstname']"))).sendKeys("ravi");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(60, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		WebElement firstname = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.cssSelector("input[name='firstname']"));
			}
		});
		
		firstname.sendKeys("ravi");
		
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("nangare");
		
	}

}
