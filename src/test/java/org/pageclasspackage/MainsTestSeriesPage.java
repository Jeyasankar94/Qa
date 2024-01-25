package org.pageclasspackage;

import java.util.List;
import java.util.Random;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainsTestSeriesPage extends VisionBaseClass {

	WebDriver driver;
	public MainsTestSeriesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Test series in header
	@FindBy(xpath = "//span [text()='Test Series']")
	private WebElement testSeries;

	// Mains Test Series in Header under Test series

	@FindBy(xpath = "//span[text()='Mains Test Series']")
	private WebElement mainsTestSeries;

	// Header text of Mains test series page

	@FindBy(xpath = "//*[@class='sm:!max-w-[60%] ']/h4")
	private WebElement headerTextMainsTestSeries;

	// webelement for cards in a page
	@FindBy(xpath = "//*[@class='p-0 container']/div[3]/div/div")
	private List<WebElement> cardElements;

	// webelements for dates in card
	@FindBy(xpath = "//*[@class='flex flex-wrap justify-start']/div")
	private List<WebElement> cardDateElements;

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

	// Filter button in mains test series page

	@FindBy(xpath = "//*[@class='flex justify-center items-center z-10']")
	private WebElement filterButton;

	// click somewhere to close the dropdown

	@FindBy(xpath = "//*[@class='modal-header']")
	private WebElement somewhere;

	// following are webelements for select year dropdown

	@FindBy(xpath = "(//*[@class='dropdown'])[1]")
	private WebElement selectYear;

	// various webelements of select year dropdown choices

	@FindBy(xpath = "//*[@class='show dropdown']/div/div/div")
	private List<WebElement> variousYearChoicesInSelectYearDropdown;

	// following are webelements for test dropdown

	@FindBy(xpath = "(//*[@class='dropdown'])[4]")
	private WebElement testDropdown;

	// total tests dropdown list

	@FindBy(xpath = "//*[@class='show dropdown']/div/div/div")
	private List<WebElement> variousNumberOfTestDropdown;

	// following are webelements for select subject dropdown

	@FindBy(xpath = "(//*[@class='dropdown'])[2]")
	private WebElement selectSubject;

	@FindBy(xpath = "//*[@class='show dropdown']/div/button")
	private List<WebElement> variousSubjectsInSubjectDropdown;

	// Following webelements are medium

	@FindBy(xpath = "(//*[@class='dropdown'])[3]")
	private WebElement medium;

	// following are webelements for language option in select medium dropdown

	@FindBy(xpath = "//*[@class='mb-0 w-[90%] capitalize']")
	private List<WebElement> variousMediumInSelectMediumDropdown;

	// apply button in filter pop-up

	@FindBy(xpath = "//*[@class=' flex justify-center items-center sm:!flex-col-reverse modal-footer']/button")
	private WebElement applyFilter;

	// click Test series in header of

	public void clickTestSeriesM() {
		testSeries.click();

		synchronized (driver) {
			try {
				driver.wait(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	// click Mains Test series under test series

	public void clickMainsTestSeriesM() {

		// scrolling down to click mains test series

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,10000)");

		synchronized (driver) {

			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		mainsTestSeries.click();

		synchronized (driver) {

			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// Getting text of header of Mains text series page

		String headerMainsText = headerTextMainsTestSeries.getText();

		extentTest.info("Header text of Mains Test Series Page : " + headerMainsText);
	}

	// click a card in page

	public void clickCard() {

		// check atleast one card is present

		if (!cardElements.isEmpty()) {

			// clickingfirst card
			cardElements.get(0).click();
		} else {
			extentTest.info("No card is present in the page ");
		}

		// select a date randomly in card

		// checking card have atleast one date
		if (!cardDateElements.isEmpty()) {

			// creating Random instance

			Random random = new Random();

			int randomIndex = random.nextInt(cardDateElements.size());

			// select random date element

			WebElement dateElement = cardDateElements.get(randomIndex);

			// get the text of the randomly selected date element
			String dateText = dateElement.getText();
			extentTest.info("date selected in the card pop-up : " + dateText);

			// click the randomly selected date element
			dateElement.click();

			// scrolling down to verify download, share , pencil , dates option

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,300)");

			synchronized (driver) {
				try {
					driver.wait(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			List<WebElement> testSchedules = driver.findElements(By.xpath(
					"//*[@class='lg:h-[30rem] md:h-[25rem] sm:h-[30vh]   overflow-auto scrollbar-hide mt-4 scroll-smoth px-2']/div"));

			WebElement startingDate = driver.findElement(By.xpath(
					"//*[@class=' text-white bg-primaryLight dark:bg-primaryDark mx-auto flex h-10 w-10 items-center justify-center rounded-full dark:text-white']/time"));

			extentTest.info("startingDate : " + startingDate.getText());

			for (WebElement testSchedule : testSchedules) {

				extentTest.info("testSchedule : " + testSchedule.getText());

			}

			// Downloading brochure

			downloadButton.click();

			extentTest.info("Download brochure of Mains Detail page verified");

			// share

			shareButton.click();

			extentTest.info("share filter o[tion   of Mains Details page verified");

			// getting page link text

			String text = pageLinkText.getText();
			extentTest.info("Page Link : " + text);

			// Share with close

			sharewithClose.click();

		}

	}

	// click Mains Test series Filter button

	public void clickMainsFilter() {
		filterButton.click();
	}

	// click somewhere to dropdown

	public void clickMiansSomewhere() {
		somewhere.click();
	}

	// select year in Select Year filter dropdown

	public void selectYearInMainsSelectYearDropdown() {
		// click select year dropdown in filter dropdown
		selectYear.click();

		// checking whether medium dropdown is greated than zero

		if (variousYearChoicesInSelectYearDropdown.size() > 0) {

			// creating random instance for random selection number of test dropdown

			Random random = new Random();

			int randomIndex = random.nextInt(variousYearChoicesInSelectYearDropdown.size());

			// select random test element and perform click action

			WebElement randomlySelectedYear = variousYearChoicesInSelectYearDropdown.get(randomIndex);
			randomlySelectedYear.click();

			// text of the randomly selected medium

			String randomYearText = randomlySelectedYear.getText();
			extentTest.info("randomYearText : " + randomYearText);
		}

	}

	// select medium in select medium filter dropdown

	public void selectMediumInMainsTestDropdown() {

		// click medium dropdown
		medium.click();

		// checking whether medium dropdown is greated than zero

		if (variousMediumInSelectMediumDropdown.size() > 0) {

			// creating random instance for random selection number of test dropdown

			Random random = new Random();

			int randomIndex = random.nextInt(variousMediumInSelectMediumDropdown.size());

			// select random test element and perform click action

			WebElement randomlySelectedMedium = variousMediumInSelectMediumDropdown.get(randomIndex);
			randomlySelectedMedium.click();

			// text of the randomly selected medium

			String randomMediumText = medium.getText();
			extentTest.info("randomMediumText : " + randomMediumText);

		}
	}

	// select number of test in test dropdown

	public void selectTestInkMainsTestDropdown() {

		// click test dropdown
		testDropdown.click();

		// checking whether test dropdown is greater than zero is

		if (variousNumberOfTestDropdown.size() > 0) {

			// creating random instance for random selection number of test dropdown

			Random random = new Random();

			int randomIndex = random.nextInt(variousNumberOfTestDropdown.size());

			// select random test element and perform click action

			WebElement randomlySelectedTest = variousNumberOfTestDropdown.get(randomIndex);
			randomlySelectedTest.click();

			// text of the random element

			String randomElementText = randomlySelectedTest.getText();

			extentTest.info("selected test series : " + randomElementText);

		}

	}

	// select subject in subject dropdown

	public void selectSubjectInkMainsSubjectDropdown() {

		// click subject dropdown
		selectSubject.click();

		// checking whether subject dropdown is greater than zero is

		if (variousSubjectsInSubjectDropdown.size() > 0) {

			// creating random instance for random selection for subjects in subject
			// dropdown

			Random random = new Random();
			int randomIndex = random.nextInt(variousSubjectsInSubjectDropdown.size());

			// select random subject element and perform click action

			WebElement randomlySelectedSubject = variousSubjectsInSubjectDropdown.get(randomIndex);
			randomlySelectedSubject.click();

			// get text of the selected subject element
			String subjectText = selectSubject.getText();

			extentTest.info("selected subject text : " + subjectText);

		}

	}

	// click apply filter in filter pop-up

	public void clickApplyFilterPopup() {
		applyFilter.click();
	}

}
