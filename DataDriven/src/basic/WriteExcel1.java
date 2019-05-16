package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel1 {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(3).setCellValue("saida@gmail.com");
		sheet1.getRow(0).createCell(4).setCellValue("879465123");
		sheet1.getRow(0).createCell(5).setCellValue("EMPID : 20145");
		sheet1.getRow(0).createCell(6).setCellValue("Salary");
		sheet1.getRow(0).createCell(7).setCellValue("Experience");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		System.out.println("Sucess");

	}

}
