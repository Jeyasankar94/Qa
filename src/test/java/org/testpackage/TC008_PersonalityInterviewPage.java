package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC008_PersonalityInterviewPage extends VisionBaseClass {

	@Test(enabled = false)
	public void testFunctionalityOfInterviewPage() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Interview Module in header of home page

		pom.getInterviewPage(getDriver()).clickInterviewHeader();

		// clicking the Vision Student interview deatils page

		// pom.getInterviewPage(getDriver()).clickVisionStudent();

		// clicking the New Student interview deatils page

		pom.getInterviewPage(getDriver()).clickNewStudent();

	}

	@Test(enabled = false)
	public void testCartPageOfInterviewPageForNewStudent() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Interview Module in header of home page

		pom.getInterviewPage(getDriver()).clickInterviewHeader();

		// verify new student

		pom.getInterviewPage(getDriver()).verifyNewStudent();

	}

	@Test
	public void testCartPageOfInterviewPageForVisionIasStudent() {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Interview Module in header of home page

		pom.getInterviewPage(getDriver()).clickInterviewHeader();

		// verify new student

		pom.getInterviewPage(getDriver()).verifyVisionIasStudent();



	}

}
