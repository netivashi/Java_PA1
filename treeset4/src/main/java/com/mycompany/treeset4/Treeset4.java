/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.treeset4;

import java.util.TreeSet;
import java.util.Scanner;

/**
 *
 * @author ViP
 */
public class Treeset4 {

    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create a tree set and add colors");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Add all elements to another tree set");
            System.out.println("4. Create a reverse order view");
            System.out.println("5. Get first and last elements");
            System.out.println("6. Clone the tree set to another tree set");
            System.out.println("7. Get the number of elements");
            System.out.println("8. Compare two tree sets");
            System.out.println("9. Find numbers less than 7");
            System.out.println("10. Get element greater than or equal to given element");
            System.out.println("11. Get element less than or equal to given element");
            System.out.println("12. Get element strictly greater than or equal to given element");
            System.out.println("13. Get element with lower value than given element");
            System.out.println("14. Retrieve and remove the first element");
            System.out.println("15. Retrieve and remove the last element");
            System.out.println("16. Remove a given element");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createTreeSet(treeSet);
                    break;

                case 2:
                    System.out.println("Iterating through all elements:");
                    iterateTreeSet(treeSet);
                    break;

                case 3:
                    System.out.println("Adding all elements to another tree set:");
                    TreeSet<String> anotherTreeSet = createAnotherTreeSet();
                    addAllElements(treeSet, anotherTreeSet);
                    break;

                case 4:
                    System.out.println("Creating a reverse order view:");
                    createReverseOrderView(treeSet);
                    break;

                case 5:
                    getFirstAndLastElements(treeSet);
                    break;

                case 6:
                    System.out.println("Cloning the tree set to another tree set:");
                    TreeSet<String> clonedTreeSet = cloneTreeSet(treeSet);
                    System.out.println("Cloned Tree Set: " + clonedTreeSet);
                    break;

                case 7:
                    System.out.println("Number of elements in the tree set: " + getNumberOfElements(treeSet));
                    break;

                case 8:
                    System.out.println("Comparing two tree sets:");
                    TreeSet<String> secondTreeSet = createSecondTreeSet();
                    compareTreeSets(treeSet, secondTreeSet);
                    break;

                case 9:
                    System.out.println("Finding numbers less than 7:");
                    findNumbersLessThanSeven(treeSet);
                    break;

                case 10:
                    System.out.print("Enter a value: ");
                    String valueGE = scanner.nextLine();
                    getElementGreaterThanOrEqual(treeSet, valueGE);
                    break;

                case 11:
                    System.out.print("Enter a value: ");
                    String valueLE = scanner.nextLine();
                    getElementLessThanOrEqual(treeSet, valueLE);
                    break;

                case 12:
                    System.out.print("Enter a value: ");
                    String valueSGE = scanner.nextLine();
                    getElementStrictlyGreaterThanOrEqual(treeSet, valueSGE);
                    break;

                case 13:
                    System.out.print("Enter a value: ");
                    String valueLower = scanner.nextLine();
                    getElementWithLowerValue(treeSet, valueLower);
                    break;

                case 14:
                    retrieveAndRemoveFirstElement(treeSet);
                    break;

                case 15:
                    retrieveAndRemoveLastElement(treeSet);
                    break;

                case 16:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    removeElement(treeSet, elementToRemove);
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
    private static void createTreeSet(TreeSet<String> treeSet) {
        treeSet.add("Red");
        treeSet.add("Green");
        treeSet.add("Blue");
        treeSet.add("Yellow");
        System.out.println("Tree Set created with colors: " + treeSet);
    }

    //2
    private static void iterateTreeSet(TreeSet<String> treeSet) {
        for (String color : treeSet) {
            System.out.println(color);
        }
    }

    //3
    private static void addAllElements(TreeSet<String> treeSet, TreeSet<String> anotherTreeSet) {
        treeSet.addAll(anotherTreeSet);
        System.out.println("Updated Tree Set: " + treeSet);
    }

    //4
    private static void createReverseOrderView(TreeSet<String> treeSet) {
        TreeSet<String> reverseOrderView = new TreeSet<>(treeSet.descendingSet());
        System.out.println("Reverse Order View: " + reverseOrderView);
    }

    //5
    private static void getFirstAndLastElements(TreeSet<String> treeSet) {
        String firstElement = treeSet.first();
        String lastElement = treeSet.last();
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }

    //6
    private static TreeSet<String> cloneTreeSet(TreeSet<String> treeSet) {
        return new TreeSet<>(treeSet);
    }

    //7
    private static int getNumberOfElements(TreeSet<String> treeSet) {
        return treeSet.size();
    }

    //8
    private static void compareTreeSets(TreeSet<String> treeSet1, TreeSet<String> treeSet2) {
        boolean isEqual = treeSet1.equals(treeSet2);
        System.out.println("Tree Set 1 is equal to Tree Set 2: " + isEqual);
    }

    //9
    private static void findNumbersLessThanSeven(TreeSet<String> treeSet) {
        TreeSet<String> numbersLessThanSeven = new TreeSet<>(treeSet.headSet("7"));
        System.out.println("Numbers less than 7: " + numbersLessThanSeven);
    }

    //10
    private static void getElementGreaterThanOrEqual(TreeSet<String> treeSet, String value) {
        String greaterThanOrEqual = treeSet.ceiling(value);
        System.out.println("Element greater than or equal to " + value + ": " + greaterThanOrEqual);
    }

    //11
    private static void getElementLessThanOrEqual(TreeSet<String> treeSet, String value) {
        String lessThanOrEqual = treeSet.floor(value);
        System.out.println("Element less than or equal to " + value + ": " + lessThanOrEqual);
    }

    //12 
    private static void getElementStrictlyGreaterThanOrEqual(TreeSet<String> treeSet, String value) {
        String strictlyGreaterThanOrEqual = treeSet.higher(value);
        System.out.println("Element strictly greater than or equal to " + value + ": " + strictlyGreaterThanOrEqual);
    }

    //13
    private static void getElementWithLowerValue(TreeSet<String> treeSet, String value) {
        String lowerValue = treeSet.lower(value);
        System.out.println("Element with lower value than " + value + ": " + lowerValue);
    }

    //14
    private static void retrieveAndRemoveFirstElement(TreeSet<String> treeSet) {
        String firstElement = treeSet.pollFirst();
        System.out.println("Retrieved and removed first element: " + firstElement);
        System.out.println("Updated Tree Set: " + treeSet);
    }

    //15
    private static void retrieveAndRemoveLastElement(TreeSet<String> treeSet) {
        String lastElement = treeSet.pollLast();
        System.out.println("Retrieved and removed last element: " + lastElement);
        System.out.println("Updated Tree Set: " + treeSet);
    }

    //16
    private static void removeElement(TreeSet<String> treeSet, String elementToRemove) {
        boolean removed = treeSet.remove(elementToRemove);
        if (removed) {
            System.out.println("Element '" + elementToRemove + "' removed successfully.");
            System.out.println("Updated Tree Set: " + treeSet);
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the tree set.");
        }
    }

    //
    // Utility function to create another tree set for testing
    private static TreeSet<String> createAnotherTreeSet() {
        TreeSet<String> anotherTreeSet = new TreeSet<>();
        anotherTreeSet.add("White");
        anotherTreeSet.add("Gray");
        anotherTreeSet.add("Brown");
        return anotherTreeSet;
    }
//// Utility function to create a second tree set for testing

    private static TreeSet<String> createSecondTreeSet() {
        TreeSet<String> secondTreeSet = new TreeSet<>();
        secondTreeSet.add("Purple");
        secondTreeSet.add("Orange");
        secondTreeSet.add("Black");
        return secondTreeSet;
    }

}
