package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Prime");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("AK");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Dept");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("About");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arunkumarpongiyan@gmail.com");
		WebElement dropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(dropDown);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("Edit")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("About the company");
		driver.findElement(By.name("submitButton")).click();
	}

}
