package basic;

import lib.ExcelDataConfig;

public class ReadExcel {
	
	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		System.out.print(excel.getData(0,0,0));
		System.out.println(excel.getData(0,0,1));
		System.out.print(excel.getData(0,1,0));
		System.out.println(excel.getData(0,1,1));
		System.out.print(excel.getData(0,2,0));
		System.out.println(excel.getData(0,2,1));
		System.out.println(excel.getData(1,2,1));
	}

}
