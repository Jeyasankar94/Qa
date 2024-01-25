package org.testpackage;

import java.awt.AWTException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC060_AIRnewsAnalysis extends VisionBaseClass {
	
	//Verify whether user is able to view the module name with proper Banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfAIRnewsAnalysis() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();

		pom.getResources(getDriver()).clickResources();

		pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
		
		Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayBannerTextOfAIRNewsAnalysis(),"Banner Text is not displayed at AIR News Analysis");
	}
	//Verify AIR news Analysis loading with a downloadable document
		@Test(priority = 2, enabled = true)
		public void testPresenceOfDocumentInAIRnewsAnalysis() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();

			pom.getResources(getDriver()).clickResources();

			pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
			Thread.sleep(2000);
			
			pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
			Thread.sleep(2000);
			
			pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
			Thread.sleep(2000);
			
			Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayDownloadButtonAIRNewsAnalysis(),"Documents cannot be Download in AIR News Analysis ");
			
		}
		//Verify title of each document is dispalyed properly
				@Test(priority = 3, enabled = true)
				public void testTitleOfDocumentInAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(2000);
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).getTitleOfDocumentInAIRNewsAnalysis(),"Title of the AIR News Analysis not displayed");
					
				}
				//Verify date,month with year and medium under each document
				@Test(priority = 4, enabled = true)
				public void testPresenceOfDateMonthAndYearInAIRnewsAnalysisDocument() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayDateMonthAndYearOfDocumentInAIRNewsAnalysis(),"Date, Month and Year is not displayed in AIR News Analysis documents ");
					
				}
				//Verify whether user can like the documents & Like icon should turn blue and count should be increased
				@Test(priority = 5, enabled = true)
				public void testLikeCountInAIRnewsAnalysisDocument() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayAndLikeTheDocumentInAIRNewsAnalysis(),"Cannot click the Like button in AIR News Analysis documents ");
					
				}
				//Verify after the user likes the button and refreshes the page
				@Test(priority = 6, enabled = true)
				public void testLikeCountOfDocumentAtBeforeUserLoginInAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(4000);
					synchronized (driver) {driver.wait(5000);}
					pom.getAIRNewsAnalysis(getDriver()).clickOnMarchAIRNewsAnalysisBackButton();
					Thread.sleep(4000);
					
					String beforeRefreshLikeCount = pom.getAIRNewsAnalysis(getDriver()).getBeforeLikeCount();
					
					pom.getAIRNewsAnalysis(getDriver()).displayTheDocumentLikeCountAfterRefreshInAIRNewsAnalysis();
					
					String afterClickLikeCount = pom.getAIRNewsAnalysis(getDriver()).getAfterLikeCount();
					
					Thread.sleep(4000);
					
					Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in AIR News Analysis  ");
					
					refresh(getDriver());
					
					Thread.sleep(4000);
					synchronized (driver) {driver.wait(5000);}
					String beforeLikeCount = pom.getAIRNewsAnalysis(getDriver()).getBeforeLikeCount();
					
					pom.getAIRNewsAnalysis(getDriver()).displayTheDocumentLikeCountAfterRefreshInAIRNewsAnalysis();
					
					String afterRefreshLikeCount = pom.getAIRNewsAnalysis(getDriver()).getAfterLikeCount();
					
					Thread.sleep(4000);
					
					Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in AIR News Analysis  ");
					
				}
				//Verify whether user can download the documents & Download icon should turn blue.
				@Test(priority = 7, enabled = true)
				public void testDownloadCountOfDocumentInAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayAndDownloadTheDocumentInAIRNewsAnalysis(),"User cannot Click the Download button in AIR News Analysis documents ");
					
				}
				//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 8, enabled = true)
				public void testDownloadCountOfDocumentAtBeforeUserLoginInAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInAIRNewsAnalysis(),"User cannot Like the Document more than once in AIR News Analysis documents ");
					
				}
				//Verify whether User can share the page via whatsapp
				@Test(priority = 9, enabled = true)
				public void testUserCanShareTheDocumentViaWhatsappOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickShareButtonInAIRNewsAnalysis();
					
					pom.getAIRNewsAnalysis(getDriver()).clickWhatsappInAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					
					windowhandling(getDriver());
					
					String title = getDriver().getTitle();
					extentTest.info(title);
					
					Assert.assertEquals("WhatsApp",title,"Incorrect Title for Whatsapp  ");
					
				}
				//Verify whether User can share the page via Facebook
				@Test(priority = 10, enabled = true)
				public void testUserCanShareTheDocumentViaFacebookOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickShareButtonInAIRNewsAnalysis();
					
					pom.getAIRNewsAnalysis(getDriver()).clickFacebookInAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					
					windowhandling(getDriver());
					
					String title = getDriver().getTitle();
					extentTest.info(title);
					
					Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
				}
				//Verify whether User can share the page via Email
				@Test(priority = 11, enabled = true)
				public void testUserCanShareTheDocumentViaEmailOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickShareButtonInAIRNewsAnalysis();
					
					pom.getAIRNewsAnalysis(getDriver()).clickGmailInAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					
					windowhandling(getDriver());
					
					String title = getDriver().getTitle();
					extentTest.info(title);
					
					Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
					
				}
				//Verify whether User can share the page via Telegram
				@Test(priority = 12, enabled = true)
				public void testUserCanShareTheDocumentViaTelegramOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickShareButtonInAIRNewsAnalysis();
					
					pom.getAIRNewsAnalysis(getDriver()).clickTelegramInAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					
					windowhandling(getDriver());
					
					String title = getDriver().getTitle();
					extentTest.info(title);
					
					Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
					
				}
				//Verify play button is clickable
				@Test(priority = 13, enabled = true)
				public void testPlayButtonOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickPlayBtnAIRNewsAnalysis();
					
