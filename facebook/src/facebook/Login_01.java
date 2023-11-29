package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_01 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		//click creat new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		//store three listbox into select class
		Select daylistbox = new Select(driver.findElement(By.name("birthday_day")));
		Select monthlistbox = new Select(driver.findElement(By.name("birthday_month")));
		Select yearlistbox = new Select(driver.findElement(By.name("birthday_year")));
		//verify listbox is single or multi selection
		boolean value = monthlistbox.isMultiple();
		System.out.println(value);
		//select items in above three listboxes
		daylistbox.selectByVisibleText("2");
		Thread.sleep(5000);
		monthlistbox.selectByIndex(6);
		System.out.println(monthlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		yearlistbox.selectByVisibleText("1987");
		Thread.sleep(5000);
		daylistbox.selectByIndex(20);
		System.out.println(daylistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		monthlistbox.selectByVisibleText("Dec");
		Thread.sleep(5000);
		yearlistbox.selectByIndex(50);
		System.out.println(yearlistbox.getFirstSelectedOption().getText());
		Thread.sleep(5000);
		driver.quit();
		

	}

}
