package ddframew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fls = new FileInputStream("./data/testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fls);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row ro = sh.getRow(2);
		
		Cell cel = ro.getCell(0);
		
		String val = cel.getStringCellValue();

	System.out.println(val);
	

	}

}
