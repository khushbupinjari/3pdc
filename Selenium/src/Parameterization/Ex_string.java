package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_string {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
	   String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	   System.out.println(data);
		
	}

}
