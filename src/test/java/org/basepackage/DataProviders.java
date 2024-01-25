package org.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviders {

	public static String[][] getLoginCredentials() throws IOException {
		File excelFile = new File("./Resources/Login.xlsx") ;

		// exists method is used to check whether excel exist in the above mentioned

		System.out.println(excelFile.exists());

		FileInputStream fis = new FileInputStream(excelFile);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		System.out.println(sheet.getPhysicalNumberOfRows());

		System.out.println(sheet.getLastRowNum());

		int noOfRows = sheet.getPhysicalNumberOfRows();

		int noOfColumns = sheet.getRow(0).getLastCellNum();

		String[][] data = new String[noOfRows - 1][noOfColumns-1];

		for (int i = 0; i < noOfRows - 1; i++) {
			for (int j = 0; j < noOfColumns-1; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
				sheet.getRow(i + 1).getCell(j).getStringCellValue();
			}
		}
		workbook.close();

		fis.close();

		return data;
	}

}
