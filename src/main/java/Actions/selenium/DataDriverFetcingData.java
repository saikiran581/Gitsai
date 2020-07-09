package Actions.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriverFetcingData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\dell\\Desktop\\screenshots\\saikiran.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(1);
		int count = sh.getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			String data = sh.getRow(i).getCell(0).toString();
		
		System.out.println(data);
		}
		Cell c = r.getCell(2);
		String value = c.toString();
		System.out.println(value);
		
	}

}
