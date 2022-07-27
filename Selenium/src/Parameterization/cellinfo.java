package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class cellinfo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		Cell cellinfo = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0);
		System.out.println(cellinfo);


	}

}
