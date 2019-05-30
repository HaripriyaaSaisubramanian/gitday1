import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String s="http://www.greenstechnologys.com/oracle-training.html";
	driver.get(s);
	driver.manage().window().maximize();
	System.out.println(s);
	System.out.println("GreensTechnology");
	WebElement element = driver.findElement(By.tagName("p"));
	System.out.println(element);
	
	
	}

}
