package kalam;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeletePages {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Abdul\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		Robot r = new Robot();
				
		driver.get("https://cortex.acr.org/Cortex/activitydesigner/assignment");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("UserName")).sendKeys("prem_pspk");
		driver.findElement(By.name("Password")).sendKeys("o0p0o0p0");
		driver.findElement(By.id("btnlogin")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@routerlink='administration/informationpage']")).click();
		
		driver.findElement(By.xpath("//*[text()='Assignments']/following-sibling::*[1]")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.id("lnkInfo")).click();
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();

		Thread.sleep(3000);
		
		//driver.findElement(By.id("lnkInfo")).click();
		
		Thread.sleep(20000);
		driver.quit();

	}

}
