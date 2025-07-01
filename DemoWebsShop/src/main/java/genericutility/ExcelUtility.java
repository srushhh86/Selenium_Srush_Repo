package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Srushti
 */
public class ExcelUtility {
	/**
	 * This method is used to read data from excel file in string format
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return value in String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resource/TestData/commondata.properties");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
	}
	
	/**
	 * This method is used to read data from excel file in number format
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return value in Number
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public double getNumeberDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resource/TestData/commondata.properties");
		Workbook wb = WorkbookFactory.create(fis);
		return  wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
	}

	/**
	 * This method is used to read data from excel file in boolean format
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return value in Boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public boolean getBooleanDataFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resource/TestData/commondata.properties");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getBooleanCellValue();
	}

	/**
	 * This method is used to read data from excel file in LocalDateTime
	 * @param sheetName
	 * @param rowIndex
	 * @param columnIndex
	 * @return value LocalDataTime
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public LocalDateTime getDateAndTimeFromExcel(String sheetName,int rowIndex,int columnIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resource/TestData/commondata.properties");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getLocalDateTimeCellValue();
	}

	
}
