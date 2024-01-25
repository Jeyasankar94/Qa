package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC250_WeeklyFocusTest extends VisionBaseClass {

	
	//Check whether user is able to view the module name with proper banner text
			@Test(priority = 1, enabled = true)
			public void testBannerTextOfWeeklyFocus() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).displayBannerTextOfWeeklyFocus(),"Banner Text is not displayed at Weekly Focus");
			}
			
			//Verify Weekly Focus is  loading with downloadable document
			@Test(priority = 2, enabled = true)
			public void testPresenceOfDocumentInWeeklyFocus() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();

				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).clickDownloadRandomlyOnWeeklyFocus(),"Documents cannot be Download in Weekly Focus");
				
			}
			
			//Verify title of each document is dispalyed properly
			@Test(priority = 3, enabled = true)
			public void testTitleOfDocumentInWeeklyFocus() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).getTitleOfDocumentInWeeklyFocus(),"Title of the Weekly Focus is not displayed");
				
			}
			
			//Verify year,medium under each document
			@Test(priority = 4, enabled = true)
			public void testPresenceOfYearAndMediumInWeeklyFocusDocument() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).displayYearOnDocumentInWeeklyFocus()," Year is not displayed in Weekly Focus documents ");
				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).displayMediumOnDocumentInWeeklyFocus()," Medium is not displayed in Weekly Focus documents ");
				
			}
			
			//Verify whether user can like the documents & Like icon should turn blue and count should be increased
			@Test(priority = 5, enabled = true)
			public void testLikeCountInWeeklyFocusDocument() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).displayAndLikeTheDocumentInWeeklyFocus(),"Cannot click the Like button in Weekly Focus documents ");
				
			}

			//Verify whether user can Like the documents & like icon should turn blue and count should be increased
			@Test(priority = 6, enabled = true)
			public void testLikeCountOfDocumentAtBeforeUserLoginInWeeklyFocus() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				Assert.assertTrue(pom.getWeeklyFocus(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInWeeklyFocus(),"User cannot Like the Document more than once in Weekly Focus documents ");
				
			}
			
			//Verify after the user likes the button and refreshes the page (Static Method)
			@Test(priority = 7, enabled = true)
			public void testLikeCountBeforeUserLoginInWeeklyFocus() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				 
				String beforeRefreshLikeCount = pom.getWeeklyFocus(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeRefreshLikeCount);
				
				pom.getWeeklyFocus(getDriver()).clickLikeOnWeeklyFocus();
				
				String afterClickLikeCount = pom.getWeeklyFocus(getDriver()).getAfterLikeCount();
				extentTest.info(afterClickLikeCount);
				
				Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Weekly Focus");
				
				refresh(getDriver());
				
				String beforeLikeCount = pom.getWeeklyFocus(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeLikeCount);
				pom.getWeeklyFocus(getDriver()).clickLikeOnWeeklyFocus();
				
				String afterRefreshLikeCount = pom.getWeeklyFocus(getDriver()).getAfterLikeCount();
				extentTest.info(afterRefreshLikeCount);
				
				Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Weekly Focus  ");
				
			}
			
			//Verify whether user can download the documents & download icon should turn blue and count should be increased
			@Test(priority = 8, enabled = true)
			public void testDownloadCountOfDocumentBeforeUserLoginInWeeklyFocus() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				 	String beforeRefreshDownlaodCount = pom.getWeeklyFocus(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeRefreshDownlaodCount);
					
					pom.getWeeklyFocus(getDriver()).clickDownloadWeeklyFocus();
					
					String afterClickDownloadCount = pom.getWeeklyFocus(getDriver()).getAfterDownloadCount();
					extentTest.info(afterClickDownloadCount);
					
					Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Weekly Focus");
					
					refresh(getDriver());
					
					
					String beforeDownloadCount = pom.getWeeklyFocus(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeDownloadCount);
					pom.getWeeklyFocus(getDriver()).clickDownloadWeeklyFocus();
					
					String afterRefreshDownlaodCount = pom.getWeeklyFocus(getDriver()).getAfterDownloadCount();
					extentTest.info(afterRefreshDownlaodCount);
					
					Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Weekly Focus  ");
					
			}
			
			//To share the page link to Whatsapp
			@Test(priority=9,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaWhatsappOfWeeklyFocus() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				 pom.getWeeklyFocus(getDriver()).clickShareWeeklyFocus();
				 synchronized (driver) { driver.wait(5000); }
				 
				 pom.getWeeklyFocus(getDriver()).clickWhatsapp();
				   
				 windowhandling(getDriver());
					
				String title = getDriver().getTitle();
				extentTest.info(title);
				  
				Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

		}

			
			//To share the page link to Facebook
			@Test(priority=10,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaFacebookOfWeeklyFocus() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				 pom.getWeeklyFocus(getDriver()).clickShareWeeklyFocus();
				 
				   pom.getWeeklyFocus(getDriver()).clickFacebook();
					
					windowhandling(getDriver());
					
					String title = getDriver().getTitle();
					extentTest.info(title);
					
					Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
				

		}

			//To share the page link to Gmail
			@Test(priority=11,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaGmailOfWeeklyFocus() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				 pom.getWeeklyFocus(getDriver()).clickShareWeeklyFocus();

			   pom.getWeeklyFocus(getDriver()).clickGmail();

		   	   windowhandling(getDriver());
			
		   	   String title = getDriver().getTitle();
		   	   extentTest.info(title);
			
		   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
			

		}

			//To share the page link to Telegram
			@Test(priority=12,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaTelegramOfWeeklyFocus() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
				
				 pom.getWeeklyFocus(getDriver()).clickShareWeeklyFocus();

				pom.getWeeklyFocus(getDriver()).clickTelegram();
				
				windowhandling(getDriver());
			
				String title = getDriver().getTitle();
				extentTest.info(title);
			
				Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
			

		}	


			@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
			public void testFilterFunctionalityOfWeeklyFocus() throws InterruptedException, AWTException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();

				 pom.getWeeklyFocus(getDriver()).clickFilter();

				 pom.getWeeklyFocus(getDriver()).clickSelectYear();
				 
				 pom.getWeeklyFocus(getDriver()).clickMediumFilter();

				 pom.getWeeklyFocus(getDriver()).clickApplyFilter();
				 
				 Thread.sleep(4000);
				 
				// Check if data is displayed
				    boolean isDataDisplayed = pom.getWeeklyFocus(getDriver()).isDataDisplayed();

				    // If data is displayed, assert that data is displayed after applying the filter
				    if (isDataDisplayed) {
				        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
				    } else
				    	 // Check if "No Data Found" message is displayed
					    try {
					        boolean isNoDataFoundDisplayed = pom.getWeeklyFocus(getDriver()).isNoDataFoundDisplayed();
					        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
					    } catch (NoSuchElementException e) {
					        // Log or report the issue
					        System.out.println("No Data Found element not found: " + e.getMessage());
					    }
				   


			}
			
			@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
			public void testClearFilterOptionWeeklyFocus() throws InterruptedException, AWTException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();

				 pom.getWeeklyFocus(getDriver()).clickFilter();

				 pom.getWeeklyFocus(getDriver()).clickSelectYear();
				 
				 pom.getWeeklyFocus(getDriver()).clickMediumFilter();

				 pom.getWeeklyFocus(getDriver()).clickApplyFilter();
				 
				 Thread.sleep(4000);
				 
				// Check if data is displayed
				    boolean isDataDisplayed = pom.getWeeklyFocus(getDriver()).isDataDisplayed();

				    // If data is displayed, assert that data is displayed after applying the filter
				    if (isDataDisplayed) {
				        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
				    } else
				    	 // Check if "No Data Found" message is displayed
					    try {
					        boolean isNoDataFoundDisplayed = pom.getWeeklyFocus(getDriver()).isNoDataFoundDisplayed();
					        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
					    } catch (NoSuchElementException e) {
					        // Log or report the issue
					        System.out.println("No Data Found element not found: " + e.getMessage());
					    }
				   
				    pom.getWeeklyFocus(getDriver()).clickClearFilter();
				    Thread.sleep(2000);

			}
			
			//Verify whether user can download the documents & download icon should turn blue and count should be increased
					@Test(priority = 15, enabled = true)
					public void testDownloadCountOfDocumentAfterUserLoginInWeeklyFocus() throws InterruptedException		{

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
						
						pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
						
						 	String beforeRefreshDownlaodCount = pom.getWeeklyFocus(getDriver()).getBeforeDownloadCount();
							extentTest.info(beforeRefreshDownlaodCount);
							
							pom.getWeeklyFocus(getDriver()).clickDownloadWeeklyFocus();
							
							String afterClickDownloadCount = pom.getWeeklyFocus(getDriver()).getAfterDownloadCount();
							extentTest.info(afterClickDownloadCount);
							
							Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Weekly Focus");
							
							refresh(getDriver());
							
							String beforeDownloadCount = pom.getWeeklyFocus(getDriver()).getBeforeDownloadCount();
							extentTest.info(beforeDownloadCount);
							pom.getWeeklyFocus(getDriver()).clickDownloadWeeklyFocus();
							
							String afterRefreshDownlaodCount = pom.getWeeklyFocus(getDriver()).getAfterDownloadCount();
							extentTest.info(afterRefreshDownlaodCount);
							
							Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Weekly Focus  ");
							
					}
						
					
					//Verify after the user likes the button and refreshes the page (Static Method)
					@Test(priority = 16, enabled = true)
					public void testLikeCountAfterUserLoginInWeeklyFocus() throws InterruptedException		{

						getDriver().get(baseURL);
						extentTest.info("Succesfully Navigated to Vision Website");

						PageObjectManager pom = new PageObjectManager();
						
						pom.getResources(getDriver()).clickResources();

						pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
						
						pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
						 
						String beforeRefreshLikeCount = pom.getWeeklyFocus(getDriver()).getBeforeLikeCount();
						extentTest.info(beforeRefreshLikeCount);
						
						// Click the like button
						pom.getWeeklyFocus(getDriver()).clickLikeOnWeeklyFocus();
			
						// Check if the like button is clickable again
						if (pom.getWeeklyFocus(getDriver()).isLikeButtonClickable()) {
						    // Get the like count after clicking
						    String afterClickLikeCount = pom.getWeeklyFocus(getDriver()).getAfterLikeCount();
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
						
						
		
		//				Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Mains365");
					
						refresh(getDriver());
						Thread.sleep(5000);
						
						String beforeLikeCount = pom.getWeeklyFocus(getDriver()).getBeforeLikeCount();
						extentTest.info(beforeLikeCount);
						pom.getWeeklyFocus(getDriver()).clickLikeOnWeeklyFocus();
						
						// Click the like button
//						pom.getWeeklyFocus(getDriver()).clickLikeButton();

						// Check if the like button is clickable again
						if (pom.getWeeklyFocus(getDriver()).isLikeButtonClickable()) {
						    // Get the like count after clicking
						    String afterRefreshLikeCount = pom.getWeeklyFocus(getDriver()).getAfterLikeCount();
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
						
					}
					
					@Test(priority = 17, enabled = true)
					public void testPaginationInWeeklyFocus() throws InterruptedException		{

						getDriver().get(baseURL);
						extentTest.info("Succesfully Navigated to Vision Website");

						PageObjectManager pom = new PageObjectManager();
						
						pom.getResources(getDriver()).clickResources();

						pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
						
						pom.getWeeklyFocus(getDriver()).clickWeeklyFocus();
						Thread.sleep(2000);
						
						pom.getWeeklyFocus(getDriver()).clickRandomPage();
						
						
					}

	
}
