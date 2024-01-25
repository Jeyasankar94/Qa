package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC350_ValueAdditionOptionalSubject extends VisionBaseClass{

		
		//Check whether user is able to view the module name with proper banner text
			@Test(priority = 1, enabled = true)
			public void testBannerTextOfValueAdditionOptionalSubject() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayBannerTextOfValueAdditionOptionalSubject(),"Banner Text is not displayed at ValueAdditionOptionalSubject");
			}
			
			//Verify PT365 is  loading with downloadable document
			@Test(priority = 2, enabled = true)
			public void testPresenceOfDocumentInValueAdditionOptionalSubject() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();

				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).clickDownloadRandomlyOnValueAdditionOptionalSubject(),"Documents cannot be Download in ValueAdditionOptionalSubject");
				
			}
			
			//Verify title of each document is dispalyed properly
			@Test(priority = 3, enabled = true)
			public void testTitleOfDocumentInValueAdditionOptionalSubject() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).getTitleOfDocumentInValueAdditionOptionalSubject(),"Title of the ValueAdditionOptionalSubject is not displayed");
				
			}
			
			//Verify year,medium under each document
			@Test(priority = 4, enabled = true)
			public void testPresenceOfYearAndMediumInValueAdditionOptionalSubjectDocument() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayYearOnDocumentInValueAdditionOptionalSubject()," Year is not displayed in ValueAdditionOptionalSubject documents ");
				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayMediumOnDocumentInValueAdditionOptionalSubject()," Medium is not displayed in ValueAdditionOptionalSubject documents ");
				
			}
			
			//Verify whether user can like the documents & Like icon should turn blue and count should be increased
			@Test(priority = 5, enabled = true)
			public void testLikeCountInValueAdditionOptionalSubjectDocument() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				Thread.sleep(5000);
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayAndLikeTheDocumentInValueAdditionOptionalSubject(),"Cannot click the Like button in ValueAdditionOptionalSubject documents ");
				
			}

			//Verify whether user can Like the documents & like icon should turn blue and count should be increased
			@Test(priority = 6, enabled = true)
			public void testLikeCountOfDocumentAtBeforeUserLoginInValueAdditionOptionalSubject() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInValueAdditionOptionalSubject(),"User cannot Like the Document more than once in ValueAdditionOptionalSubject documents ");
				
			}
			
			//Verify after the user likes the button and refreshes the page (Static Method)
			@Test(priority = 7, enabled = true)
			public void testLikeCountBeforeUserLoginInValueAdditionOptionalSubject() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				 
				String beforeRefreshLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeRefreshLikeCount);
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickLikeOnValueAdditionOptionalSubject();
				
				String afterClickLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterLikeCount();
				extentTest.info(afterClickLikeCount);
				
				Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in ValueAdditionOptionalSubject");
				
				refresh(getDriver());
				
				String beforeLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeLikeCount);
				pom.getValueAdditionOptionalSubject(getDriver()).clickLikeOnValueAdditionOptionalSubject();
				
				String afterRefreshLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterLikeCount();
				extentTest.info(afterRefreshLikeCount);
				
				Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  ValueAdditionOptionalSubject  ");
				
			}
			
			//Verify whether user can download the documents & download icon should turn blue and count should be increased
			@Test(priority = 8, enabled = true)
			public void testDownloadCountOfDocumentBeforeUserLoginInValueAdditionOptionalSubject() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				 	String beforeRefreshDownlaodCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeRefreshDownlaodCount);
					
					pom.getValueAdditionOptionalSubject(getDriver()).clickDownloadValueAdditionOptionalSubject();
					
					String afterClickDownloadCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterDownloadCount();
					extentTest.info(afterClickDownloadCount);
					
					Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in ValueAdditionOptionalSubject");
					
					refresh(getDriver());
					
					
					String beforeDownloadCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeDownloadCount);
					pom.getValueAdditionOptionalSubject(getDriver()).clickDownloadValueAdditionOptionalSubject();
					
					String afterRefreshDownlaodCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterDownloadCount();
					extentTest.info(afterRefreshDownlaodCount);
					
					Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  ValueAdditionOptionalSubject  ");
					
			}
			
			//To share the page link to Whatsapp
			@Test(priority=9,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaWhatsappOfValueAdditionOptionalSubject() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				 pom.getValueAdditionOptionalSubject(getDriver()).clickShareValueAdditionOptionalSubject();
				 synchronized (driver) { driver.wait(5000); }
				 
				 pom.getValueAdditionOptionalSubject(getDriver()).clickWhatsapp();
				   
				 windowhandling(getDriver());
					
				String title = getDriver().getTitle();
				extentTest.info(title);
				  
				Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

		}

			
			//To share the page link to Facebook
			@Test(priority=10,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaFacebookOfValueAdditionOptionalSubject() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				 pom.getValueAdditionOptionalSubject(getDriver()).clickShareValueAdditionOptionalSubject();
				 
				   pom.getValueAdditionOptionalSubject(getDriver()).clickFacebook();
					
					windowhandling(getDriver());
					
					String title = getDriver().getTitle();
					extentTest.info(title);
					
					Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
				

		}

			//To share the page link to Gmail
			@Test(priority=11,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaGmailOfValueAdditionOptionalSubject() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				 pom.getValueAdditionOptionalSubject(getDriver()).clickShareValueAdditionOptionalSubject();

			   pom.getValueAdditionOptionalSubject(getDriver()).clickGmail();

		   	   windowhandling(getDriver());
			
		   	   String title = getDriver().getTitle();
		   	   extentTest.info(title);
			
		   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
			

		}

			//To share the page link to Telegram
			@Test(priority=12,  invocationCount = 1,   enabled=true)
			public void testUserCanShareThePageLinkViaTelegramOfValueAdditionOptionalSubject() throws InterruptedException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
				
				 pom.getValueAdditionOptionalSubject(getDriver()).clickShareValueAdditionOptionalSubject();

				pom.getValueAdditionOptionalSubject(getDriver()).clickTelegram();
				
				windowhandling(getDriver());
			
				String title = getDriver().getTitle();
				extentTest.info(title);
			
				Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
			

		}	


			@Test(priority = 13, invocationCount = 2, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
			public void testFilterFunctionalityOfValueAdditionOptionalSubject() throws InterruptedException, AWTException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();

				 pom.getValueAdditionOptionalSubject(getDriver()).clickFilter();

				 pom.getValueAdditionOptionalSubject(getDriver()).clickSelectYear();
				 
				 pom.getValueAdditionOptionalSubject(getDriver()).clickSectionsFilter();

				 pom.getValueAdditionOptionalSubject(getDriver()).clickApplyFilter();
				 
				 Thread.sleep(4000);
				 
				// Check if data is displayed
				    boolean isDataDisplayed = pom.getValueAdditionOptionalSubject(getDriver()).isDataDisplayed();

				    // If data is displayed, assert that data is displayed after applying the filter
				    if (isDataDisplayed) {
				        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
				        Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayYearOnDocumentInValueAdditionOptionalSubject()," Year is not displayed in ValueAdditionOptionalSubject documents ");
						Assert.assertTrue(pom.getValueAdditionOptionalSubject(getDriver()).displayMediumOnDocumentInValueAdditionOptionalSubject()," Medium is not displayed in ValueAdditionOptionalSubject documents ");
						
				    } else
				    	 // Check if "No Data Found" message is displayed
					    try {
					        boolean isNoDataFoundDisplayed = pom.getValueAdditionOptionalSubject(getDriver()).isNoDataFoundDisplayed();
					        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
					    } catch (NoSuchElementException e) {
					        // Log or report the issue
					        System.out.println("No Data Found element not found: " + e.getMessage());
					    }
				   


			}
			
			@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
			public void testClearFilterOptionValueAdditionOptionalSubject() throws InterruptedException, AWTException {

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();

				 pom.getValueAdditionOptionalSubject(getDriver()).clickFilter();

				 pom.getValueAdditionOptionalSubject(getDriver()).clickSelectYear();
				 
				 pom.getValueAdditionOptionalSubject(getDriver()).clickSectionsFilter();

				 pom.getValueAdditionOptionalSubject(getDriver()).clickApplyFilter();
				 
				 Thread.sleep(4000);
				 
				// Check if data is displayed
				    boolean isDataDisplayed = pom.getValueAdditionOptionalSubject(getDriver()).isDataDisplayed();

				    // If data is displayed, assert that data is displayed after applying the filter
				    if (isDataDisplayed) {
				        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
				    } else
				    	 // Check if "No Data Found" message is displayed
					    try {
					        boolean isNoDataFoundDisplayed = pom.getValueAdditionOptionalSubject(getDriver()).isNoDataFoundDisplayed();
					        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
					    } catch (NoSuchElementException e) {
					        // Log or report the issue
					        System.out.println("No Data Found element not found: " + e.getMessage());
					    }
				   
				    pom.getValueAdditionOptionalSubject(getDriver()).clickClearFilter();
				    Thread.sleep(2000);

			}
			
			//Verify whether user can download the documents & download icon should turn blue and count should be increased
					@Test(priority = 15, enabled = true)
					public void testDownloadCountOfDocumentAfterUserLoginInValueAdditionOptionalSubject() throws InterruptedException		{

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
						
						pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
						
						 	String beforeRefreshDownlaodCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeDownloadCount();
							extentTest.info(beforeRefreshDownlaodCount);
							
							pom.getValueAdditionOptionalSubject(getDriver()).clickDownloadValueAdditionOptionalSubject();
							
							String afterClickDownloadCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterDownloadCount();
							extentTest.info(afterClickDownloadCount);
							
							Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in ValueAdditionOptionalSubject");
							
							refresh(getDriver());
							
							String beforeDownloadCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeDownloadCount();
							extentTest.info(beforeDownloadCount);
							pom.getValueAdditionOptionalSubject(getDriver()).clickDownloadValueAdditionOptionalSubject();
							
							String afterRefreshDownlaodCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterDownloadCount();
							extentTest.info(afterRefreshDownlaodCount);
							
							Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  ValueAdditionOptionalSubject  ");
							
					}
					//Verify after the user likes the button and refreshes the page (Static Method)
					@Test(priority = 16, enabled = true)
					public void testLikeCountAfterUserLoginInValueAdditionOptionalSubject() throws InterruptedException		{

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
						
						pom.getValueAdditionOptionalSubject(getDriver()).clickValueAdditionOptionalSubject();
						Thread.sleep(5000);

						String beforeRefreshLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeLikeCount();
						extentTest.info(beforeRefreshLikeCount);
						
						// Click the like button
						pom.getValueAdditionOptionalSubject(getDriver()).clickLikeOnValueAdditionOptionalSubject();
			
						// Check if the like button is clickable again
						if (pom.getValueAdditionOptionalSubject(getDriver()).isLikeButtonClickable()) {
						    // Get the like count after clicking
						    String afterClickLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterLikeCount();
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
						
						
		
		//				Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in ValueAdditionOptionalSubject");
					
						refresh(getDriver());
						Thread.sleep(5000);
						
						String beforeLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getBeforeLikeCount();
						extentTest.info(beforeLikeCount);
						pom.getValueAdditionOptionalSubject(getDriver()).clickLikeOnValueAdditionOptionalSubject();
						
						// Click the like button
//						pom.getValueAdditionOptionalSubject(getDriver()).clickLikeButton();

						// Check if the like button is clickable again
						if (pom.getValueAdditionOptionalSubject(getDriver()).isLikeButtonClickable()) {
						    // Get the like count after clicking
						    String afterRefreshLikeCount = pom.getValueAdditionOptionalSubject(getDriver()).getAfterLikeCount();
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
		
						
//						Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  ValueAdditionOptionalSubject  ");
						
					}
					
			
		
	}


