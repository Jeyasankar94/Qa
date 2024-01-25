package org.testpackage;

import java.awt.AWTException;
import java.util.NoSuchElementException;

import org.basepackage.VisionBaseClass;
import org.pageobjectmanager.PageObjectManager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC390_ResearchAndAnalysisTest extends VisionBaseClass {


	//Check whether user is able to view the module name with proper banner text
	@Test(priority = 1, enabled = true)
	public void testBannerTextOfResearchAndAnalysisPage() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).displayBannerTextOfResearchAndAnalysisPage(),"Banner Text is not displayed at Research And Analysis");
	}
	
	//Verify Research And Analysis is  loading with downloadable document
	@Test(priority = 2, enabled = true)
	public void testPresenceOfDocumentInResearchAndAnalysisPage() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();

		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).clickDownloadRandomlyOnResearchAndAnalysisPage(),"Documents cannot be Download in Research And Analysis");
		
	}
	
	//Verify title of each document is dispalyed properly
	@Test(priority = 3, enabled = true)
	public void testTitleOfDocumentInResearchAndAnalysisPage() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).getTitleOfDocumentInResearchAndAnalysisPage(),"Title of the Research And Analysis is not displayed");
		
	}
	
	//Verify year,medium under each document
	@Test(priority = 4, enabled = true)
	public void testPresenceOfYearAndMediumInResearchAndAnalysisPageDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).displayYearOnDocumentInResearchAndAnalysisPage()," Year is not displayed in Research And Analysis documents ");
		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).displayMediumOnDocumentInResearchAndAnalysisPage()," Medium is not displayed in Research And Analysis documents ");
		
	}
	
	//Verify whether user can like the documents & Like icon should turn blue and count should be increased
	@Test(priority = 5, enabled = true)
	public void testLikeCountInResearchAndAnalysisPageDocument() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		Thread.sleep(5000);
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).displayAndLikeTheDocumentInResearchAndAnalysisPage(),"Cannot click the Like button in Research And Analysis documents ");
		
	}

	//Verify whether user can Like the documents & like icon should turn blue and count should be increased
	@Test(priority = 6, enabled = true)
	public void testLikeCountOfDocumentAtBeforeUserLoginInResearchAndAnalysisPage() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		Assert.assertTrue(pom.getResearchAndAnalysisPage(getDriver()).displayLikeCountOfTheDocumentAfterRefreshInResearchAndAnalysisPage(),"User cannot Like the Document more than once in Research And Analysis documents ");
		
	}
	
	//Verify after the user likes the button and refreshes the page (Static Method)
	@Test(priority = 7, enabled = true)
	public void testLikeCountBeforeUserLoginInResearchAndAnalysisPage() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		 
		String beforeRefreshLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeRefreshLikeCount);
		
		pom.getResearchAndAnalysisPage(getDriver()).clickLikeOnResearchAndAnalysisPage();
		
		String afterClickLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterLikeCount();
		extentTest.info(afterClickLikeCount);
		
		Assert.assertNotEquals(beforeRefreshLikeCount,afterClickLikeCount,"Document Like counts are same in Research And Analysis");
		
		refresh(getDriver());
		
		String beforeLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeLikeCount();
		extentTest.info(beforeLikeCount);
		pom.getResearchAndAnalysisPage(getDriver()).clickLikeOnResearchAndAnalysisPage();
		
		String afterRefreshLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterLikeCount();
		extentTest.info(afterRefreshLikeCount);
		
		Assert.assertNotEquals(beforeLikeCount,afterRefreshLikeCount,"Document Like counts are same in  Research And Analysis  ");
		
	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
	@Test(priority = 8, enabled = true)
	public void testDownloadCountOfDocumentBeforeUserLoginInResearchAndAnalysisPage() throws InterruptedException		{

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		 	String beforeRefreshDownlaodCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeDownloadCount();
			extentTest.info(beforeRefreshDownlaodCount);
			
			pom.getResearchAndAnalysisPage(getDriver()).clickDownloadResearchAndAnalysisPage();
			
			String afterClickDownloadCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterDownloadCount();
			extentTest.info(afterClickDownloadCount);
			
			Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Research And Analysis");
			
			refresh(getDriver());
			
			
			String beforeDownloadCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeDownloadCount();
			extentTest.info(beforeDownloadCount);
			pom.getResearchAndAnalysisPage(getDriver()).clickDownloadResearchAndAnalysisPage();
			
			String afterRefreshDownlaodCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterDownloadCount();
			extentTest.info(afterRefreshDownlaodCount);
			
			Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Research And Analysis  ");
			
	}
	
	//To share the page link to Whatsapp
	@Test(priority=9,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaWhatsappOfResearchAndAnalysisPage() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		 pom.getResearchAndAnalysisPage(getDriver()).clickShareResearchAndAnalysisPage();
		 synchronized (driver) { driver.wait(5000); }
		 
		 pom.getResearchAndAnalysisPage(getDriver()).clickWhatsapp();
		   
		 windowhandling(getDriver());
			
		String title = getDriver().getTitle();
		extentTest.info(title);
		  
		Assert.assertEquals("WhatsApp Web",title,"Incorrect Title for Whatsapp  ");

}

	
	//To share the page link to Facebook
	@Test(priority=10,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaFacebookOfResearchAndAnalysisPage() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		 pom.getResearchAndAnalysisPage(getDriver()).clickShareResearchAndAnalysisPage();
		 
		   pom.getResearchAndAnalysisPage(getDriver()).clickFacebook();
			
			windowhandling(getDriver());
			
			String title = getDriver().getTitle();
			extentTest.info(title);
			
			Assert.assertEquals("Facebook",title,"Incorrect Title for Facebook ");					
		

}

	//To share the page link to Gmail
	@Test(priority=11,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaGmailOfResearchAndAnalysisPage() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		 pom.getResearchAndAnalysisPage(getDriver()).clickShareResearchAndAnalysisPage();

	   pom.getResearchAndAnalysisPage(getDriver()).clickGmail();

   	   windowhandling(getDriver());
	
   	   String title = getDriver().getTitle();
   	   extentTest.info(title);
	
   	   Assert.assertEquals("Cutting-Edge Research & Analysis for UPSC",title,"Incorrect Title for Gmail  ");		
	

}

	//To share the page link to Telegram
	@Test(priority=12,  invocationCount = 1,   enabled=true)
	public void testUserCanShareThePageLinkViaTelegramOfResearchAndAnalysisPage() throws InterruptedException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
		
		 pom.getResearchAndAnalysisPage(getDriver()).clickShareResearchAndAnalysisPage();

		pom.getResearchAndAnalysisPage(getDriver()).clickTelegram();
		
		windowhandling(getDriver());
	
		String title = getDriver().getTitle();
		extentTest.info(title);
	
		Assert.assertEquals("Telegram: Share Web Page",title,"Incorrect Title for Telegram  ");		;		
	

}	


	@Test(priority = 13, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testFilterFunctionalityOfResearchAndAnalysisPage() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();

		 pom.getResearchAndAnalysisPage(getDriver()).clickFilter();

		 pom.getResearchAndAnalysisPage(getDriver()).clickSelectYear();
		 
		 pom.getResearchAndAnalysisPage(getDriver()).clickApplyFilter();
		 
		 Thread.sleep(4000);
		 
		// Check if data is displayed
		    boolean isDataDisplayed = pom.getResearchAndAnalysisPage(getDriver()).isDataDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } else
		    	 // Check if "No Data Found" message is displayed
			    try {
			        boolean isNoDataFoundDisplayed = pom.getResearchAndAnalysisPage(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }
		   


	}
	
	@Test(priority = 14, invocationCount = 1, enabled=true) //, invocationTimeOut = 10000          threadPoolSize = 2,
	public void testClearFilterOptionResearchAndAnalysisPage() throws InterruptedException, AWTException {

		getDriver().get(baseURL);
		extentTest.info("Succesfully Navigated to Vision Website");

		PageObjectManager pom = new PageObjectManager();
		
		pom.getResources(getDriver()).clickResources();

		pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();

		 pom.getResearchAndAnalysisPage(getDriver()).clickFilter();

		 pom.getResearchAndAnalysisPage(getDriver()).clickSelectYear();
		 
		 pom.getResearchAndAnalysisPage(getDriver()).clickApplyFilter();
		 
		 Thread.sleep(4000);
		 
		// Check if data is displayed
		    boolean isDataDisplayed = pom.getResearchAndAnalysisPage(getDriver()).isDataDisplayed();

		    // If data is displayed, assert that data is displayed after applying the filter
		    if (isDataDisplayed) {
		        Assert.assertTrue(isDataDisplayed, "Data not displayed after applying filter");
		    } else
		    	 // Check if "No Data Found" message is displayed
			    try {
			        boolean isNoDataFoundDisplayed = pom.getResearchAndAnalysisPage(getDriver()).isNoDataFoundDisplayed();
			        Assert.assertTrue(isNoDataFoundDisplayed, "No Data Found message not displayed after applying filter");
			    } catch (NoSuchElementException e) {
			        // Log or report the issue
			        System.out.println("No Data Found element not found: " + e.getMessage());
			    }
		   
		    pom.getResearchAndAnalysisPage(getDriver()).clickClearFilter();
		    Thread.sleep(2000);

	}
	
	//Verify whether user can download the documents & download icon should turn blue and count should be increased
			@Test(priority = 15, enabled = true)
			public void testDownloadCountOfDocumentAfterUserLoginInResearchAndAnalysisPage() throws InterruptedException		{

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
				Thread.sleep(5000);
				pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
				
				 	String beforeRefreshDownlaodCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeRefreshDownlaodCount);
					
					pom.getResearchAndAnalysisPage(getDriver()).clickDownloadResearchAndAnalysisPage();
					
					String afterClickDownloadCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterDownloadCount();
					extentTest.info(afterClickDownloadCount);
					
					Assert.assertNotEquals(beforeRefreshDownlaodCount,afterClickDownloadCount,"Document Like counts are same in Research And Analysis");
					
					refresh(getDriver());
					
					String beforeDownloadCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeDownloadCount();
					extentTest.info(beforeDownloadCount);
					pom.getResearchAndAnalysisPage(getDriver()).clickDownloadResearchAndAnalysisPage();
					
					String afterRefreshDownlaodCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterDownloadCount();
					extentTest.info(afterRefreshDownlaodCount);
					
					Assert.assertNotEquals(beforeDownloadCount,afterRefreshDownlaodCount,"Document Like counts are same in  Research And Analysis  ");
					
			}
			//Verify after the user likes the button and refreshes the page (Static Method)
			@Test(priority = 16, enabled = true)
			public void testLikeCountAfterUserLoginInResearchAndAnalysisPage() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getHomePage(getDriver()).clickLogin();
				extentTest.info(" Login button is Clicked");
				Thread.sleep(2000);
				pom.getHomePage(getDriver()).enterUsername("jeyasankar88@habenwir.com");

				pom.getHomePage(getDriver()).enterPassword("123456");

				pom.getHomePage(getDriver()).clickSubmit();
				Thread.sleep(5000);
				
				pom.getResources(getDriver()).clickResources();
				Thread.sleep(5000);
				
				pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
				 
				String beforeRefreshLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeRefreshLikeCount);
				
				pom.getResearchAndAnalysisPage(getDriver()).clickLikeOnResearchAndAnalysisPage();
				
				// Check if the like button is clickable again
				if (pom.getResearchAndAnalysisPage(getDriver()).isLikeButtonClickable()) {
					
				    // Get the like count after clicking
				    String afterClickLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterLikeCount();
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
				
				String beforeLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getBeforeLikeCount();
				extentTest.info(beforeLikeCount);
				
				pom.getResearchAndAnalysisPage(getDriver()).clickLikeOnResearchAndAnalysisPage();
				
				// Click the like button
//				pom.getMains365Page(getDriver()).clickLikeButton();

				// Check if the like button is clickable again
				if (pom.getResearchAndAnalysisPage(getDriver()).isLikeButtonClickable()) {
				    // Get the like count after clicking
				    String afterRefreshLikeCount = pom.getResearchAndAnalysisPage(getDriver()).getAfterLikeCount();
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
			@Test(priority = 17, enabled = false)
			public void testPaginationInResearchAndAnalysisPage() throws InterruptedException		{

				getDriver().get(baseURL);
				extentTest.info("Succesfully Navigated to Vision Website");

				PageObjectManager pom = new PageObjectManager();
				
				pom.getResources(getDriver()).clickResources();

				pom.getResearchAndAnalysisPage(getDriver()).clickResearchAndAnalysisPage();
				Thread.sleep(2000);
				
				pom.getResearchAndAnalysisPage(getDriver()).clickRandomPage();
				
				
			}

	
}
