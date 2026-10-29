package seleniumkerala;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {
	WebDriver driver;
	
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://keralaproperty.in/");
	
	}
	
@Test
public void titleverification()
{
	String expected="Kerala Real Estate Website | Kerala Property";
	String actual=driver.getTitle();
	if(expected.equals(actual))
	{
		System.out.println("Title verification: PASS");
	}
	else
	{
		System.out.println("Title verification: FAIL");
	}
		
	}



@Test
public void set()
{
	WebElement link=driver.findElement(By.linkText("Login / Signup"));
	link.click();
	WebElement username=driver.findElement(By.name("ulogin"));
	username.sendKeys("anu");
	WebElement password=driver.findElement(By.name("upass"));
	password.sendKeys("anu123");
	WebElement button=driver.findElement(By.id("sub_logbtn"));
	button.click();
}

}
