package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC001Logintest {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vinay\\eclipse-workspace\\AutomationQA\\src\\test\\resources\\driverExecutables\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("signin_button")).click();
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		
		driver.findElement(By.name("submit")).click();
		
		System.out.println("to check the changes ARE PUSHED TO GIT");
		
		driver.quit();


	}

}
