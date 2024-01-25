package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC033_QuickRevision extends VisionBaseClass {

		
	@Test
	public void testQuickRevision() throws InterruptedException {

		getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	synchronized (driver) {driver.wait(5000);}

	pom.getHomePage(getDriver()).clickLogin();
	extentTest.info(" Login button is Clicked");

	pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

	pom.getHomePage(getDriver()).enterPassword("123456@Jk");

	pom.getHomePage(getDriver()).clickSubmit();
	synchronized (driver) {driver.wait(5000);}

	pom.getResources(getDriver()).clickResources();

	pom.getResources(getDriver()).getQuickRevision();

	pom.getResources(getDriver()).clickShareEconomics();

	pom.getResources(getDriver()).getSharewindowElem();

	pom.getResources(getDriver()).clickClosepopup();
	synchronized (driver) {driver.wait(5000);}

	pom.getResources(getDriver()).clickDownload();
	synchronized (driver) {driver.wait(5000);}

	pom.getResources(getDriver()).clickLike();

}

}
