package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC053_Abhyaas extends VisionBaseClass {

	@Test(priority = 1, enabled = true)
	public void AbhyaasTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getAbhyaas(getDriver()).clickAbhyaas();
		synchronized (driver) {driver.wait(5000);}

		pom.getAbhyaas(getDriver()).clickRegister();
		synchronized (driver) {driver.wait(2000);}

		pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

		pom.getHomePage(getDriver()).enterPassword("123456@Jk");

    	pom.getHomePage(getDriver()).clickSubmit();
		synchronized (driver) {driver.wait(5000);}

		pom.getAbhyaas(getDriver()).clickTestCenter();
		synchronized (driver) {driver.wait(2000);}

		pom.getAbhyaas(getDriver()).selectTestCenter();
		synchronized (driver) {driver.wait(2000);}

		pom.getAbhyaas(getDriver()).clickMedium();
		synchronized (driver) {driver.wait(2000);}

		pom.getAbhyaas(getDriver()).selectMedium();
		synchronized (driver) {driver.wait(2000);}

		pom.getAbhyaas(getDriver()).clickPlatform();
		synchronized (driver) {driver.wait(2000);}

		pom.getAbhyaas(getDriver()).selectPlatform();
		synchronized (driver) {driver.wait(2000);}

		pom.getAbhyaas(getDriver()).clickBuyNow();

	}

	}
