package week6;
//read Excel file
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		//step1 path
		XSSFWorkbook wb=new XSSFWorkbook("./Excel/CreateLead-1.xlsx");
		
		//step 2 get sheet of excel
		XSSFSheet sheet = wb.getSheetAt(0);
		
		//step 3 get row count
		int row = sheet.getLastRowNum();
		
		//step 4 get coloumn
		
		short cell = sheet.getRow(1).getLastCellNum();
		
		
		//step 5 print all data
		
		for (int i = 1; i <=row; i++) {
			XSSFRow row2 = sheet.getRow(i);
			for (int j = 0; j < cell; j++) {
				XSSFCell cell2 = row2.getCell(j);
				String data = cell2.getStringCellValue();
				System.out.println(data);
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
