package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC007_Classroom extends VisionBaseClass {

	@Test
	public void test() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickClassroom();

		synchronized (driver) {
			driver.wait(3000);

		}

		String actualClassroomText = pom.getHomePageRag(getDriver()).getClassroomText();

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Screenshot of classroom");

		assertEquals(actualClassroomText, expectedClassroomText);

		extentTest.info("Classroom is verified");

	}

}
