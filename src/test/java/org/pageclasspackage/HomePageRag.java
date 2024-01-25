package org.pageclasspackage;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRag extends VisionBaseClass {

	WebDriver driver;
	public HomePageRag(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span [text()='Test Series']")
	private WebElement testSeries;

	@FindBy(xpath = "(//span[text() = 'Prelims Test Series'])[1]")
	private WebElement prelimsTestSeries;

	@FindBy(xpath = "//h4 [text()='All India Prelims Test Series']")
	private WebElement verifyingPrelimsTestSeries;

	@FindBy(xpath = "//span[text()='Mains Test Series']")
	private WebElement mainsTestSeries;

	@FindBy(xpath = "//h4 [text()='All India Mains Test Series']")
	private WebElement verifyingMainsTestSeries;

	@FindBy(xpath = "(//span[text() = 'Classroom'])[1]")
	private WebElement classroom;

	@FindBy(xpath = "//*[text()='Live Classroom']")
	private WebElement classroomText;

	@FindBy(xpath = "(//span[text() = 'Interview'])[1]")
	private WebElement interview;

	@FindBy(xpath = "//*[text()='Personality Interviews']")
	private WebElement interviewText;

	@FindBy(xpath = "(//*[@class='flex no-underline w-full lg:w-auto'])[3]")
	private WebElement resources;

	@FindBy(xpath = "(//*[text()='Resources'])[2]")
	private WebElement resourcesText;

	@FindBy(xpath = "(//span[text() = 'Classroom Demo'])[1]")
	private WebElement classRoomDemo;

	@FindBy(xpath = "(//*[text()='Classroom Demo'])[2]")
	private WebElement classRoomDemoText;

	@FindBy(xpath = "(//span[text() = 'Open Test'])[1]")
	private WebElement openTest;

	@FindBy(xpath = "//*[text()='Why All India Level Mock Tests?']")
	private WebElement openTestText;

	@FindBy(xpath = "(//span[text() = 'Abhyaas'])[1]")
	private WebElement abhyaas;

	@FindBy(xpath = "//*[text()='What is Abhyaas Prelims?']")
	private WebElement abhyaasText;

	@FindBy(xpath = "//*[text()='Centers']")
	private WebElement centers;

	@FindBy(xpath = "//*[@class='Home_container__97eC3']/div/div/span/img")
	private WebElement visionHeaderImage;

	@FindBy(xpath = "//*[@class='flex sm:space-x-2 space-x-3 justify-content-end items-center sm:mb-[0.5rem]']/li[1]")
	private WebElement facebookIcon;

	@FindBy(xpath = "//*[@class='flex sm:space-x-2 space-x-3 justify-content-end items-center sm:mb-[0.5rem]']/li[2]")
	private WebElement youtubeIcon;

	@FindBy(xpath = "(//*[@id='text-container'])[1]")
	private WebElement youtubeChannelName;

	@FindBy(xpath = "//*[@class='flex sm:space-x-2 space-x-3 justify-content-end items-center sm:mb-[0.5rem]']/li[3]")
	private WebElement twitterIcon;

	@FindBy(xpath = "//*[@class='css-1dbjc4n r-1awozwy r-18u37iz r-dnmrzs']/div")
	private WebElement twitterChannelName;

	@FindBy(xpath = "//*[@class='flex sm:space-x-2 space-x-3 justify-content-end items-center sm:mb-[0.5rem]']/li[4]")
	private WebElement instagramIcon;

	@FindBy(xpath = "//*[@class='x6s0dn4 x78zum5 x1q0g3np xs83m0k xeuugli x1n2onr6']/h2")
	private WebElement instagramChannelName;

	@FindBy(xpath = "//*[@class='flex sm:space-x-2 space-x-3 justify-content-end items-center sm:mb-[0.5rem]']/li[5]")
	private WebElement telegramIcon;

	@FindBy(xpath = "")
	private WebElement telegramChannelName;

	@FindBy(xpath = "//*[@class='flex sm:space-x-2 space-x-3 justify-content-end items-center sm:mb-[0.5rem]']/li[6]")
	private WebElement darkMode;

	@FindBy(xpath = "//*[@class='nav-item']/a/div/i")
	private WebElement phoneIconButton;

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/a[1]")
	private WebElement firstPhoneNumber;

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/a[2]")
	private WebElement secondPhoneNumber;

	@FindBy(xpath = "//*[@class='xl:flex ']/section[3]/ul/li[1]/a")
	private WebElement footerFacebookIcon;

	@FindBy(xpath = "//*[@class='xl:flex ']/section[3]/ul/li[2]/a")
	private WebElement footerYoutubeIcon;

	@FindBy(xpath = "//*[@class='xl:flex ']/section[3]/ul/li[3]/a")
	private WebElement footerTwitterIcon;

	@FindBy(xpath = "//*[@class='xl:flex ']/section[3]/ul/li[4]/a")
	private WebElement footerInstagramIcon;

	@FindBy(xpath = "//*[@class='xl:flex ']/section[3]/ul/li[5]/a")
	private WebElement footerTelegramIcon;

	// footer modules

	@FindBy(xpath = "(//*[@href='/csat'])[2]")
	private WebElement footerCsat;

	@FindBy(xpath = "(//*[@class='accordion-collapse collapse'])[3]/div/ul/li[2]")
	private WebElement syllabus;

	@FindBy(xpath = "(//*[@class='accordion-collapse collapse'])[3]/div/ul/li[3]")
	private WebElement aboutUs;

	// webelements of footer modules under the polices heading

	@FindBy(xpath = "(//*[@class='accordion-collapse collapse'])[4]/div/ul/li[1]")
	private WebElement termsOfUse;

	@FindBy(xpath = "(//*[@class='accordion-collapse collapse'])[4]/div/ul/li[2]")
	private WebElement privacyPolicy;

	@FindBy(xpath = "(//*[@class='accordion-collapse collapse'])[4]/div/ul/li[3]")
	private WebElement refundPolicy;

	@FindBy(xpath = "(//*[@class='accordion-collapse collapse'])[4]/div/ul/li[4]")
	private WebElement dataPolicy;

	// *[@class='container mx-auto !px-0']/div/div/div/p

	// About Us Page

	@FindBy(xpath = "//*[@class='sm:!max-w-[60%] ']/p")
	private WebElement aboutUsText;

	// Terms of Use Page header text

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/p[1]")
	private WebElement termsOfUseText;

	// Privacy Policy Page Header Text

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/h4")
	private WebElement privacyPolicyHeader;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']//a")
	private WebElement privacyPolicyPageLinks;

	// Refund Policy Page header text

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/h4")
	private WebElement refundPolicyHeaderText;

	// About Us Page Verification

	public void clickAboutUs() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,9000)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the AboutUs module in footer
		aboutUs.click();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// getting the URL of AAbout us page
		String AboutUsURL = driver.getCurrentUrl();

		// getting the text of About us Page text
		String aboutusTextt = aboutUsText.getText();

		extentTest.info("AboutUs URL : " + AboutUsURL);
		extentTest.info("AboutUs Heading Text :" + aboutusTextt);

	}

	// Terms of Use Page verification

	public void clickTermsOfUse() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,9000)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the AboutUs module in footer
		termsOfUse.click();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// getting the URL of AAbout us page
		String termsOfUseURL = driver.getCurrentUrl();

		// getting the text of About us Page text
		String termsOfUseTextt = termsOfUseText.getText();

		extentTest.info("Terms Of Use URL : " + termsOfUseURL);
		extentTest.info("Terms Of Use Heading Text : " + termsOfUseTextt);

	}

	// Privacy Policy Page

	public void clickPrivacyPolicy() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,9000)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Privacy Policy module in footer
		privacyPolicy.click();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// getting the URL of Privacy Policy page
		String privacyPolicyURL = driver.getCurrentUrl();

		// getting the text of About us Page text
		String termsOfUseTextt = privacyPolicyHeader.getText();

		// *[@class='Home_main__OVLM4']//a

		extentTest.info("Privacy Policy URL : " + privacyPolicyURL);
		extentTest.info("Privacy Policy Heading Text : " + termsOfUseTextt);

		// Clicking the Links in Privacy Policy Page in New tab

		int numberLinksInPrivacyPolicy = driver.findElements(By.xpath("//*[@class='Home_main__OVLM4']//a")).size();

		System.out.println(numberLinksInPrivacyPolicy);

		// for loop to iteratae and click the links in new tab

		for (int i = 0; i < numberLinksInPrivacyPolicy; i++) {
			String s = Keys.chord(Keys.CONTROL, Keys.ENTER);

			driver.findElements(By.xpath("//*[@class='Home_main__OVLM4']//a")).get(i).sendKeys(s);

		}

		extentTest.info("Links in Privacy Policy Page are opened in new tabs");

	}

	public void clickRefundPolicy() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,9000)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// clicking the Refund Policy module in footer
		refundPolicy.click();

		synchronized (driver) {
			try {
				driver.wait(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// getting the URL of Refund Policy page
		String refunPolicyURL = driver.getCurrentUrl();

		// getting the text of About us Page text
		String refundPolicyText = refundPolicyHeaderText.getText();

		extentTest.info("Refund Policy URL : " + refunPolicyURL);
		extentTest.info("Refund Policy Heading Text : " + refundPolicyText);

	}

	public void switchingToLoginWindow(WebDriver driver) {

		windowhandling(driver);

	}

	public void clickTestSeries() {
		testSeries.click();
	}

	public void clickPrelimsTestSeries() {
		prelimsTestSeries.click();
	}

	public String getPrelimsTestSeriesText() {
		String prelimsText = verifyingPrelimsTestSeries.getText();
		System.out.println(prelimsText);
		return prelimsText;
	}

	public void clickMainsTestSeries() throws Exception {

		Thread.sleep(3000);

		mainsTestSeries.click();
	}

	public String getMainsTestSeriesText() {
		String mainsText = verifyingMainsTestSeries.getText();
		System.out.println(mainsText);
		return mainsText;
	}

	public void clickClassroom() {
		classroom.click();
	}

	public String getClassroomText() {
		String text = classroomText.getText();
		System.out.println(text);
		return text;
	}

	public void clickInterview() {
		interview.click();
	}

	public String getInterviewText() {
		String text = interviewText.getText();
		System.out.println(text);
		return text;
	}

	public void clickResources() {

		resources.click();

	}

	public String getResourcesText() {
		String text = resourcesText.getText();
		System.out.println(text);
		return text;
	}

	public void clickClassroomDemo() {
		classRoomDemo.click();
	}

	public String getClassroomDemoText() {
		String text = classRoomDemoText.getText();
		System.out.println(text);
		return text;
	}

	public void clickOpenTest() {
		openTest.click();
	}

	public String getOpenTestText() {
		String text = openTestText.getText();
		System.out.println(text);
		return text;
	}

	public void clickAbhyaas() {
		abhyaas.click();
	}

	public String getAbhyaasText() {
		String text = abhyaasText.getText();
		System.out.println(text);
		return text;
	}

	public void clickCenters() {
		centers.click();
	}

	public void clickCenters2() {
		Actions actions = new Actions(driver);

		actions.moveToElement(centers).perform();

	}

	public void verifyVisionHeaderImage() {
		if (visionHeaderImage.isDisplayed()) {
			extentTest.info("Vision Image in Header is displayed");

			extentTest.info(visionHeaderImage.getAttribute("class"));
		}
	}

	public void clickFacebookIcon() throws Exception {
		facebookIcon.click();

	}

	public void clickFooterFacebookIcon() throws Exception {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		// jk.executeScript("arguments[0].scrollIntoView(true)", footerFacebookIcon);
		jk.executeScript("window.scroll(0,8000)");

		synchronized (driver) {
			driver.wait(5000);

		}

		footerFacebookIcon.click();
		synchronized (driver) {
			driver.wait(5000);

		}
		String path = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(path, " facebook ");

	}

	public void getFacebookVisionUrl() {

		String currentUrl = driver.getCurrentUrl();

		extentTest.info("Url of the Vision Facebook Page :" + currentUrl);
	}

	public void clickYoutubeIcon() {

		youtubeIcon.click();

	}

	public void clickFooterYoutubeIcon() throws Exception {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		// jk.executeScript("arguments[0].scrollIntoView(true)", footerFacebookIcon);
		jk.executeScript("window.scroll(0,8000)");

		synchronized (driver) {
			driver.wait(7000);

		}

		footerYoutubeIcon.click();

		synchronized (driver) {
			driver.wait(5000);

		}
		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Youtube Vision Channel");

	}

	public void getYoutubeChannel() {

		String text = youtubeChannelName.getText();
		System.out.println(text);

		extentTest.info("Youtube Channel Name :" + text);

	}

	public void clickTwitterIcon() {
		twitterIcon.click();
	}

	public void clickFooterTwitterIcon() throws Exception {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		// jk.executeScript("arguments[0].scrollIntoView(true)", footerFacebookIcon);
		jk.executeScript("window.scroll(0,8000)");

		synchronized (driver) {
			driver.wait(7000);

		}

		footerTwitterIcon.click();

		synchronized (driver) {
			driver.wait(5000);

		}
		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Twitter Vision Channel");

	}

	public void getTwitterChannelName() {
		String text = twitterChannelName.getText();
		System.out.println(text);
		extentTest.info("Twitter Channel Name :" + text);
	}

	public void clickInstagramIcon() {
		instagramIcon.click();
	}

	public void clickFooterInstagramIcon() throws Exception {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		// jk.executeScript("arguments[0].scrollIntoView(true)", footerFacebookIcon);
		jk.executeScript("window.scroll(0,8000)");

		synchronized (driver) {
			driver.wait(7000);

		}

		footerInstagramIcon.click();

		synchronized (driver) {
			driver.wait(5000);

		}
		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Instagram Vision Channel");

	}

	public void getInstagramChannelName() {
		String text = instagramChannelName.getText();
		System.out.println(text);
		extentTest.info("Instagram Channel Name :" + text);
	}

	public void clickTelegramIcon() {
		telegramIcon.click();

	}

	public void clickFooterTelegramIcon() throws Exception {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		// jk.executeScript("arguments[0].scrollIntoView(true)", footerFacebookIcon);
		jk.executeScript("window.scroll(0,8000)");

		synchronized (driver) {
			driver.wait(7000);

		}

		footerTelegramIcon.click();

		synchronized (driver) {
			driver.wait(8000);

		}
		String base = captureScreenShotBase64(getDriver());
		extentTest.addScreenCaptureFromBase64String(base, "Screenshot of Telegram Vision Channel");

	}

	public void getTelegramVisionUrl() {

		String currentUrl = driver.getCurrentUrl();

		extentTest.info("Url of the Vision Telegram  :" + currentUrl);

	}

	public void clickDarkMode() {
		darkMode.click();
	}

	public void clickPhoneIconButton() {
		phoneIconButton.click();
	}

	public void getFirstPhoneNumber() {
		String first = firstPhoneNumber.getText();
		extentTest.info(first);
	}

	public void getSecondPhoneNumber() {
		String second = secondPhoneNumber.getText();
		extentTest.info(second);
	}

	public void clickNoticesHome() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,200)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[3]/div/div[1]/div/p")).click();
		WebElement noticesPopup = driver.findElement(By.xpath("//*[@class='modal-content']"));
		int noticesLinkNumber = noticesPopup.findElements(By.tagName("a")).size();

		System.out.println(noticesLinkNumber);

		for (int i = 0; i < noticesLinkNumber; i++) {
			String s = Keys.chord(Keys.CONTROL, Keys.ENTER);

			noticesPopup.findElements(By.tagName("a")).get(i).sendKeys(s);
		}

		// *[@class='modal-content']//a
	}

}
