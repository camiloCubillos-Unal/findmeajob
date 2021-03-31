
package findmeajob;

import findmeajob.scrappers.ComputrabajoScrapper;
import findmeajob.scrappers.Scrapper;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import findmeajob.supportTools.SupportTools;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

   
public class FindMeAJob {
    
    public static void main(String[] args) throws IOException{
        
        SupportTools supportTools = new SupportTools();
        ComputrabajoScrapper cpScrapper = new ComputrabajoScrapper("panadero", "bogota dc");
        
        ArrayList<List> offersData = cpScrapper.scrappingAll();
        System.out.println(offersData.size());
        supportTools.printTable(offersData);
        
    }
}
    