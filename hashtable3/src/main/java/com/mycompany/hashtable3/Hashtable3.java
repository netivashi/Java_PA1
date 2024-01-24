/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hashtable3;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author ViP
 */
public class Hashtable3 {

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
         int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Append element to the end");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Get the number of elements");
            System.out.println("4. Empty the hash set");
            System.out.println("5. Test if the hash set is empty");
            System.out.println("6. Clone the hash set to another hash set");
            System.out.println("7. Convert the hash set to an array");
            System.out.println("8. Convert the hash set to a tree set");
            System.out.println("9. Find numbers less than 7 in a tree set");
            System.out.println("10. Compare two hash sets");
            System.out.println("11. Compare two sets and retain common elements");
            System.out.println("12. Remove all elements");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter element to append to the end: ");
                    int element = scanner.nextInt();
                    hashSet.add(101);
                    hashSet.add(102);
                    hashSet.add(103);
                    hashSet.add(element);
                    break;

                case 2:
                    System.out.println("Iterating through all elements:");
                    iterateHashSet(hashSet);
                    break;

                case 3:
                    System.out.println("Number of elements in the hash set: " + getNumberOfElements(hashSet));
                    break;

                case 4:
                    System.out.println("Emptying the hash set:");
                    emptyHashSet(hashSet);
                    break;

                case 5:
                    System.out.println("Is the hash set empty: " + isHashSetEmpty(hashSet));
                    break;

                case 6:
                    System.out.println("Cloning the hash set to another hash set:");
                    Set<Integer> clonedHashSet = cloneHashSet(hashSet);
                    System.out.println("Cloned Hash Set: " + clonedHashSet);
                    break;

                case 7:
                    System.out.println("Converting the hash set to an array:");
                    Integer[] hashSetArray = convertHashSetToArray(hashSet);
                    System.out.println("Hash Set as Array: " + java.util.Arrays.toString(hashSetArray));
                    break;

                case 8:
                    System.out.println("Converting the hash set to a tree set:");
                    Set<Integer> treeSet = convertHashSetToTreeSet(hashSet);
                    System.out.println("Hash Set as Tree Set: " + treeSet);
                    break;

                case 9:
                    System.out.println("Finding numbers less than 7 in a tree set:");
                    findNumbersLessThanSeven(hashSet);
                    break;

                case 10:
                    System.out.println("Comparing two hash sets:");
                    Set<Integer> secondHashSet = createSecondHashSet();
                    compareHashSets(hashSet, secondHashSet);
                    break;

                case 11:
                    System.out.println("Comparing two sets and retaining common elements:");
                    Set<Integer> thirdHashSet = createThirdHashSet();
                    retainCommonElements(hashSet, thirdHashSet);
                    break;

                case 12:
                    System.out.println("Removing all elements from the hash set:");
                    removeAllElements(hashSet);
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
    
    //2
    private static void iterateHashSet(Set<Integer> hashSet) {
        for (Integer element : hashSet) {
            System.out.println(element);
        }
    }
    //3
    private static int getNumberOfElements(Set<Integer> hashSet) {
        return hashSet.size();
    }
    //4
    private static void emptyHashSet(Set<Integer> hashSet) {
        hashSet.clear();
        System.out.println("Hash set is now empty.");
    }
    //5
    private static boolean isHashSetEmpty(Set<Integer> hashSet) {
        return hashSet.isEmpty();
    }
    //6
    private static Set<Integer> cloneHashSet(Set<Integer> hashSet) {
        return new HashSet<>(hashSet);
    }
    //7
    private static Integer[] convertHashSetToArray(Set<Integer> hashSet) {
        return hashSet.toArray(new Integer[0]);
    }
    //8
    private static Set<Integer> convertHashSetToTreeSet(Set<Integer> hashSet) {
        return new TreeSet<>(hashSet);
    }
    //9
    private static void findNumbersLessThanSeven(Set<Integer> hashSet) {
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        treeSet.removeIf(num -> num >= 7);
        System.out.println("Numbers less than 7 in the tree set: " + treeSet);
    }
    //10
    private static void compareHashSets(Set<Integer> hashSet1, Set<Integer> hashSet2) {
        boolean isEqual = hashSet1.equals(hashSet2);
        System.out.println("Hash Set 1 is equal to Hash Set 2: " + isEqual);
    }
    //11
    private static void retainCommonElements(Set<Integer> hashSet1, Set<Integer> hashSet2) {
        hashSet1.retainAll(hashSet2);
        System.out.println("Common elements retained: " + hashSet1);
    }
    //12
    private static void removeAllElements(Set<Integer> hashSet) {
        hashSet.clear();
        System.out.println("All elements removed from the hash set.");
    }

    // Utility function to create a second hash set for testing
    private static Set<Integer> createSecondHashSet() {
        Set<Integer> secondHashSet = new HashSet<>();
        secondHashSet.add(5);
        secondHashSet.add(10);
        secondHashSet.add(15);
        return secondHashSet;
    }

    // Utility function to create a third hash set for testing
    private static Set<Integer> createThirdHashSet() {
        Set<Integer> thirdHashSet = new HashSet<>();
        thirdHashSet.add(3);
        thirdHashSet.add(5);
        thirdHashSet.add(8);
        return thirdHashSet;
    }

    }

