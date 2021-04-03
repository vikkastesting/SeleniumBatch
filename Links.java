import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/frames");
		driver.manage().window().maximize();
		String maniwindow = driver.getWindowHandle();
		driver.switchTo().frame(1);
		String frameText =  driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		System.out.println(frameText);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[contains(text(),'Elements')]")).click();
		
		//List<WebElement> links = driver.findElements(By.tagName("iframe"));
		//System.out.println(links.size());
	}

}
