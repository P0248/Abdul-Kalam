package kalam;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\Abdul\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r = new Robot();
				
		driver.get("https://cortex.acr.org/RadImprovehome");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("UserName")).sendKeys("tt05050339");
		driver.findElement(By.name("Password")).sendKeys("Titp42019!");
		driver.findElement(By.id("btnlogin")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Diagnostic Case']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='case_name_txt']")).sendKeys("Test Case MWeb");
		driver.findElement(By.id("c_scenario_txt")).sendKeys("Clinical Scenario");
		
//		driver.switchTo().defaultContent();
		driver.findElement(By.id("modality")).click();
		driver.findElement(By.xpath("//*[text()='3D reconstruction ']")).click();
		driver.findElement(By.xpath("//*[text()='Angiography ']")).click();
		driver.findElement(By.id("modality")).click();
		
		WebElement e = driver.findElement(By.xpath("//*[@id='case_name']/child::*[4]"));
		a.clickAndHold(e).build().perform();
				
		WebElement e1 = driver.findElement(By.xpath("(//*[@class='d-table-cell align-middle pl-2'])[1]"));
		a.release(e1).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[text()='Subspeciality ']")).click();
		driver.findElement(By.xpath("//*[text()='Abdominal ']")).click();
		driver.findElement(By.xpath("//*[text()='Body ']")).click();
		driver.findElement(By.xpath("//*[text()='Subspeciality ']")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id='category']")).click();
		driver.findElement(By.xpath("//*[text()=' Near Miss ']")).click();
		driver.findElement(By.xpath("//*[text()=' Procedural complication ']")).click();
		driver.findElement(By.xpath("//*[@id='category']")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[text()='browse files']")).click();
		
		Thread.sleep(5000);
		
		StringSelection x = new StringSelection("D:\\new\\aum.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(500);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
	/*	driver.findElement(By.xpath("//*[@id='q_stem_txt']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@aria-label='Bold']/descendant::*[2]")).click();
	//	driver.findElement(By.xpath("//*[@aria-label='Italic']/child::*")).click();
*/		driver.findElement(By.xpath("//*[@id='q_stem_txt']")).sendKeys("Multiple Choice Question for Testing");
		Thread.sleep(500);
		
		
		
		
		
		
		
//		Thread.sleep(10000);
//		driver.quit();
	}

}
