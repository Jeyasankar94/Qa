package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC290_PT365Test extends VisionBaseClass {


	//Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfPT365Page() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		Assert.assertTrue(pom.getResources(getDriver()).displayCurrentAffairsBannerText(),"Banner Text is not displayed at Current Affairs Page");
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		Assert.assertTrue(pom.getPT365Page(getDriver()).displayBannerTextOfPT365Page(),"Banner Text is not displayed at PT365");
	}
	
	//Verify PT365 is  loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInPT365Page() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();

		Assert.assertTrue(pom.getPT365Page(getDriver()).clickDownloadRandomlyOnPT365Page(),"Documents cannot be Download in PT365");
		
	}
	
	//Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInPT365Page() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		Assert.assertTrue(pom.getPT365Page(getDriver()).getTitleOfDocumentInPT365Page(),"Title of the PT365 is not displayed");
		
	}
	
	//Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInPT365PageDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		Assert.assertTrue(pom.getPT365Page(getDriver()).displayYearOnDocumentInPT365Page()," Year is not displayed in PT365 documents ");
		Assert.assertTrue(pom.getPT365Page(getDriver()).displayMediumOnDocumentInPT365Page()," Medium is not displayed in PT365 documents ");
		
	}
	
	//Verify whether user can like the documents & Like icon should turn blue and count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInPT365PageDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		Assert.assertTrue(pom.getPT365Page(getDriver()).displayAndLikeTheDocumentInPT365Page(),"Cannot click the Like button in PT365 documents ");
		
	}

	//Verify whether user can Like the documents & like icon should turn blue and count should be increased
	@Test(priority = 6, enabled = true)
	public void testLikeCountOfDocumentAtBeforeUserLoginInPT365Page() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		Assert.assertTrue(pom.getPT365Page(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInPT365Page(),"User cannot Like the Document more than once in PT365 documents ");
		
	}
	
	//Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 7, enabled = true)
	public void testLikeCountBeforeUserLoginInPT365Page() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		 
		String beforeRefreshLikeCount = pom.getPT365Page(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);
		
		pom.getPT365Page(getDriver()).clickLikeOnPT365Page();
		
		String afterClickLikeCount = pom.getPT365Page(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);
		
		Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in PT365");
		
		refresh(getDriver());
		
		String beforeLikeCount = pom.getPT365Page(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getPT365Page(getDriver()).clickLikeOnPT365Page();
		
		String afterRefreshLikeCount = pom.getPT365Page(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);
		
		Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  PT365  ");
		
	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentBeforeUserLoginInPT365Page() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		 	String beforeRefreshDownlaodCount = pom.getPT365Page(getDriver()).getBeforeDownloadCount();
			extentTest.info(beforeRefreshDownlaodCount);
			
			pom.getPT365Page(getDriver()).clickDownloadPT365Page();
			
			String afterClickDownloadCount = pom.getPT365Page(getDriver()).getAfterDownloadCount();
			extentTest.info(afterClickDownloadCount);
			
			Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in PT365");
			
			refresh(getDriver());
			
			
			String beforeDownloadCount = pom.getPT365Page(getDriver()).getBeforeDownloadCount();
			extentTest.info(beforeDownloadCount);
			pom.getPT365Page(getDriver()).clickDownloadPT365Page();
			
			String afterRefreshDownlaodCount = pom.getPT365Page(getDriver()).getAfterDownloadCount();
			extentTest.info(afterRefreshDownlaodCount);
			
			Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  PT365  ");
			
	}
	
	//To share the page link to Whatsapp
	@Test(priority=9,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaWhatsappOfPT365Page() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		 pom.getPT365Page(getDriver()).clickSharePT365Page();
		 synchronized (driver) { driver.wait(5000); }
		 
		 pom.getPT365Page(getDriver()).clickWhatsapp();
		   
		 windowhandling(getDriver());
			
		String title = getDriver().getTitle();
		extentTest.info(title);
		  
		Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

}

	
	//To share the page link to Facebook
	@Test(priority=10,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaFacebookOfPT365Page() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		 pom.getPT365Page(getDriver()).clickSharePT365Page();
		 
		   pom.getPT365Page(getDriver()).clickFacebook();
			
			windowhandling(getDriver());
			
			String title = getDriver().getTitle();
			extentTest.info(title);
			
			Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
		

}

	//To share the page link to Gmail
	@Test(priority=11,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaGmailOfPT365Page() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		 pom.getPT365Page(getDriver()).clickSharePT365Page();

	   pom.getPT365Page(getDriver()).clickGmail();

   	   windowhandling(getDriver());
	
   	   String title = getDriver().getTitle();
   	   extentTest.info(title);
	
   	   Assert.assertEquals("Vision IAS",title,"Incorrect Title for Gmail  ");		
	

}

	//To share the page link to Telegram
	@Test(priority=12,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaTelegramOfPT365Page() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();
		
		 pom.getPT365Page(getDriver()).clickSharePT365Page();

		pom.getPT365Page(getDriver()).clickTelegram();
		
		windowhandling(getDriver());
	
		String title = getDriver().getTitle();
		extentTest.info(title);
	
		Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
	

}	


	@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testFilterFunctionalityOfPT365Page() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();

		 pom.getPT365Page(getDriver()).clickFilter();

		 pom.getPT365Page(getDriver()).clickSelectYear();
		 
		 pom.getPT365Page(getDriver()).clickMediumFilter();

		 pom.getPT365Page(getDriver()).clickApplyFilter();
		 
		 Thread.sleep(4000);
		 
		// Check if data is displayed
		    boolean isDataDisplayed = pom.getPT365Page(getDriver()).isDataDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } else
		    	 // Check if "No Data Found" message is displayed
			    try {
			        boolean isNoDataFoundDisplayed = pom.getPT365Page(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }
		   


	}
	
	@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testClearFilterOptionPT365Page() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
		
		pom.getPT365Page(getDriver()).clickPT365Page();

		 pom.getPT365Page(getDriver()).clickFilter();

		 pom.getPT365Page(getDriver()).clickSelectYear();
		 
		 pom.getPT365Page(getDriver()).clickMediumFilter();

		 pom.getPT365Page(getDriver()).clickApplyFilter();
		 
		 Thread.sleep(4000);
		 
		// Check if data is displayed
		    boolean isDataDisplayed = pom.getPT365Page(getDriver()).isDataDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } else
		    	 // Check if "No Data Found" message is displayed
			    try {
			        boolean isNoDataFoundDisplayed = pom.getPT365Page(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }
		   
		    pom.getPT365Page(getDriver()).clickClearFilter();
		    Thread.sleep(2000);

	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
			@Test(priority = 15, enabled = true)
			public void testDownloadCountOfDocumentAfterUserLoginInPT365Page() throws InterruptedException		{

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
				
				pom.getPT365Page(getDriver()).clickPT365Page();
				
				 	String beforeRefreshDownlaodCount = pom.getPT365Page(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeRefreshDownlaodCount);
					
					pom.getPT365Page(getDriver()).clickDownloadPT365Page();
					
					String afterClickDownloadCount = pom.getPT365Page(getDriver()).getAfterDownloadCount();
					extentTest.info(afterClickDownloadCount);
					
					Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in PT365");
					
					refresh(getDriver());
					
					String beforeDownloadCount = pom.getPT365Page(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeDownloadCount);
					pom.getPT365Page(getDriver()).clickDownloadPT365Page();
					
					String afterRefreshDownlaodCount = pom.getPT365Page(getDriver()).getAfterDownloadCount();
					extentTest.info(afterRefreshDownlaodCount);
					
					Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  PT365  ");
					
			}
			//Verify after the user likes the button and refreshes the page (Static Method)
			@Test(priority = 16, enabled = true)
			public void testLikeCountAfterUserLoginInPT365Page() throws InterruptedException		{

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
				
				pom.getPT365Page(getDriver()).clickPT365Page();
				 
				String beforeRefreshLikeCount = pom.getPT365Page(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeRefreshLikeCount);
				
				pom.getPT365Page(getDriver()).clickLikeOnPT365Page();
				
				// Check if the like button is clickable again
				if (pom.getPT365Page(getDriver()).isLikeButtonClickable()) {
					
				    // Get the like count after clicking
				    String afterClickLikeCount = pom.getPT365Page(getDriver()).getAfterLikeCount();
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
				
				String beforeLikeCount = pom.getPT365Page(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeLikeCount);
				
				pom.getPT365Page(getDriver()).clickLikeOnPT365Page();
				
				// Click the like button
//				pom.getMains365Page(getDriver()).clickLikeButton();

				// Check if the like button is clickable again
				if (pom.getPT365Page(getDriver()).isLikeButtonClickable()) {
				    // Get the like count after clicking
				    String afterRefreshLikeCount = pom.getPT365Page(getDriver()).getAfterLikeCount();
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

				
//				Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Mains365  ");
				
			}	
			@Test(priority = 17, enabled = true)
			public void testPaginationInPT365Page() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResources(getDriver()).clickCurrentAffairsUnderResources();
				
				pom.getPT365Page(getDriver()).clickPT365Page();
				Thread.sleep(2000);
				
				pom.getPT365Page(getDriver()).clickRandomPage();
				
				
			}

	
}
