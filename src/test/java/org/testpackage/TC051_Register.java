package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC051_Register extends VisionBaseClass {

	@Test
	public void testRegister() throws InterruptedException, AWTException {


	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();

	pom.getHomePage(getDriver()).clickLogin();
	extentTest.info(" Login button is Clicked");

	pom.getHomePage(getDriver()).enterUsername("jeyasankar3@habenwir.com");

	pom.getHomePage(getDriver()).enterPassword("123456@Js");
	synchronized (driver) {driver.wait(5000);}

	pom.getHomePage(getDriver()).clickSubmit();
	synchronized (driver) {driver.wait(8000);}

	pom.getRegister(getDriver()).clickRegister();
	synchronized (driver) {driver.wait(5000);}

	pom.getRegister(getDriver()).clickClassroomSeeAllCourses();
	synchronized (driver) {driver.wait(5000);}

	pom.getRegister(getDriver()).clickPrelimsSeeAllCourses();
	synchronized (driver) {driver.wait(5000);}

	pom.getRegister(getDriver()).clickMainsSeeAllCourses();
	synchronized (driver) {driver.wait(8000);}

	pom.getRegister(getDriver()).clickInterviewVisionStudent();
	synchronized (driver) {driver.wait(8000);}

	pom.getRegister(getDriver()).clickInterviewNewStudent();
	synchronized (driver) {driver.wait(5000);}
}
}