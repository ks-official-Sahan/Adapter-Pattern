package ewision.sahan.adapters;

import ewision.sahan.architecture.AppServer;
import ewision.sahan.main.ModernAppUI;
import ewision.sahan.model.JSON_Data;
import ewision.sahan.model.XML_Data;

/**
 *
 * @author ksoff
 */
public class ModernUIAdapter implements AppServer {

    private final ModernAppUI modernAppUI;

    public ModernUIAdapter(ModernAppUI modernAppUI) {
        this.modernAppUI = modernAppUI;
    }
    
    @Override
    public void DisplayData(XML_Data xmlData) {
        JSON_Data jsonData = converter(xmlData);
        modernAppUI.displayData(jsonData);
    }
    
    private JSON_Data converter(XML_Data xmlData) {
        // business logic
        return new JSON_Data();
    }
    
}
