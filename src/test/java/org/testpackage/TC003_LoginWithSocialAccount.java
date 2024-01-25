/*
 * package org.testpackage;
 * 
 * import java.util.concurrent.TimeUnit;
 * 
 * import org.basepackage.VisionBaseClass; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebElement; import
 * org.pageobjectmanager.PageObjectManager; import org.testng.annotations.Test;
 * 
 * public class TC003_LoginWithSocialAccount extends VisionBaseClass {
 * 
 * @Test(enabled = false) public void test() throws Exception {
 * 
 * getDriver().get(baseURL);
 * 
 * extentTest.info("Vision Website  launched");
 * 
 * Thread.sleep(3000);
 * 
 * PageObjectManager pom = new PageObjectManager();
 * 
 * pom.getLoginPage(getDriver()).clickLoginButton();
 * 
 * pom.getLoginPage(getDriver()).clickFacebookLoginButton();
 * 
 * pom.getLoginPage(getDriver()).setFacebookEmail("Raghava.Gandhi@visionias.in")
 * ;
 * 
 * pom.getLoginPage(getDriver()).setFacebookPassword("Automation@123");
 * 
 * Thread.sleep(2000);
 * 
 * pom.getLoginPage(getDriver()).clickFbSubmitLoginButton();
 * 
 * synchronized (driver) {
 * 
 * driver.wait(3000);
 * 
 * }
 * 
 * getDriver().findElement(By.
 * xpath("//*[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft x1j85h84'][1]"
 * )) .click();
 * 
 * extentTest.pass("Logged in with Facebook is successful");
 * 
 * 
 * synchronized (driver) {
 * 
 * driver.wait(3000);
 * 
 * }
 * 
 * String base2 = captureScreenShotBase64(getDriver());
 * 
 * extentTest.addScreenCaptureFromBase64String(base2,
 * "Screenshot of Facebook Login ");
 * 
 * }
 * 
 * @Test(enabled = true) public void loginWithGoogle() throws Exception {
 * 
 * getDriver().get("https://qa.visionias.in/");
 * 
 * extentTest.info("Vision Website launched");
 * 
 * getDriver().manage().window().maximize();
 * getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 * 
 * getDriver().findElement(By.xpath("//button[text() = 'Login']")).click();
 * Thread.sleep(2000);
 * getDriver().findElement(By.xpath("//button[text() = ' Google']")).click();
 * Thread.sleep(2000); WebElement email =
 * getDriver().findElement(By.id("identifierId")); email.click();
 * email.sendKeys("Raghava.Gandhi@visionias.in");
 * getDriver().findElement(By.xpath("//span[text() = 'Next']")).click();
 * WebElement pass = getDriver().findElement(By.name("password")); pass.click();
 * pass.sendKeys("Visionias@100895");
 * getDriver().findElement(By.xpath("//span[text() = 'Next']")).click();
 * 
 * 
 * extentTest.info("Login with google account is successful");
 * 
 * 
 * synchronized (driver) {
 * 
 * driver.wait(20000);
 * 
 * }
 * 
 * 
 * 
 * 
 * String base1 = captureScreenShotBase64(getDriver());
 * extentTest.addScreenCaptureFromBase64String(base1,
 * "Screenshot of google login");
 * 
 * synchronized (driver) {
 * 
 * driver.wait(2000);
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 */