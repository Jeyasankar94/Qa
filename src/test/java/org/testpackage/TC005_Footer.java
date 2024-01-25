package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC005_Footer extends VisionBaseClass {


	@Test(enabled = false)
	public void testFacebook() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(10000);

		}

		pom.getHomePageRag(getDriver()).clickFooterFacebookIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).getFacebookVisionUrl();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Facebook Vision Page");




	}

	@Test(enabled = false)
	public void testYoutube() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickFooterYoutubeIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).getYoutubeChannel();




	}


	@Test(enabled = false)
	public void testInstagram() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickFooterInstagramIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {

			driver.wait(5000);

		}



		pom.getHomePageRag(getDriver()).getInstagramChannelName();




	}


	@Test(enabled = false)
	public void testTelegram() throws Exception  {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickFooterTelegramIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		pom.getHomePageRag(getDriver()).getTelegramVisionUrl();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");





	}

	@Test(enabled = false)
	public void testTwitter() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickFooterTwitterIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {

			driver.wait(5000);

		}
		pom.getHomePageRag(getDriver()).getTwitterChannelName();





	}


}
