package excelwriting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
      /* FileInputStream fls = new FileInputStream("./data/testdata.xlsx");
		
		Workbook wb = WorkbookFactory.create(fls);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row ro = sh.createRow(3);
		
		Cell cel = ro.createCell(0);
		
		cel.setCellValue("khandwa");
		
		 FileOutputStream fos = new FileOutputStream("./data/testData.xlsx");//file path has to be given for write operation 
		 
	        wb.write(fos);// this method of Workbook actually performs the write operation*/
		
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx"); //read the excel where in we need to store the data
		Workbook wb = WorkbookFactory.create(fis); // make the file ready for read operation
		Sheet sh = wb.getSheet("Sheet1"); //get the shwwt where in data has to be inserted
		Row row = sh.createRow(4); //make the row ready for write operation
		Cell cell = row.createCell(4); // it will make the cell ready for writting operation
        cell.setCellValue("maharashtra"); // set the value of the cell
        FileOutputStream fos = new FileOutputStream("./data/testdata.xlsx");//file path has to be given for write operation 
        wb.write(fos); // this method of Worknbook actually performs the write operation
		}
		

	}


