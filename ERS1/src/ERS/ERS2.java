
package ERS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ERS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize()	;
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("Dhaka Bangladesh");
		element.submit();
		
		System.out.println("page title is:" + driver.getTitle());
		driver.close();
		driver.quit();
		
		
	
	
		

	}

}
