package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
	@FindBy(xpath="//img[@alt='Skillrary']")
	private WebElement logo;
	@FindBy(name="q")
	private WebElement searchTF;
	@FindBy(xpath="//input[@Value='go']")
	private WebElement searchButton;
	@FindBy(xpath="//a[text()='GEARS']")
	private WebElement gearsTab;
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu')]/descedant::a[text()=' SkillRary Demo App']")
	private WebElement demoAppLink;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getLogo() {
		return logo;
	}
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
	}
	public void clickGears() {
		gearsTab.click();
	}
	public void clickSkillrarydemoapp() {
		demoAppLink.click();	
	}
}
