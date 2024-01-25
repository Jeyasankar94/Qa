/*
 * package org.testpackage;
 * 
 * import org.basepackage.VisionBaseClass; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebElement; import
 * org.pageobjectmanager.PageObjectManager; import org.testng.annotations.Test;
 * 
 * public class TC014_LoginScreenVerification extends VisionBaseClass {
 * 
 * @Test public void welcomeBackTextTest() throws Exception {
 * 
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * Thread.sleep(3000);
 * 
 * WebElement text = getDriver().findElement(By.
 * xpath("//*[@class='text-center sm:mt-[1.6003vh] md:mt-[1em]']")); String t1
 * =text.getText(); extentTest.info(t1);
 * 
 * }
 * 
 * @Test(enabled = false) public void emptyLoginCrendentialTest() throws
 * Exception {
 * 
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * synchronized (driver) { driver.wait(5000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickSubmitLogin();
 * 
 * synchronized (driver) { driver.wait(2000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).getErrorEmailMessage();
 * 
 * pom.getLoginPage(getDriver()).getErrorPasswordMessage();
 * 
 * String base64 = captureScreenShotBase64(getDriver());
 * extentTest.addScreenCaptureFromBase64String(base64);
 * 
 * }
 * 
 * @Test(enabled = false) public void invalidEmailidTest() throws Exception {
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * pom.getLoginPage(getDriver()).setEmailId(invlaidEmail1);
 * 
 * pom.getLoginPage(getDriver()).setPassword(invalidPassword);
 * 
 * pom.getLoginPage(getDriver()).clickSubmitLogin();
 * 
 * pom.getLoginPage(getDriver()).getErrorEmailMessage();
 * 
 * pom.getLoginPage(getDriver()).getErrorPasswordMessage();
 * 
 * String base64 = captureScreenShotBase64(getDriver());
 * extentTest.addScreenCaptureFromBase64String(base64);
 * 
 * }
 * 
 * @Test(enabled = false) public void invalidEmailidTest2() throws Exception {
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * pom.getLoginPage(getDriver()).setEmailId(invlaidEmail2);
 * 
 * pom.getLoginPage(getDriver()).setPassword(password);
 * 
 * pom.getLoginPage(getDriver()).clickSubmitLogin();
 * 
 * pom.getLoginPage(getDriver()).getErrorEmailMessage();
 * 
 * String base64 = captureScreenShotBase64(getDriver());
 * extentTest.addScreenCaptureFromBase64String(base64);
 * 
 * }
 * 
 * @Test(enabled = false) public void invalidPasswordTest() throws Exception {
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * pom.getLoginPage(getDriver()).setEmailId(email);
 * 
 * pom.getLoginPage(getDriver()).setPassword(invalidPassword);
 * 
 * pom.getLoginPage(getDriver()).clickEyePasswordIcon();
 * 
 * pom.getLoginPage(getDriver()).clickSubmitLogin();
 * 
 * //pom.getLoginPage(getDriver()).getErrorPasswordMessage();
 * 
 * String base64 = captureScreenShotBase64(getDriver());
 * extentTest.addScreenCaptureFromBase64String(base64);
 * 
 * }
 * 
 * @Test(enabled = false) public void eyePasswordIconTest() throws Exception {
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * pom.getLoginPage(getDriver()).setEmailId(email);
 * 
 * pom.getLoginPage(getDriver()).setPassword(password);
 * 
 * pom.getLoginPage(getDriver()).clickEyePasswordIcon();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * String base64 = captureScreenShotBase64(getDriver());
 * extentTest.addScreenCaptureFromBase64String(base64);
 * 
 * }
 * 
 * 
 * 
 * @Test(enabled = false) public void darkTest() throws Exception {
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website is launched");
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * synchronized (driver) { driver.wait(3000);
 * 
 * }
 * 
 * pom.getHomePageRag(getDriver()).clickDarkMode(); }
 * 
 * }
 */