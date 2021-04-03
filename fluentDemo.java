import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class fluentDemo {

	public static void main(String[] args) {
		System.setProperty ("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe" );
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/" );
		
		driver.manage().window().maximize() ;
		
		aTitle = driver.getTitle();
		
		if (aTitle.contentEquals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
			}
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(10, TimeUnit.MILLISECONDS) 			
				.pollingEvery(1, TimeUnit.MILLISECONDS) 			
				.ignoring(NoSuchElementException.class);
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>(){
		
			public WebElement apply(WebDriver driver ) {
				return driver.findElement(By.cssSelector("i.icon-wrench"));
			}
		});
		
		clickseleniumlink.click();
		
		driver.close() ;

	}

}
