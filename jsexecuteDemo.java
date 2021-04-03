import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecuteDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement LoginButton = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		
		username.sendKeys("ravi");
		password.sendKeys("nangre");
		
		//For click
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", LoginButton);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//For custom alert messages
		js.executeScript("alert('Welcome to Utkarshaa');");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		String DomainName = js.executeScript("return document.domain;").toString();			
        System.out.println("Domain name of the site = "+DomainName);					
          		
        //Fetching the URL of the site. Tostring() change object to name		
        String url = js.executeScript("return document.URL;").toString();			
        System.out.println("URL of the site = "+url);					
          		
       //Method document.title fetch the Title name of the site. Tostring() change object to name		
       String TitleName = js.executeScript("return document.title;").toString();			
       System.out.println("Title of the page = "+TitleName);	
		
       js.executeScript("window.location = 'https://www.toolsqa.com/'");
       js.executeScript("window.scrollBy(0,1600)");
		//LoginButton.click();
	}

}
