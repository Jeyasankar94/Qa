package org.basepackage;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pageclasspackage.SignUpData;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilitypackage.ReadConfig;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.gson.Gson;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisionBaseClass {

	public ThreadLocal<WebDriver>  driver = new ThreadLocal<>();	

	public void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}
	public WebDriver getDriver() {
		return this.driver.get();
	}
	// Creating object for ReadConfig class
	ReadConfig readconfig = new ReadConfig();

	// Calling the method from ReadConfig Class
	public String browser = readconfig.getBrowser();
	public String baseURL = readconfig.getApplicationUrl();
	public String email = readconfig.getEmailId();
	public String password = readconfig.getPassword();
	public String title = readconfig.gettitle();
	public String welcomeText = readconfig.getWelcome();
	public String expectedPrelimsText = readconfig.getPrelimsText();
	public String expectedMainsText = readconfig.getMainsText();
	public String expectedClassroomText = readconfig.getClassroomText();
	public String expectedInterviewText = readconfig.getInterviewText();
	public String expectedResourcesText = readconfig.getResourcesText();
	public String expectedClassroomDemoText = readconfig.getClassromDemoText();
	public String expectedOpenTestText = readconfig.getOpenTestText();
	public String expectedAbhyaasText = readconfig.getAbhyaasText();
	public String invlaidEmail1 = readconfig.getInvalidEmail1Text();
	public String invlaidEmail2 = readconfig.getInvalidEmail2Text();
	public String invalidPassword = readconfig.getInvalidPasswordText();

	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	public static String screenshotsSubFolderName;

	// This method is used to initiate Extent Report
	@BeforeSuite
	public void initiateExtentReports() {
		extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter_all = new ExtentSparkReporter("AllTests.html");
		extentReports.attachReporter(sparkReporter_all);

		extentReports.setSystemInfo("OS", System.getProperty("os.name"));
		extentReports.setSystemInfo("Java Version", System.getProperty("java.name"));
	}

	// This method is used to generate the Extent Report
	@AfterSuite
	public void generateExtentReport() {
		extentReports.flush();
/*		  try {
			  Desktop.getDesktop().browse(new File("AllTests.html").toURI());
			  } catch (IOException e) {
			  // TODO Auto-generated catch block
			  e.printStackTrace();
			  }
*/		  }

	// To attach Screenshot to Extent Report
	@AfterMethod
	public void checkStatus(Method m, ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) 
		{
			String screenshotPath = null;
			screenshotPath = captureScreenshot(result.getTestContext().getName() + "_" + result.getMethod().getMethodName() + ".jpg",getDriver());
			extentTest.addScreenCaptureFromPath(screenshotPath);
			extentTest.fail(result.getThrowable());
		} 
		else if (result.getStatus() == ITestResult.SUCCESS) 
		{
			extentTest.pass(m.getName() + " is passed");
		}
		extentTest.assignCategory(m.getAnnotation(Test.class).groups());
		extentTest.assignCategory(m.getAnnotation(Test.class).testName());


	}

	// Launching browser
	@Parameters("browser")
	@BeforeMethod
	public void launch( ITestContext context, @Optional("chrome") String browser) {	// @Optional("chrome") String browser
		
		if (browser.equalsIgnoreCase("chrome")) {
		    ChromeOptions options = new ChromeOptions();

		    // Set the path to the Chrome binary (not ChromeDriver)
		    options.setBinary("/usr/bin/google-chrome");

		    options.addArguments("--disable-gpu");
		    options.addArguments("--no-sandbox");

		    // Set ChromeDriver system property with longer timeout
		    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

		    // Instantiate the ChromeDriver with the configured options
		    setDriver(new ChromeDriver(options));
		
			
	/*		
		    ChromeOptions options = new ChromeOptions();

		    // Instantiate the ChromeDriver with the configured options
		    setDriver(new ChromeDriver(options));
		


	/*		
			
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
			WebDriver driver = new ChromeDriver();
			setDriver(driver); 
			
	/*		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
		//	options.setBinary("/usr/lib/chromium-browser/chromedriver");
			WebDriver driver = new ChromeDriver(options);

			options.addArguments("--headless");

	//	    System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
	//	    WebDriver driver = new ChromeDriver();
	        setDriver(new ChromeDriver(options));
		
	//        System.setProperty("webdriver.chrome.logfile", "/visionweb_qa/reports/chromedriver.log");

		
*/		
	/*		
		
		if (browser.equalsIgnoreCase("chrome")) {
	
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			setDriver(driver); 

			
		
			   // Setup ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();

	        // Set ChromeOptions if needed
	        ChromeOptions chromeOptions = new ChromeOptions();
	        // Add any necessary ChromeOptions configurations here

	        // Create ChromeDriver instance with options
	        WebDriver driver = new ChromeDriver(chromeOptions);
			
	        
	        
			// Create a new ChromeOptions instance
			ChromeOptions options = new ChromeOptions();
			 setDriver(new ChromeDriver(options));
			// Set the path to the downloaded ChromeDriver executable (not necessary if chromedriver is in /usr/bin)
			 System.setProperty("webdriver.chrome.driver", " D://Drivers//chromedriver-win64 (2)//chromedriver-win64//chromedriver.exe");
			
			// Set binary path for headless mode
			//options.setBinary("/usr/bin/chromedriver");

			// Add ChromeOptions arguments
			options.addArguments("--headless");
			options.addArguments("--disable-gpu");
			options.addArguments("--no-sandbox");

			// Set capability for command timeout
			options.setCapability("commandTimeout", "600");

			// Set up ChromeDriver with the specified options
			WebDriver driver = new ChromeDriver(options);



	/*		
			
			  ChromeOptions options = new ChromeOptions();
			  
			  options.setBinary("/usr/lib/chromium-browser/chromedriver");
			  
			  options.addArguments("--headless"); 
			  options.addArguments("--disable-gpu");
			  options.addArguments("--no-sandbox");
			  
			  // Set ChromeDriver system property with longer timeout
			  System.setProperty("webdriver.chrome.driver","/usr/lib/chromium-browser/chromedriver");
			  
			  System.setProperty("webdriver.chrome.driver.command_timeout", "300");
			  
			  setDriver(new ChromeDriver(options));
	*/		 

		}
		else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			 setDriver(new FirefoxDriver(options));
	
		}
		else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions edgopt = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			setDriver(new EdgeDriver(edgopt));
		}
		else {
			System.err.println("Browser name is invalid");
		}
	//	driver.manage().window().maximize();
		getDriver().manage().window().maximize();

		// getCurrentXmlTest method is used to author name via getParameter method
		extentTest = extentReports.createTest(context.getName());
		String author = context.getCurrentXmlTest().getParameter("author");

		// assignAuthor is used to display author name in Extent Report
		extentTest.assignAuthor(author);
		
	}

	// to quit the browser
	@AfterTest
	public void tearDown() {
		/*
		 * if (getDriver() != null) { getDriver().quit(); if (extentTest != null) {
		 * extentTest.info("WebDriver quit."); } }
		 */
	}
	// to pass dataprovider parameter to test cases
	@DataProvider(name = "LD1")
	public String[][] dataProvider() throws Exception {
		// DataProviders is class where data provider method getLoginCredentials is
		// written and the same got below
		String[][] data = DataProviders.getLoginCredentials();
		return data;
	}

	@DataProvider(name = "dpjson")
	public String[] passingJsonData() throws IOException, ParseException, org.json.simple.parser.ParseException {
		String[] users = DataProviderUsingJSON2Login.readJson();
		return users;
		}

	@DataProvider(name = "registerData")
	public String[] passingJsonRegisterPage() throws IOException, ParseException, org.json.simple.parser.ParseException {
		String[] details = DataProviderUsingJSON.readJson();
		return details;
		}

	@DataProvider(name = "SignUpWithSameEmailData", indices = {0})		// we can use @DataProvider (indices = [0,3] ) for partial data supply
    public Object[][] getSignUpData() throws IOException {
        // Read the JSON file containing the sign-up data
        FileReader reader = new FileReader("./Resources/signUpData.json");

        // Deserialize the JSON data into an array of SignUpData objects
        SignUpData[] signUpData = new Gson().fromJson(reader, SignUpData[].class);

        // Create a 2D array to hold the test data
        Object[][] testData = new Object[signUpData.length][5];

        // Populate the test data array with the values from the SignUpData objects
        for (int i = 0; i < signUpData.length; i++) {
            testData[i][0] = signUpData[i].getFirstName();
            testData[i][1] = signUpData[i].getLastName();
            testData[i][2] = signUpData[i].getEmail();
            testData[i][3] = signUpData[i].getMobileNumber();
            testData[i][4] = signUpData[i].getPassword();
        }

        return testData;
    }

	@DataProvider(name = "SignUpWithDataAndWithoutData", indices = {1,2,3,4,5,6,7})
    public Object[][] getSignUpWithoutData() throws IOException {
        // Read the JSON file containing the sign-up data
        FileReader reader = new FileReader("./Resources/signUpData.json");

        // Deserialize the JSON data into an array of SignUpData objects
        SignUpData[] signUpData = new Gson().fromJson(reader, SignUpData[].class);

        // Create a 2D array to hold the test data
        Object[][] testData = new Object[signUpData.length][5];

        // Populate the test data array with the values from the SignUpData objects
        for (int i = 0; i < signUpData.length; i++) {
            testData[i][0] = signUpData[i].getFirstName();
            testData[i][1] = signUpData[i].getLastName();
            testData[i][2] = signUpData[i].getEmail();
            testData[i][3] = signUpData[i].getMobileNumber();
            testData[i][4] = signUpData[i].getPassword();
        }

        return testData;
    }

	@DataProvider(name = "SignUpWithExistingUsertData", indices = {8})
    public Object[][] getSignUpWithExistingUserData() throws IOException {
        // Read the JSON file containing the sign-up data
        FileReader reader = new FileReader("./Resources/signUpData.json");

        // Deserialize the JSON data into an array of SignUpData objects
        SignUpData[] signUpData = new Gson().fromJson(reader, SignUpData[].class);

        // Create a 2D array to hold the test data
        Object[][] testData = new Object[signUpData.length][5];

        // Populate the test data array with the values from the SignUpData objects
        for (int i = 0; i < signUpData.length; i++) {
            testData[i][0] = signUpData[i].getFirstName();
            testData[i][1] = signUpData[i].getLastName();
            testData[i][2] = signUpData[i].getEmail();
            testData[i][3] = signUpData[i].getMobileNumber();
            testData[i][4] = signUpData[i].getPassword();
        }

        return testData;
    }


	// to capture the screenshot
	public static String captureScreenshot(String fileName, WebDriver driver)	 {	
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("./reports/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot saved successfully");
		return destinationFile.getAbsolutePath();

	}

	public static String captureScreenShotBase64(WebDriver driver) 	 {	
		TakesScreenshot ts = (TakesScreenshot) driver;
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		System.out.println("Screenshot saved successfully using base64");
		return base64;
		}


	public void closeCurrentWindow(WebDriver driver) {
		driver.close();
	}

	public void elementSendData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void quitBrowser(WebDriver driver) {
		driver.quit();
	}

	public WebElement elementById(String idAttributeValue, WebDriver driver) {
		WebElement element = driver.findElement(By.id(idAttributeValue));
		return element;
	}

	public WebElement elementByName(String nameAtrributeValue,WebDriver driver) {
		WebElement element = driver.findElement(By.name(nameAtrributeValue));
		return element;
	}

	public WebElement elementByClassName(String classNameAtrributeValue, WebDriver driver) {
		WebElement element = driver.findElement(By.name(classNameAtrributeValue));
		return element;
	}

	public WebElement elementByXpath(String xpath, WebDriver driver) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public String elementText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void Click(WebElement element) {
		element.click();
	}

	public void elementSendDataJs(String data, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	public void elementSendDataJs(String attributename, String data, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('" + attributename + "','" + data + "')", element);
	}

	public void elementclickJs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);
	}

	public Object elementGetDataJs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object attributeValue = executor.executeScript("arguments[0].getAttribute('value')", element);
		return attributeValue;
	}

	public String elementGetData(WebElement element) {
		String attributeValue = element.getAttribute("value");
		return attributeValue;
	}

	public String elementGetData(WebElement element, String attritubeName) {
		String attributeValue = element.getAttribute(attritubeName);
		return attributeValue;
	}

	public void moveToElement(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void dragAndDrop(WebElement source, WebElement destination, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).perform();
	}

	public void contextClickAction(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void sendDataInCaps(WebElement element, String data, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).sendKeys(element, data).keyUp(Keys.SHIFT).perform();
	}

	public void elementDoubleClick(WebElement element, WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
	}

	public WebElement elementScrollDownJs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
		return element;
	}

	public void elementScrollUpJs(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	public void backward(WebDriver driver) {
		driver.navigate().back();
	}

	public void forward(WebDriver driver) {
		driver.navigate().forward();
	}

	public void optionSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void optionSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void optionSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public List<WebElement> allOptionINDropDown(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> allSelectedOption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> selectedOption = select.getAllSelectedOptions();
		return selectedOption;
	}

	public boolean dropDownIsMultiple(WebElement element) {
		Select select = new Select(element);
		boolean isMultiple = select.isMultiple();
		return isMultiple;
	}

	public void deSelectdropAndDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectdropAndDownByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deSelectdropAndDownByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectAllOption(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void implicitWait(int seconds,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public WebElement elementByTag(String tagName, WebDriver driver) {
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;
	}

	public void pressDownKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	}

	public void pressEnterKey() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	public void clearData(WebElement element) {
		element.clear();
	}

	public void windowhandling(WebDriver driver) {
		String currentWindow = driver.getWindowHandle();
		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		// Iterate through all window handles
		for (String window : allWindows) {
			// Switch to the new window
			if (!window.equals(currentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

	}

}
