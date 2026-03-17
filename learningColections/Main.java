package learningColections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // List
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");
        System.out.println("List: " + myList);

        System.out.println("First element in List: " + myList.get(0)); // Accessing the first element
        System.out.println("Last element in List: " + myList.get(myList.size() - 1)); // Accessing the last element
        System.out.println("List contains 'Hello': " + myList.contains("Hello")); // Checking for an element
        System.out.println("Size of List: " + myList.size()); // Getting the size of the list
        System.out.println("Is the list empty? " + myList.isEmpty()); // Checking if the list is empty
        System.out.println("Clearing the list...");
        myList.clear(); // Clearing the list
        System.out.println("List after clearing: " + myList);
        System.out.println("List removed 'Hello': " + myList.remove("Hello")) ; // Removing a specific element from the list
        System.out.println("List after removing 'Hello': " + myList);
        

        // Set
        Set<String> mySet = new HashSet<>();
        mySet.add("Hello");
        mySet.add("World");
        mySet.add("Hello"); // Duplicate, will not be added
        System.out.println("Set: " + mySet);

        System.out.println("setStrings: " + mySet.contains("Hello")); // Checking for an element

        // Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("One", 1);
        myMap.put("Two", 2);
        System.out.println("Map: " + myMap);

        System.out.println("Value for 'One': " + myMap.get("One")); // Accessing value by key


        // Queue
        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("First");
        myQueue.add("Second");
        System.out.println("Queue: " + myQueue);

        System.out.println("Polling from Queue: " + myQueue.poll()); // Removing and returning the head of the queue
        System.out.println("Queue after polling: " + myQueue);
        System.out.println("Peeking from Queue: " + myQueue.peek()); // Returning the head of the queue without removing it 
        System.out.println("Queue after peeking: " + myQueue);
        System.out.println("Queue contains 'Second': " + myQueue.contains("Second")); // Checking for an element in the queue
        System.out.println("Queue size: " + myQueue.size()); // Getting the size of the queue
        System.out.println("Is the queue empty? " + myQueue.isEmpty()); // Checking if the queue is empty
        System.out.println("Clearing the queue...");
        System.out.println("Queue before clearing: " + myQueue);
        myQueue.clear(); // Clearing the queue
        System.out.println("Queue after clearing: " + myQueue);
        System.out.println("Queue removed 'Second': " + myQueue.remove("Second")) ; // Removing a specific element from the queue
        System.out.println("Queue after removing 'Second': " + myQueue);

        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("First");
        myLinkedList.add("Second");
        System.out.println("Linked List: " + myLinkedList);
        System.out.println("First element in Linked List: " + myLinkedList.getFirst()); // Accessing the first element
        System.out.println("Last element in Linked List: " + myLinkedList.getLast()); // Accessing the last element
        System.out.println("Removing first element from Linked List: " + myLinkedList.removeFirst()); // Removing the first element
        System.out.println("Linked List after removing first element: " + myLinkedList);
        System.out.println("Removing last element from Linked List: " + myLinkedList.removeLast()); // Removing the last element
        System.out.println("Linked List after removing last element: " + myLinkedList);
        System.out.println("Is the Linked List empty? " + myLinkedList.isEmpty()); // Checking if the linked list is empty
        System.out.println("Size of Linked List: " + myLinkedList.size()); // Getting the size of the linked list
        System.out.println("Clearing the Linked List...");
        myLinkedList.clear(); // Clearing the linked list
        System.out.println("Linked List after clearing: " + myLinkedList);
        System.out.println("Linked List removed 'Second': " + myLinkedList.remove("Second")) ; // Removing a specific element from the linked list
        System.out.println("Linked List after removing 'Second': " + myLinkedList);        
    }

}
