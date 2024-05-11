package resuablecode;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {

    public static String getData(String sheetName, int rowIndex, int columnIndex) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/main/resources/testdata/TestData1.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
       return sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();

    }
}
