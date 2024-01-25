package org.testpackage;

// Note : The video is not automated and it is for Manual testing
import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class PT365FooterTest extends VisionBaseClass {

	// This test method is to verify the BUY COURSE in PT365 Homepage
	// and also verifies , when user user clicks BUY NOW in Details Page and it is
	// added to Cart page

	@Test(enabled = true)
	public void test() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click PT365 module in the footer of Home page

		pom.getPT365Footer(getDriver()).clickPT365InFooter();

		// click Buy Course in PT365 Page

		pom.getPT365Footer(getDriver()).clickBuyCourseInPT365();

		// verify card

		pom.getPT365Footer(getDriver()).verifyCard();

	}

	// This test method verifies the following
	// Verifies where Image are present , Centres are present
	// verifies whether About the program is present
	// verifies whether Why Choose Our Program is present
	// verifies Download & Share option in PT365 Details page


	@Test
	public void testPT365Functionality() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click PT365 module in the footer of Home page

		pom.getPT365Footer(getDriver()).clickPT365InFooter();

		// Time wait for data load

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// verify image

		pom.getPT365Footer(getDriver()).verifyImagePT365();

		// verify centre

		pom.getPT365Footer(getDriver()).verifyCentrePT365();

		// // verify about the program and why choose our program

		pom.getPT365Footer(getDriver()).verifyAboutTheProgramAndWhyChooseOurProgram();

		// click Buy Course in PT365 Page

		pom.getPT365Footer(getDriver()).clickBuyCourseInPT365();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// verify download and share button

		pom.getPT365Footer(getDriver()).verifyDownloadAndShare();

	}

}
