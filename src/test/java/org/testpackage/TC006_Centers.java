package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC006_Centers extends VisionBaseClass{

	@Test(priority = 1, enabled = false)
	public void AhmedabadTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickAhmedabad();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).ahmedabadClickhereforFreeCounseling();


	}
	@Test(priority = 2, enabled = false)
	public void bhopalTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickAhmedabad();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).bhopalClickhereforFreeCounseling();

	}
	@Test(priority = 3, enabled = false)
	public void chandigarhTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickChandigarh();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).chandigarhClickhereforFreeCounseling();


	}
	@Test(priority = 4 , enabled = false)
	public void delhiTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

//		pom.getHomePage(getDriver()).clickLogin();
//		extentTest.info(" Login button is Clicked");

//		pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

//		pom.getHomePage(getDriver()).enterPassword("123456@Jk");

//		pom.getHomePage(getDriver()).clickSubmit();
//		synchronized (driver) {driver.wait(9000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickDelhi();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOfflineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickhereforFreeCounseling();

	}

	@Test(priority = 5, enabled = false)
	public void guwahatiTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickGuwahati();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).guwahatiClickhereforFreeCounseling();

	}
	@Test(priority = 6, enabled = false)
	public void hyderabadTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickHyderabad();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).hyderabadClickhereforFreeCounseling();
	}

	@Test(priority = 7, enabled = false)
	public void jaipurTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickJaipur();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOfflineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).jaipurClickhereforFreeCounseling();

	}
	@Test(priority = 8, enabled = false)
	public void jodhpurTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickJodhpur();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).jodhpurClickhereforFreeCounseling();

}
	@Test(priority = 9, enabled = false)
	public void lucknowTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickLucknow();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOfflineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}


		pom.getCenters(getDriver()).lucknowClickhereforFreeCounseling();

}
	@Test(priority = 10, enabled = false)
	public void prayagrajTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickPrayagraj();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).prayagrajClickhereforFreeCounseling();


}
	@Test(priority = 11, enabled = true)
	public void puneTest() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(8000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickPune();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOnlineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickOfflineBuycourse();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).selectRandomDate();
		synchronized (driver) {driver.wait(5000);}


		pom.getCenters(getDriver()).puneClickhereforFreeCounseling();


}
	@Test(priority = 12, enabled = false)
	public void sikarTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickCenters();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).clickSikar();
		synchronized (driver) {driver.wait(5000);}

		pom.getCenters(getDriver()).sikarClickhereforFreeCounseling();

}



		@Test(priority = 2 , enabled = false)
		public void clickFacebookTest() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(2000);

			pom.getHomePage(getDriver()).clickLogin();
			extentTest.info(" Login button is Clicked");

			pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

			pom.getHomePage(getDriver()).enterPassword("Jsankar@94");
			Thread.sleep(2000);

			pom.getHomePage(getDriver()).clickSubmit();
			Thread.sleep(5000);

		pom.getHomePage(getDriver()).clickFacbookInFooter();
		Thread.sleep(3000);
		pom.getHomePage(getDriver()).switchingToLoginWindow();
		Thread.sleep(3000);
	//	String title = pom.getHomePage(getDriver()).getCurrentTitle();
		Thread.sleep(3000);

		extentTest.info("Current Title of the Page :"+title);
		extentTest.pass("Successfully clicked FacbookInFooter ");
		Thread.sleep(5000);
	}
	@Test(priority = 3, enabled = false)
		public void clickYoutubeTest() throws InterruptedException {

		getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(2000);

			pom.getHomePage(getDriver()).clickLogin();
			extentTest.info(" Login button is Clicked");

			pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

			pom.getHomePage(getDriver()).enterPassword("Jsankar@94");
			Thread.sleep(2000);

			pom.getHomePage(getDriver()).clickSubmit();
			Thread.sleep(5000);

		pom.getHomePage(getDriver()).clickYoutubeInFooter();
		Thread.sleep(3000);
		pom.getHomePage(getDriver()).switchingToLoginWindow();
		Thread.sleep(3000);
	//	String url = pom.getHomePage(getDriver()).getCurrentURL();
		Thread.sleep(3000);
	//	extentTest.info("Current URl of the Page :"+url);
		extentTest.pass("Successfully clicked YoutubeInFooter ");


	}
	@Test(priority = 4, enabled = false)
	public void clickTwitterTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(2000);

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info(" Login button is Clicked");

		pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

		pom.getHomePage(getDriver()).enterPassword("Jsankar@94");
		Thread.sleep(2000);

		pom.getHomePage(getDriver()).clickSubmit();
		Thread.sleep(5000);

	pom.getHomePage(getDriver()).clickTwitter();
	Thread.sleep(3000);
	pom.getHomePage(getDriver()).switchingToLoginWindow();
	Thread.sleep(3000);
//	String url = pom.getHomePage(getDriver()).getCurrentURL();
	Thread.sleep(3000);
//	extentTest.info("Current URl of the Page :"+url);
	extentTest.pass("Successfully clicked Twitter ");


}
	@Test(priority = 5, enabled = false)
	public void clickInstagramTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(2000);

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info(" Login button is Clicked");

		pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

		pom.getHomePage(getDriver()).enterPassword("Jsankar@94");
		Thread.sleep(2000);

		pom.getHomePage(getDriver()).clickSubmit();
		Thread.sleep(5000);

	pom.getHomePage(getDriver()).clickInstagram();
	Thread.sleep(5000);
	pom.getHomePage(getDriver()).switchingToLoginWindow();
	Thread.sleep(3000);
//	String url = pom.getHomePage(getDriver()).getCurrentURL();
	Thread.sleep(3000);
//	extentTest.info("Current URl of the Page :"+url);
	extentTest.pass("Successfully clicked Instagram ");


}
	@Test(priority = 6, enabled = false)
	public void clickTelegramTest() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(2000);

		pom.getHomePage(getDriver()).clickLogin();
		extentTest.info(" Login button is Clicked");

		pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

		pom.getHomePage(getDriver()).enterPassword("Jsankar@94");
		Thread.sleep(2000);

		pom.getHomePage(getDriver()).clickSubmit();
		Thread.sleep(5000);

	pom.getHomePage(getDriver()).clickTelegram();
	Thread.sleep(5000);
	pom.getHomePage(getDriver()).switchingToLoginWindow();
	Thread.sleep(3000);
//	String url = pom.getHomePage(getDriver()).getCurrentURL();
	Thread.sleep(3000);
//	extentTest.info("Current URl of the Page :"+url);
	extentTest.pass("Successfully clicked Telegram ");


}


}
