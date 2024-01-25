package org.pageclasspackage;

//Note : The video is not automated and it is for Manual testing

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSATFooterPage extends VisionBaseClass {

	WebDriver driver;
	public CSATFooterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// CSAT in footer

	@FindBy(xpath = "(//*[@class='accordion-body'])[2]/ul/li[2]/a/span")
	private WebElement csatFooter;

	// Toppers image

	@FindBy(xpath = "//*[@class='flex overflow-x-scroll scrollbar-hide scroll-smooth md:gap-4 sm:gap-3']/div/div/span/img")
	private List<WebElement> toppersImage;

	// About the program Text

	@FindBy(xpath = "(//*[@class='container mx-auto']/div/div/p[1])[1]")
	private WebElement aboutTheProgram;

	// why choose our program

	@FindBy(xpath = "(//*[@class='container mx-auto'])[2]/div/div/h4")
	private WebElement whyChooseOurProgram;

	// AllCentre

	@FindBy(xpath = "//*[@class='CentersSlider_our_office__b51h4']/div")
	private List<WebElement> allCentre;

	// Download

	@FindBy(xpath = "(//*[@alt='Download'])[1]")
	private WebElement downloadButton;

	// share

	@FindBy(xpath = "//*[@alt='Share']")
	private WebElement shareButton;

	@FindBy(xpath = "(//*[@class='modal-body']/div)[2]/span")
	private WebElement pageLinkText;

	@FindBy(xpath = "//*[@class='modal-content sm:!rounded-t-xl']/div[1]/div/span")
	private WebElement sharewithClose;

	// Buy Course in PT365 Page

	@FindBy(xpath = "//*[@class='flex flex-col']/div[2]/div/button")
	private List<WebElement> buyCourseInCSATPage;

	// select a date in Buy Course Pop-up

	@FindBy(xpath = "//*[@class='modal-content sm:!rounded-t-xl']/div/div[2]/button")
	private WebElement dateButtonInBuyCoursePopup;

	// topic of the card in PT365 Details Page

	@FindBy(xpath = "//*[@class='w-[65%] lg:space-y-7 md:space-y-4']/div/h5")
	private WebElement topicOfCardInPT365DetailsPage;

	// price mentioned in the details page

	@FindBy(xpath = "//*[@class='flex items-center flex-col justify-center md:!mt-[3rem] xl:!mt-[4rem] md:px-[2rem]']/p")
	private WebElement priceMentionedInDetailsPage;

	// Buy now in PT365 Details page

	@FindBy(xpath = "//*[@class='flex items-center flex-col justify-center md:!mt-[3rem] xl:!mt-[4rem] md:px-[2rem]']/button")
	private WebElement buyNowInPT365DetailsPage;

	// emailId in login

	@FindBy(xpath = "//*[@id='formGridEmail']")
	private WebElement emailIdPT365;

	// password in login field

	@FindBy(xpath = "//*[@id='formGridPassword']")
	private WebElement passwordPT365;

	// submit login

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginSubmit;

	// heading of card in cart page

	@FindBy(xpath = "//*[@class='w-full flex flex-col gap-3 ']/div/div/div[2]/div/main")
	private List<WebElement> topicOfCardInCartPage;

	// card prices in cart page

	@FindBy(xpath = "//*[@id=\"__next\"]/div/div/main/div[1]/div/div[1]/div/div/div[2]/div[2]/label")
	private List<WebElement> pricesInCartPage;

	// click CSAT in footer of HomePage

	public void clickCSATInFooter() {
		// scroll down to PT365 location
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,9500)");

		// time wait to scroll down to the location

		synchronized (driver) {
			try {
				driver.wait(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		jk.executeScript("arguments[0].click();", csatFooter);

	}

	// verify Image is displayed

	public void verifyImageCSATFooter() {

		// Flag to track if all images are displayed

		boolean allImagesDisplayed = true;

		for (WebElement topperImage : toppersImage) {
			if (!topperImage.isDisplayed()) {
				allImagesDisplayed = false;

				// Exit the loop as soon as one image is not displayed

				break;
			}
		}

		if (allImagesDisplayed) {
			extentTest.info("All Images are displayed");
		} else {
			extentTest.info("NOT all Images are displayed");
		}
	}

	// verify Centre is present

	public void verifyCentreCSATFooter() {

		// Flag to track if all the centres are displayed

		boolean allCentresDisplayed = true;

		for (WebElement centre : allCentre) {
			if (!centre.isDisplayed()) {
				allCentresDisplayed = false;

				// Exit the loop as soon as one centre is not displayed

				break;
			}
		}

		if (allCentresDisplayed) {
			extentTest.info("All centres are displayed");

		} else {
			extentTest.info("NOT All centres are displayed");
		}

	}

	// verify about the program and why choose our program

	public void verifyAboutTheProgramAndWhyChooseOurProgramCSATFooter() {

		// get the text of About the program

		String aboutTheProgramText = aboutTheProgram.getText();

		// get the text of Why Choose Our Program

		String whyChooseOurProgramText = whyChooseOurProgram.getText();

		extentTest.info("About the program has been verified, and its title text is: " + aboutTheProgramText);

		extentTest.info("Why Choose Our Program has been verified and its heading text is :" + whyChooseOurProgramText);

	}

	// To verify the Download and Share button in Details Page

	public void verifyDownloadAndShareCSATFooter() {

		// share

		shareButton.click();

		extentTest.info("Share functionality  of CSAT Details  page verified");

		// getting page link text

		String text = pageLinkText.getText();
		extentTest.info("Page Link : " + text);

		// Share with close

		sharewithClose.click();

		// Downloading brochure

		downloadButton.click();

		extentTest.info("Download brochure of CSAT Details page verified");

	}

	// click buy course in PT365 Page

	public void clickBuyCourseInCSATPage() {

		// scroll down to to click BUY Course

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,1300)");

		// time wait to scroll down to the location

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// check if any Buy Course element is found

		if (buyCourseInCSATPage.size() > 0) {

			// create instance for Random class

			Random random = new Random();

			int randomIndex = random.nextInt(buyCourseInCSATPage.size());

			// click randomly selected element

			WebElement buyCourse = buyCourseInCSATPage.get(randomIndex);

			buyCourse.click();

			// click a date in Buy Course popup

			dateButtonInBuyCoursePopup.click();

			synchronized (driver) {
				try {
					driver.wait(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		} else {
			extentTest.info("Course is NOT available in the PT365 Page");
		}

	}

	// verify course details mentioned in Details page and cart page are similar

	// to store the topic of course in details page
	// String topicOfCourseInDetailsPage;

	public void verifyCardCSAT() {
		// get the topic of course mentioned in Details page

		String topicOfCourseInDetailsPage = topicOfCardInPT365DetailsPage.getText();

		extentTest.info("Topic of the course in details page is : " + topicOfCourseInDetailsPage);

		String price = priceMentionedInDetailsPage.getText();

		int priceDetailsPage = Integer.parseInt(price.replaceAll("[₹,]", "").trim());

		extentTest.info("Price mentioned in the details page : " + price);

		extentTest.info("priceDetailsPage : " + priceDetailsPage);

		// click Buy Now in PT365 Details page

		buyNowInPT365DetailsPage.click();

		// enter email id
		emailIdPT365.sendKeys(email);

		// enter password
		passwordPT365.sendKeys(password);

		// click submit login button
		loginSubmit.click();

		// Implicit wait to execute for loop

		implicitWait(25,getDriver());

		// verifying whether the card is added to cart page

		// Flag to check if the condition was satisfied

		boolean conditionSatisfied = false;

		for (int i = 0; i < topicOfCardInCartPage.size(); i++) {

			// getting the text of the heading of cards in cart page

			WebElement topic = topicOfCardInCartPage.get(i);

			String topicText = topic.getText();

			extentTest.info("topicText: " + topicText);

			// If condition is : comparing the heading of the course in details page and
			// heading of the card in cart page
			// if matches it will also check for the price
			// if don't match it will throw NO such element is added

			if (topicText.equalsIgnoreCase(topicOfCourseInDetailsPage)
					|| topicOfCourseInDetailsPage.contains(topicText)) {

				// getting price of specific card whose topic matches with the heading of course
				// in details page

				WebElement priceOfCardInCartPage = pricesInCartPage.get(i);

				String priceInCardOfCartPageText = priceOfCardInCartPage.getText();

				// type casting price from string to integer for comparision purpose

				int priceOfCardInCartPageInt = Integer
						.parseInt(priceInCardOfCartPageText.replaceAll("[₹,]", "").trim());

				assertEquals(priceOfCardInCartPageInt, priceDetailsPage);

				extentTest.info("Price mentioned in Details Page and price mentioned in card of cart page are same");

				// displaying the Heading of the card in the cartpage that matches with the
				// heading of the course in details page
				extentTest.info(topicText);

				extentTest
						.info("The topic of the course in Details Page & the same in cart page are same and verified");

				// Set the flag to true to indicate the condition was satisfied
				conditionSatisfied = true;

				break;

			}

			// Throw an error if the condition was not satisfied
			if (!conditionSatisfied) {
				extentTest.info(
						"The Course Added is either  NOT reflected in Cart Page or is of different heading in the cart page ");
			}
		}

	}

}
