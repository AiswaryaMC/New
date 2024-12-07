package package2;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windwhandling {

	public static void main(String[] args)  throws InterruptedException {
	

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?flowName=GlifWebSignIn&h1=en&ifkv=AcMMx-cVg_GBptkxYJAoWZpzCji0krQrkan7UbO2NxTRksMWfrJhc9iEj_IblVQxpw5JJxEiHjBo&lowEntry=SignUp&flowEntry=ServiceLogin&dsh=S-1088219344%3A1730611357009372&ddm=1");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Help")).click();	
		Set<String>wind = driver.getWindowHandles();
		Iterator<String>itwind=wind.iterator();
		while(itwind.hasNext())
			
		{
			String wind1 = itwind.next();
			String wind2 = itwind.next();
			driver.switchTo().window(wind1);
			driver.findElement(By.name("identifier")).sendKeys("aiswarya");
			//
			Thread.sleep(2000);
			driver.switchTo().window(wind2);
			driver.findElement(By.name("q")).sendKeys("stc");
			Thread.sleep(2000);
			// TODO Auto-generated method stub
		}
		}
}

