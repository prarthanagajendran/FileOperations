package javafileiopack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question3 {

	// public static void main(String[] args) throws IOException {
	// // First create a work book

	public static void main(String[] args) throws IOException {
			
			
			XSSFWorkbook book = new XSSFWorkbook();
			
			
			XSSFSheet sheet = book.createSheet("DetailInput");
			
			
			Object[][] data = {
					{"Name","Age","E-mail"},
					{"John Doe",30,"John@test.com"},
					{"Jane Doe",28,"Jane@test.com"},
					{"Bob Smith",35,"Jacky@example.com"},
					{"Swapnil",37,"Swapnil@example.com"}
			};
			
			
			int rowCount = 0;
			
			
			for(Object[] row1 : data) {  		
				XSSFRow row = sheet.createRow(rowCount++);
				
				int columnCount = 0;
				
				for(Object col : row1) {		
				
				XSSFCell cell =	row.createCell(columnCount++);
				
				
				if(col instanceof String) {
					cell.setCellValue((String)col); 
					
				}else if(col instanceof Integer) {
					cell.setCellValue((Integer)col); 
				}
				}
			}
			
		try {
			FileOutputStream output = new FileOutputStream("Utils//Students.xlsx");
			System.out.println("File Created");	
			book.write(output);
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
		book.close();
		
		}
}
