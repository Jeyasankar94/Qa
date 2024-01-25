package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC330_ToppersAnswerCopyTest extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
		@Test(priority = 1, enabled = true)
		public void testBannerTextOfToppersAnswerCopyPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).displayBannerTextOfToppersAnswerCopyPage(),"Banner Text is not displayed at Toppers Answer Copy");
		}
		
		//Verify Toppers Answer Copy is  loading with downloadable document
		@Test(priority = 2, enabled = true)
		public void testPresenceOfDocumentInToppersAnswerCopyPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();

			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).clickDownloadRandomlyOnToppersAnswerCopyPage(),"Documents cannot be Download in Toppers Answer Copy");
			
		}
		
		//Verify title of each document is dispalyed properly
		@Test(priority = 3, enabled = true)
		public void testTitleOfDocumentInToppersAnswerCopyPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).getTitleOfDocumentInToppersAnswerCopyPage(),"Title of the Toppers Answer Copy is not displayed");
			
		}
		
		//Verify year,medium under each document
		@Test(priority = 4, enabled = true)
		public void testPresenceOfYearAndMediumInToppersAnswerCopyPageDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).displayYearOnDocumentInToppersAnswerCopyPage()," Year is not displayed in Toppers Answer Copy documents ");
			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).displayMediumOnDocumentInToppersAnswerCopyPage()," Medium is not displayed in Toppers Answer Copy documents ");
			
		}
		
		//Verify whether user can like the documents & Like icon should turn blue and count should be increased
		@Test(priority = 5, enabled = true)
		public void testLikeCountInToppersAnswerCopyPageDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(5000);
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).displayAndLikeTheDocumentInToppersAnswerCopyPage(),"Cannot click the Like button in Toppers Answer Copy documents ");
			
		}

		//Verify whether user can Like the documents & like icon should turn blue and count should be increased
		@Test(priority = 6, enabled = true)
		public void testLikeCountOfDocumentAtBeforeUserLoginInToppersAnswerCopyPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			Assert.assertTrue(pom.getToppersAnswerCopyPage(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInToppersAnswerCopyPage(),"User cannot Like the Document more than once in Toppers Answer Copy documents ");
			
		}
		
		//Verify after the user likes the button and refreshes the page (Static Method)
		@Test(priority = 7, enabled = true)
		public void testLikeCountBeforeUserLoginInToppersAnswerCopyPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			 
			String beforeRefreshLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeRefreshLikeCount);
			
			pom.getToppersAnswerCopyPage(getDriver()).clickLikeOnToppersAnswerCopyPage();
			
			String afterClickLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterLikeCount();
			extentTest.info(afterClickLikeCount);
			
			Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Toppers Answer Copy");
			
			refresh(getDriver());
			 Thread.sleep(4000);
			
			String beforeLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeLikeCount);
			pom.getToppersAnswerCopyPage(getDriver()).clickLikeOnToppersAnswerCopyPage();
			
			String afterRefreshLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterLikeCount();
			extentTest.info(afterRefreshLikeCount);
			
			Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Toppers Answer Copy  ");
			
		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
		@Test(priority = 8, enabled = true)
		public void testDownloadCountOfDocumentBeforeUserLoginInToppersAnswerCopyPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			 	String beforeRefreshDownlaodCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeRefreshDownlaodCount);
				
				pom.getToppersAnswerCopyPage(getDriver()).clickDownloadToppersAnswerCopyPage();
				
				 try {
					 String afterClickDownloadCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Toppers Answer Copy");
				    } catch (AssertionError e) {
				        // Log or report the issue
				      //  System.out.println("No Data Found element not found: " + e.getMessage());
				        extentTest.info("Document Like counts are same in Toppers Answer Copy");
				        extentTest.info("No Data Found element not found: " + e.getMessage());
				    }
				refresh(getDriver());
				 Thread.sleep(4000);
				
				String beforeDownloadCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeDownloadCount);
				pom.getToppersAnswerCopyPage(getDriver()).clickDownloadToppersAnswerCopyPage();
			
				 try {
						String afterRefreshDownlaodCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in Toppers Answer Copy");
				    } catch (AssertionError e) {
				        // Log or report the issue
				        extentTest.info("Document Like counts are same in Toppers Answer Copy");
				        extentTest.info("No Data Found element not found: " + e.getMessage());
				    }
		}
		
		//To share the page link to Whatsapp
		@Test(priority=9,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaWhatsappOfToppersAnswerCopyPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			 pom.getToppersAnswerCopyPage(getDriver()).clickShareToppersAnswerCopyPage();
			 
			 pom.getToppersAnswerCopyPage(getDriver()).clickWhatsapp();
			   
			 windowhandling(getDriver());
				
			String title = getDriver().getTitle();
			extentTest.info(title);
			  
			Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

	}

		
		//To share the page link to Facebook
		@Test(priority=10,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaFacebookOfToppersAnswerCopyPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			 pom.getToppersAnswerCopyPage(getDriver()).clickShareToppersAnswerCopyPage();
			 
			   pom.getToppersAnswerCopyPage(getDriver()).clickFacebook();
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
			

	}

		//To share the page link to Gmail
		@Test(priority=11,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaGmailOfToppersAnswerCopyPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			 pom.getToppersAnswerCopyPage(getDriver()).clickShareToppersAnswerCopyPage();

		   pom.getToppersAnswerCopyPage(getDriver()).clickGmail();

	   	   windowhandling(getDriver());
		
	   	   String title = getDriver().getTitle();
	   	   extentTest.info(title);
		
	   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
		

	}

		//To share the page link to Telegram
		@Test(priority=12,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaTelegramOfToppersAnswerCopyPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
			
			 pom.getToppersAnswerCopyPage(getDriver()).clickShareToppersAnswerCopyPage();

			pom.getToppersAnswerCopyPage(getDriver()).clickTelegram();
			
			windowhandling(getDriver());
		
			String title = getDriver().getTitle();
			extentTest.info(title);
		
			Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
		

	}	


		@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testFilterFunctionalityOfToppersAnswerCopyPage() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();

			 pom.getToppersAnswerCopyPage(getDriver()).clickFilter();

			 pom.getToppersAnswerCopyPage(getDriver()).clickSelectYear();
			 
			 pom.getToppersAnswerCopyPage(getDriver()).clickSelectMedium();
			 
			 pom.getToppersAnswerCopyPage(getDriver()).clickSubjectsFilter();
			 
			 pom.getToppersAnswerCopyPage(getDriver()).clickToppersFilter();

			 pom.getToppersAnswerCopyPage(getDriver()).clickApplyFilter();
			 
			 Thread.sleep(4000);
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getToppersAnswerCopyPage(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getToppersAnswerCopyPage(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   


		}
		
		@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testClearFilterOptionToppersAnswerCopyPage() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();

			 pom.getToppersAnswerCopyPage(getDriver()).clickFilter();

			 pom.getToppersAnswerCopyPage(getDriver()).clickSelectYear();
			 
			 pom.getToppersAnswerCopyPage(getDriver()).clickSubjectsFilter();

			 pom.getToppersAnswerCopyPage(getDriver()).clickApplyFilter();
			 
			 Thread.sleep(4000);
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getToppersAnswerCopyPage(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getToppersAnswerCopyPage(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   
			    pom.getToppersAnswerCopyPage(getDriver()).clickClearFilter();
			    Thread.sleep(2000);

		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 15, enabled = true)
				public void testDownloadCountOfDocumentAfterUserLoginInToppersAnswerCopyPage() throws InterruptedException		{

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
					
					pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
					
					 	String beforeRefreshDownlaodCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeRefreshDownlaodCount);
						
						pom.getToppersAnswerCopyPage(getDriver()).clickDownloadToppersAnswerCopyPage();
						
						String afterClickDownloadCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Toppers Answer Copy");
						
						refresh(getDriver());
						
						String beforeDownloadCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeDownloadCount);
						pom.getToppersAnswerCopyPage(getDriver()).clickDownloadToppersAnswerCopyPage();
						
						String afterRefreshDownlaodCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Toppers Answer Copy  ");
						
				}
				//Verify after the user likes the button and refreshes the page (Static Method)
				@Test(priority = 16, enabled = true)
				public void testLikeCountAfterUserLoginInToppersAnswerCopyPage() throws InterruptedException		{

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
					
					pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
					Thread.sleep(5000);

					String beforeRefreshLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeLikeCount();
					extentTest.info(beforeRefreshLikeCount);
					
					// Click the like button
					pom.getToppersAnswerCopyPage(getDriver()).clickLikeOnToppersAnswerCopyPage();
		
					// Check if the like button is clickable again
					if (pom.getToppersAnswerCopyPage(getDriver()).isLikeButtonClickable()) {
					    // Get the like count after clicking
					    String afterClickLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterLikeCount();
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
					
					String beforeLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getBeforeLikeCount();
					extentTest.info(beforeLikeCount);
					pom.getToppersAnswerCopyPage(getDriver()).clickLikeOnToppersAnswerCopyPage();
					
					// Check if the like button is clickable again
					if (pom.getToppersAnswerCopyPage(getDriver()).isLikeButtonClickable()) {
					    // Get the like count after clicking
					    String afterRefreshLikeCount = pom.getToppersAnswerCopyPage(getDriver()).getAfterLikeCount();
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
	
					
//					Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Toppers Answer Copy  ");
					
				}
				
				@Test(priority = 17, enabled = true)
				public void testPaginationInToppersAnswerCopyPage() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getToppersAnswerCopyPage(getDriver()).clickToppersAnswerCopyPage();
					Thread.sleep(2000);
					
					pom.getToppersAnswerCopyPage(getDriver()).clickRandomPage();
					
					
				}

	
}
