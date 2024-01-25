package org.utilitypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {


Properties prop;

	public ReadConfig() {

		File file = new File ("./configuration/config.properties");
		try {
			prop  = new Properties();
			FileInputStream fs = new FileInputStream(file);
			prop.load(fs);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}
	public String getApplicationUrl() {
		String url = prop.getProperty("baseUrl");
		return url;

	}

	public String getEmailId() {
        String email = prop.getProperty("emailId");
        return email;
	}

	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}

	public String gettitle() {
		String title = prop.getProperty("title");
		return title;

	}

	public String getWelcome() {
	String welcomeText =	prop.getProperty("Welcome");
	return welcomeText;
	}

	public String getPrelimsText() {
	  String prelimsText=	prop.getProperty("PrelimsText");
	  return prelimsText;
	}

	public String getMainsText() {
	String  mainsText =	prop.getProperty("MainsText");
	return mainsText;
	}

	public String getClassroomText() {
	String classroomText =	 prop.getProperty("ClassroomText");
	return classroomText;

	}

	public String getInterviewText() {
		String interviewText =	 prop.getProperty("InterviewText");
		return interviewText;

		}

	public String getResourcesText() {
		String resourcesText =	 prop.getProperty("ResourcesText");
		return resourcesText;

		}

	public String getClassromDemoText() {
		String resourcesText =	 prop.getProperty("ClassroomDemoText");
		return resourcesText;

		}
	public String getOpenTestText() {
		String resourcesText =	 prop.getProperty("OpenTestText");
		return resourcesText;

		}
	public String getAbhyaasText() {
		String resourcesText =	 prop.getProperty("AbhyaasText");
		return resourcesText;

		}

	public String getInvalidEmail1Text() {
		String resourcesText =	 prop.getProperty("InvalidEmail1");
		return resourcesText;

		}
	public String getInvalidEmail2Text() {
		String resourcesText =	 prop.getProperty("InvalidEmail2");
		return resourcesText;

		}

	public String getInvalidPasswordText() {
		String resourcesText =	 prop.getProperty("InvalidPassword");
		return resourcesText;

		}








}
