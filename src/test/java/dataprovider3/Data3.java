package dataprovider3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data3 {
	public Object[][] getdatafromexcel() throws EncryptedDocumentException, IOException{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Namita Pandey\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\Excel\\src\\main\\resources\\Data provider.xlsx");
		
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		short Cellsize = sheet.getRow(0).getLastCellNum();
		  int rowcount = sheet.getLastRowNum();
		 
		  Object [][] obje = new Object[rowcount][Cellsize];
		 
		  for(int i=0; i<rowcount; i++) {
			  for(int j=0; j<Cellsize; j++) {
				 obje[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			  }
		  }
		  return obje;
}


}
