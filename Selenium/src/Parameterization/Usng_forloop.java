package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Usng_forloop {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\Documents\\bearebel@6.xlsx");
		 Sheet k = WorkbookFactory.create(file).getSheet("Sheet4");
		
		for(int i=0;i<= k.getLastRowNum();i++) {
		       for(int j=0;j<=k.getRow(i).getLastCellNum()-1;j++) {
			
			   Cell cellinfo = k.getRow(i).getCell(j);
			   CellType CT = cellinfo.getCellType();
		
		if(CT==CellType.BOOLEAN) {
			System.out.print(cellinfo.getBooleanCellValue()+ "|");
		}
		else if(CT==CellType.STRING) {
			System.out.print(cellinfo.getStringCellValue()+ "|");
		}
		else if(CT==CellType.NUMERIC) {
			System.out.print(cellinfo.getNumericCellValue()+ "|");
		}
		
	
	}
         System.out.println();
	}
}
}
