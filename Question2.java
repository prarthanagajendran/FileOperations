package javafileiopack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Question2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		HSSFWorkbook wb = new HSSFWorkbook();

		
		FileOutputStream fileOut = new FileOutputStream("Guvi.xlsx");

		
		HSSFSheet sheet1 = wb.createSheet("Sheet1");
		System.out.println("Sheet1 Created");

		wb.write(fileOut);
	}
}



ouput:
Sheet1 Created
