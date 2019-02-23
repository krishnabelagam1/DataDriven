package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		sheet1.getRow(0).createCell(2).setCellValue("Team");
		sheet1.getRow(1).createCell(2).setCellValue("captains");
		sheet1.getRow(2).createCell(2).setCellValue("opening batsman");
		sheet1.getRow(3).createCell(2).setCellValue("first down batsman");
		sheet1.getRow(4).createCell(2).setCellValue("wicket keeper");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		System.out.println("Sucess");
	

	}

}
