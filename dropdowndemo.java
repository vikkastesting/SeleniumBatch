import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions action = new Actions(driver);
		WebElement CreateAcc = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		CreateAcc.click();
		// Handle static dropdown using select class
		Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		day.selectByIndex(1);
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByValue("7");
		
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		
		year.selectByVisibleText("2000");
		
		driver.navigate().to("https://www.spicejet.com/");
		
		WebElement passnger = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passnger.click();
		
		Select adult =new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']")));
		adult.selectByVisibleText("4");
		
		//Handle Dynamic Dropdown
		 * 
		 */
		driver.get("https://demoqa.com/select-menu");
		
	//	WebElement dropdown = driver.findElement(By.xpath("//div[@class=' css-1hwfws3']//div[contains(text(),'Option')]"));
	//	dropdown.click();
	//	driver.findElement(By.xpath("//*[contains(text(),'Group 1, option 1')]")).click();
		
		//action.sendKeys(Keys.TAB).build().perform();
	//	action.sendKeys(Keys.TAB).build().perform();
	//	action.sendKeys(Keys.TAB).build().perform();
		
		WebElement multiselect = driver.findElement(By.xpath("//*[contains(text(),'Multiselect drop down')]//ancestor::p//following-sibling::div//div//div[@class=' css-1hwfws3']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		multiselect.click();
		//js.executeScript("arguments[0].click();", multiselect);
	//	action.moveToElement(multiselect).build().perform();
		
	//	action.click(multiselect).build().perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Green')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Blue')]")).click();
		
	}

}
