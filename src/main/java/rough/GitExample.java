package rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GitExample {
	
	@Test
	public void doLogin() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.quit();
		
	}
	
	

}
