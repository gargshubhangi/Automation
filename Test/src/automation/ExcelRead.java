package automation;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Shubhangi\\Desktop\\Selenium\\TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet s=wb.getSheet("Sheet1");
		
		Iterator<Row> rowit=s.iterator();
		
		while(rowit.hasNext())
		{
			System.out.println(rowit.next().getCell(0).getStringCellValue());
		}

	}

}
