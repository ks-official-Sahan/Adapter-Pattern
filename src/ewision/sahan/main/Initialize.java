package ewision.sahan.main;

import ewision.sahan.adapters.ModernUIAdapter;
import ewision.sahan.architecture.AppServer;
import ewision.sahan.model.XML_Data;

/**
 *
 * @author ksoff
 */
public class Initialize {

    public void init() {
        AppServer legacyUI = new LegacyAppUI();
        legacyUI.DisplayData(new XML_Data());
        
        AppServer modernUI = new ModernUIAdapter(new ModernAppUI());
        modernUI.DisplayData(new XML_Data());
    }
    
}
