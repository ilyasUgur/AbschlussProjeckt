package utilies;

import org.apache.poi.ss.usermodel.*;
import org.apache.xmlbeans.impl.common.SAXHelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExelQuel {

    public static List<List<String>> exelData(String path, String sheetName, int ColumnSize) {

        List<List<String>> rückgabeList = new ArrayList<List<String>>();
        List<String> rowlist = new ArrayList<String>();

        Workbook workbook = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        Sheet sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getPhysicalNumberOfRows();



        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);

            int cellCount = row.getPhysicalNumberOfCells();
            if (ColumnSize > cellCount) {
                ColumnSize = cellCount;
            }
            for (int j = 0; j < cellCount; j++) {
                rowlist.add(row.getCell(j).toString());
            }
            rückgabeList.add(rowlist);
        }

        return rückgabeList;
    }
//todo exel kod bloguna tekrar bak.....
}
