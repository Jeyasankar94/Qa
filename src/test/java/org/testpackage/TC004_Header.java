package org.testpackage;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.annotations.Test;

public class TC004_Header extends VisionBaseClass {

	@Test(enabled = true)
	public void testFacebook() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickFacebookIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).getFacebookVisionUrl();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Facebook Vision Page");

		// driver.findElement(By.xpath("//*[@class='xng8ra x6ikm8r x10wlt62 x1n2onr6
		// xh8yej3 x1ja2u2z x1a2a7pz']/div/div/div")).click();

	}

	@Test(enabled = true)
	public void testYoutube() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickYoutubeIcon();

		pom.getHomePage(getDriver()).switchingToLoginWindow();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).getYoutubeChannel();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Youtube Vision Channel");

	}

	@Test(enabled = true)
	public void testTwitter() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickTwitterIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {
			driver.wait(5000);
		}
		pom.getHomePageRag(getDriver()).getTwitterChannelName();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Twitter Vision Channel");

	}

	@Test(enabled = true)
	public void testInstagram() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickInstagramIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		synchronized (driver) {
			driver.wait(5000);
		}

		pom.getHomePageRag(getDriver()).getInstagramChannelName();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Instagram Vision Channel");

	}

	@Test(enabled = true)
	public void testTelegram() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickTelegramIcon();

		pom.getHomePageRag(getDriver()).switchingToLoginWindow(getDriver());

		pom.getHomePageRag(getDriver()).getTelegramVisionUrl();

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");

	}

	@Test(enabled = false)
	public void testDarkMode() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickDarkMode();

		synchronized (driver) {

			driver.wait(3000);

		}

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");

	}

	@Test(enabled = false)
	public void testHeaderImage() throws Exception {

		getDriver().get(baseURL);

		extentTest.info("Vision Website launched");

		PageObjectManager pom = new PageObjectManager();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).clickPhoneIconButton();

		synchronized (driver) {

			driver.wait(3000);

		}

		pom.getHomePageRag(getDriver()).getFirstPhoneNumber();

		synchronized (driver) {

			driver.wait(1000);

		}


		pom.getHomePageRag(getDriver()).getSecondPhoneNumber();



		pom.getHomePageRag(getDriver()).verifyVisionHeaderImage();

		synchronized (driver) {

			driver.wait(3000);

		}

		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");



	}


}
