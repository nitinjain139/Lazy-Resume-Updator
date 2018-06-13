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
		//---------------------------------------------------------------------------------------------------------------------------------
		
		driver.get("https://www.indeed.com");
		
		//driver.navigate().to("https://www.indeed.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.id("signin_email")).sendKeys("nitinjain139@gmail.com");
		driver.findElement(By.id("signin_password")).sendKeys("9355283112");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("userOptionsLabel")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Edit Resume')]")).click();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:/Personal/Resume new/Updated_Resume_Nitin1.pdf");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='form-control ']")).sendKeys("Software Developer");
		driver.findElement(By.xpath("//label[contains(text(),'Full-time')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Fresher')]")).click();
		driver.findElement(By.xpath("//input[@class='form-control salary-text form-control']")).sendKeys("320000");
		driver.findElement(By.xpath("//input[@data-shield-id='relocation-check']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		
		System.out.println("Indeed Resume upload successfully");
		
		Thread.sleep(2000);
		driver.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Found:"+e);
		}
	}
	

}
