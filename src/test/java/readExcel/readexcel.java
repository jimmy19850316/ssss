package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class readexcel {
	public static HashMap<String,userinfo> readexcel_userinfo(String path) throws Exception{
	Map<String,userinfo> userinfo_map = new HashMap<String,userinfo>();
	//userinfo info =new userinfo();放这里为什么不行？
	InputStream is=new FileInputStream(path);
	HSSFWorkbook hassworkbook =new HSSFWorkbook(is);
	int sheetCount= hassworkbook.getNumberOfSheets();
	Sheet sheet =hassworkbook.getSheetAt(0);   
	int rowcount=sheet.getPhysicalNumberOfRows();
	for(int i=0;i<rowcount;i++)
	{
		userinfo info =new userinfo();
		Row row =sheet.getRow(i);
		info.setUsername(row.getCell(1).getStringCellValue());
		info.setUserpasswd(row.getCell(2).toString());
		userinfo_map.put(row.getCell(0).getStringCellValue(),info);
		//System.out.println(row.getCell(1).getStringCellValue()+"  "+row.getCell(2).getStringCellValue()+"  "+row.getCell(0).toString());
	}
	return (HashMap<String, userinfo>) userinfo_map;	
	}
}
	