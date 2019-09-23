package ERS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;






public class ERS1 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://borkotmicrotechna.com/ers/Login.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.name("UserName")).sendKeys("borkot");
		driver.findElement(By.name("Password")).sendKeys("borkot123");
		driver.findElement(By.name("Login")).submit();
		System.out.println("login successful");
		driver.close();
		driver.quit();
		
		
		

	}

}
