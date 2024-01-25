package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC050_Classroom extends VisionBaseClass{

	//Testing on Filter functionality
	@Test(priority = 1, invocationCount = 3, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void classroomFilterTest() throws InterruptedException, AWTException {

	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	synchronized (driver) {driver.wait(5000);}

	pom.getClassroom(getDriver()).clickClassroom();
	synchronized (driver) {driver.wait(5000);}

	pom.getClassroom(getDriver()).clickFilter();

	pom.getClassroom(getDriver()).selectYear();

	pom.getClassroom(getDriver()).selectMedium();

	pom.getClassroom(getDriver()).selectSubject();

	pom.getClassroom(getDriver()).selectCenter();

	pom.getClassroom(getDriver()).selectClassMode();

	pom.getClassroom(getDriver()).clickApply();

	}
	//Testing on Pagination
	@Test(priority=2,  invocationCount = 2,   enabled=true)
	public void classroomPaginationTest() throws InterruptedException {

	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	synchronized (driver) {driver.wait(5000);}

	pom.getClassroom(getDriver()).clickClassroom();
	synchronized (driver) {driver.wait(5000);}

	pom.getClassroom(getDriver()).clickPage();

	}
	//Testing on course card
	@Test(priority=3,  invocationCount = 3, enabled=true)
	public void classroomCourseTest() throws InterruptedException {

	getDriver().get(baseURL);
	extentTest.info("Succesfully Navigated to Vision Website");

	PageObjectManager pom = new PageObjectManager();
	synchronized (driver) {driver.wait(5000);}

	pom.getHomePage(getDriver()).clickLogin();
	extentTest.info(" Login button is Clicked");

	pom.getHomePage(getDriver()).enterUsername("jeyasankar3@habenwir.com");

	pom.getHomePage(getDriver()).enterPassword("123456@Js");

	pom.getHomePage(getDriver()).clickSubmit();
	synchronized (driver) {driver.wait(5000);}

	pom.getClassroom(getDriver()).clickClassroom();
	synchronized (driver) {driver.wait(5000);}

    pom.getClassroom(getDriver()).clickFoundationCourse();
    synchronized (driver) {driver.wait(5000);}

    pom.getClassroom(getDriver()).clickDate();
    synchronized (driver) {driver.wait(5000);}

    pom.getClassroom(getDriver()).clickonBuyNowButton();

	}

}