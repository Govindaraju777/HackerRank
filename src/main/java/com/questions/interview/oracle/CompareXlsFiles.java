package com.questions.interview.oracle;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompareXlsFiles {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileInputStream f1 = new FileInputStream("Exceltest1.xlsx");
		FileInputStream f2 = new FileInputStream("Exceltest2.xlsx");
		Workbook wb1 = WorkbookFactory.create(f1);
		Sheet sh1 = wb1.getSheet("Sheet1");
		Workbook wb2 = WorkbookFactory.create(f2);
		Sheet sh2 = wb2.getSheet("Sheet2");

		for (int i = 2; i < 7; i++) {
			Row row1 = sh1.getRow(i);
			Cell cell1 = row1.getCell(6);
			System.out.println(cell1);
			{
				for (int j = 5; j < 10; j++) {
					Row row2 = sh2.getRow(j);
					Cell cell2 = row2.getCell(26);
					System.out.println(cell2);
					if (cell1 == cell2) {
						System.out.println("True");
					} else {
						System.out.println("False");
					}
				}
			}
		}
	}

}
