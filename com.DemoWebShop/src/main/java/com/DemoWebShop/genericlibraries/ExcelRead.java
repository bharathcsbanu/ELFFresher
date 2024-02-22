package com.DemoWebShop.genericlibraries;

import java.io.IOException;
import java.sql.Date;
import java.io.File;
import java.io.FileInputStream;

public class ExcelRead {

	 public static String readStringValue(String sheetName, int row, int cell)
	
	
	
	throws EncryptedDocumentException, IOException {
	File file= new File(EXCEL_PATH);
	FileInputStream fis= new FileInputStream(file);
	Workbook workbook =WorkbookFactory.create(fis);
	Sheet sheet =workbook.getSheet(sheetName);
	
	
	       return sheet.getRow(row).getCell(cell).toString();
	       
	 }
	
	
	public static double readNumericValue(String sheetName, int row, int cell)
	       throws EncryptedDocumentException, IOException {
	
	    File file =new File(EXCEL_PATH);
		FileInputStream fis= new FileInputStream(file);
	    Workbook workbook= WorkbookFactory.create(fis);
	    Sheet sheet =workbook.getSheet(sheetName);
	
	return sheet.getRow(row).getCell(cell).getNumericCellValue();
	

}
	public static boolean readBooleanValue(String sheetName, int row, int cell) 
			throws EncryptedDocumentException, IOException {
        File file =new File(EXCEL_PATH);
        FileInputStream fis =new FileInputStream(file); 
        Workbook workbook= Workbookfactory.create(fis);
		Sheet sheet= workbook.getSheet (sheetName);

		return sheet. getRow(row).getCell(cell).getBooleanCellValue();
	}
		public static Date readDateValue(String sheetNane, int row, int cell)
				throws EncryptedDocumentException, IOException {

		File file= new File(EXCEL_PATH);
		FileInputStream fis =new FileInputStream(file);
        Workbook workbook= WorkbookFactory.create(fis); 
		Sheet sheet =workbook.getSheet (sheetName);

		   return sheet .getRow(row).getCell(cell).getDateCellValue();
		
		}
		public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException {

		File file =new File(EXCEL_PATH);
        FileInputStrean fis= new FileInputStream(file); 
		Workbook workbook =WorkbookFactory.create(fis);
		Sheet sheet= workbook.getSheet (sheetName); 
		int row_size= sheet.getPhysicalNumberOfRows();
		

		return sheet.getRow(row).getCell(cell).getDateCellValue();

		}
		public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException {
		File file =new File(EXCEL_PATH);
		FileInputStream fis= new FileInputStream(file);
     	Workbook workbook= WorkbookFactory.create(fis); 
		Sheet sheet= workbook.getSheet (sheetName);

		int row size sheet.getPhysicalNumberOfRows(); int col size sheet.getRow(0).getPhysicalNumberOfCells();

		String[][] data new String[row size

		i=0; i < row size 1; i++)Workbook workbook WorkbookFactory.create(fis); Sheet sheet workbook.getSheet (sheetName);

return sheet.getRow(row).getCell(cell).getDateCellValue();



File file new File(EXCEL PATH); FileInputStream fis new FileInputStream(file);

public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException (

Workbook workbook WorkbookFactory.create(fis); Sheet sheet workbook.getSheet (sheetName);

int row size sheet.getPhysicalNumberOfRows(); int col size sheet.getRow(0).getPhysicalNumberOfCells();

String[][] data new String[row size

i=0; i < row size 1; i++) ( for (int 0; j < col size; j++) (

1][col_size];

Workbook workbook WorkbookFactory.create(fis); Sheet sheet workbook.getSheet (sheetName);

return sheet.getRow(row).getCell(cell).getDateCellValue();



File file new File(EXCEL PATH); FileInputStream fis new FileInputStream(file);

public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException (

Workbook workbook WorkbookFactory.create(fis); Sheet sheet workbook.getSheet (sheetName);

int row size sheet.getPhysicalNumberOfRows(); int col size sheet.getRow(0).getPhysicalNumberOfCells();

String[][] data new String[row size

i=0; i < row size 1; i++) ( for (int 0; j < col size; j++) (

1][col_size];
( for (int 0; j < col size; j++)

data[i][j] sheet.getlow(i 1).getCell().toString();

<>

return data;

data[i][j] sheet.getlow(i 1).getCell().toString();


return data;(

		1][col_size];

		for (int j=0;j<col_size;j++) {

		data[i][j] =sheet.getlow(i+ 1).getCell().toString();
		  }
		
		}

		return data;
		}
}
