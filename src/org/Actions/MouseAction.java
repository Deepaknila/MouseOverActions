package org.Actions;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class MouseAction {
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Acer\\\\\\\\eclipse-workspace\\\\\\\\Facebook\\\\\\\\Drivers\\\\\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
	
//		WebElement xx = driver.findElement(By.xpath("//button[text()='✕']"));
//		xx.click();
//		
		WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
		user.sendKeys("deepak");
		
	
		Actions ac = new Actions(driver);
//		Thread.sleep(5000);
//		ac.doubleClick(user).perform();
//		ac.contextClick().perform();
//		
//		Robot r = new Robot();
//		
//		
		
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    
//	    r.keyPress(KeyEvent.VK_DOWN);
//	    r.keyRelease(KeyEvent.VK_DOWN);
//	    
//	    r.keyPress(KeyEvent.VK_ENTER);
//	    r.keyRelease(KeyEvent.VK_ENTER);
//	    
//	    r.keyPress(KeyEvent.VK_TAB);
//	    r.keyRelease(KeyEvent.VK_TAB);
//	    
//	    
//	    r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_V);
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_V);
//	    
//	    TakesScreenshot tk = (TakesScreenshot)driver;
//	    File src = tk.getScreenshotAs(OutputType.FILE);
//	    File save = new File("C:\\Users\\Acer\\eclipse-workspace\\MouseOverAction\\Lib\\facebook");
//	    FileUtils.copyFile(src, save);
//	    
	    
		
		
		
	    
			
	}

}
