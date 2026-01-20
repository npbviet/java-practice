package Day20_1.Map;

import java.util.*;

public class ByAge1 {
    public static void main(String[] args) {
        Map<String, Integer> ages = new TreeMap<>();

        ages.put("Allison", 18);
        ages.put("Benson", 48);
        ages.put("David", 20);
        ages.put("Erik", 20);
        ages.put("Galen", 15);
        ages.put("Grace", 25);
        ages.put("Helene", 40);
        ages.put("Janette", 18);
        ages.put("Jessica", 35);
        ages.put("Marty", 35);
        ages.put("Paul", 28);
        ages.put("Sara", 15);
        ages.put("Stuart", 98);
        ages.put("Tyler", 6);
        ages.put("Zack", 20);

        System.out.println(byAge(ages, 16, 25));
    }

    public static TreeMap<Integer, String> byAge(Map<String, Integer> ages, int min, int max) {
        TreeMap<Integer, String> result = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            if (age >= min && age <= max) {
                if (!result.containsKey(age)) {
                    result.put(age, name);
                }
                else {
                    String existingNames = result.get(age);
                    result.put(age, existingNames + " and " + name);
                }
            }
        }
        return result;
    }
}