package org.testpackage;

import static org.testng.Assert.assertEquals;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC012_Abhyaas extends VisionBaseClass {

	@Test
	public void test() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website is launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {
			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickAbhyaas();

		synchronized (driver) {
			driver.wait(3000);

		}

		String actualAbhyaasText = pom.getHomePageRag(getDriver()).getAbhyaasText();

		assertEquals(actualAbhyaasText, expectedAbhyaasText);

		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, "Screenshot of Abhyaas");


	}

}
