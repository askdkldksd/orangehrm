package select1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm123 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://orangehrm.com/en/30-day-free-trial/");
		WebElement country = driver.findElement(By.id("Form_getForm_Country"));
		Select s=new Select(country);
		//s.selectByVisibleText("Afghanistan");
		List<WebElement> allcountryID = s.getOptions();
		for(WebElement e :allcountryID) {
			System.out.println(e.getText());
			s.selectByVisibleText(e.getText());
		}
		

	}

}
