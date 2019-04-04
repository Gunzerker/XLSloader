
import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author houss
 */
public class Reader {
    
    public void gets(String ch) throws IOException, BiffException{
        File f=new File(ch);
        Workbook wb=Workbook.getWorkbook(f);
        Sheet s=wb.getSheet(0);
        int row=s.getRows();
        int col=s.getColumns();
        for(int i=1;i<row;i++){
            for(int j=0;j<col;j++){
                Cell c=s.getCell(j,i);
                System.out.println(c.getContents());
            }
            System.out.println();
        }
    }
}
