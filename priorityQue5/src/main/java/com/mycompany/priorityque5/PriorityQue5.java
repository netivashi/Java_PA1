/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.priorityque5;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 *
 * @author ViP
 */
public class PriorityQue5 {

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Create a priority queue and add colors");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Add all elements to another priority queue");
            System.out.println("4. Insert a given element");
            System.out.println("5. Remove all elements");
            System.out.println("6. Count the number of elements");
            System.out.println("7. Compare two priority queues");
            System.out.println("8. Retrieve the first element");
            System.out.println("9. Retrieve and remove the first element");
            System.out.println("10. Convert to an array");
            System.out.println("11. Convert to string representations");
            System.out.println("12. Change to maximum priority queue");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    createPriorityQueue(priorityQueue);
                    break;

                case 2:
                    System.out.println("Iterating through all elements:");
                    iteratePriorityQueue(priorityQueue);
                    break;

                case 3:
                    System.out.println("Adding all elements to another priority queue:");
                    PriorityQueue<String> anotherPriorityQueue = createAnotherPriorityQueue();
                    addAllElements(priorityQueue, anotherPriorityQueue);
                    break;

                case 4:
                    System.out.print("Enter an element to insert: ");
                    String elementToInsert = scanner.nextLine();
                    insertElement(priorityQueue, elementToInsert);
                    break;

                case 5:
                    removeAllElements(priorityQueue);
                    break;

                case 6:
                    System.out.println("Number of elements in the priority queue: " + countElements(priorityQueue));
                    break;

                case 7:
                    System.out.println("Comparing two priority queues:");
                    PriorityQueue<String> secondPriorityQueue = createSecondPriorityQueue();
                    comparePriorityQueues(priorityQueue, secondPriorityQueue);
                    break;

                case 8:
                    retrieveFirstElement(priorityQueue);
                    break;

                case 9:
                    retrieveAndRemoveFirstElement(priorityQueue);
                    break;

                case 10:
                    convertToArrayList(priorityQueue);
                    break;

                case 11:
                    convertToStringRepresentations(priorityQueue);
                    break;

                case 12:
                    changeToMaximumPriorityQueue(priorityQueue);
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
     private static void createPriorityQueue(PriorityQueue<String> priorityQueue) {
        priorityQueue.add("Red");
        priorityQueue.add("Green");
        priorityQueue.add("Blue");
        priorityQueue.add("Yellow");
        System.out.println("Priority Queue created with colors: " + priorityQueue);
    }
    //2
    private static void iteratePriorityQueue(PriorityQueue<String> priorityQueue) {
        for (String color : priorityQueue) {
            System.out.println(color);
        }
    }
    //3
    private static void addAllElements(PriorityQueue<String> priorityQueue, PriorityQueue<String> anotherPriorityQueue) {
        priorityQueue.addAll(anotherPriorityQueue);
        System.out.println("Updated Priority Queue: " + priorityQueue);
    }
    //4
    private static void insertElement(PriorityQueue<String> priorityQueue, String elementToInsert) {
        priorityQueue.add(elementToInsert);
        System.out.println("Element '" + elementToInsert + "' inserted successfully.");
        System.out.println("Updated Priority Queue: " + priorityQueue);
    }
    //5
    private static void removeAllElements(PriorityQueue<String> priorityQueue) {
        priorityQueue.clear();
        System.out.println("All elements removed from the priority queue.");
    }
    //6
    private static int countElements(PriorityQueue<String> priorityQueue) {
        return priorityQueue.size();
    }
    //7
    private static void comparePriorityQueues(PriorityQueue<String> priorityQueue1, PriorityQueue<String> priorityQueue2) {
        boolean isEqual = priorityQueue1.equals(priorityQueue2);
        System.out.println("Priority Queue 1 is equal to Priority Queue 2: " + isEqual);
    }
    //8
    private static void retrieveFirstElement(PriorityQueue<String> priorityQueue) {
        String firstElement = priorityQueue.peek();
        System.out.println("First element: " + firstElement);
    }
    //9
    private static void retrieveAndRemoveFirstElement(PriorityQueue<String> priorityQueue) {
        String firstElement = priorityQueue.poll();
        if (firstElement != null) {
            System.out.println("Retrieved and removed first element: " + firstElement);
            System.out.println("Updated Priority Queue: " + priorityQueue);
        } else {
            System.out.println("Priority Queue is empty. No elements to retrieve and remove.");
        }
    }
    //10
    private static void convertToArrayList(PriorityQueue<String> priorityQueue) {
        Object[] array = priorityQueue.toArray();
        System.out.println("Priority Queue as an array: " + java.util.Arrays.toString(array));
    }
    //11
    private static void convertToStringRepresentations(PriorityQueue<String> priorityQueue) {
        String stringRepresentation = priorityQueue.toString();
        System.out.println("Priority Queue as string representations: " + stringRepresentation);
    } 
    //12
    private static void changeToMaximumPriorityQueue(PriorityQueue<String> priorityQueue) {
        // Priority queues in Java are by default Min-Heap.
        // To convert to a Max-Heap, you can use a custom comparator.
        PriorityQueue<String> maxPriorityQueue = new PriorityQueue<>(java.util.Collections.reverseOrder());
        maxPriorityQueue.addAll(priorityQueue);

        System.out.println("Converted to maximum priority queue: " + maxPriorityQueue);
    }

    // Utility function to create a second priority queue for testing
    private static PriorityQueue<String> createSecondPriorityQueue() {
        PriorityQueue<String> secondPriorityQueue = new PriorityQueue<>();
        secondPriorityQueue.add("Purple");
        secondPriorityQueue.add("Orange");
        secondPriorityQueue.add("Black");
        return secondPriorityQueue;
    }

    // Utility function to create another priority queue for testing
    private static PriorityQueue<String> createAnotherPriorityQueue() {
        PriorityQueue<String> anotherPriorityQueue = new PriorityQueue<>();
        anotherPriorityQueue.add("White");
        anotherPriorityQueue.add("Gray");
        anotherPriorityQueue.add("Brown");
        return anotherPriorityQueue;
    }
}
    
