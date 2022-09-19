package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetchthedata {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		FileInputStream fis=new FileInputStream("./excel/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		Row ro = sh.getRow(0);
		Cell cel = ro.getCell(0);
		String value = cel.getStringCellValue();
		System.out.println(value);
	}

}
