package ewision.sahan.main;

import ewision.sahan.architecture.AppServer;
import ewision.sahan.model.XML_Data;

/**
 *
 * @author ksoff
 */
public class LegacyAppUI implements AppServer {

    @Override
    public void DisplayData(XML_Data xmlData) {
        System.out.println("Using XML base Data");
    }
    
}
