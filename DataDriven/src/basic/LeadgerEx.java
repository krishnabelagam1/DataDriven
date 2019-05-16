package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeadgerEx {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		String da = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("First ledger name: "+da);
		

	}

}
