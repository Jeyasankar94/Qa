package org.pageclasspackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AIRNewsAnalysis extends VisionBaseClass{

	WebDriver driver;
	public AIRNewsAnalysis(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='mobile-menu']/li[5]/a/label")		
	private WebElement airNewsAnalysis;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/div/div/main")
	private WebElement bannerText;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div/div/div/span[1]/div/span")
	private WebElement backAIRnewsAnalysis;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[3]/div/div")
	private List<WebElement> months;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div[4]/div[3]")
	private List<WebElement> shareButton;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div[4]/div[2]")
	private List<WebElement> downloadButton;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div[4]/div[1]")
	private List<WebElement> likeButton;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/main/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]/p")
	private List<WebElement> titleOfDocument;
	
	@FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div/main/div/div[2]/div[2]/div[2]/div/div/div[4]")
	private List<WebElement> displayDateMonthYear;
	
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[1]")
	private WebElement whatsapp;
			
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[2]")
	private WebElement facebook;
			
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[3]")
	private WebElement gmail;
	
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[4]")
	private WebElement telegram;
			
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[3]/div/div/div/div/div/p)[1]")
	private WebElement marchMonth;
	
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div[4]/div[1])[1]")
	private WebElement likeButtonOnMarchMonth;		
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div[3]/button")
	private List<WebElement> playButton;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div[3]/div[2]")
	private WebElement audioLength;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[2]/div[1]/div[3]/div[3]")
	private WebElement audioBtnAIR1;

	@FindBy(xpath = "//*[@class='w-[20px] h-[20px] bg-[#fff] rounded-[50%] text-[#333] absolute top-[-5px] right-[-5px]']")
	private WebElement closeaudioBtnAIR;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[2]/div[1]/div[3]/div[4]")
	private WebElement playbackSpeedBtnAIR1;

	@FindBy(xpath = "(//*[@class='dark:text-white cursor-pointer sm:w-6 sm:h-6 lg:w-[20px] lg:h-[20px] ml-[94%] absolute !top-[-5px] right-[-5px]'])[1]")
	private WebElement closeplaybackSpeedBtnAIR;

	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/div/div/button")
	private WebElement chooseMedium;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement popupApplyBtn;

	@FindBy(xpath = "//*[@class='cursor-pointer w-[20px] h-[20px] lg:h-[25px] lg:w-[25px] dark:text-white undefined']")
	private WebElement closepopup;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div/div[2]/div[2]")
	private WebElement filterBtn;

	@FindBy(xpath = "//*[@id='dropdown-basic']")
	private WebElement selectYear;
	
	@FindBy(xpath = "//*[@class='show dropdown']/div/div")
	private List<WebElement> years;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[3]/div/div/div/div/div[2]/div[1]/span[2]")
	private List<WebElement> yearsOnMonthlyDocument;
		
	@FindBy(xpath = "(//*[@id='dropdown-basic'])[1]")
	private WebElement selectCategoryDropdown	;
	
	@FindBy(xpath = "//*[@class='show dropdown']/div/button/div/p")
	private List<WebElement> selectCategoryList;
	
	@FindBy(xpath = "//*[@class='show dropdown']/div/button/div/p")
	private List<WebElement> selectLevel;
	
	@FindBy(xpath = "//p[text()='Importance Level']")
	private WebElement importanceDropdown;

	// This is used to click the AIR News Analysis at Home page
		public AIRNewsAnalysis clickAIRNewsAnalysis() throws InterruptedException {
			Actions act = new Actions(driver);
			act.moveToElement(airNewsAnalysis).perform();
			airNewsAnalysis.click();
			synchronized (driver) {driver.wait(2000);}
			String url = driver.getCurrentUrl();
			extentTest.info(url);
			return this;
		}
		// This is used to click the Back Button in AIR News Analysis 
				public AIRNewsAnalysis clickAIRNewsAnalysisBackButton() throws InterruptedException {
					backAIRnewsAnalysis.click();
					String url = driver.getCurrentUrl();
					extentTest.info(url);
				return this;	
				}
		// This is used to verify whether the banner is Display proper text in  AIR News Analysis
				public boolean displayBannerTextOfAIRNewsAnalysis() throws InterruptedException {
					String banText = bannerText.getText();
					extentTest.info("Banner Text in AIR News Analysis: "+ banText);
					return bannerText.isDisplayed();
				}
		// This is used to click the Month at AIR News Analysis
		public AIRNewsAnalysis clickMonthAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,400)", "");

					synchronized (driver) {driver.wait(3000);}
					// Getting size of options available
						int size = months.size();

					// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					// Selecting random value
						months.get(randnMumber).click();
						synchronized (driver) {driver.wait(3000);}
						return this;
				}			
				// This is used to click the Share Button at AIR News Analysis
				public AIRNewsAnalysis clickShareButtonInAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,400)", "");

					synchronized (driver) {driver.wait(3000);}
					// Getting size of options available
						int size = shareButton.size();

					// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					// Selecting random value
						shareButton.get(randnMumber).click();
						synchronized (driver) {driver.wait(3000);}
						return this;
				}	
				// This is used to click the Whatsapp in AIR News Analysis 
				public AIRNewsAnalysis clickWhatsappInAIRNewsAnalysis() throws InterruptedException {
					whatsapp.click();
					return this;	
				}
				// This is used to click the Facebook in AIR News Analysis 
				public AIRNewsAnalysis clickFacebookInAIRNewsAnalysis() throws InterruptedException {
					facebook.click();
					return this;	
				}
				// This is used to click the Gmail in AIR News Analysis 
				public AIRNewsAnalysis clickGmailInAIRNewsAnalysis() throws InterruptedException {
					gmail.click();
					return this;	
				}
				// This is used to click the Telegram in AIR News Analysis 
				public AIRNewsAnalysis clickTelegramInAIRNewsAnalysis() throws InterruptedException {
					telegram.click();
					return this;	
				}
				// This is used to click the Download button at AIR News Analysis
				public boolean displayDownloadButtonAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");

					synchronized (driver) {driver.wait(3000);}
					// Getting size of options available
						int size = downloadButton.size();

					// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

					// Selecting random value
						downloadButton.get(randnMumber).click();
						String title = downloadButton.get(randnMumber).getText();
						extentTest.info(title);
						Thread.sleep(2000);
						return downloadButton.get(randnMumber).isDisplayed();
				}			
				// This is used to get the Title of Document at AIR News Analysis
				public boolean getTitleOfDocumentInAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");

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
				// This is used to get the Date, Month and year of the Document at AIR News Analysis
				public boolean displayDateMonthAndYearOfDocumentInAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");

					synchronized (driver) {driver.wait(3000);}
					// Getting size of options available
						int size = displayDateMonthYear.size();

					// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
						// Selecting random value
						String title = displayDateMonthYear.get(randnMumber).getText();
						extentTest.info(title);
						Thread.sleep(2000);
						return displayDateMonthYear.get(randnMumber).isDisplayed();
				}	
				// This is used to click the Like Button in AIR News Analysis documents
				public boolean displayAndLikeTheDocumentInAIRNewsAnalysis() throws InterruptedException {
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
				// This is used to click the Back Button in AIR News Analysis 
				public AIRNewsAnalysis clickOnMarchAIRNewsAnalysisBackButton() throws InterruptedException {
					marchMonth.click();
					String url = driver.getCurrentUrl();
					extentTest.info(url);
				return this;	
				}
				public String getBeforeLikeCount() {
				    return likeButtonOnMarchMonth.getText();
				}
				public String getAfterLikeCount() {
				    return likeButtonOnMarchMonth.getText();
				}
				// This is used to count the document Likes before user login and refresh the same page and again click the Like button in AIR News Analysis 
				public AIRNewsAnalysis displayTheDocumentLikeCountAfterRefreshInAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,400)", "");

					synchronized (driver) {driver.wait(3000);}

					String beforeLike = likeButtonOnMarchMonth.getText();
					extentTest.info("Before like count is :" +beforeLike);
					
					likeButtonOnMarchMonth.click();
					synchronized (driver) {driver.wait(3000);}
					
					String afterLike = likeButtonOnMarchMonth.getText();
					extentTest.info("After Like count is :" +afterLike);
					Thread.sleep(4000);
					return this;
				}			
				// This is used to click the Download Button in AIR News Analysis documents
				public boolean displayAndDownloadTheDocumentInAIRNewsAnalysis() throws InterruptedException {
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
						Thread.sleep(2000);
						String afterDownload = downloadButton.get(randnMumber).getText();
						extentTest.info("After Download count is :" +afterDownload);
						
						return downloadButton.get(randnMumber).isDisplayed();
				}						
				// This is used to count the document Download before user login and refresh the same page and again click the Like button in AIR News Analysis 
				public boolean displayDownloadCountOfTheDocumentAfterRefreshInAIRNewsAnalysis() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");

					synchronized (driver) {driver.wait(3000);}
					// Getting size of options available
						int size = downloadButton.size();

					// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

						String beforeLike = downloadButton.get(randnMumber).getText();
						extentTest.info("Before like count is :" +beforeLike);
					// Selecting random value
						downloadButton.get(randnMumber).click();
						Thread.sleep(3000);
						String afterLike = downloadButton.get(randnMumber).getText();
						extentTest.info("After Like count is :" +afterLike);
						
						driver.navigate(). refresh();
						
						Thread.sleep(3000);
						
						String refreshbeforeLike = downloadButton.get(randnMumber).getText();
						extentTest.info("Before like count is :" +refreshbeforeLike);
					// Selecting random value
						downloadButton.get(randnMumber).click();
						Thread.sleep(3000);
						String refreshafterLike = downloadButton.get(randnMumber).getText();
						extentTest.info("After Like count is :" +refreshafterLike);
						
						return downloadButton.get(randnMumber).isDisplayed();
				}				
		// This is used to click the Play button at AIR News Analysis
		public AIRNewsAnalysis clickPlayBtnAIRNewsAnalysis() throws InterruptedException {
			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,500)", "");

			synchronized (driver) {driver.wait(3000);}
			// Getting size of options available
				int size = playButton.size();

			// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
				playButton.get(randnMumber).click();
				Thread.sleep(5000);
				
				playButton.get(randnMumber).click();
			

			return this;
		}

		// This is used to click the Playback speed button at AIR News Analysis
		public AIRNewsAnalysis clickplaybackBtnAIRNewsAnalysis() throws InterruptedException {
			String text = audioLength.getText();
			extentTest.info(text);
			synchronized (driver) {
				driver.wait(5000);
			}
			playbackSpeedBtnAIR1.click();
			synchronized (driver) {
				driver.wait(5000);
			}
			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " playbabkspeed ");
			extentTest.pass("Playback speed button clicked");

			closeplaybackSpeedBtnAIR.click();
			synchronized (driver) {
				driver.wait(5000);
			}
			return this;
		}

		// This is used to click the Audio Button at AIR News Analysis
		public AIRNewsAnalysis clickAudioBtnAIRNewsAnalysis() throws InterruptedException {
			audioBtnAIR1.click();
			synchronized (driver) {
				driver.wait(5000);
			}
			String path = captureScreenShotBase64(getDriver());
			extentTest.addScreenCaptureFromBase64String(path, " Audio button");
			extentTest.pass("Audio button clicked");

			closeaudioBtnAIR.click();
			synchronized (driver) {
				driver.wait(8000);
			}
			return this;
		}


	public AIRNewsAnalysis selectYearFilterOnAIRNewsAnalysis() throws InterruptedException	{
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		synchronized (driver) {driver.wait(2000);}
			
		filterBtn.click();
		synchronized (driver) {driver.wait(2000);}

		selectYear.click();
		synchronized (driver) {driver.wait(2000);}
		
		// Getting size of options available
		int size = years.size();

		// Generate a random number with in range
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

		String yearFilter = years.get(randnMumber).getText();
		extentTest.info("Selected year is :" +yearFilter);
		
		// Selecting random value
		years.get(randnMumber).click();
		synchronized (driver) {driver.wait(2000);}
		selectYear.click();
/*
		Robot cat = new Robot();
		for (int i = 0; i < 5; i++) {
			cat.keyPress(KeyEvent.VK_TAB);
			cat.keyRelease(KeyEvent.VK_TAB);
			synchronized (driver) {driver.wait(1000);}
		}
		cat.keyPress(KeyEvent.VK_SPACE);
		cat.keyRelease(KeyEvent.VK_SPACE);

		chooseMedium.click();
		synchronized (driver) {driver.wait(1000);}
			
		cat.keyPress(KeyEvent.VK_TAB);
		cat.keyRelease(KeyEvent.VK_TAB);
		cat.keyPress(KeyEvent.VK_SPACE);
		cat.keyRelease(KeyEvent.VK_SPACE);
		synchronized (driver) {driver.wait(2000);}
			
		popupApplyBtn.click();
*/
		return this;
	}
	//Display selected year on the Monthly document
	public boolean selectedYearOnAIRNewsAnalysis() throws InterruptedException	{
			
			// Getting size of options available
			int size = yearsOnMonthlyDocument.size();

			// Generate a random number with in range
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			// Selecting random value
			yearsOnMonthlyDocument.get(randnMumber).click();
			
			String selectedYear = yearsOnMonthlyDocument.get(randnMumber).getText();
			extentTest.info("Selected year on Monthly Document  :" +selectedYear);
			
			return yearsOnMonthlyDocument.get(randnMumber).isDisplayed();

	}
	// This is used to click the Whatsapp in AIR News Analysis 
	public AIRNewsAnalysis clickApplyButtonInFilterPopup() throws InterruptedException {
		popupApplyBtn.click();
		return this;	
	}
	// This is used to click the Filter in AIR News Analysis 
	public AIRNewsAnalysis clickFilterButton() throws InterruptedException {
		filterBtn.click();
		return this;	
	}
	//Select Category and Medium of Filters on Monthly document
	public AIRNewsAnalysis selectCategoryOnAIRNewsAnalysisFilter() throws InterruptedException	{
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			selectCategoryDropdown.click();
			synchronized (driver) {driver.wait(2000);}
			
			// Getting size of options available
			int size = selectCategoryList.size();

			// Generate a random number with in range			
			int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

			String categ = selectCategoryList.get(randnMumber).getText();
			extentTest.info("Selected year is :" +categ);
			
			// Selecting random value
				selectCategoryList.get(randnMumber).click();
			
			return this;
	}
	//Select Category and Medium of Filters on Monthly document
		public AIRNewsAnalysis selectImportanceLevelOnAIRNewsAnalysisFilter() throws InterruptedException	{
			synchronized (driver) {driver.wait(2000);}
			
			importanceDropdown.click();
				synchronized (driver) {driver.wait(2000);}
				
				// Getting size of options available
				int size = selectLevel.size();

				// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

				String level = selectLevel.get(randnMumber).getText();
				extentTest.info("Selected Level is :" +level);

				// Selecting random value
				selectLevel.get(randnMumber).click();
				
			
				return this;
		}
}