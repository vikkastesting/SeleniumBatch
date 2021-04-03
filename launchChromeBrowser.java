import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("ravinangre@gmail.com");
		//String facebook_text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText();
		driver.findElement(By.id("pass")).sendKeys("123456789");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.cssSelector("button[name=login]")).click();
		//String FText = driver.findElement(By.className("_8esh")).getText();
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/a")).click();
		//driver.findElement(By.partialLinkText("Messen")).click();
		//System.out.println(FText);
		//System.out.println(facebook_text);
		 List<WebElement> links= driver.findElements(By.tagName("a"));
         
         //storing the size of the links
         int i= links.size();
         
         //Printing the size of the string
         System.out.println(i);
         
         for(int j=0; j<i; j++)
         {
             //Printing the links
             System.out.println(links.get(j).getText());
         }
	} 

}
