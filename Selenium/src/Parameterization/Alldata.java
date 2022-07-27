package Parameterization;

import static org.apache.poi.ss.usermodel.CellType.BLANK;
import static org.apache.poi.ss.usermodel.CellType.BOOLEAN;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Alldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\\\Documents\\\\bearebel@6.xlsx");
		Sheet k = WorkbookFactory.create(file).getSheet("Sheet4");

		for (int i = 0; i <= 20; i++) {
			for (int j = 0; j <= 6; j++) {

				Cell cell = k.getRow(i).getCell(j);
				CellType celltype = cell.getCellType();

				if (celltype == BLANK) {
					CellType m = BLANK;
					m.toString();
					System.out.print("***" + m + "*** |");
				}

				else if (celltype == BOOLEAN) {
					System.out.print(cell.getBooleanCellValue() + " | ");
				} else if (celltype == STRING) {
					System.out.print(cell.getStringCellValue() + " | ");
				} else if (celltype ==NUMERIC) {
					System.out.print(cell.getNumericCellValue() + " | ");
				}

			}

			System.out.println();
		}

	}

}
