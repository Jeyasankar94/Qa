package org.pageclasspackage;

import java.awt.AWTException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.By;
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

public class ValueAddedMaterialPage extends VisionBaseClass {

	WebDriver driver;
	public ValueAddedMaterialPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/a[11]/div/div")	
	private WebElement ValueAddedMaterialPage;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div/div/div/main")
	private WebElement ValueAddedMaterialPageBannerText;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1]")
	private List<WebElement> likeButton;//i[@class='icon-thumbs-up pr-1 text-[#686E70] dark:text-[#fff]']
	
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[1])[2]")
	private WebElement likeButtonOnValueAddedMaterialPage;
	
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2])[2]")
	private WebElement downloadButtonOnValueAddedMaterialPage;
	
	//Download the document on ValueAddedMaterialPage For Random option
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[2]/div")
	private List<WebElement> downloadButton;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div/div/p")
	private List<WebElement> titleOfDocument;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/span[2]")
	private List<WebElement> yearAtDocument;
	
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[2]/span[2]")
	private List<WebElement> mediumAtDocument;

	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div[1]/div[2]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div[3]")
	private List<WebElement> share;
	
	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/div/div/button/p")
	private WebElement sections;
	
	@FindBy(xpath = "//*[@class='modal-body']/div/div[2]/div/div/div/button/div/p")
	private List<WebElement> selectSections;

	@FindBy(xpath = "//*[@class='cursor-pointer w-[20px] h-[20px] lg:h-[25px] lg:w-[25px] dark:text-white undefined']")
	private WebElement closepopup;

	@FindBy(xpath = "//*[@class='flex relative mb-[1rem]']/div[2]/div/div[2]/div[2]")
	private WebElement filterBtn;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement popupApplyBtn;

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

	@FindBy(xpath = "//h1[text()='NO RESOURCES FOUND']")
	private WebElement nodatafound;


	
	
	public boolean isLikeButtonClickable() {
	    try {
	        return likeButtonOnValueAddedMaterialPage.isEnabled() && likeButtonOnValueAddedMaterialPage.isDisplayed();
	    } catch (NoSuchElementException | StaleElementReferenceException | ElementClickInterceptedException e) {
	        // Log the exception to understand the issue
	        extentTest.info("Exception while checking if like button is clickable: " + e.getMessage());
	        return false;
	    }
	}
	// This is used to click ValueAddedMaterialPage in Current Affairs
		public ValueAddedMaterialPage clickValueAddedMaterialPage() throws InterruptedException {
			  // Wait for a maximum of 10 seconds for the banner text to be displayed
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.elementToBeClickable(ValueAddedMaterialPage));

			JavascriptExecutor jk = (JavascriptExecutor) driver;
			jk.executeScript("window.scrollBy(0,200)", "");
			
			ValueAddedMaterialPage.click();
			
			return this;
		}

		// Display the Banner Text of ValueAddedMaterialPage
				public boolean displayBannerTextOfValueAddedMaterialPage() {
				    // Wait for a maximum of 10 seconds for the banner text to be displayed
				    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
				    wait.until(ExpectedConditions.visibilityOf(ValueAddedMaterialPageBannerText));

				    String text = ValueAddedMaterialPageBannerText.getText();
				    extentTest.info(text);

				    return ValueAddedMaterialPageBannerText.isDisplayed();
				}
				
				// This is used to click the Download button at ValueAddedMaterialPage
					public boolean clickDownloadRandomlyOnValueAddedMaterialPage() {
					    JavascriptExecutor jk = (JavascriptExecutor) driver;
					    jk.executeScript("window.scrollBy(0,400)");

					    // Wait for a maximum of 10 seconds before interacting with the download button
					    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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

					// This is used to get the Title of Document at  ValueAddedMaterialPage
					public boolean getTitleOfDocumentInValueAddedMaterialPage() throws InterruptedException {
					    JavascriptExecutor jk = (JavascriptExecutor) driver;
					    jk.executeScript("window.scrollBy(0,400)");

					    // Wait for a maximum of 10 seconds before interacting with the title Of Document
					    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // 10 seconds timeout
					    wait.until(ExpectedConditions.visibilityOfAllElements(titleOfDocument));

					    // Getting size of options available
					    int size = titleOfDocument.size();

					    // Generate a random number within range
					    int randNumber = ThreadLocalRandom.current().nextInt(0, size);

					    // Selecting random value
					    String title = titleOfDocument.get(randNumber).getText();
					    extentTest.info(title);

					    return titleOfDocument.get(randNumber).isDisplayed();
					}

					// This is used to get the year of the Document at ValueAddedMaterialPage
					public boolean displayYearOnDocumentInValueAddedMaterialPage() throws InterruptedException {
						JavascriptExecutor jk = (JavascriptExecutor) driver;
						jk.executeScript("window.scrollBy(0,500)", "");

						  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
						  wait.until(ExpectedConditions.visibilityOfAllElements(yearAtDocument));
						    
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
					// This is used to get the Medium of the Document at  ValueAddedMaterialPage
					public boolean displayMediumOnDocumentInValueAddedMaterialPage() throws InterruptedException {

						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
						  wait.until(ExpectedConditions.visibilityOfAllElements(mediumAtDocument));
						  
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
					
					// This is used to click the Like Button in ValueAddedMaterialPage documents
					public boolean displayAndLikeTheDocumentInValueAddedMaterialPage() throws InterruptedException {
						JavascriptExecutor jk = (JavascriptExecutor) driver;
						jk.executeScript("window.scrollBy(0,500)", "");

						WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
						  wait.until(ExpectedConditions.visibilityOfAllElements(likeButton));
						  
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
					    // Use WebDriverWait for waiting until the element is clickable
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						wait.until(ExpectedConditions.elementToBeClickable(likeButtonOnValueAddedMaterialPage));
					    return likeButtonOnValueAddedMaterialPage.getText();
					}
					public String getAfterLikeCount() {
						// Use WebDriverWait for waiting until the element is clickable
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						wait.until(ExpectedConditions.elementToBeClickable(likeButtonOnValueAddedMaterialPage));
					    return likeButtonOnValueAddedMaterialPage.getText();
					}	
					// This is used to click the Like button at ValueAddedMaterialPage
					public ValueAddedMaterialPage clickLikeOnValueAddedMaterialPage() throws InterruptedException {
							JavascriptExecutor jk = (JavascriptExecutor) driver;
							jk.executeScript("window.scrollBy(0,400)", "");
							// Use WebDriverWait for waiting until the element is clickable
							 try {
							    	likeButtonOnValueAddedMaterialPage.click();
							        // Wait for the like button to become clickable again (adjust the timeout as needed)
							        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
							        wait.until(ExpectedConditions.elementToBeClickable(likeButtonOnValueAddedMaterialPage));
							    } catch (NoSuchElementException | StaleElementReferenceException | ElementClickInterceptedException error) {
							        // Log the exception to understand the issue
							        extentTest.info("Exception while clicking like button: " + error.getMessage());
							    }
							return this;
					}		
					
					// Check Like count of the document before user login and refresh the same page and again click the Like button in ValueAddedMaterialPage
								public boolean displayLikeCountOfTheDocumentAfterRefreshInValueAddedMaterialPage() throws InterruptedException {
									JavascriptExecutor jk = (JavascriptExecutor) driver;
									jk.executeScript("window.scrollBy(0,500)", "");

									WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
									  wait.until(ExpectedConditions.visibilityOfAllElements(likeButton));
									  
									// Getting size of options available
										int size = likeButton.size();

									// Generate a random number with in range
										int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

										String beforeDownload = likeButton.get(randnMumber).getText();
										extentTest.info("Before Like count is :" +beforeDownload);
										
									// Selecting random value
										likeButton.get(randnMumber).click();
										
										String afterLike = likeButton.get(randnMumber).getText();
										extentTest.info("After Like count is :" +afterLike);
										
										driver.navigate(). refresh();
										
										Thread.sleep(3000);
										
										String refreshbeforeDownload = likeButton.get(randnMumber).getText();
										extentTest.info("Before Like count is :" +refreshbeforeDownload);
										
									// Selecting random value
										likeButton.get(randnMumber).click();
										
										String refreshafterLike = likeButton.get(randnMumber).getText();
										extentTest.info("After Like count is :" +refreshafterLike);
										
										return likeButton.get(randnMumber).isDisplayed();
								}			
								
								public String getBeforeDownloadCount() {
									 // Use WebDriverWait for waiting until the element is clickable
							        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
									wait.until(ExpectedConditions.elementToBeClickable(downloadButtonOnValueAddedMaterialPage));
								    return downloadButtonOnValueAddedMaterialPage.getText();
								}
								public String getAfterDownloadCount() {
									 // Use WebDriverWait for waiting until the element is clickable
							        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
									wait.until(ExpectedConditions.elementToBeClickable(downloadButtonOnValueAddedMaterialPage));
								    return downloadButtonOnValueAddedMaterialPage.getText();
								}	
								// This is used to click the Like button at ValueAddedMaterialPage
								public ValueAddedMaterialPage clickDownloadValueAddedMaterialPage() throws InterruptedException {
										synchronized (driver) {driver.wait(2000);}
										JavascriptExecutor jk = (JavascriptExecutor) driver;
										jk.executeScript("window.scrollBy(0,400)", "");
										 // Use WebDriverWait for waiting until the element is clickable
								        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
										wait.until(ExpectedConditions.elementToBeClickable(downloadButtonOnValueAddedMaterialPage));
										downloadButtonOnValueAddedMaterialPage.click();
										return this;
								}		
								
								// This is used to count the document Download before user login and refresh the same page and again click the Like button in ValueAddedMaterialPage
								public boolean displayDownloadCountOfTheDocumentAfterRefreshInValueAddedMaterialPage() throws InterruptedException {
									JavascriptExecutor jk = (JavascriptExecutor) driver;
									jk.executeScript("window.scrollBy(0,500)", "");

									WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
									  wait.until(ExpectedConditions.visibilityOfAllElements(downloadButton));
									  
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
								public ValueAddedMaterialPage clickShareValueAddedMaterialPage() throws InterruptedException {
									synchronized (driver) {driver.wait(2000);}
									JavascriptExecutor jk = (JavascriptExecutor) driver;
									jk.executeScript("window.scrollBy(0,400)", "");

									WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
									  wait.until(ExpectedConditions.visibilityOfAllElements(downloadButton));
									  
									// Getting size of options available
										int size = share.size();

									// Generate a random number with in range
										int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

									// Selecting random value
										share.get(randnMumber).click();
						
										return this;
								}


							// This is used to click on Whatsapp in Share  with window
							public ValueAddedMaterialPage copyThePageLink() throws InterruptedException {
								 // Use WebDriverWait for waiting until the element is clickable
							       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
							      wait.until(ExpectedConditions.elementToBeClickable(copyPageLinktext));

									String url = copyPageLinktext.getText();
									extentTest.info(url);
									return this;
							}
							// This is used to click on Whatsapp in Share  with window
							public ValueAddedMaterialPage clickWhatsapp() throws InterruptedException {
								 // Use WebDriverWait for waiting until the element is clickable
							       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
							         wait.until(ExpectedConditions.elementToBeClickable(whatsapp));
								     whatsapp.click();	   
								      return this;
							}
						// This is used to click on Facebook in Share  with window
						public ValueAddedMaterialPage clickFacebook() throws InterruptedException {
							 // Use WebDriverWait for waiting until the element is clickable
						       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						      wait.until(ExpectedConditions.elementToBeClickable(facebook));
							facebook.click();
							return this;
						  }
						// This is used to click on gmail in Share  with window
						public ValueAddedMaterialPage clickGmail() throws InterruptedException {
							 // Use WebDriverWait for waiting until the element is clickable
						       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						      wait.until(ExpectedConditions.elementToBeClickable(gmail));
							gmail.click();
							return this;
						  }
						// This is used to click on gmail in Share  with window
						public ValueAddedMaterialPage clickTelegram() throws InterruptedException {
							 // Use WebDriverWait for waiting until the element is clickable
						       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						      wait.until(ExpectedConditions.elementToBeClickable(telegram));
							telegram.click();
							return this;
						  }
						// This is used to click the News Today English back button
						public ValueAddedMaterialPage clickCloseButtonInSharePopup() throws InterruptedException {
							 // Use WebDriverWait for waiting until the element is clickable
						       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						      wait.until(ExpectedConditions.elementToBeClickable(closepopup));
							closepopup.click();
							return this;
						}
								
						public ValueAddedMaterialPage clickRandomPage() throws InterruptedException {
							JavascriptExecutor jk = (JavascriptExecutor) driver;
							jk.executeScript("window.scrollBy(0,400)", "");
										
										// Getting size of options available
										int size = numberOfPages.size();

						    			// Generate a random number with in range
										int randnMumber = ThreadLocalRandom.current().nextInt(0, size);


										// Selecting random value
										numberOfPages.get(randnMumber).click();

										return this;
								}	
								
						
						//Click on Clear Filters
						public ValueAddedMaterialPage clickClearFilter() throws InterruptedException {
							// Use WebDriverWait for waiting until the element is clickable
						       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
						      wait.until(ExpectedConditions.elementToBeClickable(clearFilter));
							clearFilter.click();
							return this;
						}
						// This is used to click the Filter icon
						public ValueAddedMaterialPage clickFilter() throws InterruptedException {
							// Use WebDriverWait for waiting until the element is clickable
						       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
							      wait.until(ExpectedConditions.elementToBeClickable(filterBtn));
									filterBtn.click();

									return this;
						}

								// This is used to click the select year
								public ValueAddedMaterialPage clickSelectYear() throws InterruptedException {
									// Use WebDriverWait for waiting until the element is clickable
								       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
									      wait.until(ExpectedConditions.elementToBeClickable(filterselectYear));
											filterselectYear.click();
											
											  wait.until(ExpectedConditions.visibilityOfAllElements(numberOfYears));
											  
										// Getting size of options available
										int size = numberOfYears.size();

										// Generate a random number with in range
										int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

										// Selecting random value
										numberOfYears.get(randnMumber).click();

										String year = numberOfYears.get(randnMumber).getText();
										extentTest.info("Selected Year is :" +year);
										
						   				filterselectYear.click();

						   				return this;
								}
								// This is used to click the Apply button in the filter popup
								public ValueAddedMaterialPage clickApplyFilter() throws InterruptedException {
									// Use WebDriverWait for waiting until the element is clickable
								       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
									      wait.until(ExpectedConditions.elementToBeClickable(popupApplyBtn));
											popupApplyBtn.click();
											return this;
								}
						
								
								// Choose medium in the drop down box
								public ValueAddedMaterialPage clickSectionsFilter() throws InterruptedException, AWTException {
									// Use WebDriverWait for waiting until the element is clickable
								       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
									      wait.until(ExpectedConditions.elementToBeClickable(sections));
									      sections.click();

									  wait.until(ExpectedConditions.visibilityOfAllElements(selectSections));
									// Getting size of options available
									int size = selectSections.size();

									// Generate a random number with in range
									int randnMumber = ThreadLocalRandom.current().nextInt(0, size);

									// Selecting random value
									selectSections.get(randnMumber).click();
									
			//						String mediumFilter = medium.get(randnMumber).getText();
			//						extentTest.info("Selected Medium is :" +mediumFilter);

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
									
									return nodatafound.isDisplayed();
								}



}
