package Framework;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {
    String[][] exceldata = null;
    FileInputStream fis;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    File excel_filepath;
    public String[][] readExcelDataFileToArray(String filename, String Sheetname) {
        excel_filepath= new File(filename);

        try {
            fis = new FileInputStream(excel_filepath);
            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheet(Sheetname);

            exceldata = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

            for (int i = 1; i < sheet.getLastRowNum(); i++) {
                for (int j = 1; j < sheet.getRow(0).getLastCellNum(); j++) {
                    exceldata[i][j] = sheet.getRow(i).getCell(j).toString();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } return exceldata;
    }
    public void readExcelDataToArray(String filename, String Sheetname) {
        excel_filepath = new File(filename);
        String[] excel_data;
        try {
            fis = new FileInputStream(excel_filepath);
            wb = new XSSFWorkbook(fis);
            sheet = wb.getSheet(Sheetname);

            excel_data = new String[sheet.getLastRowNum()];

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
        public void getColumnHeaders()
    {
              String[] header;

            // XSSFRow header_row = sheet.getRow(0);
              header=new String[sheet.getRow(0).getLastCellNum()];
             for (int j = 1; j < sheet.getRow(0).getLastCellNum(); j++) {
                 header[j] = sheet.getRow(0).getCell(j).toString();
             }


        }

      /*  data = excelUtils.readExcelDataFileToArray(fileName, "Faclity_NewChecklist");
    String[] headers = ExcelUtils.getColumHeaders(data);
        for (int i = 1; i < data.length; i++) {
        template = ExcelUtils.getCellValue(data[i], headers, "Template");
        resp = ExcelUtils.getCellValue(data[i], headers, "Responsible");
        superviser = ExcelUtils.getCellValue(data[i], headers, "Supervisor");
    }
        return new String[0][];*/
    }
