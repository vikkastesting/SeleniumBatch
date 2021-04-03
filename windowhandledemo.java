import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandledemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement NewTab = driver.findElement(By.xpath("//button[@id='tabButton']"));
		WebElement NewWindow = driver.findElement(By.xpath("//button[@id='windowButton']"));
		WebElement NewWindowMesg = driver.findElement(By.xpath("//button[@id='messageWindowButton']"));
		NewTab.click();
		NewWindow.click();
		//NewWindowMesg.click();
		
	//	WebElement text = driver.findElement(By.id("sampleHeading"));
    //    System.out.println("Heading of child window is " + text.getText());
		
		String MainWindow = driver.getWindowHandle();
		
		Set<String> childWinows = driver.getWindowHandles();
		Iterator<String> iterator = childWinows.iterator();
		while(iterator.hasNext()) {
			
			String childWindow = iterator.next();
			if(!MainWindow.equalsIgnoreCase(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
                System.out.println("Heading of child window is " + text.getText());
			}
			
		}
		System.out.println(childWinows.size());
		driver.quit();
	}
	
}
