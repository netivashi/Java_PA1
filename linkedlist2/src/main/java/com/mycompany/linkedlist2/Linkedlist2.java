/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.linkedlist2;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author ViP
 */
public class Linkedlist2 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Append element to the end");
            System.out.println("2. Iterate through all elements");
            System.out.println("3. Iterate from specified position");
            System.out.println("4. Iterate in reverse order");
            System.out.println("5. Insert element at specified position");
            System.out.println("6. Insert elements at first and last positions");
            System.out.println("7. Insert element at the front");
            System.out.println("8. Insert element at the end");
            System.out.println("9. Insert elements at specified position");
            System.out.println("10. Get first and last occurrence");
            System.out.println("11. Display elements and their positions");
            System.out.println("12. Remove specified element");
            System.out.println("13. Remove first and last elements");
            System.out.println("14. Remove all elements");
            System.out.println("15. Swap elements");
            System.out.println("16. Shuffle elements");
            System.out.println("17. Join two linked lists");
            System.out.println("18. Copy linked list to another linked list");
            System.out.println("19. Remove and return first element");
            System.out.println("20. Retrieve, but not remove, first element");
            System.out.println("21. Retrieve, but not remove, last element");
            System.out.println("22. Check if element exists");
            System.out.println("23. Convert linked list to array list");
            System.out.println("24. Compare two linked lists");
            System.out.println("25. Check if linked list is empty");
            System.out.println("26. Replace an element");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter element to append to the end: ");
                    String element = scanner.nextLine();
                    linkedList.add("savan");
                    linkedList.add("dev");
                    linkedList.add("parth");
                    linkedList.add(element);
                    break;

                case 2:
                    System.out.println("Iterating through all elements:");
                    iterateLinkedList(linkedList);
                    break;

                case 3:
                    System.out.print("Enter start position: ");
                    int startPosition = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Iterating from position " + startPosition + ":");
                    iterateFromPosition(linkedList, startPosition);
                    break;

                case 4:
                    System.out.println("Iterating in reverse order:");
                    iterateReverseOrder(linkedList);
                    break;

                case 5:
                    System.out.print("Enter position to insert element: ");
                    int insertPosition = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter element to insert: ");
                    String newElement = scanner.nextLine();
                    insertAtPosition(linkedList, insertPosition, newElement);
                    break;

                case 6:
                    System.out.print("Enter first element to insert at the first position: ");
                    String firstElement = scanner.nextLine();
                    System.out.print("Enter last element to insert at the last position: ");
                    String lastElement = scanner.nextLine();
                    insertFirstAndLast(linkedList, firstElement, lastElement);
                    break;

                case 7:
                    System.out.print("Enter element to insert at the front: ");
                    String frontElement = scanner.nextLine();
                    insertAtFront(linkedList, frontElement);
                    break;

                case 8:
                    System.out.print("Enter element to insert at the end: ");
                    String endElement = scanner.nextLine();
                    insertAtEnd(linkedList, endElement);
                    break;

                case 9:
                    System.out.print("Enter position to start inserting elements: ");
                    int insertPositionMultiple = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter number of elements to insert: ");
                    int numElements = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.println("Enter elements to insert:");
                    String[] elementsToInsert = new String[numElements];
                    for (int i = 0; i < numElements; i++) {
                        elementsToInsert[i] = scanner.nextLine();
                    }
                    insertMultipleAtPosition(linkedList, insertPositionMultiple, elementsToInsert);
                    break;

                case 10:
                    System.out.print("Enter element to find occurrences: ");
                    String elementToFind = scanner.nextLine();
                    getFirstAndLastOccurrence(linkedList, elementToFind);
                    break;

                case 11:
                    System.out.println("Displaying elements and their positions:");
                    displayElementsWithPositions(linkedList);
                    break;

                case 12:
                    System.out.print("Enter element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    removeElement(linkedList, elementToRemove);
                    break;

                case 13:
                    System.out.println("Removing first and last elements:");
                    removeFirstAndLast(linkedList);
                    break;

                case 14:
                    System.out.println("Removing all elements:");
                    removeAllElements(linkedList);
                    break;

                case 15:
                    System.out.print("Enter index of first element to swap: ");
                    int index1 = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter index of second element to swap: ");
                    int index2 = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    swapElements(linkedList, index1, index2);
                    break;

                case 16:
                    System.out.println("Shuffling elements:");
                    shuffleElements(linkedList);
                    break;

                case 17:
                    System.out.println("Joining two linked lists:");
                    joinLinkedLists(linkedList, createSecondLinkedList());
                    break;

                case 18:
                    System.out.println("Copying a linked list to another linked list:");
                    copyToAnotherList(linkedList);
                    break;

                case 19:
                    System.out.println("Removing and returning the first element:");
                    removeAndReturnFirstElement(linkedList);
                    break;

                case 20:
                    System.out.println("Retrieving, but not removing, the first element:");
                    retrieveFirstElement(linkedList);
                    break;

                case 21:
                    System.out.println("Retrieving, but not removing, the last element:");
                    retrieveLastElement(linkedList);
                    break;

                case 22:
                    System.out.print("Enter element to check if it exists: ");
                    String checkElement = scanner.nextLine();
                    checkIfElementExists(linkedList, checkElement);
                    break;

                case 23:
                    System.out.println("Converting linked list to array list:");
                    convertToArrayList(linkedList);
                    break;

                case 24:
                    System.out.println("Comparing two linked lists:");
                    compareLinkedLists(linkedList, createSecondLinkedList());
                    break;

                case 25:
                    System.out.println("Checking if the linked list is empty:");
                    checkIfEmpty(linkedList);
                    break;

                case 26:
                    System.out.print("Enter index to replace element: ");
                    int replaceIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter replacement element: ");
                    String replacementElement = scanner.nextLine();
                    replaceElement(linkedList, replaceIndex, replacementElement);
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
    private static void iterateLinkedList(LinkedList<String> linkedList) {
        for (String element : linkedList) {
            System.out.println(element);
        }
    }

    //3
    private static void iterateFromPosition(LinkedList<String> linkedList, int startPosition) {
        ListIterator<String> iterator = linkedList.listIterator(startPosition);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //4
    private static void iterateReverseOrder(LinkedList<String> linkedList) {
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    //5
    private static void insertAtPosition(LinkedList<String> linkedList, int insertPosition, String newElement) {
        linkedList.add(insertPosition, newElement);
        System.out.println(linkedList);
    }

    //6
    private static void insertFirstAndLast(LinkedList<String> linkedList, String firstElement, String lastElement) {
        linkedList.addFirst(firstElement);
        linkedList.addLast(lastElement);
        System.out.println(linkedList);
    }

    //7
    private static void insertAtFront(LinkedList<String> linkedList, String frontElement) {
        linkedList.offerFirst(frontElement);
        System.out.println(linkedList);
    }

    //8
    private static void insertAtEnd(LinkedList<String> linkedList, String endElement) {
        linkedList.offerLast(endElement);
        System.out.println(linkedList);
    }

    //9
    private static void insertMultipleAtPosition(LinkedList<String> linkedList, int insertPosition, String[] elementsToInsert) {
        for (String element : elementsToInsert) {
            linkedList.add(insertPosition, element);
            insertPosition++;
        }
        System.out.println(linkedList);
    }

    //10
    private static void getFirstAndLastOccurrence(LinkedList<String> linkedList, String elementToFind) {
        int firstOccurrenceIndex = linkedList.indexOf(elementToFind);
        int lastOccurrenceIndex = linkedList.lastIndexOf(elementToFind);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + elementToFind + "': " + firstOccurrenceIndex);
        } else {
            System.out.println("Element '" + elementToFind + "' not found in the linked list.");
        }

        if (lastOccurrenceIndex != -1) {
            System.out.println("Last occurrence of '" + elementToFind + "': " + lastOccurrenceIndex);
        } else {
            System.out.println("Element '" + elementToFind + "' not found in the linked list.");
        }
    }

    //11
    private static void displayElementsWithPositions(LinkedList<String> linkedList) {
        ListIterator<String> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            int position = iterator.nextIndex();
            String element = iterator.next();
            System.out.println("Position " + position + ": " + element);
        }
    }

    //12
    private static void removeElement(LinkedList<String> linkedList, String elementToRemove) {
        linkedList.remove(elementToRemove);
        System.out.println(linkedList);
    }

    //13
    private static void removeFirstAndLast(LinkedList<String> linkedList) {
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }

    //14
    private static void removeAllElements(LinkedList<String> linkedList) {
        linkedList.clear();
        System.out.println(linkedList);
    }

    //15
    private static void swapElements(LinkedList<String> linkedList, int index1, int index2) {
        String temp = linkedList.get(index1);
        linkedList.set(index1, linkedList.get(index2));
        linkedList.set(index2, temp);
        System.out.println(linkedList);
    }

    //16
    private static void shuffleElements(LinkedList<String> linkedList) {
        java.util.Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }

    //17
    private static void joinLinkedLists(LinkedList<String> linkedList1, LinkedList<String> linkedList2) {
        linkedList1.addAll(linkedList2);
        System.out.println(linkedList1);
    }

    //18
    private static void copyToAnotherList(LinkedList<String> linkedList) {
        LinkedList<String> copyList = new LinkedList<>(linkedList);
        System.out.println("Copied Linked List: " + copyList);
    }

    //19
    private static void removeAndReturnFirstElement(LinkedList<String> linkedList) {
        String removedElement = linkedList.poll();
        System.out.println("Removed and returned first element: " + removedElement);
        System.out.println(linkedList);
    }

    //20
    private static void retrieveFirstElement(LinkedList<String> linkedList) {
        String firstElement = linkedList.peek();
        System.out.println("Retrieved, but not removed, first element: " + firstElement);
        System.out.println(linkedList);
    }

    //21
    private static void retrieveLastElement(LinkedList<String> linkedList) {
        String lastElement = linkedList.peekLast();
        System.out.println("Retrieved, but not removed, last element: " + lastElement);
        System.out.println(linkedList);
    }

    //22
    private static void checkIfElementExists(LinkedList<String> linkedList, String checkElement) {
        boolean exists = linkedList.contains(checkElement);
        System.out.println("Element '" + checkElement + "' exists: " + exists);
    }

    //23
    private static void convertToArrayList(LinkedList<String> linkedList) {
        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>(linkedList);
        System.out.println("Converted ArrayList: " + arrayList);
    }

    //24
    private static void compareLinkedLists(LinkedList<String> linkedList1, LinkedList<String> linkedList2) {
        boolean isEqual = linkedList1.equals(linkedList2);
        System.out.println("Linked List 1 is equal to Linked List 2: " + isEqual);
    }

    //25
    private static void checkIfEmpty(LinkedList<String> linkedList) {
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Linked List is empty: " + isEmpty);
    }

    //26
    private static void replaceElement(LinkedList<String> linkedList, int replaceIndex, String replacementElement) {
        linkedList.set(replaceIndex, replacementElement);
        System.out.println(linkedList);
    }

    //
    private static LinkedList<String> createSecondLinkedList() {
        LinkedList<String> secondList = new LinkedList<>();
        secondList.add("SecondElement1");
        secondList.add("SecondElement2");
        return secondList;
    }
}
