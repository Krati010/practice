package practice.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hpsf.Date;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLib
{
 //  private static final String STRING = null;
//private static final String NUMERIC = null;
//private static final String BOOLEAN = null;
//reusable methods to read or write data from excel
   String filepath;
  
  public ExcelLib(String filepath)
  {
	  this.filepath= filepath;
  }
  
  //reusable methods to read or write data from excel
   public String[] readData(String sheetName, String testcaseID)
   {
	   String[] value = null;
	   
	  try
	   {
		   FileInputStream fis = new FileInputStream(new File(filepath));
		   Workbook wb= WorkbookFactory.create(fis);
		   Sheet sh = wb.getSheet(sheetName);       //.getRow(row).getCell(cell);
		   int rowcount = sh.getLastRowNum();
		   
		   int colcount = sh.getRow(0).getLastCellNum();
		   
		   for(int i= 0; i<rowcount; i++)
		   {
			   Row currentRow = sh.getRow(i);
			   
			 for(int j = 0; j<colcount; j++)
			 {
				 currentRow.getCell(j).toString();
			 }
		   }
		   
//		   switch(cl.getCellType())
//		   {
//		   case STRING:
//			   value [j]= cl.getStringCellValue();
//			   break;
//			   
//		   case NUMERIC:
//			   if(DateUtil.isCellInternalDateFormatted(cl))
//			   {
//				   SimpleDateFormat sdf = new SimpleDateFormat("MM dd, yyyy");
//				    value[j]= sdf.format(cl.getNumericCellValue());
//				    
//			   }
//			   
//			   else
//			   {
//				   long longValue = (long) cl.getNumericCellValue();
//				   value[j] = Long.toString(longValue);
//			   }
//			   break;
//		   
//		   case BOOLEAN:
//				value[j] = Boolean.toString(cl.getBooleanCellValue());
//				break;
//
//			   
//			   default:
//				   break;
//	  }
	   }
	   
	  catch(EncryptedDocumentException e)
	   {
		   e.printStackTrace();
		      
	  }
	   
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
	  
	  return value;
   }
}

