import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcel {
    public static void main(String[] args) throws Exception{

        // Create file
        File file = new File("C://Selenium Excel Data//TestData1.xlsx");
        // Create FileInputStream
        FileInputStream fls = new FileInputStream(file);
        // Create XSSFWORKBook for xlsx files.
        XSSFWorkbook workbook = new XSSFWorkbook(fls);
        // Create XSSFSheet
        XSSFSheet sheet1 = workbook.getSheetAt(0);

        int rowCount = sheet1.getLastRowNum();
        System.out.println("Total Rows is : " + rowCount);
        for(int i = 0;i<=rowCount;i++){
            // Create String to extract data from Excel sheet in String format.
            String dataUserName = sheet1.getRow(i).getCell(0).getStringCellValue();
            System.out.println(" UserNameData From Row: " + i + " is "+ dataUserName);

            String dataPassword = sheet1.getRow(i).getCell(1).getStringCellValue();
            System.out.println(" Password Data for Row: " + i + " is "+ dataPassword);
        }

        // Below closing workbook to avoid data leaks
        workbook.close();
    }
}
