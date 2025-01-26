package javafileiopack;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question4 {

	
		public static void main(String[] args) {
	       
	        String outputFilePath = "Read.xlsx";

	       
	       XSSFWorkbook workbook = new XSSFWorkbook();

	       
	        XSSFSheet sheet = workbook.createSheet("Details");

	        
	        String[][] data = {
	                {"ID", "Name", "Age"},
	                {"1", "Alice", "25"},
	                {"2", "Bob", "30"},
	                {"3", "Charlie", "35"}
	        };

	        
	        for (int i = 0; i < data.length; i++) {
	            XSSFRow row = sheet.createRow(i);
	            for (int j = 0; j < data[i].length; j++) {
	                XSSFCell cell = row.createCell(j);
	                cell.setCellValue(data[i][j]);
	            }
	        }

	     
	        for (int i = 0; i < data[0].length; i++) {
	            sheet.autoSizeColumn(i);
	        }

	        
	        try (FileOutputStream outputStream = new FileOutputStream(outputFilePath)) {
	            workbook.write(outputStream);
	            System.out.println("Data written successfully to " + outputFilePath);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	  
	        try {
	            workbook.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

	


