package org.pageclasspackage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalityInterviewPage extends VisionBaseClass {

	WebDriver driver;
	public PersonalityInterviewPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Interview WebElement

	@FindBy(xpath = "(//*[@class='flex no-underline w-full lg:w-auto'])[2]")
	private WebElement interviewHeader;

	@FindBy(xpath = "//*[@class='sm:!max-w-[60%] ']/h4")
	private WebElement interviewPageHeaderText;

	@FindBy(xpath = "//*[@class='container mx-auto ']/section/div/div")
	private WebElement videoPlayButton;

	@FindBy(xpath = "//*[@class='ytp-fullscreen-button ytp-button']")
	private WebElement videoFulScreenButton;

	// visionias student course details in interview homepage

	// visionias student topic in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[1]/div[2]/p[1]")
	private WebElement visioniasStudentTopic;

	// visionias student text in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[1]/div[2]/div[1]/span[2]")
	private WebElement visioniasStudentText;

	// visionias student fee in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[1]/div[2]/p[2]")
	private WebElement visioniasStudentPrice;

	// visionias student BUY NOW in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[1]/button")
	private WebElement visioniasStudentBUYNOW;

	// New Student course details in Interview home page

	// new student topic heading in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[2]/div[2]/p")
	private WebElement newStudentTopic;

	// new student webelement text in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[2]/div[2]/div[1]/span[2]")
	private WebElement newStudentText;

	// new student price in interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[2]/div[2]/p[2]")
	private WebElement newStudentPrice;

// new student BUY NOW in Interview homepage

	@FindBy(xpath = "//*[@class='flex flex-col container mx-auto ']/div/div[2]/button")
	private WebElement newStudentBUYNOW;

	// interview details page : course details

	// course details : student detail either visioias student or new student

	@FindBy(xpath = "//*[@class='text-[#36B37E] font-sans font-semibold text-3xl md:text-2xl']")
	private WebElement priceOfTheCourseInDetalsPage;

	@FindBy(xpath = "//*[@class='flex items-center flex-col justify-center md:!mt-[3rem] xl:!mt-[4rem] md:px-[2rem]']/button")
	private WebElement buyNowInInterviewDetailsPage;

	// emailId in login

	@FindBy(xpath = "//*[@id='formGridEmail']")
	private WebElement emailIdPersonality;

	// password in login field

	@FindBy(xpath = "//*[@id='formGridPassword']")
	private WebElement passwordPersonality;

	// submit login

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginSubmit;

	// cart page list of items

	@FindBy(xpath = "//*[@class='!mx-1 flex !justify-between w-full']/main")
	private List<WebElement> cartPageItems;

	// cart items price list

	@FindBy(xpath = "//*[@class='flex flex-col mx-2 max-w-[430px] w-full gap-1']/label")
	private List<WebElement> cartPageItemsPrices;

	@FindBy(xpath = "(//*[@class=' flex items-center gap-3'])[1]/p/span[2]")
	private WebElement typeOfStudentIdea;

	// Interview Details Page header text

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/div/div/h5")
	private WebElement interviewDetailsPageHeaderText;

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

	// see all centre

	@FindBy(xpath = "//*[@class='text-[#3362CC] mb-[2px] md:font-[600] md:text-[18px]']")
	private WebElement seeAllCentre;

	@FindBy(xpath = "//*[@class='flex gap-[20px] sm:hidden mt-[27px] justify-end']/div[1]")
	private WebElement seeAllCentreBackwardButton;

	@FindBy(xpath = "//*[@class='flex gap-[20px] sm:hidden mt-[27px] justify-end']/div[2]")
	private WebElement seeAllCentreForwardButton;

	// *[@class='flex gap-[20px] sm:hidden mt-[27px] justify-end']/div[1]
	// click Interview Module in header of homepage

	public void clickInterviewHeader() {
		// Actions act = new Actions(driver);

		// act.moveToElement(interviewHeader).contextClick().keyDown(Keys.CONTROL).click().perform();

		interviewHeader.click();

		synchronized (driver) {
			try {
				driver.wait(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Getting URL of interview Page

		String interviewURL = driver.getCurrentUrl();
		extentTest.info("Interview Page URL : " + interviewURL);

		// getting interview header text

		String text = interviewPageHeaderText.getText();
		extentTest.info("Interview Page Header Text : " + text);

	}

	// toppers video functionality

	public void verifyToppersInterviewPageVideo() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,3500)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		videoPlayButton.click();

		// frame webelement

		WebElement frameVideoElement = driver
				.findElement(By.xpath("//*[@class='w-full sm:min-h-[200px] md:min-h-[350px] xl:min-h-[540px] ']"));

		driver.switchTo().frame(frameVideoElement);

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click full screen button

		videoFulScreenButton.click();

		//// *[@class='ytp-popup ytp-settings-menu']

		synchronized (driver) {
			try {
				driver.wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// click settings button

		driver.findElement(By.xpath("//*[@class='ytp-button ytp-settings-button ytp-hd-quality-badge']")).click();

	}

	// Vision Student

	public void clickVisionStudent() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,2300)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		visioniasStudentBUYNOW.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String headerText = interviewDetailsPageHeaderText.getText();
		extentTest.info("Interview Details Page Header Text : " + headerText);

		// to scroll down to locate

		jk.executeScript("window.scroll(0,300)");

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String url = driver.getCurrentUrl();
		extentTest.info("URL of Interview page is : " + url);

		// Downloading brochure

		downloadButton.click();

		extentTest.info("Download brochure of interview page verified");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// share

		shareButton.click();

		extentTest.info("Download brochure of interview page verified");

		// getting page link text

		String text = pageLinkText.getText();
		extentTest.info("Page Link : " + text);

		// Share with close

		sharewithClose.click();

	}

	// New student

	public void clickNewStudent() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,1500)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		newStudentBUYNOW.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String headerText = interviewDetailsPageHeaderText.getText();
		extentTest.info("Interview Details Page Header Text : " + headerText);

		// to scroll down to locate

		jk.executeScript("window.scroll(0,300)");

		synchronized (driver) {
			try {
				driver.wait(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String url = driver.getCurrentUrl();
		extentTest.info("URL of Interview Details  Page is : " + url);

		// share

		shareButton.click();

		extentTest.info("Share functionality  of interview page verified");

		// getting page link text

		String text = pageLinkText.getText();
		extentTest.info("Page Link : " + text);

		// Share with close

		sharewithClose.click();

		// Downloading brochure

		downloadButton.click();

		extentTest.info("Download brochure of interview page verified");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// verify new student

	public void verifyNewStudent() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,1500)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String headingOfTheCourse = newStudentTopic.getText();
		String priceOfNewAStudent = newStudentPrice.getText();
		String textOfNewStudent = newStudentText.getText();

		extentTest.info("Heading of the new student : " + headingOfTheCourse);
		extentTest.info("price of the new student : " + priceOfNewAStudent);
		extentTest.info("text of student selected : " + textOfNewStudent);

		newStudentBUYNOW.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// heading of the selected course

		String textOfTheCourse = interviewDetailsPageHeaderText.getText();
		extentTest.info("Interview Details Page Header Text : " + textOfTheCourse);

		// Interview detals page : price detail

		String priceOfCourseMentionedInDetailsPage = priceOfTheCourseInDetalsPage.getText();
		extentTest.info("course price mentioned in details page : " + priceOfCourseMentionedInDetailsPage);

		// Interview details page : course details Student List

		String studentType = typeOfStudentIdea.getText();
		extentTest.info("course details student type : " + studentType);

		// expected value of comparing the heading text of the course , type of student
		// and price mentioned
		boolean expectedTopicValue = true;
		boolean expectedStudentValue = true;
		boolean expectedPriceValue = true;

		// comparing the text of the course in interview page with interview details
		// page
		boolean actualTopicText = headingOfTheCourse.equals(textOfTheCourse);
		// comparing the type of student mentioned in interview page and interview
		// details page
		boolean actualStudentValue = studentType.contains(textOfNewStudent);
		// comparing the price mentioned in the interview page with interview details
		boolean actualPriceValue = priceOfNewAStudent.contains(priceOfCourseMentionedInDetailsPage);

		// comparing the heading text of the course in Interview home page and interview
		// details page
		assertEquals(actualTopicText, expectedTopicValue);
		extentTest.info(
				"Heading text of the course mentioned in Interview Home Page and Interview Details Page is successfully verified");

		// comparing the type of student mentioned in course of interview page and
		// interview details page
		assertEquals(actualStudentValue, expectedStudentValue);
		extentTest.info(
				"Type of student mentioned in course of the interview home page and interview details page is successfully verified");

		// comaparing the price mentioned in the course of interview home page and
		// interview details page
		assertEquals(actualPriceValue, expectedPriceValue);
		extentTest.info(
				"Price mentioned in the course of interview home page and interview details page is successfully verified");

		// click buy now in Interview detals page
		buyNowInInterviewDetailsPage.click();

		// enter email id
		emailIdPersonality.sendKeys(email);

		// enter password
		passwordPersonality.sendKeys(password);

		// click submit login button
		loginSubmit.click();

		synchronized (driver) {
			try {
				driver.wait(12000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// cart page verification

		// checking whether cart page items and cart page prices are equal

		if (cartPageItems.size() == cartPageItemsPrices.size()) {
			boolean expectedCartPageCourseTopicValue = true;

			for (int i = 0; i < cartPageItems.size(); i++) {
				WebElement cartPageItem = cartPageItems.get(i);
				WebElement cartPageItemPrice = cartPageItemsPrices.get(i);
				String cartPageCourseTitle = cartPageItem.getText();
				boolean actualCartPageCourseTopicValue = cartPageCourseTitle.equals(textOfTheCourse);

				System.out.println("actualCartPageCourseTopicValue : " + actualCartPageCourseTopicValue);
				if (actualCartPageCourseTopicValue == expectedCartPageCourseTopicValue) {
					extentTest.info(cartPageCourseTitle);
					extentTest.pass("Title of course in Cart Page is successfully verified");
				}

				if (actualCartPageCourseTopicValue == expectedCartPageCourseTopicValue) {
					System.out.println(cartPageItemPrice.getText());
					System.out.println("cart page price " + cartPageItemPrice.getText());

					boolean expectedCartPageItemPrice = true;
					boolean actualCartPageItemPrice = cartPageItemPrice.getText()
							.contains(priceOfCourseMentionedInDetailsPage);

					extentTest.info(" cart page item price and price in course mentioned in details page: "
							+ actualCartPageItemPrice + cartPageItemPrice.getText());

					if (actualCartPageItemPrice == expectedCartPageItemPrice) {

						extentTest.pass("Price mentioned in the course in Cart Page is successfully verified");
						extentTest.pass(
								"The course in the cart page of the interview course TITLE & PRICE is successfully verified");
					}

				}
			}
		}

		extentTest.info("new way");

		boolean atLeastOneIterationSuccessful = false;

		if (cartPageItems.size() == cartPageItemsPrices.size()) {
			boolean expectedCartPageCourseTopicValue = true;

			for (int i = 0; i < cartPageItems.size(); i++) {
				WebElement cartPageItem = cartPageItems.get(i);
				WebElement cartPageItemPrice = cartPageItemsPrices.get(i);
				String cartPageCourseTitle = cartPageItem.getText();
				boolean actualCartPageCourseTopicValue = cartPageCourseTitle.equals(textOfTheCourse);

				System.out.println("actualCartPageCourseTopicValue : " + actualCartPageCourseTopicValue);

				if (actualCartPageCourseTopicValue == expectedCartPageCourseTopicValue) {
					extentTest.info(cartPageCourseTitle);
					extentTest.pass("Title of course in Cart Page is successfully verified");

					atLeastOneIterationSuccessful = true; // Flag that at least one iteration was successful

					System.out.println(cartPageItemPrice.getText());
					System.out.println("cart page price " + cartPageItemPrice.getText());

					boolean expectedCartPageItemPrice = true;
					boolean actualCartPageItemPrice = cartPageItemPrice.getText()
							.contains(priceOfCourseMentionedInDetailsPage);

					extentTest.info("cart page item price and price in course mentioned in details page: "
							+ actualCartPageItemPrice + cartPageItemPrice.getText());

					if (actualCartPageItemPrice == expectedCartPageItemPrice) {
						extentTest.pass("Price mentioned in the course in Cart Page is successfully verified");
						extentTest.pass(
								"The course in the cart page of the interview course TITLE & PRICE is successfully verified");
					}
				}
			}

			// Check if no iterations were successful and output "Not matched"
			if (!atLeastOneIterationSuccessful) {
				System.out.println("Not matched");
			}
		}

	}

	// verify VisionIas student

	public void verifyVisionIasStudent() {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scroll(0,1500)");

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		String headingOfTheCourse = visioniasStudentTopic.getText();
		String priceOfNewAStudent = visioniasStudentPrice.getText();
		String textOfNewStudent = visioniasStudentText.getText();

		extentTest.info("Heading of the new student : " + headingOfTheCourse);
		extentTest.info("price of the new student : " + priceOfNewAStudent);
		extentTest.info("text of student selected : " + textOfNewStudent);

		visioniasStudentBUYNOW.click();

		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// heading of the selected course

		String textOfTheCourse = interviewDetailsPageHeaderText.getText();
		extentTest.info("Interview Details Page Header Text : " + textOfTheCourse);

		// Interview detals page : price detail

		String priceOfCourseMentionedInDetailsPage = priceOfTheCourseInDetalsPage.getText();
		extentTest.info("course price mentioned in details page : " + priceOfCourseMentionedInDetailsPage);

		// Interview details page : course details Student List

		String studentType = typeOfStudentIdea.getText();
		extentTest.info("course details student type : " + studentType);

		// expected value of comparing the heading text of the course , type of student
		// and price mentioned
		boolean expectedTopicValue = true;
		boolean expectedStudentValue = true;
		boolean expectedPriceValue = true;

		// comparing the text of the course in interview page with interview details
		// page
		boolean actualTopicText = headingOfTheCourse.equals(textOfTheCourse);
		// comparing the type of student mentioned in interview page and interview
		// details page
		boolean actualStudentValue = studentType.contains(textOfNewStudent);
		// comparing the price mentioned in the interview page with interview details
		boolean actualPriceValue = priceOfNewAStudent.contains(priceOfCourseMentionedInDetailsPage);

		// comparing the heading text of the course in Interview home page and interview
		// details page
		assertEquals(actualTopicText, expectedTopicValue);
		extentTest.info(
				"Heading text of the course mentioned in Interview Home Page and Interview Details Page is successfully verified");

		// comparing the type of student mentioned in course of interview page and
		// interview details page
		assertEquals(actualStudentValue, expectedStudentValue);
		extentTest.info(
				"Type of student mentioned in course of the interview home page and interview details page is successfully verified");

		// comaparing the price mentioned in the course of interview home page and
		// interview details page
		assertEquals(actualPriceValue, expectedPriceValue);
		extentTest.info(
				"Price mentioned in the course of interview home page and interview details page is successfully verified");

		// click buy now in Interview detals page
		buyNowInInterviewDetailsPage.click();

		// enter email id
		emailIdPersonality.sendKeys(email);

		// enter password
		passwordPersonality.sendKeys(password);

		// click submit login button
		loginSubmit.click();

		synchronized (driver) {
			try {
				driver.wait(12000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// cart page verification

		// checking whether cart page items and cart page prices are equal


		boolean atLeastOneIterationSuccessful = false;

		if (cartPageItems.size() == cartPageItemsPrices.size()) {
			boolean expectedCartPageCourseTopicValue = true;

			for (int i = 0; i < cartPageItems.size(); i++) {
				WebElement cartPageItem = cartPageItems.get(i);
				WebElement cartPageItemPrice = cartPageItemsPrices.get(i);
				String cartPageCourseTitle = cartPageItem.getText();
				boolean actualCartPageCourseTopicValue = cartPageCourseTitle.equals(textOfTheCourse);

				System.out.println("actualCartPageCourseTopicValue : " + actualCartPageCourseTopicValue);

				if (actualCartPageCourseTopicValue == expectedCartPageCourseTopicValue) {
					extentTest.info(cartPageCourseTitle);
					extentTest.pass("Title of course in Cart Page is successfully verified");

					atLeastOneIterationSuccessful = true; // Flag that at least one iteration was successful

					System.out.println(cartPageItemPrice.getText());
					System.out.println("cart page price " + cartPageItemPrice.getText());

					boolean expectedCartPageItemPrice = true;
					boolean actualCartPageItemPrice = cartPageItemPrice.getText()
							.contains(priceOfCourseMentionedInDetailsPage);

					extentTest.info("cart page item price and price in course mentioned in details page: "
							+ actualCartPageItemPrice + cartPageItemPrice.getText());

					if (actualCartPageItemPrice == expectedCartPageItemPrice) {
						extentTest.pass("Price mentioned in the course in Cart Page is successfully verified");
						extentTest.pass(
								"The course in the cart page of the interview course TITLE & PRICE is successfully verified");
					}
				}
			}

			// Check if no iterations were successful and output "Not matched"
			if (!atLeastOneIterationSuccessful) {
				extentTest.fail("None of the course added matches with cart page course ");
			}
		}

	}

}
