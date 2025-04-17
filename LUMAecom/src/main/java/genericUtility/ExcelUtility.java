package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getDatafromExcel(String sheetName,int rownum,int colnum) throws EncryptedDocumentException, IOException
{
	FileInputStream fis=new FileInputStream("D:\\Our_Class\\LUMA_Test_Cases.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetName);
	DataFormatter df=new DataFormatter();
	String DATA= df.formatCellValue(sh.getRow(rownum).getCell(colnum));
	return DATA;
}
}
