package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramSpecificMethod;

public class AccountsPage extends ProgramSpecificMethod{

	public AccountsPage(ChromeDriver driver) {
		this.driver = driver;
	}


	public CreateAccountPage createAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage(driver);
	}
	
	public void findAccounts() {
		driver.findElement(By.linkText("Find Accounts")).click();
	}
	
	public void mergeAccounts() {
		driver.findElement(By.linkText("Merge Accounts")).click();
	}
}

