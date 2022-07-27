package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class numeric_value {

  public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file = new FileInputStream("D:\\Desktop\\Book1.xlsx");
	     int data = (int) WorkbookFactory.create(file).getSheet("Sheet1").getRow(19).getCell(8).getNumericCellValue();
	     System.out.println(data);
	     
	     
	}

}


