package kalam;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		//System.out.println("Hello World!");
		System.setProperty("webdriver.chrome.driver","D:\\Abdul\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("http://cortex.acr.org/ovid");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@name='ID']")).sendKeys("test1kb");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("testing");
		driver.findElement(By.xpath("//*[@name='submit:Start Ovid|Start Ovid']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[text()='Radiology Learning from ACR']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[text()='Continue'])[2]")).click();
		
		Thread.sleep(1000);
		
		ArrayList<String> s = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(s.get(1));
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("UserName")).sendKeys("prem_pspk");
		driver.findElement(By.name("Password")).sendKeys("o0p0o0p0");
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		Thread.sleep(1000);
		
		List<WebElement> l1 = driver.findElements(By.tagName("table"));
		System.out.println("Table Count:"+l1.size());
		
		List<WebElement> l5 = l1.get(0).findElements(By.tagName("tbody"));
		System.out.println("Table Body:"+l5.size());
		
		List<WebElement> l6 = l5.get(0).findElements(By.tagName("tr"));
		System.out.println("Table Rows:"+l6.size());
		
		
		for(int i=0;i<l6.size();i++) {
			
			List<WebElement> l7 = l6.get(i).findElements(By.tagName("td"));
					
			for(int j=0;j<l7.size();j++) {
				
				
				System.out.print(l7.get(j).getText());
				
				System.out.print("     ");
			
			}
			
			System.out.println("");
											
		}
		
		
			
		
			
			
		
		
	}

}
