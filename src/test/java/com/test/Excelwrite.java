package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\sathyanarayanan\\eclipse-workspace\\SampleMaven\\workbook\\Book1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet s = book.getSheet("Sheet1");
		s.getRow(0).createCell(5).setCellValue("Username");
		s.getRow(0).createCell(6).setCellValue("password");
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			Row r1 = s.getRow(i);	
			if (i==1) {
				r1.createCell(5).setCellValue("Dinesh123");
			}
			if (i==2) {
				r1.createCell(5).setCellValue("naveen111");
			}
		}
		FileOutputStream fout = new FileOutputStream(f);
		book.write(fout);
		System.out.println("done");
	}

}
