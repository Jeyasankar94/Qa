package org.testpackage;


//Note : The video is not automated and it is for Manual testing
import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class CSATFooterTest extends VisionBaseClass {

	// This test method verifies the following
	// Verifies where Image are present , Centres are present
	// verifies whether About the program is present
	// verifies whether Why Choose Our Program is present
	// verifies Download & Share option in PT365 Details page

	@Test()
	public void testCSAT() {

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

		// click CSAT module in the footer of Home page

		pom.getCSATFooterPage(getDriver()).clickCSATInFooter();

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

		pom.getCSATFooterPage(getDriver()).verifyImageCSATFooter();

		// verify centre

		pom.getCSATFooterPage(getDriver()).verifyCentreCSATFooter();

		// // verify about the program and why choose our program

		pom.getCSATFooterPage(getDriver()).verifyAboutTheProgramAndWhyChooseOurProgramCSATFooter();

		// click Buy Course in PT365 Page

		pom.getCSATFooterPage(getDriver()).clickBuyCourseInCSATPage();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// verify download and share button

		pom.getCSATFooterPage(getDriver()).verifyDownloadAndShareCSATFooter();

	}

	// This test method is to verify the BUY COURSE in PT365 Homepage
	// and also verifies , when user user clicks BUY NOW in Details Page and it is
	// added to Cart page

	@Test
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

		// click CSAT module in the footer of Home page

		pom.getCSATFooterPage(getDriver()).clickCSATInFooter();

		// click Buy Course in CSAT Page

		pom.getCSATFooterPage(getDriver()).clickBuyCourseInCSATPage();

		// verify card

		pom.getCSATFooterPage(getDriver()).verifyCardCSAT();

	}

}
