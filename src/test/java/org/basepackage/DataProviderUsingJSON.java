package org.basepackage;

import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUsingJSON { 

	
	public static String[] readJson() throws IOException, ParseException {
		 
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader("./registerData.json");
		Object obj = jsonparser.parse(reader); 
		JSONObject userloginsJsonobj  = (JSONObject) obj;
		JSONArray userloginsArray  = (JSONArray) userloginsJsonobj.get("Sheet1");
		
		String[] arry = new String[userloginsArray.size()];
		
		for(int i=0; i<userloginsArray.size(); i++) {
		JSONObject  users= (JSONObject) userloginsArray.get(i);
		String firstname = (String) users.get("FirstName");
		String lastname = (String) users.get("LastName");
		String emailid = (String) users.get("Email address");
		String mobileno = (String) users.get("Mobile no");
		String password = (String) users.get("password");
		
		arry[i] = firstname +","+lastname+","+emailid+","+mobileno+","+password;	
		
	}
		for(String dataArr : arry) { 
			System.out.println(dataArr);
		}
	 return arry;
	}
	
}
