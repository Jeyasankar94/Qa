package org.pageclasspackage;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.basepackage.VisionBaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalksAndInterviews extends VisionBaseClass {

	WebDriver driver;
	public TalksAndInterviews(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@class='Home_main__OVLM4']/div/div[2]/div/a[7]/div")
	   private  WebElement talksAndInterviews;
	
	@FindBy(xpath = "//*[@id='mobile-menu']/li[7]/a/label")	
	private WebElement talksAndInterviewsUnderResource;

	// Get the Banner text from Talks and Interviews
	@FindBy(xpath = "(//*[@class='Home_main__OVLM4']/div/div/div/div)[1]")
	private WebElement talksAndInterviewsBannerText;
	

	@FindBy(xpath = "(//button[text()='WATCH'])[1]")
	   private  WebElement buttonWatchEnglish;

	@FindBy(xpath = "(//button[text()='WATCH'])[2]")
	   private  WebElement buttonWatchHindi;

	@FindBy(xpath = "//*[@class='pagination_pagination__2FDlE sm:!m-0  pagination']/li") // if add /a at the end 2 to 6 page will be selected
	   private  List<WebElement> pagination;

	@FindBy(xpath = "//main[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div/div/div[3]/div")
	   private  List<WebElement> numberOfPlaylist;

	@FindBy(xpath = "//main[@class='Home_main__OVLM4']/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div")
	   private  List<WebElement> playvideo;

	
	// This is used to click the Talks And Interviews at Resources page
				public TalksAndInterviews clickTalksAndInterviews() throws InterruptedException {
					talksAndInterviewsUnderResource.click();
					synchronized (driver) {driver.wait(5000);}
						
					String url = driver.getCurrentUrl();
					extentTest.info(url);
					synchronized (driver) {driver.wait(5000);}
					 
					return this; 
				}
		// Display the Banner Text of Talks And Interviews Page
				public boolean displayBannerTextOfTalksAndInterviews() throws InterruptedException  {
					synchronized (driver) {driver.wait(5000);}
					
					String text = talksAndInterviewsBannerText.getText();
					extentTest.info(text);
					
					synchronized (driver) {driver.wait(5000);}
					
					return talksAndInterviewsBannerText.isDisplayed();
				}

		// This is used to click the WATCH English button in the Talks and Interviews
				public TalksAndInterviews clickWatchEnglish() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");
					synchronized (driver) {driver.wait(2000);}

					buttonWatchEnglish.click();
					synchronized (driver) {driver.wait(3000);}

					String url = driver.getCurrentUrl();
					extentTest.info(url);

					return this;
				}
		// This is used to click the WATCH English button in the Talks and Interviews
				public TalksAndInterviews clickWatchHindi() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");
					synchronized (driver) {driver.wait(2000);}

					buttonWatchHindi.click();
					synchronized (driver) {driver.wait(3000);}

					String url = driver.getCurrentUrl();
					extentTest.info(url);

					return this;
				}
				//Click on Playlist
				public TalksAndInterviews clickPlaylistRandomnly() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,500)", "");
					synchronized (driver) {driver.wait(2000);}

					//Dynamic selection using Random class
					for (WebElement option : numberOfPlaylist) {

						String optionPage = option.getText();
						System.out.println(optionPage);

					}
					// Getting size of options available
					int size = numberOfPlaylist.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
					synchronized (driver) {driver.wait(2000);}
					
					// Selecting random value
					numberOfPlaylist.get(randnMumber).click();

					String url = driver.getCurrentUrl();
					extentTest.info(url);

					return this;
				}
				//Click on Platform
				public TalksAndInterviews playVideoRandomnly() throws InterruptedException {
					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,400)", "");
					synchronized (driver) {driver.wait(2000);}

					//Dynamic selection using Random class
					for (WebElement option : playvideo) {

						String optionPage = option.getText();
						System.out.println(optionPage);

					}
					// Getting size of options available
					int size = playvideo.size();

					// Generate a random number with in range
					int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
					synchronized (driver) {driver.wait(2000);}
					
					// Selecting random value
					playvideo.get(randnMumber).click();

					return this;
				}
			//Pagination Randomly
				public TalksAndInterviews selectPageRandomnly() throws InterruptedException {

					JavascriptExecutor jk = (JavascriptExecutor) driver;
					jk.executeScript("window.scrollBy(0,1000)", "");
					synchronized (driver) {driver.wait(2000);}

					
						//Dynamic selection using Random class
						for (WebElement option : pagination) {

							String optionPage = option.getText();
							System.out.println(optionPage);

						}
						// Getting size of options available
						int size = pagination.size();

						// Generate a random number with in range
						int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
						synchronized (driver) {driver.wait(2000);}
						
						// Selecting random value
						pagination.get(randnMumber).click();


						return this;

				}

}
