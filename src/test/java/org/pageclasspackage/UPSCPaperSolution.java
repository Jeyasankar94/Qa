package org.pageclasspackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UPSCPaperSolution extends VisionBaseClass {

	WebDriver driver;
	public UPSCPaperSolution(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	// Get the element from Title - UPSC Paper Solution at Resources page
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div/a[6]/div")
	private WebElement upscpapersolution;
	
	@FindBy(xpath = "//*[@id='mobile-menu']/li[6]/a/label")	
	private WebElement upscpapersolutionUnderResource;

	// Get the Banner text from UPSC Paper Solution
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div/div/div/div)[1]")
	private WebElement upscPaperSolutionText;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/div/div/main")
	private WebElement upscPaperSolutionBannerText;

	// Like the document on UPSC Paper Solution
	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]")
	private WebElement likeUPSCpaperSolution;
	
	//Download the document on UPSC Paper Solution For Random option
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[2]")
	private List<WebElement> downloadButton;
	
	//Download the document on UPSC Paper Solution
	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]")
	private WebElement downloadUPSCpaperSolution;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div/div/div/div/p")
	private List<WebElement> titleOfDocument;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/span[2]")
	private List<WebElement> yearAtDocument;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/span[2]")
	private List<WebElement> mediumAtDocument;


	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[1]")
	private List<WebElement> likeButton;
	
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[1])[5]")
	private WebElement likeButtonOnUPSCPaperSolution;	
	
	//Share the document on UPSC Paper Solution
	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[3]")
	private WebElement shareUPSCpaperSolution;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div[3]")
	private List<WebElement> shareButton;
	
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[1]")
	private WebElement whatsapp;
			
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[2]")
	private WebElement facebook;
			
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[3]")
	private WebElement gmail;
	
	@FindBy(xpath = "(//*[@class='modal-body']/div/p/button/div/img)[4]")
	private WebElement telegram;

	@FindBy(xpath = "//*[@class='cursor-pointer w-[20px] h-[20px] lg:h-[25px] lg:w-[25px] dark:text-white undefined']")
	private WebElement closepopup;
	
	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement popupApplyBtn;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div/div[2]/div[2]")
	private WebElement filterBtn;

	@FindBy(xpath = "//*[@class='modal-body']/div/div/div/div/div/button")
	private WebElement filterselectCategory;
	
	@FindBy(xpath = "//*[@class='show dropdown']/div/div/div/label")
	private List<WebElement> numberOfYears;

	@FindBy(xpath = "//*[text()='Clear Filters']")
	private WebElement clearFilter;
	
	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/div/div/button")
	private WebElement chooseMedium;
	
	@FindBy(xpath = "//*[@class='show dropdown']/div/button/div/p")
	private List<WebElement> medium;
	
	@FindBy(xpath = "//h1[text()='NO DATA FOUND']")
	private WebElement nodatafound;

	@FindBy(xpath = "//*[@class='sm:px-[20px']/div[2]/ul/li")
	private List<WebElement> numberOfPages;


	
	// This is used to click the QuickRevisionMaterial at Resources page
			public UPSCPaperSolution clickUPSCPaperSolution() throws InterruptedException {
				upscpapersolutionUnderResource.click();
				synchronized (driver) {driver.wait(5000);}
					
				String url = driver.getCurrentUrl();
				extentTest.info(url);
				synchronized (driver) {driver.wait(5000);}
				
				return this;
			}
	// Display the Banner Text of UPSC Paper Solution Page
			public boolean displayBannerTextOfUPSCPaperSolution() throws InterruptedException  {
				synchronized (driver) {driver.wait(5000);}
				
				String text = upscPaperSolutionBannerText.getText();
				extentTest.info(text);
				
				synchronized (driver) {driver.wait(5000);}
				
				return upscPaperSolutionBannerText.isDisplayed();
			}
			// This is used to click the Download button at UPSCPaperSolution
			public boolean clickDownloadUPSCPaperSolution() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,400)", "");

				synchronized (driver) {driver.wait(3000);}
				
				// Getting size of options available
					int size = downloadButton.size();

				// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
					
				// Selecting random value
				String title = downloadButton.get(randnMumber).getText();
				extentTest.info(title);
				
				downloadButton.get(randnMumber).click();
				synchronized (driver) {driver.wait(3000);}
				
				return downloadButton.get(randnMumber).isDisplayed();
			}
			// This is used to get the Title of Document at Quick Revision Material
			public boolean getTitleOfDocumentInUPSCPaperSolution() throws InterruptedException {
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
			// This is used to get the year of the Document at Quick Revision Material
			public boolean displayYearOnDocumentInUPSCPaperSolution() throws InterruptedException {
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
			// This is used to get the Medium of the Document at Quick Revision Material
					public boolean displayMediumOnDocumentInUPSCPaperSolution() throws InterruptedException {
						JavascriptExecutor jk = (JavascriptExecutor) driver;
						jk.executeScript("window.scrollBy(0,500)", "");

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
			// This is used to click the Like Button in Quick Revision Material documents
			public boolean displayAndLikeTheDocumentInUPSCPaperSolution() throws InterruptedException {
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
			    return likeButtonOnUPSCPaperSolution.getText();
			}
			public String getAfterLikeCount() {
			    return likeButtonOnUPSCPaperSolution.getText();
			}
			// This is used to count the document Likes before user login and refresh the same page and again click the Like button in Quick Revision Material
			public UPSCPaperSolution clickLikeButtonInUPSCPaperSolution() throws InterruptedException {
				JavascriptExecutor jk = (JavascriptExecutor) driver;
				jk.executeScript("window.scrollBy(0,400)", "");

				synchronized (driver) {driver.wait(3000);} 
				
				likeButtonOnUPSCPaperSolution.click();
				
				Thread.sleep(4000);
				return this;
			}	
			// This is used to click the Download Button in Quick Revision Material documents
			public boolean displayAndDownloadTheDocumentInUPSCPaperSolution() throws InterruptedException {
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
			// This is used to count the document Download before user login and refresh the same page and again click the Like button in Quick Revision Material
			public boolean displayDownloadCountOfTheDocumentAfterRefreshInUPSCPaperSolution() throws InterruptedException {
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
					
					String afterLike = downloadButton.get(randnMumber).getText();
					extentTest.info("After Download count is :" +afterLike);
					
					driver.navigate(). refresh();
					
					Thread.sleep(3000);
					
					String refreshbeforeDownload = downloadButton.get(randnMumber).getText();
					extentTest.info("Before Download count is :" +refreshbeforeDownload);
					
				// Selecting random value
					downloadButton.get(randnMumber).click();
					Thread.sleep(3000);
					
					String refreshafterLike = downloadButton.get(randnMumber).getText();
					extentTest.info("After Like count is :" +refreshafterLike);
					
					return downloadButton.get(randnMumber).isDisplayed();
			}	
			// This is used to click the Share Button at UPSC Paper Solution
			public UPSCPaperSolution clickShareButtonOfUPSCPaperSolution() throws InterruptedException {
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
			public UPSCPaperSolution clickWhatsappInUPSCPaperSolution() throws InterruptedException {
				whatsapp.click();
				return this;	
			}
			// This is used to click the Facebook in AIR News Analysis 
			public UPSCPaperSolution clickFacebookInUPSCPaperSolution() throws InterruptedException {
				facebook.click();
				return this;	
			}
			// This is used to click the Gmail in AIR News Analysis 
			public UPSCPaperSolution clickGmailInUPSCPaperSolution() throws InterruptedException {
				gmail.click();
				return this;	
			}
			// This is used to click the Telegram in AIR News Analysis 
			public UPSCPaperSolution clickTelegramInUPSCPaperSolution() throws InterruptedException {
				telegram.click();
				return this;	
			}
			// Click filter icon in the QuickRevisionMaterial
			public UPSCPaperSolution clickFilterButtonInUPSCPaperSolution() throws InterruptedException {
					synchronized (driver) {driver.wait(2000);}
						
					filterBtn.click();
					synchronized (driver) {driver.wait(2000);}
					return this;
					}

			
			// Filter actions at QuickRevisionMaterial
			public UPSCPaperSolution clickClearFilter() throws InterruptedException	 {
					synchronized (driver) {driver.wait(2000);}
					clearFilter.click();
					synchronized (driver) {driver.wait(2000);}
					
					return this;
					}
			// Select year randomly from the dropdown box
			public UPSCPaperSolution selectYearFilterOnUPSCPaperSolution() throws InterruptedException {

				filterselectCategory.click();
				synchronized (driver) {driver.wait(2000);}
	/*
				Robot cat = new Robot();
				for (int i = 0; i < 5; i++) {
					cat.keyPress(KeyEvent.VK_TAB);
					cat.keyRelease(KeyEvent.VK_TAB);
					cat.keyPress(KeyEvent.VK_SPACE);
					cat.keyRelease(KeyEvent.VK_SPACE);
					synchronized (driver) {driver.wait(2000);}
				}

					chooseMedium.click();
				synchronized (driver) {driver.wait(2000);}


				cat.keyPress(KeyEvent.VK_TAB);
				cat.keyRelease(KeyEvent.VK_TAB);
				cat.keyPress(KeyEvent.VK_SPACE);
				cat.keyRelease(KeyEvent.VK_SPACE);
			synchronized (driver) {driver.wait(2000);}
	*/
				
				// Getting size of options available
				int size = numberOfYears.size();

				// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

				Thread.sleep(1000);
				String yearFilter = numberOfYears.get(randnMumber).getText();
				extentTest.info("Selected year is :" +yearFilter);
				
				// Selecting random value
				numberOfYears.get(randnMumber).click();

				Thread.sleep(1000);

				synchronized (driver) {driver.wait(2000);}
				return this;
			}
			//Select category by randomly
			public UPSCPaperSolution clickSlectCategoryFilter() throws InterruptedException {

				chooseMedium.click();
				synchronized (driver) {driver.wait(2000);}
				
				// Getting size of options available
				int size = medium.size();

				// Generate a random number with in range
				int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
				Thread.sleep(1000);
				
				String mediumFilter = medium.get(randnMumber).getText();
				extentTest.info("Selected Medium is :" +mediumFilter);
				
				// Selecting random value
				medium.get(randnMumber).click();

				Thread.sleep(2000);

				synchronized (driver) {driver.wait(2000);}

				return this;
			}
			//Clicking on Apply button in the filter popup
			public UPSCPaperSolution clickFilterApplyButton() throws InterruptedException {

				popupApplyBtn.click();
				synchronized (driver) {driver.wait(2000);}
				return this;
			}
			//Clicking on Page by Randomly
			public UPSCPaperSolution clickRandomPage() throws InterruptedException {

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
				
				if (!nodatafound.isDisplayed()) 
				{
			        return true;
				} else 
				{
					String text = nodatafound.getText();
					extentTest.info(text);
			        return false; // No data found
			    }
			
			}

	// This is used to click the UPSC Paper Solution at Resources page
	public UPSCPaperSolution clickUPSCpaperSolution() throws InterruptedException {
		JavascriptExecutor jk = (JavascriptExecutor) driver;
		jk.executeScript("window.scrollBy(0,500)", "");
		synchronized (driver) {
			driver.wait(3000);
		}
		upscpapersolution.click();
		synchronized (driver) {
			driver.wait(5000);
		}
		String url = driver.getCurrentUrl();
		extentTest.info(url);
		synchronized (driver) {
			driver.wait(5000);
		}
		String text = upscPaperSolutionText.getText();
		extentTest.info(text);
		return this;
	}

	
}
