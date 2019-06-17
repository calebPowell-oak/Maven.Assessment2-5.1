package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    private Map<String, Integer> inv;

    public Inventory(List<String> strings) {
         inv = new HashMap<>(0);
        for (String s : strings){
            inv.put(s, 0);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        inv = new HashMap<>(0);
        inv.put("", 0);
        inv.put("Lamp", 0);
        inv.put("Shade", 0);
        inv.put("Lightbulb", 0);
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        inv.replace(item, inv.get(item)+1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        inv.replace(item, inv.get(item)-1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return inv.get(item);
    }
}
