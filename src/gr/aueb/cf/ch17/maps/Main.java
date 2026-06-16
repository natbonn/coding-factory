package gr.aueb.cf.ch17.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // add & update
        map.put("GR", "Greece");
        map.put("USA", "United States");
        map.put("GR", "Germany");        // update

        // get
        String country = map.get("GR");
        System.out.println(country);

        // Remove
        map.remove("USA");

        // traverse
        map.forEach ((k, v) -> System.out.println(k + " = " + v));

    }
}
