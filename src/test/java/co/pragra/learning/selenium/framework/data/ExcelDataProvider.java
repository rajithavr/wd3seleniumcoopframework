package co.pragra.learning.selenium.framework.data;

import co.pragra.learning.selenium.framework.config.Config;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelDataProvider {

    private String dataFileSheet ="ISP_DatabaseTestData.xlsx";

    private List<Object[]> data=new ArrayList<>();
    private Workbook workbook;

    public ExcelDataProvider(){
        try {
           // Path path = Paths.get("src", "test", "resources", dataFileSheet);
            Path path = Paths.get("src/test/resources", dataFileSheet);
            InputStream stream = new FileInputStream(path.toFile());
            workbook = new XSSFWorkbook(stream);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Object[]> getDataFromSheet(String sheetName) {

        Sheet sheet =workbook.getSheet(sheetName);
        Iterator<Row> rowIterator =sheet.rowIterator();
        rowIterator.next(); //skip the first row that gas headings

        while (rowIterator.hasNext()){
            List<Object>cellData =new ArrayList<>();
            Row row =rowIterator.next();
            Iterator<Cell> cellIterator =row.cellIterator();

            while (cellIterator.hasNext()){
                Cell cell =cellIterator.next();

                if (cell.getCellType()== CellType.STRING){
                    cellData.add(cell.getStringCellValue());
                }
                if (cell.getCellType()== CellType.NUMERIC){
                    cellData.add(cell.getNumericCellValue());
                }
                if (cell.getCellType()== CellType.BOOLEAN){
                    cellData.add(cell.getBooleanCellValue());
                }
            }
            data.add(cellData.toArray());
        }
        return data;
    }

    @DataProvider
    public Iterator<Object[]> loginProvider(){
        return getDataFromSheet("Login").iterator();
    }

    @DataProvider
    public Iterator<Object[]> generalInfoProvider(){
        return getDataFromSheet("GeneralInfo").iterator();
    }
}