package javafileiopack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question5 {

	public static void main(String[] args) {
		Excelread x = new Excelread();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.println(x.getExcelData("Sheet1", i, j));
			}System.out.println(" ");
		}
		}

	
	public String getExcelData(String sheetName, int rowNum, int colNum ) {
		String retVal = null;

		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("Salarydetails.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet s = wb.getSheet(sheetName);
			XSSFRow r = s.getRow(rowNum);
			XSSFCell c = r.getCell(colNum);
			
			retVal = Excelread.getCellVAlue(c);

			fis.close();
			wb.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return retVal;

	}
	public static String getCellVAlue(XSSFCell c) {
		switch(c.getCellType()){
		case NUMERIC:
			return String.valueOf(c.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(c.getBooleanCellValue());
		case STRING:
			return c.getStringCellValue();
			default:
				return c.getStringCellValue();
		}
	}

}





output:
	Name
	Salary
	 
	Arun
	10000.0
	 
	Bala
	10000.0
	 
	Siva
	10000.0
	 

