package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsLoginDoAction {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();;
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Selenium");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		
		WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceOption = new Select(sourceDropDown);
		sourceOption.selectByIndex(4);
		
		WebElement campaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select campaignOption = new Select(campaignDropDown);
		campaignOption.selectByVisibleText("Automobile");

		WebElement ownershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipOption = new Select(ownershipDropDown);
		ownershipOption.selectByValue("OWN_CCORP");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String verifyTitle = driver.getTitle();
		System.out.println(verifyTitle);
		
		//driver.close();
	}
}

