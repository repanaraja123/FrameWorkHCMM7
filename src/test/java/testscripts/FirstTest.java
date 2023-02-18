package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass {

	@Test 
	
	public void firstTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoapp();
		web.handleChildBrowser();
		
		soft.assertTrue(SkillraryDemo.getPageHeader().isDisplayed());
		
		SkillraryDemo.mouseHoverToCourse(web);
		SkillraryDemo.clickSeleniumTraining();
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");		
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handleAlert();
		web.explicitWait(time,selenium.getItemAddedMessage());
		soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
		soft.assertAll();	
	}
}
