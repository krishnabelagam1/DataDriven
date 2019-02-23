package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel2 {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Users\\Dell\\Documents\\writedata.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		sheet1.getRow(0).createCell(0).setCellValue("2^3");
		sheet1.getRow(0).createCell(1).setCellValue("8");
		sheet1.getRow(1).createCell(0).setCellValue("3^3");
		sheet1.getRow(1).createCell(1).setCellValue("27");
		sheet1.getRow(2).createCell(0).setCellValue("4^4");
		sheet1.getRow(2).createCell(1).setCellValue("64");
		sheet1.getRow(3).createCell(0).setCellValue("5^5");
		sheet1.getRow(3).createCell(1).setCellValue("125");
		sheet1.getRow(4).createCell(0).setCellValue("6^6");
		sheet1.getRow(4).createCell(1).setCellValue("216");
		FileOutputStream fout = new FileOutputStream(src);
		wb.write(fout);
		wb.close();
		System.out.println("Success");
	

	}

}
