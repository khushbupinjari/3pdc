package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Both {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		Sheet k = WorkbookFactory.create(file).getSheet("Sheet2");
		for( int i=0;i<=k.getLastRowNum();i++) {
			
			for(int j=0;j<=k.getRow(i).getLastCellNum()-1;j++) {
				
				String data = k.getRow(i).getCell(j).getStringCellValue(); //i=0 i==1
				System.out.print(data +" ");
						
		   }
	
		    System.out.println();
		
		}
		
	}
		
}

