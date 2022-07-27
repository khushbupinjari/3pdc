package Parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Using_ifelse {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		Cell cellinfo  = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(0);
		
		CellType CT = cellinfo.getCellType();
		
		if(CT==CellType.BOOLEAN) {
			System.out.println(cellinfo.getBooleanCellValue());
		}
		else if(CT==CellType.STRING) {
			System.out.println(cellinfo.getStringCellValue());
		}
		else if(CT==CellType.NUMERIC) {
			System.out.println(cellinfo.getNumericCellValue()+ " ");
		}
		
		System.out.println(CT);

	}

}
