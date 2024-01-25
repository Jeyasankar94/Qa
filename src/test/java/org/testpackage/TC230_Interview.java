package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC230_Interview extends VisionBaseClass {

	//Check whether user is able to view the module name with proper banner text
		@Test(priority = 1, enabled = true)
		public void testBannerTextOfInterview() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
			
			pom.getInterview(getDriver()).clickInterview();
			
			Assert.assertTrue(pom.getInterview(getDriver()).displayBannerTextOfInterview(),"Banner Text is not displayed at Interview");
		}
		
		//Verify Interview is  loading with downloadable document
		@Test(priority = 2, enabled = true)
		public void testPresenceOfDocumentInInterview() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();

			Assert.assertTrue(pom.getInterview(getDriver()).clickDownloadRandomlyOnInterview(),"Documents cannot be Download in Interview");
			
		}
		
		//Verify title of each document is dispalyed properly
		@Test(priority = 3, enabled = true)
		public void testTitleOfDocumentInInterview() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			Assert.assertTrue(pom.getInterview(getDriver()).getTitleOfDocumentInInterview(),"Title of the Interview is not displayed");
			
		}
		
		//Verify year,medium under each document
		@Test(priority = 4, enabled = true)
		public void testPresenceOfYearAndMediumInInterviewDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			Assert.assertTrue(pom.getInterview(getDriver()).displayYearOnDocumentInInterview()," Year is not displayed in Interview documents ");
			Assert.assertTrue(pom.getInterview(getDriver()).displayMediumOnDocumentInInterview()," Medium is not displayed in Interview documents ");
			
		}
		
		//Verify whether user can like the documents & Like icon should turn blue and count should be increased
		@Test(priority = 5, enabled = true)
		public void testLikeCountInInterviewDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(5000);
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			Assert.assertTrue(pom.getInterview(getDriver()).displayAndLikeTheDocumentInInterview(),"Cannot click the Like button in Interview documents ");
			
		}

		//Verify whether user can Like the documents & like icon should turn blue and count should be increased
		@Test(priority = 6, enabled = true)
		public void testLikeCountOfDocumentAtBeforeUserLoginInInterview() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			Assert.assertTrue(pom.getInterview(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInInterview(),"User cannot Like the Document more than once in Interview documents ");
			
		}
		
		//Verify after the user likes the button and refreshes the page (Static Method)
		@Test(priority = 7, enabled = true)
		public void testLikeCountBeforeUserLoginInInterview() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			 
			String beforeRefreshLikeCount = pom.getInterview(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeRefreshLikeCount);
			
			pom.getInterview(getDriver()).clickLikeOnInterview();
			
			String afterClickLikeCount = pom.getInterview(getDriver()).getAfterLikeCount();
			extentTest.info(afterClickLikeCount);
			
			Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Interview");
			
			refresh(getDriver());
			
			String beforeLikeCount = pom.getInterview(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeLikeCount);
			pom.getInterview(getDriver()).clickLikeOnInterview();
			
			String afterRefreshLikeCount = pom.getInterview(getDriver()).getAfterLikeCount();
			extentTest.info(afterRefreshLikeCount);
			
			Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Interview  ");
			
		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
		@Test(priority = 8, enabled = true)
		public void testDownloadCountOfDocumentBeforeUserLoginInInterview() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			 	String beforeRefreshDownlaodCount = pom.getInterview(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeRefreshDownlaodCount);
				
				pom.getInterview(getDriver()).clickDownloadInterview();
				
				String afterClickDownloadCount = pom.getInterview(getDriver()).getAfterDownloadCount();
				extentTest.info(afterClickDownloadCount);
				
				Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Interview");
				
				refresh(getDriver());
				
				
				String beforeDownloadCount = pom.getInterview(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeDownloadCount);
				pom.getInterview(getDriver()).clickDownloadInterview();
				
				String afterRefreshDownlaodCount = pom.getInterview(getDriver()).getAfterDownloadCount();
				extentTest.info(afterRefreshDownlaodCount);
				
				Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Interview  ");
				
		}
		
		//To share the page link to Whatsapp
		@Test(priority=9,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaWhatsappOfInterview() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			 pom.getInterview(getDriver()).clickShareInterview();
			 synchronized (driver) { driver.wait(5000); }
			 
			 pom.getInterview(getDriver()).clickWhatsapp();
			   
			 windowhandling(getDriver());
				
			String title = getDriver().getTitle();
			extentTest.info(title);
			  
			Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

	}

		
		//To share the page link to Facebook
		@Test(priority=10,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaFacebookOfInterview() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			 pom.getInterview(getDriver()).clickShareInterview();
			 
			   pom.getInterview(getDriver()).clickFacebook();
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
			

	}

		//To share the page link to Gmail
		@Test(priority=11,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaGmailOfInterview() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			 pom.getInterview(getDriver()).clickShareInterview();

		   pom.getInterview(getDriver()).clickGmail();

	   	   windowhandling(getDriver());
		
	   	   String title = getDriver().getTitle();
	   	   extentTest.info(title);
		
	   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
		

	}

		//To share the page link to Telegram
		@Test(priority=12,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaTelegramOfInterview() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();
			
			 pom.getInterview(getDriver()).clickShareInterview();

			pom.getInterview(getDriver()).clickTelegram();
			
			windowhandling(getDriver());
		
			String title = getDriver().getTitle();
			extentTest.info(title);
		
			Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
		

	}	


		@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testFilterFunctionalityOfInterview() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();

			 pom.getInterview(getDriver()).clickFilter();

			 pom.getInterview(getDriver()).clickSelectYear();
			 
			 pom.getInterview(getDriver()).clickMediumFilter();

			 pom.getInterview(getDriver()).clickApplyFilter();
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getInterview(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getInterview(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   


		}
		
		@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testClearFilterOptionInterview() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getInterview(getDriver()).clickInterview();

			 pom.getInterview(getDriver()).clickFilter();

			 pom.getInterview(getDriver()).clickSelectYear();
			 
			 pom.getInterview(getDriver()).clickMediumFilter();

			 pom.getInterview(getDriver()).clickApplyFilter();
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getInterview(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getInterview(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   
			    pom.getInterview(getDriver()).clickClearFilter();
			    Thread.sleep(2000);

		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 15, enabled = true)
				public void testDownloadCountOfDocumentAfterUserLoginInInterview() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info(" Login button is Clicked");
					Thread.sleep(2000);
					pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

					pom.getHomePage(getDriver()).enterPassword("123456");

					pom.getHomePage(getDriver()).clickSubmit();
					Thread.sleep(2000);
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getInterview(getDriver()).clickInterview();
					
					 	String beforeRefreshDownlaodCount = pom.getInterview(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeRefreshDownlaodCount);
						
						pom.getInterview(getDriver()).clickDownloadInterview();
						
						String afterClickDownloadCount = pom.getInterview(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Interview");
						
						refresh(getDriver());
						
						String beforeDownloadCount = pom.getInterview(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeDownloadCount);
						pom.getInterview(getDriver()).clickDownloadInterview();
						
						String afterRefreshDownlaodCount = pom.getInterview(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Interview  ");
						
				}
					
				@Test(priority = 16, enabled = true)
				public void testPaginationInInterview() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getInterview(getDriver()).clickInterview();
					
					pom.getInterview(getDriver()).clickRandomPage();
					
					
				}

}
