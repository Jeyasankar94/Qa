package org.pageclasspackage;

import java.util.List;

import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class HindiMagazine extends VisionBaseClass{

	WebDriver driver;
	public HindiMagazine(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[2]/a[5]/div")
	private WebElement hindiMagazine;

	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div/div/div/div)[1]")
	private WebElement hindiMagazineBannerText;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[3]")
	private List<WebElement> share;

	//Download the document on Hindi Magazine For Random option
		@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div")
		private List<WebElement> downloadButton;
		
		@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div/div/p")
		private List<WebElement> titleOfDocument;
		
		@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/span[2]")
		private List<WebElement> yearAtDocument;
		
		@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/span[2]")
		private List<WebElement> mediumAtDocument;

		@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]")
		private List<WebElement> likeButton;
		
		@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1])[2]")
		private WebElement likeButtonOnHindiMagazine;

	@FindBy(xpath = "(//*[@class='flex relative mb-[1rem]']/div[2]/div[2]/div/div/div/div/div[2]/div/div[1])[1]")
	private WebElement likeHindiMgznMnt1;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div/div[2]/div[2]")
	private WebElement filterBtn;

	@FindBy(xpath = "//*[@class='modal-body']/div/div/div/div/div/button")
	private WebElement selectBtn;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement popupApplyBtn;

	@FindBy(xpath = "//*[@class='cursor-pointer w-[20px] h-[20px] lg:h-[25px] lg:w-[25px] dark:text-white undefined']")
	private WebElement closepopup;

	@FindBy(xpath = "//span[text()='Clear Filters']")
	private WebElement clearFilter;

	@FindBy(xpath = "//*[@class='modal-body']/div/div/div/div/div/button")
	private WebElement filterselectYear;
	
	@FindBy(xpath = "//*[@class='show dropdown']/div/div/div/label")
	private List<WebElement> numberOfYears;
	
	@FindBy(xpath = "//div[contains(@class,'show dropdown')]/div/div/div/label")
	private List<WebElement> selectButton;

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

	
	// This is used to click the Hindi Magazine in Current Affairs
	public HindiMagazine clickHindiMagazine() {
	    hindiMagazine.click();

	    // Wait for a maximum of 8 seconds for the current URL to change
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(driver.getCurrentUrl())));

	    String url = driver.getCurrentUrl();
	    extentTest.info(url);

	    return this;
	}

	// Display the Banner Text of Hindi magazine Page
	public boolean displayBannerTextOfHindiMagazine() {
	    // Wait for a maximum of 10 seconds for the banner text to be displayed
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOf(hindiMagazineBannerText));

	    String text = hindiMagazineBannerText.getText();
	    extentTest.info(text);

	    return hindiMagazineBannerText.isDisplayed();
	}

	// This is used to click the Download button at News Today English
	public boolean clickDownloadRandomlyOnHindiMagazine() {
	    JavascriptExecutor jk = (JavascriptExecutor) driver;
	    jk.executeScript("window.scrollBy(0,400)");

	    // Wait for a maximum of 10 seconds before interacting with the download button
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfAllElements(downloadButton));

	    // Getting size of options available
	    int size = downloadButton.size();

	    // Generate a random number within the range
	    int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

	    // Wait for a maximum of 10 seconds for the selected download button to be clickable
	    wait.until(ExpectedConditions.elementToBeClickable(downloadButton.get(randnMumber)));

	    // Selecting random value
	    String title = downloadButton.get(randnMumber).getText();
	    extentTest.info(title);

	    downloadButton.get(randnMumber).click();

	    return downloadButton.get(randnMumber).isDisplayed();
	}

			// This is used to get the Title of Document at  Hindi Magazine
			public boolean getTitleOfDocumentInHindiMagazine() throws InterruptedException {
						JavascriptExecutor jk = (JavascriptExecutor) driver;
						jk.executeScript("window.scrollBy(0,400)", "");

						synchronized (driver) {driver.wait(3000);}
						// Getting size of options available
							int size = titleOfDocument.size();

						// Generate a random number with in range
							int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
							
							// Selecting random value
							String title = titleOfDocument.get(randnMumber).getText();
							extentTest.info(title);
							Thread.sleep(2000);
							
							return titleOfDocument.get(randnMumber).isDisplayed();
				}	
			// This is used to get the year of the Document at Hindi Magazine
			public boolean displayYearOnDocumentInHindiMagazine() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,500)", "");

				synchronized (driver) {driver.wait(3000);}
				// Getting size of options available
					int size = yearAtDocument.size();

				// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
					
					// Selecting random value
					String year = yearAtDocument.get(randnMumber).getText();
					extentTest.info(year);
					Thread.sleep(1000);
					
					return yearAtDocument.get(randnMumber).isDisplayed();
			}	
			// This is used to get the Medium of the Document at  Hindi Magazine
			public boolean displayMediumOnDocumentInHindiMagazine() throws InterruptedException {

						synchronized (driver) {driver.wait(3000);}
						// Getting size of options available
							int size = mediumAtDocument.size();

						// Generate a random number with in range
							int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
							
							// Selecting random value
							String medium = mediumAtDocument.get(randnMumber).getText();
							extentTest.info(medium);
							Thread.sleep(1000);
							
							return mediumAtDocument.get(randnMumber).isDisplayed();
			}	
			
			// This is used to click the Like Button in Hindi Magazine documents
			public boolean displayAndLikeTheDocumentInHindiMagazine() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,500)", "");

				synchronized (driver) {driver.wait(3000);}
				// Getting size of options available
					int size = likeButton.size();

				// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					String beforeLike = likeButton.get(randnMumber).getText();
					extentTest.info("Before like count is :" +beforeLike);
					
				// Selecting random value
					likeButton.get(randnMumber).click();
					
					String afterLike = likeButton.get(randnMumber).getText();
					extentTest.info("After Like count is :" +afterLike);
					Thread.sleep(2000);
					
					return likeButton.get(randnMumber).isDisplayed();
			}		
			
			public String getBeforeLikeCount() {
			    return likeButtonOnHindiMagazine.getText();
			}
			public String getAfterLikeCount() {
			    return likeButtonOnHindiMagazine.getText();
			}
			// Check Like count of the document before user login and refresh the same page and again click the Like button in NewsTodayEnglish
			public boolean displayLikeCountOfTheDocumentAfterRefreshInHindiMagazine() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,500)", "");

				synchronized (driver) {driver.wait(3000);}
				// Getting size of options available
					int size = likeButton.size();

				// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					String beforeDownload = likeButton.get(randnMumber).getText();
					extentTest.info("Before Like count is :" +beforeDownload);
					
				// Selecting random value
					likeButton.get(randnMumber).click();
					Thread.sleep(3000);
					
					String afterLike = likeButton.get(randnMumber).getText();
					extentTest.info("After Like count is :" +afterLike);
					
					driver.navigate(). refresh();
					
					Thread.sleep(3000);
					
					String refreshbeforeDownload = likeButton.get(randnMumber).getText();
					extentTest.info("Before Like count is :" +refreshbeforeDownload);
					
				// Selecting random value
					likeButton.get(randnMumber).click();
					Thread.sleep(3000);
					
					String refreshafterLike = likeButton.get(randnMumber).getText();
					extentTest.info("After Like count is :" +refreshafterLike);
					
					return likeButton.get(randnMumber).isDisplayed();
			}			
			
			// This is used to click the Like button at News Today Hindi
			public HindiMagazine clickLikeHindiMagazine() throws InterruptedException {
					synchronized (driver) {driver.wait(2000);}
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,400)", "");

					likeButtonOnHindiMagazine.click();
					return this;
			}
			
			// This is used to count the document Download before user login and refresh the same page and again click the Like button in News Today Hindi
			public boolean displayDownloadCountOfTheDocumentAfterRefreshInHindiMagazine() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,500)", "");

				synchronized (driver) {driver.wait(3000);}
				// Getting size of options available
					int size = downloadButton.size();

				// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					String beforeDownload = downloadButton.get(randnMumber).getText();
					extentTest.info("Before Download count is :" +beforeDownload);
					
				// Selecting random value
					downloadButton.get(randnMumber).click();
					Thread.sleep(3000);
					
					String afterDownload = downloadButton.get(randnMumber).getText();
					extentTest.info("After Download count is :" +afterDownload);
					
					driver.navigate(). refresh();
					
					Thread.sleep(3000);
					
					String downloadBeforeRefresh = downloadButton.get(randnMumber).getText();
					extentTest.info("Before Download count is :" +downloadBeforeRefresh);
					
				// Selecting random value
					downloadButton.get(randnMumber).click();
					Thread.sleep(3000);
					
					String downloadAfterRefresh = downloadButton.get(randnMumber).getText();
					extentTest.info("After Download count is :" +downloadAfterRefresh);
					
					return downloadButton.get(randnMumber).isDisplayed();
		}	
		
			// This is used to click the Share button at News Today Hindi
			public HindiMagazine clickShareHindiMagazine() throws InterruptedException {
				synchronized (driver) {driver.wait(2000);}
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,400)", "");

				synchronized (driver) {driver.wait(3000);}
				// Getting size of options available
					int size = share.size();

				// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

				// Selecting random value
					share.get(randnMumber).click();
					synchronized (driver) {driver.wait(3000);}
		/*
				String path = captureScreenShotBase64();
				extentTest.addScreenCaptureFromBase64String(path, "Share ");
				extentTest.pass("Share button clicked");
		*/
					return this;
			}
			
			// This is used to click on Whatsapp in Share  with window
			public HindiMagazine copyThePageLink() throws InterruptedException {
				synchronized (driver) {driver.wait(2000);}
				String url = copyPageLinktext.getText();
				extentTest.info(url);
				return this;
		}
			// This is used to click on Whatsapp in Share  with window
			public HindiMagazine clickWhatsapp() throws InterruptedException {
				whatsapp.click();	   
				synchronized (driver) {driver.wait(2000);}
				return this;
		}
			// This is used to click on Facebook in Share  with window
			public HindiMagazine clickFacebook() throws InterruptedException {
				facebook.click();
				synchronized (driver) {driver.wait(2000);}
				return this;
	  }
			// This is used to click on gmail in Share  with window
			public HindiMagazine clickGmail() throws InterruptedException {
				synchronized (driver) {driver.wait(2000);}
				gmail.click();
				return this;
	  }
			// This is used to click on gmail in Share  with window
			public HindiMagazine clickTelegram() throws InterruptedException {
				telegram.click();
				synchronized (driver) {driver.wait(2000);}
				return this;
	  }
			// This is used to click the News Today English back button
			public HindiMagazine clickCloseButtonInSharePopup() throws InterruptedException {
				closepopup.click();
				synchronized (driver) {driver.wait(5000);}
				return this;
			}
			public HindiMagazine clickRandomPage() throws InterruptedException {

				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,400)", "");
				synchronized (driver) {
					driver.wait(2000);
				}
					
				/*
					for (WebElement option : numberOfPages) {
						String optionPage = option.getText();

				 if(optionPage.equals("2")) {
					 option.click();
				 }

					//	System.out.println(optionPage);
					}
	*/
					// Getting size of options available
					int size = numberOfPages.size();

	    			// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


					// Selecting random value
					numberOfPages.get(randnMumber).click();

					Thread.sleep(2000);
		
								return this;
			}	
			
	
	//Click on Clear Filters
	public HindiMagazine clickClearFilter() throws InterruptedException {
		synchronized (driver) {
			driver.wait(2000);
		}
		clearFilter.click();
		return this;
	}
	// This is used to click the Filter icon
			public HindiMagazine clickFilter() throws InterruptedException {
				filterBtn.click();

				synchronized (driver) {
					driver.wait(2000);
				}
				return this;
			}

			// This is used to click the select year
			public HindiMagazine clickSelectYear() throws InterruptedException {
						filterselectYear.click();
					// Getting size of options available
					int size = numberOfYears.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					// Selecting random value
					numberOfYears.get(randnMumber).click();

					String year = numberOfYears.get(randnMumber).getText();
					extentTest.info("Selected Year is :" +year);
					
	   				Thread.sleep(2000);
	   				synchronized (driver) {driver.wait(3000);}

	   				filterselectYear.click();

	   				return this;
			}
			// This is used to click the Apply button in the filter popup
			public HindiMagazine clickApplyFilter() throws InterruptedException {
						popupApplyBtn.click();
						synchronized (driver) {driver.wait(3000);}
						return this;
			}
	
}
