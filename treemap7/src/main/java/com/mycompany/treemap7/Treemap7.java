/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.treemap7;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author ViP
 */
public class Treemap7 {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Associate value with key in a TreeMap");
            System.out.println("2. Copy TreeMap's content to another TreeMap");
            System.out.println("3. Search for a key in a TreeMap");
            System.out.println("4. Search for a value in a TreeMap");
            System.out.println("5. Get all keys from a TreeMap");
            System.out.println("6. Delete all elements from a TreeMap");
            System.out.println("7. Sort keys in a TreeMap by using a comparator");
            System.out.println("8. Get key-value mapping associated with greatest and least key");
            System.out.println("9. Get first and last key in a TreeMap");
            System.out.println("10. Get reverse order view of keys");
            System.out.println("11. Get key-value mapping associated with greatest key less than or equal");
            System.out.println("12. Get greatest key less than or equal");
            System.out.println("13. Get portion of map whose keys are strictly less than a given key");
            System.out.println("14. Get portion of map whose keys are less than or equal to a given key");
            System.out.println("15. Get least key strictly greater than the given key");
            System.out.println("16. Get key-value mapping associated with greatest key strictly less than");
            System.out.println("17. Get greatest key strictly less than");
            System.out.println("18. Get NavigableSet view of keys");
            System.out.println("19. Remove and get key-value mapping associated with least key");
            System.out.println("20. Remove and get key-value mapping associated with greatest key");
            System.out.println("21. Get portion of map whose keys range from a given key to another key");
            System.out.println("22. Get portion of map whose keys range from a given key to another key (exclusive)");
            System.out.println("23. Get portion of map whose keys are greater than or equal to a given key");
            System.out.println("24. Get portion of map whose keys are greater than a given key");
            System.out.println("25. Get key-value mapping associated with least key greater than or equal");
            System.out.println("26. Get least key greater than or equal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    associateKeyValue(treeMap);
                    break;

                case 2:
                    System.out.println("Copying TreeMap's content to another TreeMap:");
                    //TreeMap<Integer, String> anotherTreeMap = createAnotherTreeMap();
                    //copyTreeMapContent(treeMap, anotherTreeMap);
                    break;

                case 3:
                    searchForKey(treeMap);
                    break;

                case 4:
                    searchForValue(treeMap);
                    break;

                case 5:
                    getAllKeys(treeMap);
                    break;

                case 6:
                    deleteAllElements(treeMap);
                    break;

                case 7:
                    sortKeysByComparator(treeMap);
                    break;

                case 8:
                    getKeyValuesForGreatestAndLeastKey(treeMap);
                    break;

                case 9:
                    getFirstAndLastKey(treeMap);
                    break;

                case 10:
                    getReverseOrderView(treeMap);
                    break;

                case 11:
                    getKeyValuesForGreatestKeyLessThanOrEqual(treeMap);
                    break;

                case 12:
                    getGreatestKeyLessThanOrEqual(treeMap);
                    break;

                case 13:
                    getPortionOfMapStrictlyLessThan(treeMap);
                    break;

                case 14:
                    getPortionOfMapLessThanOrEqual(treeMap);
                    break;

                case 15:
                    getLeastKeyStrictlyGreaterThan(treeMap);
                    break;

                case 16:
                    getKeyValueForGreatestKeyStrictlyLessThan(treeMap);
                    break;

                case 17:
                    getGreatestKeyStrictlyLessThan(treeMap);
                    break;

                case 18:
                    getNavigableSetView(treeMap);
                    break;

                case 19:
                    removeAndGetKeyValueForLeastKey(treeMap);
                    break;

                case 20:
                    removeAndGetKeyValueForGreatestKey(treeMap);
                    break;

                case 21:
                    getPortionOfMapInRange(treeMap, true);
                    break;

                case 22:
                    getPortionOfMapInRange(treeMap, false);
                    break;

                case 23:
                    getPortionOfMapGreaterThanOrEqual(treeMap);
                    break;

                case 24:
                    getPortionOfMapGreaterThan(treeMap);
                    break;

                case 25:
                    getKeyValueForLeastKeyGreaterThanOrEqual(treeMap);
                    break;

                case 26:
                    getLeastKeyGreaterThanOrEqual(treeMap);
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

    private static void associateKeyValue(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key (Integer): ");
        int key = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter value (String): ");
        String value = scanner.nextLine();
        treeMap.put(key, value);
        System.out.println("Value '" + value + "' associated with key '" + key + "' in the TreeMap.");
    }

    private static void copyTreeMapContent(TreeMap<Integer, String> sourceMap, TreeMap<Integer, String> targetMap) {
        targetMap.putAll(sourceMap);
        System.out.println("TreeMap content copied successfully. Target TreeMap: " + targetMap);
    }

    private static void searchForKey(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to search: ");
        int keyToSearch = scanner.nextInt();
        boolean containsKey = treeMap.containsKey(keyToSearch);
        System.out.println("Does the TreeMap contain the key '" + keyToSearch + "'? " + containsKey);
    }

    private static void searchForValue(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        String valueToSearch = scanner.nextLine();
        boolean containsValue = treeMap.containsValue(valueToSearch);
        System.out.println("Does the TreeMap contain the value '" + valueToSearch + "'? " + containsValue);
    }

    private static void getAllKeys(TreeMap<Integer, String> treeMap) {
        Set<Integer> keys = treeMap.keySet();
        System.out.println("All keys in the TreeMap: " + keys);
    }

    private static void deleteAllElements(TreeMap<Integer, String> treeMap) {
        treeMap.clear();
        System.out.println("All elements removed from the TreeMap.");
    }

    private static void sortKeysByComparator(TreeMap<Integer, String> treeMap) {
        Comparator<Integer> comparator = Collections.reverseOrder();
        TreeMap<Integer, String> sortedTreeMap = new TreeMap<>(comparator);
        sortedTreeMap.putAll(treeMap);
        System.out.println("TreeMap sorted by keys in descending order: " + sortedTreeMap);
    }

    private static void getKeyValuesForGreatestAndLeastKey(TreeMap<Integer, String> treeMap) {
        Integer leastKey = treeMap.firstKey();
        Integer greatestKey = treeMap.lastKey();
        String leastValue = treeMap.get(leastKey);
        String greatestValue = treeMap.get(greatestKey);

        System.out.println("Key-value mapping associated with the least key (" + leastKey + "): " + leastValue);
        System.out.println("Key-value mapping associated with the greatest key (" + greatestKey + "): " + greatestValue);
    }

    private static void getFirstAndLastKey(TreeMap<Integer, String> treeMap) {
        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();
        System.out.println("First key in the TreeMap: " + firstKey);
        System.out.println("Last key in the TreeMap: " + lastKey);
    }

    private static void getReverseOrderView(TreeMap<Integer, String> treeMap) {
        NavigableSet<Integer> reverseOrderKeys = treeMap.descendingKeySet();
        System.out.println("Reverse order view of keys: " + reverseOrderKeys);
    }

    private static void getKeyValuesForGreatestKeyLessThanOrEqual(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to find mapping: ");
        int keyToFind = scanner.nextInt();
        Map.Entry<Integer, String> entry = treeMap.floorEntry(keyToFind);

        if (entry != null) {
            System.out.println("Key-value mapping associated with the greatest key less than or equal to "
                    + keyToFind + ": " + entry);
        } else {
            System.out.println("No mapping found for the given key.");
        }
    }

    private static void getGreatestKeyLessThanOrEqual(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to find greatest key less than or equal to: ");
        int keyToFind = scanner.nextInt();
        Integer greatestKeyLessThanOrEqual = treeMap.floorKey(keyToFind);

        if (greatestKeyLessThanOrEqual != null) {
            System.out.println("Greatest key less than or equal to " + keyToFind + ": " + greatestKeyLessThanOrEqual);
        } else {
            System.out.println("No key found less than or equal to the given key.");
        }
    }

    private static void getPortionOfMapStrictlyLessThan(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to get portion strictly less than: ");
        int key = scanner.nextInt();
        SortedMap<Integer, String> portionMap = treeMap.headMap(key);
        System.out.println("Portion of map whose keys are strictly less than " + key + ": " + portionMap);
    }

    private static void getPortionOfMapLessThanOrEqual(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key to get portion less than or equal to: ");
        int key = scanner.nextInt();
        SortedMap<Integer, String> portionMap = treeMap.headMap(key, true);
        System.out.println("Portion of map whose keys are less than or equal to " + key + ": " + portionMap);
    }

    private static void getLeastKeyGreaterThanOrEqualTo(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();
        Integer leastKey = treeMap.ceilingKey(givenKey);

        if (leastKey != null) {
            System.out.println("Least key greater than or equal to " + givenKey + ": " + leastKey);
        } else {
            System.out.println("No such key found.");
        }
    }

    private static void getLeastKeyStrictlyGreaterThan(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        Integer leastKey = treeMap.higherKey(givenKey);

        if (leastKey != null) {
            System.out.println("Least key strictly greater than " + givenKey + ": " + leastKey);
        } else {
            System.out.println("No such key found.");
        }
    }

    private static void getKeyValueForGreatestKeyStrictlyLessThan(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        Map.Entry<Integer, String> entry = treeMap.lowerEntry(givenKey);

        if (entry != null) {
            System.out.println("Key-Value mapping for the greatest key strictly less than " + givenKey + ": " + entry);
        } else {
            System.out.println("No such key found.");
        }
    }

    private static void getGreatestKeyStrictlyLessThan(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        Integer greatestKey = treeMap.lowerKey(givenKey);

        if (greatestKey != null) {
            System.out.println("Greatest key strictly less than " + givenKey + ": " + greatestKey);
        } else {
            System.out.println("No such key found.");
        }
    }

    private static void getNavigableSetView(TreeMap<Integer, String> treeMap) {
        NavigableSet<Integer> navigableSet = treeMap.navigableKeySet();
        System.out.println("NavigableSet view of keys in the map: " + navigableSet);
    }

    private static void removeAndGetKeyValueForLeastKey(TreeMap<Integer, String> treeMap) {
        Map.Entry<Integer, String> entry = treeMap.pollFirstEntry();

        if (entry != null) {
            System.out.println("Removed and retrieved key-value mapping for the least key: " + entry);
        } else {
            System.out.println("The map is empty.");
        }
    }

    private static void removeAndGetKeyValueForGreatestKey(TreeMap<Integer, String> treeMap) {
        Map.Entry<Integer, String> entry = treeMap.pollLastEntry();

        if (entry != null) {
            System.out.println("Removed and retrieved key-value mapping for the greatest key: " + entry);
        } else {
            System.out.println("The map is empty.");
        }
    }

    private static void getPortionOfMapInRange(TreeMap<Integer, String> treeMap, boolean inclusive) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start key: ");
        int startKey = scanner.nextInt();
        System.out.print("Enter end key: ");
        int endKey = scanner.nextInt();

        NavigableMap<Integer, String> portionMap = inclusive
                ? treeMap.subMap(startKey, true, endKey, false)
                : treeMap.subMap(startKey, false, endKey, false);

        System.out.println("Portion of the map in the specified range: " + portionMap);
    }