//					Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
					
				}
				//Verify Filter Functionality 
				@Test(priority = 14, enabled = true)
				public void testYearFilterOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).selectYearFilterOnAIRNewsAnalysis();
					
					pom.getAIRNewsAnalysis(getDriver()).clickApplyButtonInFilterPopup();
					Thread.sleep(4000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).selectedYearOnAIRNewsAnalysis(),"Select year mismatch  ");		;		
					
				}
				//Verify Filter  Functionality on Monthly document
				@Test(priority = 15, enabled = true)
				public void testCategoryAndMediumFiltersOfAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getResources(getDriver()).clickResources();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(6000);
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(6000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickFilterButton();
					
					pom.getAIRNewsAnalysis(getDriver()).selectCategoryOnAIRNewsAnalysisFilter();
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).selectImportanceLevelOnAIRNewsAnalysisFilter();
					synchronized (driver) {driver.wait(5000);}
					
					pom.getAIRNewsAnalysis(getDriver()).clickApplyButtonInFilterPopup();
					Thread.sleep(4000);
					
//					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).selectedYearOnAIRNewsAnalysis(),"Select year mismatch  ");		;		
					
				}
				//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 16, enabled = true)
				public void testDownloadCountOfDocumentAfterUserLoginInAIRnewsAnalysis() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					Thread.sleep(5000);

					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info(" Login button is Clicked");

					pom.getHomePage(getDriver()).enterUsername("jeyasankar@visionias.in");

					pom.getHomePage(getDriver()).enterPassword("123456@Jk");

					pom.getHomePage(getDriver()).clickSubmit();
					synchronized (driver) {driver.wait(5000);}

					pom.getResources(getDriver()).clickResources();

					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysis();
					Thread.sleep(2000);
					synchronized (driver) {driver.wait(5000);}
					pom.getAIRNewsAnalysis(getDriver()).clickAIRNewsAnalysisBackButton();
					Thread.sleep(2000);
					
					pom.getAIRNewsAnalysis(getDriver()).clickMonthAIRNewsAnalysis();
					Thread.sleep(2000);
					
					Assert.assertTrue(pom.getAIRNewsAnalysis(getDriver()).displayDownloadCountOfTheDocumentAfterRefreshInAIRNewsAnalysis(),"User cannot Like the Document more than once in AIR News Analysis documents ");
					
				}
	
}