package kalam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Cortex {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		JavascriptExecutor js;
		Actions a = new Actions(driver);
		
		driver.get("https://cortexuat.acr.org/cortex");
		
		driver.findElement(By.xpath("//*[@name='UserName']")).sendKeys("05102906");
		driver.findElement(By.xpath("//*[@name='Password']")).sendKeys("Titp42017!");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		
		
		driver.findElement(By.xpath("//*[@routerlink='case/create']")).click();
		
		//Thread.sleep(10000);
		
		//WebElement e1 = driver.findElement(By.xpath("//*[@id='txtCaseName' and @type='text']"));
		//a.click(e1).sendKeys("Case1").build().perform();//*[@id='SelectedProduct']/child::*[6]
		
		driver.findElement(By.xpath("//*[@id='txtCaseName' and @type='text']")).sendKeys("PKCase1");
		driver.findElement(By.xpath("//*[@id='txtDiagnosis']")).sendKeys("Test1");
		
		WebElement e1 = driver.findElement(By.xpath("//*[@id='SelectedProduct']"));
		a.click(e1).build().perform();
		Thread.sleep(5000);
		Select s1 = new Select(e1);
		s1.selectByIndex(5);
		a.click(e1).build().perform();
		
		WebElement e2 = driver.findElement(By.xpath("//*[@id='selectedCourse']"));
		a.click(e2).build().perform();
		Thread.sleep(5000);
		Select s2 = new Select(e2);
		s2.selectByIndex(5);
		a.click(e2).build().perform();
		
		WebElement e3 = driver.findElement(By.xpath("//*[@id='selectedCategory1']"));
		a.click(e3).build().perform();
		Thread.sleep(5000);
		Select s3 = new Select(e3);
		s3.selectByIndex(1);
		a.click(e3).build().perform();
		
		driver.findElement(By.xpath("(//*[text()='Create Case'])[3]")).click();
		
		
	}

}