    private static void getPortionOfMapGreaterThanOrEqual(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        NavigableMap<Integer, String> portionMap = treeMap.tailMap(givenKey, true);

        System.out.println("Portion of the map whose keys are greater than or equal to " + givenKey + ": " + portionMap);
    }

    private static void getPortionOfMapGreaterThan(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        NavigableMap<Integer, String> portionMap = treeMap.tailMap(givenKey, false);

        System.out.println("Portion of the map whose keys are greater than " + givenKey + ": " + portionMap);
    }

    private static void getKeyValueForLeastKeyGreaterThanOrEqual(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        Map.Entry<Integer, String> entry = treeMap.ceilingEntry(givenKey);

        if (entry != null) {
            System.out.println("Key-Value mapping for the least key greater than or equal to " + givenKey + ": " + entry);
        } else {
            System.out.println("No such key found.");
        }
    }

    private static void getLeastKeyGreaterThanOrEqual(TreeMap<Integer, String> treeMap) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter key: ");
        int givenKey = scanner.nextInt();

        Integer leastKey = treeMap.ceilingKey(givenKey);

        if (leastKey != null) {
            System.out.println("Least key greater than or equal to " + givenKey + ": " + leastKey);
        } else {
            System.out.println("No such key found.");
        }
    }


}
