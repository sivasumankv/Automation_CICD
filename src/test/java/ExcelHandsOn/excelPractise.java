package ExcelHandsOn;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelPractise {

	@Test
	public void TestExcel() throws IOException 
	
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\sivas\\OneDrive\\Desktop\\Test.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet("TestData");
		
		int rowCount = sheet.getLastRowNum();
		
		for (int i=0;i<=rowCount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
		/*	Iterator<Cell> cells  = row.iterator();
			
			while(cells.hasNext())
			{
				 Cell cell = cells.next();
				 String cellValue = cell.toString();
				 System.out.println(cellValue);
			}  */
			int cellCount = row.getLastCellNum();
			for (int j=0;j<cellCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString()+"    ");
			}
			
			System.out.println();
		}
		
		
	}
}
