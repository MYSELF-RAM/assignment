package Week7;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PomExcelEdit {
	
	public static String[][] exceldata() throws IOException {
	XSSFWorkbook wb=new XSSFWorkbook("./PomEditlead/EditLead.xlsx");
	XSSFSheet sheet = wb.getSheetAt(0);
	int row = sheet.getLastRowNum();
	int cell = sheet.getRow(0).getLastCellNum();
	String[][] data=new String[row][cell];
	for (int i = 1; i <=row; i++) {
		XSSFRow row2 = sheet.getRow(i);
		for (int j = 0; j < cell; j++) {
			XSSFCell cell2 = row2.getCell(j);
			String data1 = cell2.getStringCellValue();
			data[i-1][j]=data1;
			
			
		}
		
	}
	wb.close();
	return data;

}}
