package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TotalRowsandCell {
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\sathyanarayanan\\eclipse-workspace\\SampleMaven\\workbook\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet s = book.getSheet("Sheet1");
		int count = 0;
		int cell=0;
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			count++;
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				cell++;
			}
		}
		System.out.println("Totala number of rows :"+count);
		System.out.println("Totala number of cells :"+cell);
		
	}

}

