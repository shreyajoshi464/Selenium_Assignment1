package code;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Rate {

	WebDriver dr;
	String url="https://accounts.google.com/signup";
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		dr=new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		dr.quit();
	}

	@Test
	public void test() {
        dr.findElement(By.id("firstName")).sendKeys("Rasika");
		
		dr.findElement(By.id("lastName")).sendKeys("Desai");
		
		WebElement username = dr.findElement(By.id("username"));
		
		username.sendKeys("def123abc98");
		
		System.out.println(username.getAttribute("value"));
		
		dr.findElement(By.name("Passwd")).sendKeys("Rasi@7891");
		
		dr.findElement(By.name("ConfirmPasswd")).sendKeys("Rasi@7891");
		
		dr.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span")).click();
		
		String value =dr.findElement(By.id("headingText")).getText();
		System.out.println(value);
	}

}
