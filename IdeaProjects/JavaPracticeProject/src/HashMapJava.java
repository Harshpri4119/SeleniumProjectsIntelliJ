import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
    public static void main(String args[]) {
        HashMap<String, Integer> countryInfo = new HashMap<>();
        // Insert Data in Map
        countryInfo.put("Harsha Vardhan", 11159019);
        countryInfo.put("Priya", 11159041);
        countryInfo.put("Deeptha", 11159045);
        countryInfo.put("Pavan", 11159034);

        System.out.println(countryInfo);

        // Search Data in Map
        if (countryInfo.containsKey("Priya")) {
            System.out.println(countryInfo.get("Priya"));
            System.out.println(" Key is Present in the Data");
        } else {
            System.out.println(countryInfo.get("Priya"));
            System.out.println(" Key is not Present in the Data");
        }

        // Map Iterate through LOOP
        for (Map.Entry<String, Integer> data : countryInfo.entrySet()) {
            System.out.println(data.getKey());
            System.out.println(data.getValue());
        }

        // Remove Data in Map
        countryInfo.remove("Pavan");
        System.out.println(countryInfo);
    }
}