package javafileiopack;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question1 {

	public static void main(String[] args) throws IOException {

		{

			XSSFWorkbook wb = new XSSFWorkbook();

			FileOutputStream fileOut = new FileOutputStream("Guviworkbook.xlsx");

			System.out.println("Workbook created");

			wb.write(fileOut);
		}
	}

}
