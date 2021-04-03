import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class mouseeventDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Java Jars and browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demoqa.com/buttons");
	
		//driver.get("https://demoqa.com/droppable/");
	//	driver.get("https://www.demoqa.com/tool-tips/");
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		/*
		WebElement DoubleClick = driver.findElement(By.id("doubleClickBtn"));
		WebElement RightClick = driver.findElement(By.id("rightClickBtn"));
		WebElement DynamicClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']//parent::div//following-sibling::div//button"));
		
		Actions action = new Actions(driver);
		action.doubleClick(DoubleClick).build().perform();
		action.contextClick(RightClick).build().perform();
		action.click(DynamicClick).build().perform();
		*/
	//	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	//	WebElement dest = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		
		Actions action = new Actions(driver);
	//	action.dragAndDrop(source, dest).build().perform();
		
	//	WebElement TooltipBtn = driver.findElement(By.xpath("//button[@id='toolTipButton']"));
		
	//	action.moveToElement(TooltipBtn).build().perform();
		
	//	Thread.sleep(1000);
		
	//	WebElement tooptip = driver.findElement(By.xpath("//*[contains(text(),'You hovere')]"));
		
	//	String TooltipText = tooptip.getText();
		
	//	System.out.println(TooltipText);
		WebElement SubmitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		
		driver.findElement(By.id("userName")).sendKeys("ravi");
		driver.findElement(By.id("userEmail")).sendKeys("ravinangre@gmail.com");
		WebElement CurrentAdd = driver.findElement(By.id("currentAddress"));
		CurrentAdd.sendKeys("Ambajogai");
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		action.sendKeys(Keys.TAB);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		action.sendKeys(Keys.TAB);
		
		//WebElement PerAdd = driver.findElement(By.id("permanentAddress"));
		//PerAdd.sendKeys("Pune");
		action.moveToElement(SubmitBtn).build().perform();
		SubmitBtn.click();
		
	}

}
