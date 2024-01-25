package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC120_TalksAndInterviews extends VisionBaseClass{

	@Test(priority = 1, enabled = true)
	public void testBannerTextOTalksAndInterviews() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
	    Thread.sleep(5000);

	    pom.getResources(getDriver()).clickResources();

		pom.getTalksAndInterviews(getDriver()).clickTalksAndInterviews();
		synchronized (driver) {driver.wait(3000);}

		Assert.assertTrue(pom.getTalksAndInterviews(getDriver()).displayBannerTextOfTalksAndInterviews(),"Banner Text is not displayed at TalksAndInterviews");
	}
	@Test(priority = 2, enabled = true)
	public void playEnglishTalksAndInterviews() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
	    Thread.sleep(5000);

	    pom.getResources(getDriver()).clickResources();

		pom.getTalksAndInterviews(getDriver()).clickTalksAndInterviews();
		synchronized (driver) {driver.wait(3000);}
		
		pom.getTalksAndInterviews(getDriver()).clickWatchEnglish();
		synchronized (driver) {driver.wait(3000);}
		Thread.sleep(5000);
		
		pom.getTalksAndInterviews(getDriver()).clickPlaylistRandomnly();
		synchronized (driver) {driver.wait(3000);}
		Thread.sleep(5000);
		
		pom.getTalksAndInterviews(getDriver()).playVideoRandomnly();
		synchronized (driver) {driver.wait(3000);}

//		Assert.assertTrue(pom.getTalksAndInterviews(getDriver()).displayBannerTextOfTalksAndInterviews(),"Banner Text is not displayed at TalksAndInterviews");
	}
	@Test(priority = 3, enabled = true)
	public void playHindiTalksAndInterviews() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
	    Thread.sleep(5000);

	    pom.getResources(getDriver()).clickResources();

		pom.getTalksAndInterviews(getDriver()).clickTalksAndInterviews();
		synchronized (driver) {driver.wait(3000);}
		
		pom.getTalksAndInterviews(getDriver()).clickWatchHindi();
		synchronized (driver) {driver.wait(3000);}
		Thread.sleep(5000);
		
		pom.getTalksAndInterviews(getDriver()).clickPlaylistRandomnly();
		synchronized (driver) {driver.wait(3000);}
		Thread.sleep(5000);
		
		pom.getTalksAndInterviews(getDriver()).playVideoRandomnly();
		synchronized (driver) {driver.wait(3000);}

//		Assert.assertTrue(pom.getTalksAndInterviews(getDriver()).displayBannerTextOfTalksAndInterviews(),"Banner Text is not displayed at TalksAndInterviews");
	}
	@Test(priority = 4, enabled = true)
	public void paginationtestOnTalksAndInterviews() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
	    Thread.sleep(5000);

	    pom.getResources(getDriver()).clickResources();

		pom.getTalksAndInterviews(getDriver()).clickTalksAndInterviews();
		synchronized (driver) {driver.wait(3000);}
		
		pom.getTalksAndInterviews(getDriver()).clickWatchHindi();
		synchronized (driver) {driver.wait(3000);}
		Thread.sleep(5000);
		
		pom.getTalksAndInterviews(getDriver()).selectPageRandomnly();
		synchronized (driver) {driver.wait(3000);}
		Thread.sleep(2000);
//		Assert.assertTrue(pom.getTalksAndInterviews(getDriver()).displayBannerTextOfTalksAndInterviews(),"Banner Text is not displayed at TalksAndInterviews");
	}
	

}
