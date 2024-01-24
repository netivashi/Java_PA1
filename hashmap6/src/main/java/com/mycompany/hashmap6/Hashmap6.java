/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hashmap6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author ViP
 */
public class Hashmap6 {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Associate value with key in a HashMap");
            System.out.println("2. Count the number of key-value mappings");
            System.out.println("3. Copy all mappings to another map");
            System.out.println("4. Remove all mappings");
            System.out.println("5. Check if the map is empty");
            System.out.println("6. Get a shallow copy of the HashMap");
            System.out.println("7. Test if the map contains a key");
            System.out.println("8. Test if the map contains a value");
            System.out.println("9. Create a set view of the mappings");
            System.out.println("10. Get the value of a specified key");
            System.out.println("11. Get a set view of the keys");
            System.out.println("12. Get a collection view of the values");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    associateKeyValue(hashMap);
                    break;

                case 2:
                    System.out.println("Number of key-value mappings: " + countMappings(hashMap));
                    break;

                case 3:
                    System.out.println("Copying all mappings to another map:");
                    Map<String, String> anotherMap = createAnotherMap();
                    copyMappings(hashMap, anotherMap);
                    break;

                case 4:
                    removeAllMappings(hashMap);
                    break;

                case 5:
                    checkIfEmpty(hashMap);
                    break;

                case 6:
                    getShallowCopy(hashMap);
                    break;

                case 7:
                    testContainsKey(hashMap);
                    break;

                case 8:
                    testContainsValue(hashMap);
                    break;

                case 9:
                    createSetView(hashMap);
                    break;

                case 10:
                    getValueForKey(hashMap);
                    break;

                case 11:
                    getSetViewOfKeys(hashMap);
                    break;

                case 12:
                    getCollectionViewOfValues(hashMap);
                    break;

                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
    //1
    private static void associateKeyValue(Map<String, String> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        String key = scanner.nextLine();
        System.out.print("Enter value: ");
        String value = scanner.nextLine();
        hashMap.put(key, value);
        System.out.println("Value '" + value + "' associated with key '" + key + "' in the HashMap.");
    }
    //2
    private static int countMappings(Map<String, String> hashMap) {
        return hashMap.size();
    }
    //3 
    private static void copyMappings(Map<String, String> sourceMap, Map<String, String> targetMap) {
        targetMap.putAll(sourceMap);
        System.out.println("Mappings copied successfully. Target Map: " + targetMap);
    }
    //4
    private static void removeAllMappings(Map<String, String> hashMap) {
        hashMap.clear();
        System.out.println("All mappings removed from the map.");
    }
    //5
    private static void checkIfEmpty(Map<String, String> hashMap) {
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);
    }
    //6
    private static void getShallowCopy(Map<String, String> hashMap) {
        Map<String, String> shallowCopy = new HashMap<>(hashMap);
        System.out.println("Shallow copy of the HashMap: " + shallowCopy);
    }
    //7
    private static void testContainsKey(Map<String, String> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to test: ");
        String keyToTest = scanner.nextLine();
        boolean containsKey = hashMap.containsKey(keyToTest);
        System.out.println("Does the map contain the key '" + keyToTest + "'? " + containsKey);
    }
    //8
    private static void testContainsValue(Map<String, String> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to test: ");
        String valueToTest = scanner.nextLine();
        boolean containsValue = hashMap.containsValue(valueToTest);
        System.out.println("Does the map contain the value '" + valueToTest + "'? " + containsValue);
    }
    //9
    private static void createSetView(Map<String, String> hashMap) {
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        System.out.println("Set view of mappings: " + entrySet);
    }
    //10
    private static void getValueForKey(Map<String, String> hashMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to get value: ");
        String keyToGet = scanner.nextLine();
        String value = hashMap.get(keyToGet);
        System.out.println("Value for key '" + keyToGet + "': " + value);
    }
    //11
    private static void getSetViewOfKeys(Map<String, String> hashMap) {
        Set<String> keySet = hashMap.keySet();
        System.out.println("Set view of keys: " + keySet);
    }
    //12
    private static void getCollectionViewOfValues(Map<String, String> hashMap) {
        Collection<String> values = hashMap.values();
        System.out.println("Collection view of values: " + values);
    }

    // Utility function to create another map for testing
    private static Map<String, String> createAnotherMap() {
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("City", "New York");
        anotherMap.put("Country", "USA");
        anotherMap.put("Continent", "North America");
        return anotherMap;
    }
    

}
