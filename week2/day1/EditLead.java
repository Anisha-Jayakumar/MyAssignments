package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayakumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("AJ");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anishajayakumar19@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("important Note");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.getTitle();
        System.out.println(title);
	}

}
