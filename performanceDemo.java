import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class performanceDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Long startTime = System.currentTimeMillis();
		
		//First way
		driver.get("https://www.toolsqa.com");
		WebElement SeleniumTraining = driver.findElement(By.xpath("//ul[@id='primary-menu']//span[contains(text(),'Selenium Training')]"));
		SeleniumTraining.click();
		driver.navigate().back();
		driver.navigate().forward();
		//Second way
		driver.navigate().to("https://www.google.com");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Third way
	
		js.executeScript("window.location = 'http://demo.guru99.com/'");
		driver.navigate().back();
		driver.navigate().refresh();
		//Long startTime = System.currentTimeMillis();
	    //driver.get("https://www.demoqa.com/");
	    long diff = System.currentTimeMillis() - startTime;
	    System.out.println("Load time was " + diff);
	}

}
