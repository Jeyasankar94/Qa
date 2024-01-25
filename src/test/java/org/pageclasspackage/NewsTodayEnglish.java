package org.pageclasspackage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class NewsTodayEnglish extends VisionBaseClass {

	WebDriver driver;

	public NewsTodayEnglish(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='News Today English']")
	private WebElement newstodayEnglish;

	@FindBy(xpath = "//h4[text()='NEWS Today English']/following-sibling::main")
	private WebElement newstodayEnglishBannerText;

	@FindBy(xpath = "//span[text()='News Today English']")
	private WebElement backnewstodayEnglish;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div/div[2]/div[2]/div[2]/div/div/div")
	private List<WebElement> randomMonth;

	@FindBy(xpath = "//*[@class='show dropdown']/div/div/div/input")
	private List<WebElement> numberOfYears;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[3]")
	private List<WebElement> share;

	// Download the document on News Today English For Random option
	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div")
	private List<WebElement> downloadButton;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]")
	private List<WebElement> likeButton;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div/div/p")
	private List<WebElement> titleOfDocument;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/span[2]")
	private List<WebElement> yearAtDocument;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4 main']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/span[2]")
	private List<WebElement> mediumAtDocument;

	@FindBy(xpath = "(//*[@class='Home_main__OVLM4 main']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1])[2]")
	private WebElement likeButtonOnNewsTodayEnglish;

	@FindBy(xpath = "//*[@title='Close']")
	private WebElement closepopup;

	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/div/div/button")
	private WebElement chooseMedium;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement popupApplyBtn;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div/div[2]/div[2]")
	private WebElement filterBtn;

	@FindBy(xpath = "//*[@class='modal-body']/div/div/div/div/div/button")
	private WebElement filterselectYear;

	@FindBy(xpath = "//*[text()='Clear Filters']")
	private WebElement clearFilter;

	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button)[1]")
	private WebElement whatsapp;

	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button)[2]")
	private WebElement facebook;

	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button)[3]")
	private WebElement gmail;

	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button)[4]")
	private WebElement telegram;

	@FindBy(xpath = "//*[@class='modal-body']/div[2]/span")
	private WebElement copyPageLinktext;

	@FindBy(xpath = "//*[@src='/icons/copy.svg']")
	private WebElement copyIconPageLink;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div[2]/ul/li")
	private List<WebElement> numberOfPages;

	@FindBy(xpath = "//h1[text()='NO RESOURCES FOUND']")
	private WebElement nodatafound;

	public boolean isLikeButtonClickable() {
		try {
			return likeButtonOnNewsTodayEnglish.isEnabled() && likeButtonOnNewsTodayEnglish.isDisplayed();
		} catch (NoSuchElementException | StaleElementReferenceException | ElementClickInterceptedException e) {
			// Log the exception to understand the issue
			extentTest.info("Exception while checking if like button is clickable: " + e.getMessage());
			return false;
		}
	}

	// This is used to click the News Today English in Current Affairs
	public NewsTodayEnglish clickNewsTodayEnglish() throws InterruptedException {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(newstodayEnglish));
		newstodayEnglish.click();
		return this;
	}

	// Display the Banner Text of News Today English Page
	public boolean displayBannerTextOfNewsTodayEnglish() throws InterruptedException {
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Wait for a maximum of 10 seconds for the banner text to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(newstodayEnglishBannerText));

		String text = newstodayEnglishBannerText.getText();
		extentTest.info(text);

		return newstodayEnglishBannerText.isDisplayed();
	}

	// This is used to click the News Today English back button
	public NewsTodayEnglish clickbackNewsTodayEnglish() throws InterruptedException {
		// Wait for a maximum of 20 seconds for the banner text to be displayed
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(backnewstodayEnglish));
		backnewstodayEnglish.click();
		return this;
	}

	// This is used to click the Download button at News Today English
	public boolean clickDownloadRandomnlyOnNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(downloadButton));

		// Getting size of options available
		int size = downloadButton.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		String title = downloadButton.get(randnMumber).getText();
		extentTest.info(title);

		downloadButton.get(randnMumber).click();

		return downloadButton.get(randnMumber).isDisplayed();
	}

	// This is used to get the Title of Document at News Today English
	public boolean getTitleOfDocumentInNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(titleOfDocument));

		// Getting size of options available
		int size = titleOfDocument.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		String title = titleOfDocument.get(randnMumber).getText();
		extentTest.info(title);

		return titleOfDocument.get(randnMumber).isDisplayed();
	}

	// This is used to get the year of the Document at News Today English
	public boolean displayYearOnDocumentInNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,500)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(yearAtDocument));

		// Getting size of options available
		int size = yearAtDocument.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		String year = yearAtDocument.get(randnMumber).getText();
		extentTest.info(year);

		return yearAtDocument.get(randnMumber).isDisplayed();
	}

	// This is used to get the Medium of the Document at News Today English
	public boolean displayMediumOnDocumentInNewsTodayEnglish() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(mediumAtDocument));
		// Getting size of options available
		int size = mediumAtDocument.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		String medium = mediumAtDocument.get(randnMumber).getText();
		extentTest.info(medium);

		return mediumAtDocument.get(randnMumber).isDisplayed();
	}

	// This is used to click the Like Button in News Today English documents
	public boolean displayAndLikeTheDocumentInNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,500)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(likeButton));

		// Getting size of options available
		int size = likeButton.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		String beforeLike = likeButton.get(randnMumber).getText();
		extentTest.info("Before like count is :" + beforeLike);

		// Selecting random value
		likeButton.get(randnMumber).click();

		String afterLike = likeButton.get(randnMumber).getText();
		extentTest.info("After Like count is :" + afterLike);
		Thread.sleep(2000);

		return likeButton.get(randnMumber).isDisplayed();
	}

	public String getBeforeLikeCount() {
		// Use WebDriverWait for waiting until the element is clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(likeButtonOnNewsTodayEnglish));
		return likeButtonOnNewsTodayEnglish.getText();
	}

	public String getAfterLikeCount() {
		// Use WebDriverWait for waiting until the element is clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(likeButtonOnNewsTodayEnglish));
		return likeButtonOnNewsTodayEnglish.getText();
	}

	// Check Like count of the document before user login and refresh the same page
	// and again click the Like button in NewsTodayEnglish
	public boolean displayLikeCountOfTheDocumentAfterRefreshInNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,500)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(likeButton));

		// Getting size of options available
		int size = likeButton.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		String beforeDownload = likeButton.get(randnMumber).getText();
		extentTest.info("Before Like count is :" + beforeDownload);

		// Selecting random value
		likeButton.get(randnMumber).click();
		Thread.sleep(3000);

		String afterLike = likeButton.get(randnMumber).getText();
		extentTest.info("After Like count is :" + afterLike);

		driver.navigate().refresh();

		Thread.sleep(3000);

		String refreshbeforeDownload = likeButton.get(randnMumber).getText();
		extentTest.info("Before Like count is :" + refreshbeforeDownload);

		// Selecting random value
		likeButton.get(randnMumber).click();
		Thread.sleep(3000);

		String refreshafterLike = likeButton.get(randnMumber).getText();
		extentTest.info("After Like count is :" + refreshafterLike);

		return likeButton.get(randnMumber).isDisplayed();
	}

	// This is used to click any one of the month Randomly at News Today English in
	// Current Affairs
	public NewsTodayEnglish clickAnyOneOfTheMonthOnNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(randomMonth));

		// Getting size of options available
		int size = randomMonth.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		randomMonth.get(randnMumber).click();

		return this;
	}

	// This is used to click the Like button at News Today English (Static method)
	public NewsTodayEnglish clickLikeOnNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");
		// Use WebDriverWait for waiting until the element is clickable
		try {
			likeButtonOnNewsTodayEnglish.click();
			// Wait for the like button to become clickable again (adjust the timeout as
			// needed)
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(likeButtonOnNewsTodayEnglish));
		} catch (NoSuchElementException | StaleElementReferenceException | ElementClickInterceptedException error) {
			// Log the exception to understand the issue
			extentTest.info("Exception while clicking like button: " + error.getMessage());
		}
		return this;
	}

	// This is used to count the document Download before user login and refresh the
	// same page and again click the Like button in News Today English
	public boolean displayDownloadCountOfTheDocumentAfterRefreshInNewsTodayEnglish() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,500)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(downloadButton));

		// Getting size of options available
		int size = downloadButton.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		String downloadBeforeRefresh = downloadButton.get(randnMumber).getText();
		extentTest.info("Before Download count is :" + downloadBeforeRefresh);

		// Selecting random value
		downloadButton.get(randnMumber).click();

		String afterDownload = downloadButton.get(randnMumber).getText();
		extentTest.info("After Download count is :" + afterDownload);

		driver.navigate().refresh();

		String downloadBefore = downloadButton.get(randnMumber).getText();
		extentTest.info("Before Download count is :" + downloadBefore);

		// Selecting random value
		downloadButton.get(randnMumber).click();

		String downloadAfterRefresh = downloadButton.get(randnMumber).getText();
		extentTest.info("After Download count is :" + downloadAfterRefresh);

		return downloadButton.get(randnMumber).isDisplayed();
	}

	// This is used to click the Share button at News Today English
	public NewsTodayEnglish clickShare() throws InterruptedException {

		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");

		// Wait for a maximum of 10 seconds before interacting with the download button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(share));

		// Getting size of options available
		int size = share.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		share.get(randnMumber).click();

		return this;
	}

	// This is used to click the Filter icon
	public NewsTodayEnglish clickFilter() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the Filter Button
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(filterBtn));
		filterBtn.click();

		return this;
	}

	// This is used to click the select year //Dynamic selection using Random class
	public NewsTodayEnglish clickSelectYear() throws InterruptedException {

		// Wait for a maximum of 10 seconds before interacting with the select Year
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(filterselectYear));
		filterselectYear.click();

		// Wait for a maximum of 10 seconds before interacting with the download button
		wait.until(ExpectedConditions.visibilityOfAllElements(numberOfYears));

		// Getting size of options available
		int size = numberOfYears.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		numberOfYears.get(randnMumber).click();

		String year = numberOfYears.get(randnMumber).getText();
		extentTest.info("Selected Year is :" + year);

		filterselectYear.click();
		return this;
	}

	// This is used to click the Apply button in the filter popup
	public NewsTodayEnglish clickApplyFilter() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(popupApplyBtn));
		popupApplyBtn.click();
		return this;
	}

	// This is used to click the Clear Filter
	public NewsTodayEnglish clickClearFilter() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(clearFilter));
		clearFilter.click();
		return this;
	}

	// This is used to click on Whatsapp in Share with window
	public NewsTodayEnglish clickWhatsapp() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(whatsapp));
		whatsapp.click();
		// Wait for a maximum of 10 seconds for the banner text to be displayed
		wait.until(ExpectedConditions.visibilityOf(copyPageLinktext));

		String url = copyPageLinktext.getText();
		extentTest.info(url);
		return this;
	}

	// This is used to click on Facebook in Share with window
	public NewsTodayEnglish clickFacebook() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(facebook));
		facebook.click();
		// Wait for a maximum of 10 seconds for the banner text to be displayed
		wait.until(ExpectedConditions.visibilityOf(copyPageLinktext));
		String url = copyPageLinktext.getText();
		extentTest.info(url);
		return this;
	}

	// This is used to click on gmail in Share with window
	public NewsTodayEnglish clickGmail() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(gmail));
		gmail.click();
		// Wait for a maximum of 10 seconds for the banner text to be displayed
		wait.until(ExpectedConditions.visibilityOf(copyPageLinktext));
		String url = copyPageLinktext.getText();
		extentTest.info(url);
		return this;
	}

	// This is used to click on gmail in Share with window
	public NewsTodayEnglish clickTelegram() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(telegram));
		telegram.click();
		// Wait for a maximum of 10 seconds for the banner text to be displayed
		wait.until(ExpectedConditions.visibilityOf(copyPageLinktext));
		String url = copyPageLinktext.getText();
		extentTest.info(url);
		return this;
	}

	// This is used to click the News Today English back button
	public NewsTodayEnglish clickCloseButtonInShareWithPopup() throws InterruptedException {
		// Wait for a maximum of 10 seconds before interacting with the popup Apply Btn
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		closepopup.click();
		return this;
	}

	// Clicking on Page by Randomly
	public NewsTodayEnglish clickRandomPage() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");

		// Wait for a maximum of 10 seconds before interacting with the select Year
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfAllElements(numberOfPages));

		/*
		 * for (WebElement option : numberOfPages) { String optionPage =
		 * option.getText();
		 * 
		 * if(optionPage.equals("2")) { option.click(); }
		 * 
		 * // System.out.println(optionPage); }
		 */
		// Getting size of options available
		int size = numberOfPages.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		// Selecting random value
		numberOfPages.get(randnMumber).click();

		return this;
	}

	public boolean isDataDisplayed() {
		// Check if the list is not empty before accessing its elements
		if (!yearAtDocument.isEmpty() && (!mediumAtDocument.isEmpty())) {
			yearAtDocument.get(0);
			return true;
		} else {
			return false; // No data found
		}
	}

	public boolean isNoDataFoundDisplayed() {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,400)", "");

		String nodata = nodatafound.getText();
		extentTest.info("Error Message found :" + nodata);

		return nodatafound.isDisplayed();
	}
}
