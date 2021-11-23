package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exel {
	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\sathyanarayanan\\eclipse-workspace\\SampleMaven\\workbook\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook workbook = new XSSFWorkbook(fi);

		Sheet s = workbook.getSheet("Sheet1");
		Row ri = s.getRow(0);

		Cell cc = ri.getCell(0);
// To Print only one Cell
		//System.out.println(cc);
      //To Print particular Cell
		System.out.println("Cell no.2:");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				
				if (j == 1) {
					
					System.out.println(c);
				}
			}

		}
		System.out.println("\n");
		//to print all rows and cell
		System.out.println("Total rows & cells");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j <r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
			System.out.println("\n");
		}
		
		//to print Specific row
		System.out.println("\n");
		System.out.println("Row no.4:");
		Row r = s.getRow(4);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			System.out.println(c);
			
		}
	}
}
