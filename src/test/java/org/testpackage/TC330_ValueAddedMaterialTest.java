package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC330_ValueAddedMaterialTest extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
		@Test(priority = 1, enabled = true)
		public void testBannerTextOfValueAddedMaterialPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).displayBannerTextOfValueAddedMaterialPage(),"Banner Text is not displayed at ValueAddedMaterial");
		}
		
		//Verify Value added Material is  loading with downloadable document
		@Test(priority = 2, enabled = true)
		public void testPresenceOfDocumentInValueAddedMaterialPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();

			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).clickDownloadRandomlyOnValueAddedMaterialPage(),"Documents cannot be Download in ValueAddedMaterial");
			
		}
		
		//Verify title of each document is dispalyed properly
		@Test(priority = 3, enabled = true)
		public void testTitleOfDocumentInValueAddedMaterialPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).getTitleOfDocumentInValueAddedMaterialPage(),"Title of the ValueAddedMaterial is not displayed");
			
		}
		
		//Verify year,medium under each document
		@Test(priority = 4, enabled = true)
		public void testPresenceOfYearAndMediumInValueAddedMaterialPageDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).displayYearOnDocumentInValueAddedMaterialPage()," Year is not displayed in ValueAddedMaterial documents ");
			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).displayMediumOnDocumentInValueAddedMaterialPage()," Medium is not displayed in ValueAddedMaterial documents ");
			
		}
		
		//Verify whether user can like the documents & Like icon should turn blue and count should be increased
		@Test(priority = 5, enabled = true)
		public void testLikeCountInValueAddedMaterialPageDocument() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			Thread.sleep(5000);
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).displayAndLikeTheDocumentInValueAddedMaterialPage(),"Cannot click the Like button in ValueAddedMaterial documents ");
			
		}

		//Verify whether user can Like the documents & like icon should turn blue and count should be increased
		@Test(priority = 6, enabled = true)
		public void testLikeCountOfDocumentAtBeforeUserLoginInValueAddedMaterialPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			Assert.assertTrue(pom.getValueAddedMaterialPage(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInValueAddedMaterialPage(),"User cannot Like the Document more than once in ValueAddedMaterial documents ");
			
		}
		
		//Verify after the user likes the button and refreshes the page (Static Method)
		@Test(priority = 7, enabled = true)
		public void testLikeCountBeforeUserLoginInValueAddedMaterialPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			 
			String beforeRefreshLikeCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeRefreshLikeCount);
			
			pom.getValueAddedMaterialPage(getDriver()).clickLikeOnValueAddedMaterialPage();
			
			String afterClickLikeCount = pom.getValueAddedMaterialPage(getDriver()).getAfterLikeCount();
			extentTest.info(afterClickLikeCount);
			
			Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in ValueAddedMaterial");
			
			refresh(getDriver());
			
			String beforeLikeCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeLikeCount();
			extentTest.info(beforeLikeCount);
			pom.getValueAddedMaterialPage(getDriver()).clickLikeOnValueAddedMaterialPage();
			
			String afterRefreshLikeCount = pom.getValueAddedMaterialPage(getDriver()).getAfterLikeCount();
			extentTest.info(afterRefreshLikeCount);
			
			Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  ValueAddedMaterial  ");
			
		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
		@Test(priority = 8, enabled = true)
		public void testDownloadCountOfDocumentBeforeUserLoginInValueAddedMaterialPage() throws InterruptedException		{

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			 	String beforeRefreshDownlaodCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeRefreshDownlaodCount);
				
				pom.getValueAddedMaterialPage(getDriver()).clickDownloadValueAddedMaterialPage();
				
				String afterClickDownloadCount = pom.getValueAddedMaterialPage(getDriver()).getAfterDownloadCount();
				extentTest.info(afterClickDownloadCount);
				
				Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in ValueAddedMaterial");
				
				refresh(getDriver());
				
				
				String beforeDownloadCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeDownloadCount();
				extentTest.info(beforeDownloadCount);
				pom.getValueAddedMaterialPage(getDriver()).clickDownloadValueAddedMaterialPage();
				
				String afterRefreshDownlaodCount = pom.getValueAddedMaterialPage(getDriver()).getAfterDownloadCount();
				extentTest.info(afterRefreshDownlaodCount);
				
				Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  ValueAddedMaterial  ");
				
		}
		
		//To share the page link to Whatsapp
		@Test(priority=9,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaWhatsappOfValueAddedMaterialPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			 pom.getValueAddedMaterialPage(getDriver()).clickShareValueAddedMaterialPage();
			 synchronized (driver) { driver.wait(5000); }
			 
			 pom.getValueAddedMaterialPage(getDriver()).clickWhatsapp();
			   
			 windowhandling(getDriver());
				
			String title = getDriver().getTitle();
			extentTest.info(title);
			  
			Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

	}

		
		//To share the page link to Facebook
		@Test(priority=10,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaFacebookOfValueAddedMaterialPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			 pom.getValueAddedMaterialPage(getDriver()).clickShareValueAddedMaterialPage();
			 
			   pom.getValueAddedMaterialPage(getDriver()).clickFacebook();
				
				windowhandling(getDriver());
				
				String title = getDriver().getTitle();
				extentTest.info(title);
				
				Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
			

	}

		//To share the page link to Gmail
		@Test(priority=11,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaGmailOfValueAddedMaterialPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			 pom.getValueAddedMaterialPage(getDriver()).clickShareValueAddedMaterialPage();

		   pom.getValueAddedMaterialPage(getDriver()).clickGmail();

	   	   windowhandling(getDriver());
		
	   	   String title = getDriver().getTitle();
	   	   extentTest.info(title);
		
	   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
		

	}

		//To share the page link to Telegram
		@Test(priority=12,  invocationCount = 1,   enabled=true)
		public void testUserCanShareThePageLinkViaTelegramOfValueAddedMaterialPage() throws InterruptedException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
			
			 pom.getValueAddedMaterialPage(getDriver()).clickShareValueAddedMaterialPage();

			pom.getValueAddedMaterialPage(getDriver()).clickTelegram();
			
			windowhandling(getDriver());
		
			String title = getDriver().getTitle();
			extentTest.info(title);
		
			Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
		

	}	


		@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testFilterFunctionalityOfValueAddedMaterialPage() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();

			 pom.getValueAddedMaterialPage(getDriver()).clickFilter();

			 pom.getValueAddedMaterialPage(getDriver()).clickSelectYear();
			 
			 pom.getValueAddedMaterialPage(getDriver()).clickSectionsFilter();

			 pom.getValueAddedMaterialPage(getDriver()).clickApplyFilter();
			 
			 Thread.sleep(4000);
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getValueAddedMaterialPage(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getValueAddedMaterialPage(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   


		}
		
		@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
		public void testClearFilterOptionValueAddedMaterialPage() throws InterruptedException, AWTException {

			getDriver().get(baseURL);
			extentTest.info("Succesfully Navigated to Vision Website");

			PageObjectManager pom = new PageObjectManager();
			
			pom.getResources(getDriver()).clickResources();

			pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
			
			pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();

			 pom.getValueAddedMaterialPage(getDriver()).clickFilter();

			 pom.getValueAddedMaterialPage(getDriver()).clickSelectYear();
			 
			 pom.getValueAddedMaterialPage(getDriver()).clickSectionsFilter();

			 pom.getValueAddedMaterialPage(getDriver()).clickApplyFilter();
			 
			 Thread.sleep(4000);
			 
			// Check if data is displayed
			    boolean isDataDisplayed = pom.getValueAddedMaterialPage(getDriver()).isDataDisplayed();

			    // If data is displayed, assert that data is displayed after applying the filter
			    if (isDataDisplayed) {
			        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
			    } else
			    	 // Check if "No Data Found" message is displayed
				    try {
				        boolean isNoDataFoundDisplayed = pom.getValueAddedMaterialPage(getDriver()).isNoDataFoundDisplayed();
				        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
				    } catch (NoSuchElementException e) {
				        // Log or report the issue
				        System.out.println("No Data Found element not found: " + e.getMessage());
				    }
			   
			    pom.getValueAddedMaterialPage(getDriver()).clickClearFilter();
			    Thread.sleep(2000);

		}
		
		//Verify whether user can download the documents & download icon should turn blue and count should be increased
				@Test(priority = 15, enabled = true)
				public void testDownloadCountOfDocumentAfterUserLoginInValueAddedMaterialPage() throws InterruptedException		{

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
					
					pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
					
					 	String beforeRefreshDownlaodCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeRefreshDownlaodCount);
						
						pom.getValueAddedMaterialPage(getDriver()).clickDownloadValueAddedMaterialPage();
						
						String afterClickDownloadCount = pom.getValueAddedMaterialPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterClickDownloadCount);
						
						Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in ValueAddedMaterial");
						
						refresh(getDriver());
						
						String beforeDownloadCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeDownloadCount();
						extentTest.info(beforeDownloadCount);
						pom.getValueAddedMaterialPage(getDriver()).clickDownloadValueAddedMaterialPage();
						
						String afterRefreshDownlaodCount = pom.getValueAddedMaterialPage(getDriver()).getAfterDownloadCount();
						extentTest.info(afterRefreshDownlaodCount);
						
						Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  ValueAddedMaterial  ");
						
				}
				//Verify after the user likes the button and refreshes the page (Static Method)
				@Test(priority = 16, enabled = true)
				public void testLikeCountAfterUserLoginInValueAddedMaterialPage() throws InterruptedException		{

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
					
					pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
					Thread.sleep(5000);

					String beforeRefreshLikeCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeLikeCount();
					extentTest.info(beforeRefreshLikeCount);
					
					// Click the like button
					pom.getValueAddedMaterialPage(getDriver()).clickLikeOnValueAddedMaterialPage();
		
					// Check if the like button is clickable again
					if (pom.getValueAddedMaterialPage(getDriver()).isLikeButtonClickable()) {
					    // Get the like count after clicking
					    String afterClickLikeCount = pom.getValueAddedMaterialPage(getDriver()).getAfterLikeCount();
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
					
					String beforeLikeCount = pom.getValueAddedMaterialPage(getDriver()).getBeforeLikeCount();
					extentTest.info(beforeLikeCount);
					pom.getValueAddedMaterialPage(getDriver()).clickLikeOnValueAddedMaterialPage();
					
					// Check if the like button is clickable again
					if (pom.getValueAddedMaterialPage(getDriver()).isLikeButtonClickable()) {
					    // Get the like count after clicking
					    String afterRefreshLikeCount = pom.getValueAddedMaterialPage(getDriver()).getAfterLikeCount();
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
	
					
//					Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  ValueAddedMaterial  ");
					
				}
				
				@Test(priority = 17, enabled = true)
				public void testPaginationInValueAddedMaterialPage() throws InterruptedException		{

					getDriver().get(baseURL);
					extentTest.info("Succesfully Navigated to Vision Website");

					PageObjectManager pom = new PageObjectManager();
					
					pom.getResources(getDriver()).clickResources();

					pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
					
					pom.getValueAddedMaterialPage(getDriver()).clickValueAddedMaterialPage();
					Thread.sleep(2000);
					
					pom.getValueAddedMaterialPage(getDriver()).clickRandomPage();
					
					
				}

	
}
