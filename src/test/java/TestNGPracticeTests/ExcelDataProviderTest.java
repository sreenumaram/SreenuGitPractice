package TestNGPracticeTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderTest {
	
	
	
	
	@Test(dataProvider = "userCredentials")
	public void printUserCerds(String username,String password) {
		System.out.println("username:"+username+ ", password:'0"+ password);
		
	}
	
	

	
	
	
	@DataProvider(name="userCredentials")
	public Object[][] dataProviders() throws IOException {
		
		
		File testXlFile = new File("C:\\Users\\sreenivasa.maram\\Downloads\\TestDataProvider.xlsx");
		
		System.out.println(testXlFile.exists());
		
		FileInputStream fis  = new FileInputStream(testXlFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
		System.out.println(noOfColumns);
		
		String[][] data = new String[noOfRows-1][noOfColumns];
		for(int i=0; i<noOfRows-1;i++) {
			
			for(int j =0; j< noOfColumns;j++)
			{
				
				DataFormatter df = new DataFormatter();
				System.out.println(df.formatCellValue(sheet.getRow(i+1).getCell(j)));
						
//				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				
				data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			
			
				
			}
		}
		
//		for(String[] d: data) {
//			System.out.println(Arrays.toString(d));
//		}
		
		return data;
		
	}
}
