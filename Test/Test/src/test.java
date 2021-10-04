

import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertNull;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class test  {
	
	static WebDriver driver;
	WebElement ele;
	
	@BeforeClass
	public static void start() {
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sudakshina\\Downloads\\chromedriver_win32\\chromedriver.exe");

	}
	
	@Test
     public void ValidUser() throws Exception {
		 ChromeDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("http://localhost:8080/selinumtesting/start.jsp");
			WebElement uname = driver.
					findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/input"));
			uname.sendKeys("669");
	                Thread.sleep(2000);
	                WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/input"));
			pass.sendKeys("suwarna34");
	               Thread.sleep(2000);
			WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]/button"));
			login.click();
			 Thread.sleep(2000);
		try {
		ele = driver.findElement(By.xpath("/html/body/div/h4"));
		}
		catch(Exception e) {
			
		}
		assertNotNull(ele);
		driver.quit();
	}

	@Test
	public void InvalidUser() throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/selinumtesting/start.jsp");
		driver.get("http://localhost:8080/selinumtesting/start.jsp");
		WebElement uname = driver.
				findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[1]/input"));
		uname.sendKeys("100005");
                Thread.sleep(2000);
                WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/input"));
		pass.sendKeys("12900");
               Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]/button"));
		login.click();
		 Thread.sleep(2000);
	try {
	ele = driver.findElement(By.xpath("/html/body/div/h4"));
	}
	catch(Exception e) {
		
	}
		assertNull(ele);
		driver.quit();
	}
	
	@AfterClass
	public static void stop() {
	}
}
