package org.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ConvertingExcelintoJson {

	private ObjectMapper mapper = new ObjectMapper();

	/**
	 * Method to convert excel sheet data to JSON format
	 *
	 * @param excel
	 * @return
	 */
	public JsonNode excelToJson(File excel) {
		// hold the excel data sheet wise
		ObjectNode excelData = mapper.createObjectNode();
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			// Creating file input stream
			fis = new FileInputStream(excel);

			String filename = excel.getName().toLowerCase();
			if (filename.endsWith(".xls") || filename.endsWith(".xlsx")) {
				// creating workbook object based on excel file format
				if (filename.endsWith(".xls")) {
					workbook = new HSSFWorkbook(fis);
				} else {
					workbook = new XSSFWorkbook(fis);
				}

				// Reading each sheet one by one
				for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
					Sheet sheet = workbook.getSheetAt(i);
					String sheetName = sheet.getSheetName();

					List<String> headers = new ArrayList<>();
					ArrayNode sheetData = mapper.createArrayNode();
					// Reading each row of the sheet
					for (int j = 0; j <= sheet.getLastRowNum(); j++) {
						Row row = sheet.getRow(j);
						if (j == 0) {
							// reading sheet header's name
							for (int k = 0; k < row.getLastCellNum(); k++) {
								headers.add(row.getCell(k).getStringCellValue());
							}
						} else {
							// reading work sheet data
							ObjectNode rowData = mapper.createObjectNode();
							for (int k = 0; k < headers.size(); k++) {
								Cell cell = row.getCell(k);
								String headerName = headers.get(k);
								if (cell != null) {
									switch (cell.getCellType()) {
									case FORMULA:
										rowData.put(headerName, cell.getCellFormula());
										break;
									case BOOLEAN:
										rowData.put(headerName, cell.getBooleanCellValue());
										break;
									case NUMERIC:
										rowData.put(headerName, cell.getNumericCellValue());
										break;
									case BLANK:
										rowData.put(headerName, "");
										break;
									default:
										rowData.put(headerName, cell.getStringCellValue());
										break;
									}
								} else {
									rowData.put(headerName, "");
								}
							}
							sheetData.add(rowData);
						}
					}
					excelData.set(sheetName, sheetData);
				}
				return excelData;
			} else {
				throw new IllegalArgumentException("File format not supported.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (workbook != null) {
				try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	/**
	 * Main method to test this converter
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// Creating a file object with specific file path
		File excel = new File("./Resources/registeration at QA visionias.xlsx");
		ConvertingExcelintoJson converter = new ConvertingExcelintoJson();
		JsonNode data = converter.excelToJson(excel);

		try(FileWriter filewriter = new FileWriter("registerData.json"))
		{
			filewriter.write(data.toString());
			filewriter.flush();
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}
		//System.out.println(data);

		System.out.println("Excel file contains the Data:\n" + data);

	}

}

