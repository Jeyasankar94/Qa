package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC009_Resources extends VisionBaseClass {

	@Test(enabled = false)
	public void testResourcesPage() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickResources();

		synchronized (driver) {
			driver.wait(3000);

		}

		String actualResourcesText = pom.getHomePageRag(getDriver()).getResourcesText();

		assertEquals(actualResourcesText, expectedResourcesText);

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Screenshot of Resources");

		extentTest.info("Resources is verified");

	}

	@Test(enabled = true)
	public void test() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getResourcesPage(getDriver()).ClickResources();

		synchronized (driver) {
			driver.wait(2000);

		}

		pom.getResourcesPage(getDriver()).clickCurrentAffairs();
		pom.getResourcesPage(getDriver()).clickSmartQuiz();
		pom.getResourcesPage(getDriver()).quickRevisionMaterial();
		pom.getResourcesPage(getDriver()).clickInfographics();
		pom.getResourcesPage(getDriver()).airNewAnalysis();
		pom.getResourcesPage(getDriver()).upscPaperSolution();
		pom.getResourcesPage(getDriver()).talksAndInterviews();
		pom.getResourcesPage(getDriver()).clickToppersAnswerCopy();
		pom.getResourcesPage(getDriver()).clickResearchAndAnalysis();

	}

}
