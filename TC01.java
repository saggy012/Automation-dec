package com.test.Signup;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.vel.config.Configurations;

public class Utility {
	
	public String readExelSheet(int row,int col) throws 
	EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream(Configurations.exelSheetpath);
	Sheet sh = WorkbookFactory. create(file).getSheet("Sheet1");
	String data = sh.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
}
