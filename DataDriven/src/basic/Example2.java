package basic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example2 {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount  = sheet1.getLastRowNum();
		System.out.println("Total number of rows:" +rowcount);
		for(int i =0;i<rowcount;i++) {
			String data1 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data1);
		}
		
		
		wb.close();
		 
		

	}

}
