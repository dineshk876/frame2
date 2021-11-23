package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteBase {
	public static void writeExcel(String Sheet, int rowno, int Cellno, String text) throws Throwable {
		File f = new File("C:\\Users\\sathyanarayanan\\eclipse-workspace\\SampleMaven\\workbook\\newdd.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet s = book.getSheet(Sheet);
		s.getRow(rowno).createCell(Cellno).setCellValue(text);
		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);

	}
}