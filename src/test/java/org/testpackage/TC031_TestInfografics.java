package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC031_TestInfografics extends VisionBaseClass {


	@Test
	public void testInfografics() throws InterruptedException {

	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	synchronized (driver) {
		driver.wait(5000);
	}

	pom.getResources(getDriver()).clickResources();
	synchronized (driver) {
		driver.wait(5000);
	}

	pom.getResources(getDriver()).shareInfographics();

	pom.getResources(getDriver()).shareNehruLiaquat();
	pom.getResources(getDriver()).getSharewindowElem();
	pom.getResources(getDriver()).clickClosepopup();
	synchronized (driver) {
		driver.wait(3000);
	}

	pom.getResources(getDriver()).shareNewFindings();
	synchronized (driver) {
		driver.wait(3000);
	}
	pom.getResources(getDriver()).getSharewindowElem();
	pom.getResources(getDriver()).clickClosepopup();
	synchronized (driver) {
		driver.wait(3000);
	}

	pom.getResources(getDriver()).shareNorthEast();
	synchronized (driver) {
		driver.wait(5000);
	}
	pom.getResources(getDriver()).getSharewindowElem();
	pom.getResources(getDriver()).clickClosepopup();
	}
}
