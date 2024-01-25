package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC020_HomePage extends VisionBaseClass{

	@Test
	public void testCoursesTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(8000);

		pom.getHomePage(getDriver()).clickRdmrAllTestSeries();
		Thread.sleep(5000);

		pom.getHomePage(getDriver()).getPrelimsTestSeries();
		Thread.sleep(3000);


		pom.getHomePage(getDriver()).clickRdmrLiveAndOffline();
		Thread.sleep(3000);

		pom.getHomePage(getDriver()).getLiveClassroom();
		Thread.sleep(3000);


		pom.getHomePage(getDriver()).clickRdmrFreeResources();
		Thread.sleep(3000);

		pom.getHomePage(getDriver()).getResources();
		Thread.sleep(3000);

		pom.getHomePage(getDriver()).clickRdmrInterviewPrepartn();
		Thread.sleep(3000);

		pom.getHomePage(getDriver()).getPersonalityInterview();
		Thread.sleep(3000);


}
}



















