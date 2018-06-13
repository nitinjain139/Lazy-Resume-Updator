import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriUpdater2 {
	
	public static void main(String[] args) {
		
		try {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.naukri.com/nlogin/login");
		//driver.get("https://www.naukri.com/mnjuser/profile?id=&altre1sid");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.findElement(By.id("usernameField")).sendKeys("nitinjain139@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("9355283112");
		driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn']")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@class='mTxt'  and contains(text(),'My Naukri')]"));
		 
        	Actions action = new Actions(driver);
       		action.moveToElement(element).perform();
        	driver.findElement(By.linkText("Edit Profile")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='secondary-content' and contains(text(),'Update')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("attachCV")).sendKeys("C:/Personal/Resume new/Updated_Resume_Nitin1.pdf");
		System.out.println("Resume uploaded successfully on Naukri.com");
		driver.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Found:"+e);
		}
	}
	

}
