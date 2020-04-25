package App;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	
	public static void my_test() 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHAL\\Documents\\Chrome Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	String url = "https://github.com/edureka-devops/projCert";
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul[2]/li[6]/a")).click();
	String title = driver.getTitle();
	assertEquals(title, "About · GitHub");
	System.out.println("Title is: " +title);
	System.out.println("Test Succeeded!!");
	driver.quit();
		}
	}
