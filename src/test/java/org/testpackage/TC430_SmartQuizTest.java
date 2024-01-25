/*
 * package org.testpackage;
 * 
 * import org.basepackage.VisionBaseClass; import
 * org.pageobjectmanager.PageObjectManager; import org.testng.annotations.Test;
 * 
 * public class TC430_SmartQuizTest extends VisionBaseClass {
 * 
 * @Test(enabled = true) public void testSmart() {
 * 
 * getDriver().get(baseURL);
 * 
 * synchronized (driver) { try { driver.wait(5000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * // clicking resources module
 * pom.getHomePageRag(getDriver()).clickResources();
 * 
 * synchronized (driver) { try { driver.wait(7000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // clicking Smart Quiz module
 * pom.getResourcesPage(getDriver()).clickSmartQuiz();
 * 
 * synchronized (driver) { try { driver.wait(7000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // clicking the filter button
 * pom.getSmartQuizPage(getDriver()).clickSQFilter();
 * 
 * // clicking Monthly Current Affairs choice in filter dropdown
 * 
 * pom.getSmartQuizPage(getDriver()).clickSQMCA();
 * 
 * synchronized (driver) { try { driver.wait(5000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // clicking the filter button again to display the filter dropdown
 * pom.getSmartQuizPage(getDriver()).clickSQFilter();
 * 
 * // clicking PT365 choice in filter dropdown
 * 
 * pom.getSmartQuizPage(getDriver()).clickSQPT365();
 * 
 * extentTest.info("Filter option of Smart Quiz page is Verified ");
 * 
 * synchronized (driver) { try { driver.wait(7000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // scroll down to click Reading material & start quiz
 * pom.getSmartQuizPage(getDriver()).scrollDownSQ();
 * 
 * synchronized (driver) { try { driver.wait(2000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // click Reading material
 * pom.getSmartQuizPage(getDriver()).clickSQReadingMaterial();
 * 
 * // click Start Quiz pom.getSmartQuizPage(getDriver()).clickSQStartQuiz();
 * 
 * synchronized (driver) { try { driver.wait(2000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // pom.getLoginPage(getDriver()).setEmailId();
 * 
 * try { pom.getLoginPage(getDriver()).setEmailId(email); } catch (Exception e)
 * { // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * // pom.getLoginPage(getDriver()).setPassword();
 * 
 * try { pom.getLoginPage(getDriver()).setPassword(password); } catch (Exception
 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * pom.getLoginPage(getDriver()).clickSubmitLogin();
 * 
 * synchronized (driver) { try { driver.wait(7000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // again scroll down to click start quiz
 * pom.getSmartQuizPage(getDriver()).scrollDownSQ();
 * 
 * synchronized (driver) { try { driver.wait(4000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // click Start Quiz Again to navigate to respective page post login
 * pom.getSmartQuizPage(getDriver()).clickSQStartQuiz();
 * 
 * synchronized (driver) { try { driver.wait(7000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * // Instruction Page Functionality verification
 * 
 * pom.getSmartQuizPage(getDriver()).firstQuizInstruction();
 * 
 * }
 * 
 * 
 * }
 */