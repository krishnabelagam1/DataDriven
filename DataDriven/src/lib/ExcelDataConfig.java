package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig(String excelpath) {
		File src = new File(excelpath);
		try {
			FileInputStream fin = new FileInputStream(src);
			wb= new XSSFWorkbook(fin);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		}
	public String getData(int sheetnumber,int row,int column) {
		sheet1 = wb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

}
