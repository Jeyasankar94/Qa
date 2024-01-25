package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC054_Open_Test  extends VisionBaseClass{

	@Test(priority = 1, enabled = true)
	public void openTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(9000);}

		pom.getOpen_Test(getDriver()).clickOpen_Test();
		synchronized (driver) {driver.wait(5000);}

		pom.getOpen_Test(getDriver()).clickApplyButtonOpen_Test();
		synchronized (driver) {driver.wait(5000);}

		pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

		pom.getHomePage(getDriver()).enterPassword("123456@Jk");

		pom.getHomePage(getDriver()).clickSubmit();
		synchronized (driver) {driver.wait(8000);}

		pom.getOpen_Test(getDriver()).clickSelectPlatform();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).selectAnyPlatformOption();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).clickSelectState();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).selectAnyStateOption();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).clickMedium();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).selectMedium();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).enterCityName();
		synchronized (driver) {driver.wait(2000);}

		pom.getOpen_Test(getDriver()).clickApplyButton();

	}

}
