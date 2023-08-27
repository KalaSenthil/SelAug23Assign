package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Launch website login page
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Enter Username - - find element using id
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter password - find element using id
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click Login - find element using className
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA - find element using partialLinkText
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click on Leads - find element using linkText 
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on Create Lead - find element using linkText
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Company Name field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ginni");
		
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Grate");
		
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("GG");
		
		//Enter Department Field using name locator
		driver.findElement(By.name("departmentName")).sendKeys("Quality");
		
		//Enter Description Field using name locator
		driver.findElement(By.name("description")).sendKeys("Create Lead for Quality");
		
		//Enter your email using id locator
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("efg@outlook.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement stateDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateDD);
		state.selectByVisibleText("New York");
		
		//Click on Create Button using name locator
		driver.findElement(By.name("submitButton")).click();
		
		//Click on Edit
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field using .clear()
		driver.findElement(By.name("description")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updating the Lead");
		
		//Click on update button
		driver.findElement(By.name("submitButton")).click();
		
		//Get the Title of Resulting Page
		String updateLeadPageTitle = driver.getTitle();
		System.out.println("Update Lead Page Title is: "+updateLeadPageTitle);

	}

}
