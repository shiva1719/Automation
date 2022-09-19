package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_the_data_into_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.createSheet("Sheet3");
		Row ro = sh.createRow(0);
		Cell cel = ro.createCell(1);
		cel.setCellValue("SHivaraj");
		FileOutputStream fout=new FileOutputStream("./excel/testdata.xlsx");
		book.write(fout);
	}

}
