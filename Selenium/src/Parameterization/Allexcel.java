package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Allexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet2");

		for (int i = 0; i <= data.getLastRowNum();i++) {
			for (int j = 0; j<=data.getRow(i).getLastCellNum();j++) {
				String data1 = data.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data1+" ");
			}
			System.out.println();
		}

	}

}
