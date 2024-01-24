/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ViP
 */
public class Arraylist1 {

    private static ArrayList<String> colors = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice (0 to exit): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAndPrintArrayList();
                    break;
                case 2:
                    iterateThroughArrayList();
                    break;
                case 3:
                    insertElementAtFirstPosition();
                    break;
                case 4:
                    retrieveElementAtIndex();
                    break;
                case 5:
                    updateArrayElement();
                    break;
                case 6:
                    removeThirdElement();
                    break;
                case 7:
                    searchForElement();
                    break;
                case 8:
                    sortArrayList();
                    break;
                case 9:
                    copyArrayList();
                    break;
                case 10:
                    shuffleArrayList();
                    break;
                case 11:
                    reverseArrayList();
                    break;
                case 12:
                    extractPortionOfArrayList();
                    break;
                case 13:
                    compareArrayLists();
                    break;
                case 14:
                    swapElements();
                    break;
                case 15:
                    joinArrayLists();
                    break;
                case 16:
                    cloneArrayList();
                    break;
                case 17:
                    emptyArrayList();
                    break;
                case 18:
                    testArrayListEmpty();
                    break;
                case 19:
                    trimArrayListCapacity();
                    break;
                case 20:
                    increaseArrayListSize();
                    break;
                case 21:
                    replaceSecondElement();
                    break;
                case 22:
                    printElementsByPosition();
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Invalid choice. Please try again.");
                    }
            }
        } while (choice != 0);

        System.out.println("Exiting the program. Goodbye!");
    }

    private static void displayMenu() {
        System.out.println("\n----- ArrayList Operations Menu -----");
        System.out.println("1. Create and print ArrayList");
        System.out.println("2. Iterate through ArrayList");
        System.out.println("3. Insert element at first position");
        System.out.println("4. Retrieve element at specified index");
        System.out.println("5. Update array element");
        System.out.println("6. Remove third element");
        System.out.println("7. Search for an element");
        System.out.println("8. Sort ArrayList");
        System.out.println("9. Copy ArrayList");
        System.out.println("10. Shuffle ArrayList");
        System.out.println("11. Reverse ArrayList");
        System.out.println("12. Extract a portion of ArrayList");
        System.out.println("13. Compare two ArrayLists");
        System.out.println("14. Swap two elements");
        System.out.println("15. Join two ArrayLists");
        System.out.println("16. Clone ArrayList");
        System.out.println("17. Empty ArrayList");
        System.out.println("18. Test if ArrayList is empty");
        System.out.println("19. Trim ArrayList capacity");
        System.out.println("20. Increase ArrayList size");
        System.out.println("21. Replace the second element");
        System.out.println("22. Print all elements using their positions");
        System.out.println("0. Exit");
    }

    private static void createAndPrintArrayList() {
        colors.clear(); // Clear the ArrayList before creating a new one
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("ArrayList created and elements added: " + colors);
    }

    private static void iterateThroughArrayList() {
        System.out.println("Iterating through all elements in the ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }

    private static void insertElementAtFirstPosition() {
        System.out.print("Enter the element to insert at the first position: ");
        String newColor = scanner.nextLine();
        colors.add(0, newColor);

        System.out.println("Element inserted at the first position. Updated ArrayList: " + colors);
    }

    private static void retrieveElementAtIndex() {
        System.out.print("Enter the index to retrieve element: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < colors.size()) {
            String element = colors.get(index);
            System.out.println("Element at index " + index + ": " + element);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (colors.size() - 1));
        }
    }

    private static void updateArrayElement() {
        System.out.print("Enter the index to update element: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (index >= 0 && index < colors.size()) {
            System.out.print("Enter the new element: ");
            String newElement = scanner.nextLine();
            colors.set(index, newElement);
            System.out.println("Element at index " + index + " updated. Updated ArrayList: " + colors);
        } else {
            System.out.println("Invalid index. Index should be between 0 and " + (colors.size() - 1));
        }
    }

    private static void removeThirdElement() {
        if (colors.size() >= 3) {
            colors.remove(2);
            System.out.println("Third element removed. Updated ArrayList: " + colors);
        } else {
            System.out.println("ArrayList does not have a third element to remove.");
        }
    }

    private static void searchForElement() {
        System.out.print("Enter the element to search: ");
        String searchElement = scanner.nextLine();

        if (colors.contains(searchElement)) {
            System.out.println(searchElement + " found in the ArrayList.");
        } else {
            System.out.println(searchElement + " not found in the ArrayList.");
        }
    }

    private static void sortArrayList() {
        Collections.sort(colors);
        System.out.println("ArrayList sorted in ascending order: " + colors);
    }

    private static void copyArrayList() {
        ArrayList<String> copyColors = new ArrayList<>(colors);
        System.out.println("ArrayList copied to another ArrayList: " + copyColors);
    }

    private static void shuffleArrayList() {
        Collections.shuffle(colors);
        System.out.println("ArrayList elements shuffled: " + colors);
    }

    private static void reverseArrayList() {
        Collections.reverse(colors);
        System.out.println("ArrayList elements reversed: " + colors);
    }

    private static void extractPortionOfArrayList() {
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        if (startIndex >= 0 && endIndex < colors.size() && startIndex <= endIndex) {
            ArrayList<String> subList = new ArrayList<>(colors.subList(startIndex, endIndex + 1));
            System.out.println("Extracted portion of ArrayList: " + subList);
        } else {
            System.out.println("Invalid start or end index.");
        }
    }

    private static void compareArrayLists() {
        ArrayList<String> compareList = new ArrayList<>();
        compareList.add("Red");
        compareList.add("Green");
        compareList.add("Blue");

        if (colors.equals(compareList)) {
            System.out.println("ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are not equal.");
        }
    }

    private static void swapElements() {
        System.out.print("Enter index of the first element to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter index of the second element to swap: ");
        int index2 = scanner.nextInt();

        if (index1 >= 0 && index1 < colors.size() && index2 >= 0 && index2 < colors.size()) {
            Collections.swap(colors, index1, index2);
            System.out.println("Elements swapped. Updated ArrayList: " + colors);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    private static void joinArrayLists() {
        ArrayList<String> secondArrayList = new ArrayList<>();
        secondArrayList.add("Yellow");
        secondArrayList.add("Orange");

        colors.addAll(secondArrayList);
        System.out.println("ArrayLists joined. Updated ArrayList: " + colors);
    }

    private static void cloneArrayList() {
        ArrayList<String> clonedList = (ArrayList<String>) colors.clone();
        System.out.println("ArrayList cloned to another ArrayList: " + clonedList);
    }

    private static void emptyArrayList() {
        colors.clear();
        System.out.println("ArrayList emptied. Updated ArrayList: " + colors);
    }

    private static void testArrayListEmpty() {
        if (colors.isEmpty()) {
            System.out.println("ArrayList is empty.");
        } else {
            System.out.println("ArrayList is not empty.");
        }
    }

    private static void trimArrayListCapacity() {
        colors.trimToSize();
        System.out.println("ArrayList capacity trimmed to its current size.");
    }

    private static void increaseArrayListSize() {
        System.out.print("Enter the new size to increase ArrayList: ");
        int newSize = scanner.nextInt();
        colors.ensureCapacity(newSize);
        System.out.println("ArrayList size increased to " + newSize);
    }

    private static void replaceSecondElement() {
        if (colors.size() >= 2) {
            System.out.print("Enter the new element to replace the second element: ");
            String newElement = scanner.nextLine();
            colors.set(1, newElement);
            System.out.println("Second element replaced. Updated ArrayList: " + colors);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }
    }

    private static void printElementsByPosition() {
        System.out.println("Printing all elements of ArrayList using their positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Position " + i + ": " + colors.get(i));
        }
    }

}
