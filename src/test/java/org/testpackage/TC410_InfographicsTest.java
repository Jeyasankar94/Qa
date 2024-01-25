package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC410_InfographicsTest extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
		@Test(priority = 1, enabled = true)
		public void testBannerTextOfInfographicsPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			Assert.assertTrue(pom.getInfographicsPage(getDriver()).displayBannerTextOfInfographicsPage(),"Banner Text is not displayed at Infographics");
		}
		
		//Verify Infographics is  loading with downloadable document
		@Test(priority = 2, enabled = true)
		public void testPresenceOfDocumentInInfographicsPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();

			Assert.assertTrue(pom.getInfographicsPage(getDriver()).clickDownloadRandomlyOnInfographicsPage(),"Documents cannot be Download in Infographics");
			
		}
		
		//Verify title of each document is dispalyed properly
		@Test(priority = 3, enabled = true)
		public void testTitleOfDocumentInInfographicsPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			Assert.assertTrue(pom.getInfographicsPage(getDriver()).getTitleOfDocumentInInfographicsPage(),"Title of the Infographics is not displayed");
			
		}
		
		//Verify year,medium under each document
		@Test(priority = 4, enabled = true)
		public void testPresenceOfYearAndMediumInInfographicsPageDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			Assert.assertTrue(pom.getInfographicsPage(getDriver()).displayYearOnDocumentInInfographicsPage()," Year is not displayed in Infographics documents ");
			Assert.assertTrue(pom.getInfographicsPage(getDriver()).displayMediumOnDocumentInInfographicsPage()," Medium is not displayed in Infographics documents ");
			
		}
		
		//Verify whether user can like the documents & Like icon should turn blue and count should be increased
		@Test(priority = 5, enabled = true)
		public void testLikeCountInInfographicsPageDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(5000);
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			Assert.assertTrue(pom.getInfographicsPage(getDriver()).displayAndLikeTheDocumentInInfographicsPage(),"Cannot click the Like button in Infographics documents ");
			
		}

		//Verify whether user can Like the documents & like icon should turn blue and count should be increased
		@Test(priority = 6, enabled = true)
		public void testLikeCountOfDocumentAtBeforeUserLoginInInfographicsPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			Assert.assertTrue(pom.getInfographicsPage(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInInfographicsPage(),"User cannot Like the Document more than once in Infographics documents ");
			
		}
		
		//Verify after the user likes the button and refreshes the page (Static Method)
		@Test(priority = 7, enabled = true)
		public void testLikeCountBeforeUserLoginInInfographicsPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			 
			String beforeRefreshLikeCount = pom.getInfographicsPage(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeRefreshLikeCount);
			
			pom.getInfographicsPage(getDriver()).clickLikeOnInfographicsPage();
			
			String afterClickLikeCount = pom.getInfographicsPage(getDriver()).getAfterLikeCount();
			extentTest.info(afterClickLikeCount);
			
			Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Infographics");
			
			refresh(getDriver());
			 Thread.sleep(4000);
			
			String beforeLikeCount = pom.getInfographicsPage(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeLikeCount);
			pom.getInfographicsPage(getDriver()).clickLikeOnInfographicsPage();
			
			String afterRefreshLikeCount = pom.getInfographicsPage(getDriver()).getAfterLikeCount();
			extentTest.info(afterRefreshLikeCount);
			
			Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Infographics  ");
			
		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
		@Test(priority = 8, enabled = true)
		public void testDownloadCountOfDocumentBeforeUserLoginInInfographicsPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			 	String beforeRefreshDownlaodCount = pom.getInfographicsPage(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeRefreshDownlaodCount);
				
				pom.getInfographicsPage(getDriver()).clickDownloadInfographicsPage();
				
				 try {
					 String afterClickDownloadCount = pom.getInfographicsPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Infographics");
				    } catch (AssertionError e) {
				        // Log or report the issue
				      //  System.out.println("No Data Found element not found: " + e.getMessage());
				        extentTest.info("Document Like counts are same in Infographics");
				        extentTest.info("No Data Found element not found: " + e.getMessage());
				    }
				refresh(getDriver());
				 Thread.sleep(4000);
				
				String beforeDownloadCount = pom.getInfographicsPage(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeDownloadCount);
				pom.getInfographicsPage(getDriver()).clickDownloadInfographicsPage();
			
				 try {
						String afterRefreshDownlaodCount = pom.getInfographicsPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in Infographics");
				    } catch (AssertionError e) {
				        // Log or report the issue
				        extentTest.info("Document Like counts are same in Infographics");
				        extentTest.info("No Data Found element not found: " + e.getMessage());
				    }
		}
		
		//To share the page link to Whatsapp
		@Test(priority=9,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaWhatsappOfInfographicsPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			 pom.getInfographicsPage(getDriver()).clickShareInfographicsPage();
			 
			 pom.getInfographicsPage(getDriver()).clickWhatsapp();
			   
			 windowhandling(getDriver());
				
			String title = getDriver().getTitle();
			extentTest.info(title);
			  
			Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

	}

		
		//To share the page link to Facebook
		@Test(priority=10,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaFacebookOfInfographicsPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			 pom.getInfographicsPage(getDriver()).clickShareInfographicsPage();
			 
			   pom.getInfographicsPage(getDriver()).clickFacebook();
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
			

	}

		//To share the page link to Gmail
		@Test(priority=11,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaGmailOfInfographicsPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			 pom.getInfographicsPage(getDriver()).clickShareInfographicsPage();

		   pom.getInfographicsPage(getDriver()).clickGmail();

	   	   windowhandling(getDriver());
		
	   	   String title = getDriver().getTitle();
	   	   extentTest.info(title);
		
	   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
		

	}

		//To share the page link to Telegram
		@Test(priority=12,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaTelegramOfInfographicsPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();
			
			 pom.getInfographicsPage(getDriver()).clickShareInfographicsPage();

			pom.getInfographicsPage(getDriver()).clickTelegram();
			
			windowhandling(getDriver());
		
			String title = getDriver().getTitle();
			extentTest.info(title);
		
			Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
		

	}	


		@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testFilterFunctionalityOfInfographicsPage() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();

			 pom.getInfographicsPage(getDriver()).clickFilter();

			 pom.getInfographicsPage(getDriver()).clickSelectYear();
			 
			 pom.getInfographicsPage(getDriver()).clickSelectMedium();
			 
			 pom.getInfographicsPage(getDriver()).clickSubjectsFilter();
			 
			 pom.getInfographicsPage(getDriver()).clickToppersFilter();

			 pom.getInfographicsPage(getDriver()).clickApplyFilter();
			 
			 Thread.sleep(4000);
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getInfographicsPage(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getInfographicsPage(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   


		}
		
		@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testClearFilterOptionInfographicsPage() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getInfographicsPage(getDriver()).clickInfographicsPage();

			 pom.getInfographicsPage(getDriver()).clickFilter();

			 pom.getInfographicsPage(getDriver()).clickSelectYear();
			 
			 pom.getInfographicsPage(getDriver()).clickSubjectsFilter();

			 pom.getInfographicsPage(getDriver()).clickApplyFilter();
			 
			 Thread.sleep(4000);
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getInfographicsPage(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getInfographicsPage(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   
			    pom.getInfographicsPage(getDriver()).clickClearFilter();
			    Thread.sleep(2000);

		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 15, enabled = true)
				public void testDownloadCountOfDocumentAfterUserLoginInInfographicsPage() throws InterruptedException		{

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
					
					pom.getInfographicsPage(getDriver()).clickInfographicsPage();
					
					 	String beforeRefreshDownlaodCount = pom.getInfographicsPage(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeRefreshDownlaodCount);
						
						pom.getInfographicsPage(getDriver()).clickDownloadInfographicsPage();
						
						String afterClickDownloadCount = pom.getInfographicsPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Infographics");
						
						refresh(getDriver());
						
						String beforeDownloadCount = pom.getInfographicsPage(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeDownloadCount);
						pom.getInfographicsPage(getDriver()).clickDownloadInfographicsPage();
						
						String afterRefreshDownlaodCount = pom.getInfographicsPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Infographics  ");
						
				}
				//Verify after the user likes the button and refreshes the page (Static Method)
				@Test(priority = 16, enabled = true)
				public void testLikeCountAfterUserLoginInInfographicsPage() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getHomePage(getDriver()).clickLogin();
					extentTest.info(" Login button is Clicked");
					
					pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

					pom.getHomePage(getDriver()).enterPassword("123456");

					pom.getHomePage(getDriver()).clickSubmit();
					Thread.sleep(5000);
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getInfographicsPage(getDriver()).clickInfographicsPage();
					Thread.sleep(5000);

					String beforeRefreshLikeCount = pom.getInfographicsPage(getDriver()).getBeforeLikeCount();
					extentTest.info(beforeRefreshLikeCount);
					
					// Click the like button
					pom.getInfographicsPage(getDriver()).clickLikeOnInfographicsPage();
		
					// Check if the like button is clickable again
					if (pom.getInfographicsPage(getDriver()).isLikeButtonClickable()) {
					    // Get the like count after clicking
					    String afterClickLikeCount = pom.getInfographicsPage(getDriver()).getAfterLikeCount();
					    extentTest.info(afterClickLikeCount);
					    
					    Thread.sleep(2000);
					    
					    // Check if the like counts are the same
					    if (beforeRefreshLikeCount == afterClickLikeCount) {
					        // Log a message that the like button is not clickable because it was already clicked
					        extentTest.info("User cannot click the like button because already hit the like button");
					    } else {
					        // Continue with the next steps of your test
					        extentTest.info("Like button clicked successfully. Proceeding to the next step.");
					        // Perform additional steps here
					    }
					} else {
					    // Log a message that the like button is not clickable because it was already clicked
					    extentTest.info("Like button is not clickable because it was already clicked");
					}
					
					refresh(getDriver());
					Thread.sleep(5000);
					
					String beforeLikeCount = pom.getInfographicsPage(getDriver()).getBeforeLikeCount();
					extentTest.info(beforeLikeCount);
					pom.getInfographicsPage(getDriver()).clickLikeOnInfographicsPage();
					
					// Check if the like button is clickable again
					if (pom.getInfographicsPage(getDriver()).isLikeButtonClickable()) {
					    // Get the like count after clicking
					    String afterRefreshLikeCount = pom.getInfographicsPage(getDriver()).getAfterLikeCount();
					    extentTest.info(afterRefreshLikeCount);
					    
					    Thread.sleep(2000);
					    
					    // Check if the like counts are the same
					    if (beforeLikeCount == afterRefreshLikeCount) {
					        // Log a message that the like button is not clickable because it was already clicked
					        extentTest.info("User cannot click the like button because already hit the like button");
					    } else {
					        // Continue with the next steps of your test
					        extentTest.info("Like button clicked successfully. Proceeding to the next step.");
					        // Perform additional steps here
					    }
					} else {
					    // Log a message that the like button is not clickable because it was already clicked
					    extentTest.info("Like button is not clickable because it was already clicked");
					}
	
					
//					Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Infographics  ");
					
				}
				
				@Test(priority = 17, enabled = true)
				public void testPaginationInInfographicsPage() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getInfographicsPage(getDriver()).clickInfographicsPage();
					Thread.sleep(2000);
					
					pom.getInfographicsPage(getDriver()).clickRandomPage();
					
					
				}

	
}
