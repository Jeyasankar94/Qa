package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class ClassRomeDemoTest extends VisionBaseClass {

	@Test
	public void testClassRoomDemo() {

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

		// click classRoomDemo page in header of the home page

		pom.getClassRoomDemoPage(getDriver()).clickClassRoomDemo();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// verify buy course in classroom demo page

		pom.getClassRoomDemoPage(getDriver()).verifyBuyCourse();

		// click a subject

		// click ecology and environment

		pom.getClassRoomDemoPage(getDriver()).clickEcologyANdEnvironment();

		// verify talk to expert

		pom.getClassRoomDemoPage(getDriver()).verifyTalkToExpert();

		// verify video

		 pom.getClassRoomDemoPage(getDriver()).verifyVideo();

		// verify self test

		 pom.getClassRoomDemoPage(getDriver()).verifySelfTest();

		// verify assignment

		 pom.getClassRoomDemoPage(getDriver()).verifyAssignment();

		// verify feedback

		 pom.getClassRoomDemoPage(getDriver()).verifyFeedback();

	}

}
