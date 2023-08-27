package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValidate {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Reliance");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kala");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		
		
		//Select by Index
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select(sourceDropDown);
		sourceDD.selectByIndex(1);
		
		//Select by Value
		WebElement marketCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mCampaign = new Select(marketCampaign);
		mCampaign.selectByValue("CATRQ_CARNDRIVER");
		
		//Select by Visible Text
		WebElement ownerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select owner = new Select(ownerDD);
		owner.selectByVisibleText("LLC/LLP");
		
		driver.findElement(By.name("submitButton")).click();
		
	}

}
