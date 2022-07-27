package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Celltype {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		CellType CT = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0).getCellType();
		System.out.println(CT);

	}

}
