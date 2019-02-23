package basic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Example3 {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int columncount  = sheet1.getLastRowNum();
		System.out.println("Total number of rows:" +columncount);
		int rowcount  = sheet1.getLastRowNum();
		System.out.println("Total number of rows:" +rowcount);
		for(int i = 0;i<5;i++) {
			for(int j =0;j<=1;j++) {
		
			String data1 = sheet1.getRow(i).getCell( j).getStringCellValue();
			System.out.print(data1+" ");
			
		}
			
		}
		
		wb.close();
		 
		

	}

}
