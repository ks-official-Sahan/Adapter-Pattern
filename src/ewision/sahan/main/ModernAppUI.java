package ewision.sahan.main;

import ewision.sahan.architecture.AppServer;
import ewision.sahan.model.JSON_Data;

/**
 *
 * @author ksoff
 */

public class ModernAppUI {
// public class ModernAppUI implements AppServer { // Can't handle without an adapter (using adapter design pattern) // so we use an adapter to implement AppServer and parse this object to the adapter.

    public void displayData(JSON_Data jsonData) {
        System.out.println("Using JSON base Data");
    }

}
