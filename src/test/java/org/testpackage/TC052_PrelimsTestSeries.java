package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC052_PrelimsTestSeries extends VisionBaseClass{

	@Test
	public void testPrelimsTestSeries() throws InterruptedException, AWTException {


	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();

//	pom.getHomePage().clickLogin();
//	extentTest.info(" Login button is Clicked");

//	pom.getHomePage().enterUsername("jeyasankar3@habenwir.com");

//	pom.getHomePage().enterPassword("123456@Js");
//	synchronized (driver) {driver.wait(5000);}

//	pom.getHomePage().clickSubmit();
	synchronized (driver) {driver.wait(5000);}

	pom.getPrelimsTestSeries(getDriver()).clickTestSeries();
	synchronized (driver) {driver.wait(5000);}

	pom.getPrelimsTestSeries(getDriver()).clickPrelimsTestSeries();
	synchronized (driver) {driver.wait(9000);}

	pom.getPrelimsTestSeries(getDriver()).clickFilter();

	pom.getPrelimsTestSeries(getDriver()).chooseYear();

	pom.getPrelimsTestSeries(getDriver()).chooseMedium();

	pom.getPrelimsTestSeries(getDriver()).numberOfTests();

	pom.getPrelimsTestSeries(getDriver()).selectSubject();

	pom.getPrelimsTestSeries(getDriver()).clickApply();

//	pom.getPrelimsTestSeries(getDriver()).clickPage();

	}

}
