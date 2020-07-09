package Actions.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriverRideingData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\dell\\Desktop\\screenshots\\saikiran.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(1);
		Cell c=r.createCell(3);
		c.setCellValue("Saikiran");
		FileOutputStream fos =new FileOutputStream("C:\\Users\\dell\\Desktop\\screenshots\\saikiran.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("Data is sucessfully written");
	}

}
