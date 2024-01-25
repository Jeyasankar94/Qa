package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC190_EconomicSurvey extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
		@Test(priority = 1, enabled = true)
		public void testBannerTextOfEconomicSurvey() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			Thread.sleep(2000);
			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).displayBannerTextOfEconomicSurvey(),"Banner Text is not displayed at Economic Survey");
		}
		
		//Verify Economic Survey is  loading with downloadable document
		@Test(priority = 2, enabled = true)
		public void testPresenceOfDocumentInEconomicSurvey() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();

			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).clickDownloadRandomlyOnEconomicSurvey(),"Documents cannot be Download in Economic Survey");
			
		}
		
		//Verify title of each document is dispalyed properly
		@Test(priority = 3, enabled = true)
		public void testTitleOfDocumentInEconomicSurvey() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).getTitleOfDocumentInEconomicSurvey(),"Title of the Economic Survey is not displayed");
			
		}
		
		//Verify year,medium under each document
		@Test(priority = 4, enabled = true)
		public void testPresenceOfYearAndMediumInEconomicSurveyDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).displayYearOnDocumentInEconomicSurvey()," Year is not displayed in Economic Survey documents ");
			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).displayMediumOnDocumentInEconomicSurvey()," Medium is not displayed in Economic Survey documents ");
			
		}
		
		//Verify whether user can like the documents & Like icon should turn blue and count should be increased
		@Test(priority = 5, enabled = true)
		public void testLikeCountInEconomicSurveyDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).displayAndLikeTheDocumentInEconomicSurvey(),"Cannot click the Like button in Economic Survey documents ");
			
		}
	
		//Verify whether user can Like the documents & like icon should turn blue and count should be increased
		@Test(priority = 6, enabled = true)
		public void testLikeCountOfDocumentAtBeforeUserLoginInEconomicSurvey() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			Assert.assertTrue(pom.getEconomicSurvey(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInEconomicSurvey(),"User cannot Like the Document more than once in Economic Survey documents ");
			
		}
		
		//Verify after the user likes the button and refreshes the page (Static Method)
		@Test(priority = 7, enabled = true)
		public void testLikeCountBeforeUserLoginInEconomicSurvey() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			 
			String beforeRefreshLikeCount = pom.getEconomicSurvey(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeRefreshLikeCount);
			
			pom.getEconomicSurvey(getDriver()).clickLikeEconomicSurvey();
			
			String afterClickLikeCount = pom.getEconomicSurvey(getDriver()).getAfterLikeCount();
			extentTest.info(afterClickLikeCount);
			
			Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Economic Survey");
			
			refresh(getDriver());
			
			
			String beforeLikeCount = pom.getEconomicSurvey(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeLikeCount);
			pom.getEconomicSurvey(getDriver()).clickLikeEconomicSurvey();
			
			String afterRefreshLikeCount = pom.getEconomicSurvey(getDriver()).getAfterLikeCount();
			extentTest.info(afterRefreshLikeCount);
			
			Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Economic Survey  ");
			
		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
		@Test(priority = 8, enabled = true)
		public void testDownloadCountOfDocumentBeforeUserLoginInEconomicSurvey() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			 	String beforeRefreshDownlaodCount = pom.getEconomicSurvey(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeRefreshDownlaodCount);
				
				pom.getEconomicSurvey(getDriver()).clickDownloadEconomicSurvey();
				
				String afterClickDownloadCount = pom.getEconomicSurvey(getDriver()).getAfterDownloadCount();
				extentTest.info(afterClickDownloadCount);
				Thread.sleep(4000);
				
				Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Economic Survey");
				
				refresh(getDriver());
				
				Thread.sleep(4000);
				synchronized (driver) {driver.wait(5000);}
				
				String beforeDownloadCount = pom.getEconomicSurvey(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeDownloadCount);
				pom.getEconomicSurvey(getDriver()).clickDownloadEconomicSurvey();
				
				String afterRefreshDownlaodCount = pom.getEconomicSurvey(getDriver()).getAfterDownloadCount();
				extentTest.info(afterRefreshDownlaodCount);
				Thread.sleep(2000);
				
				Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Economic Survey  ");
				
		}
		
		//To share the page link to Whatsapp
		@Test(priority=9,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaWhatsappOfEconomicSurvey() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			 pom.getEconomicSurvey(getDriver()).clickShareEconomicSurvey();
			 
			 pom.getEconomicSurvey(getDriver()).clickWhatsapp();
			   
			 windowhandling(getDriver());
				
			String title = getDriver().getTitle();
			extentTest.info(title);
			  
			Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

	}
	
		
		//To share the page link to Facebook
		@Test(priority=10,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaFacebookOfEconomicSurvey() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			 pom.getEconomicSurvey(getDriver()).clickShareEconomicSurvey();
			 
			   pom.getEconomicSurvey(getDriver()).clickFacebook();
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
			

	}

		//To share the page link to Gmail
		@Test(priority=11,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaGmailOfEconomicSurvey() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			 pom.getEconomicSurvey(getDriver()).clickShareEconomicSurvey();

		   pom.getEconomicSurvey(getDriver()).clickGmail();

	   	   windowhandling(getDriver());
		
	   	   String title = getDriver().getTitle();
	   	   extentTest.info(title);
		
	   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
		

	}

		//To share the page link to Telegram
		@Test(priority=12,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaTelegramOfEconomicSurvey() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
			
			 pom.getEconomicSurvey(getDriver()).clickShareEconomicSurvey();

			pom.getEconomicSurvey(getDriver()).clickTelegram();

			windowhandling(getDriver());
		
			String title = getDriver().getTitle();
			extentTest.info(title);
		
			Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
		

	}	

	
		@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testFilterFunctionalityOfEconomicSurvey() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();

			 pom.getEconomicSurvey(getDriver()).clickFilter();

			 pom.getEconomicSurvey(getDriver()).clickSelectYear();
			 
			 pom.getEconomicSurvey(getDriver()).clickMediumFilter();

			 pom.getEconomicSurvey(getDriver()).clickApplyFilter();
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getEconomicSurvey(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	// Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getEconomicSurvey(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   

		}
		
		@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testClearFilterOptionEconomicSurvey() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();

			 pom.getEconomicSurvey(getDriver()).clickFilter();

			 pom.getEconomicSurvey(getDriver()).clickSelectYear();
			 
			 pom.getEconomicSurvey(getDriver()).clickMediumFilter();

			 pom.getEconomicSurvey(getDriver()).clickApplyFilter();
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getEconomicSurvey(getDriver()).isDataDisplayed();
			    
			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getEconomicSurvey(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   
			    pom.getEconomicSurvey(getDriver()).clickClearFilter();

		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 15, enabled = true)
				public void testDownloadCountOfDocumentAfterUserLoginInEconomicSurvey() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info(" Login button is Clicked");
					
					pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

					pom.getHomePage(getDriver()).enterPassword("123456");

					pom.getHomePage(getDriver()).clickSubmit();
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
					
					 	String beforeRefreshDownlaodCount = pom.getEconomicSurvey(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeRefreshDownlaodCount);
						
						pom.getEconomicSurvey(getDriver()).clickDownloadEconomicSurvey();
						
						String afterClickDownloadCount = pom.getEconomicSurvey(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Economic Survey");
						
						refresh(getDriver());
						
						String beforeDownloadCount = pom.getEconomicSurvey(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeDownloadCount);
						pom.getEconomicSurvey(getDriver()).clickDownloadEconomicSurvey();
						
						String afterRefreshDownlaodCount = pom.getEconomicSurvey(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Economic Survey  ");
						
				}
					
				@Test(priority = 16, enabled = true)
				public void testPaginationInEconomicSurvey() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getEconomicSurvey(getDriver()).clickEconomicSurvey();
					
					pom.getEconomicSurvey(getDriver()).clickRandomPage();
					
					
				}
}
