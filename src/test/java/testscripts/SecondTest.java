package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest  extends BaseClass {
	@Test
	public void secondTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoapp();
		web.handleChildBrowser();
		  soft.AssertTrue(SkillraryDemo.getPageHearder().isDisplayed());
		  SkillraryDemo.SelectCategory(web,1);
		  
		  soft.assertEquals(testing.getPageHearder(),"Testing");
		  web.dragAndDropElement(testing.getSeleniumImage(), testing.getCcartArea());
		  web.scrollToElement(testing.getFacebookIcon());
		  testing.clickFacebookIcon();
		  soft.assertAll();
		  
		  
	}
	

}
