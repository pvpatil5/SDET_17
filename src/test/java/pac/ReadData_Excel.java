package pac;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		FileInputStream fis = new FileInputStream("../SDET_17/SDET17.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh=wb.getSheet("Sheet1");

		Row r =sh.getRow(3);

		String data= r.getCell(0).getStringCellValue();
		System.out.println(data);


	}
}
