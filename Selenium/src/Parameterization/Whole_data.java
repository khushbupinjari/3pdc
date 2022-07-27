package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Whole_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		Sheet k = WorkbookFactory.create(file).getSheet("Sheet2");
		short cellsize = k.getRow(0).getLastCellNum();
			
		for(int i=0;i<cellsize;i++) {
		
			String data = k.getRow(1).getCell(i).getStringCellValue(); //i=0 i==1
			System.out.println(data+" ");
					
		}
		
	}

}
