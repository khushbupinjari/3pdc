package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class all_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet2");
		for (int i = 0; i <= data.getLastRowNum(); i++) {

			System.out.print(data.getRow(i).getCell(0).getStringCellValue());
			System.out.println(" " + data.getRow(i).getCell(1).getStringCellValue());

		}

	}

}
