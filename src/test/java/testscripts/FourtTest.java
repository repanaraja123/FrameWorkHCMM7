package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FourtTest extends BaseClass {
	@Test
	public void fourttest() {
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoapp();
		web.handleChildBrowser();
		soft.assertTrue(SkillraryDemo.getPageHeader().isDisplayed());
		 web.scrollToElement(soft);
	}

}
