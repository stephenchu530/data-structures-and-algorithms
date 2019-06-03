# Doubly Linked List
<!-- Short summary or background information -->
This is the stretch goal to the (Singly) Linked List project

## Challenge Description
<!-- Description of the challenge -->
Do the same exact project as the Linked List project, but implement doubly linked list.
* Create a `Node` class with a property to the stored value and to the next `Node` as well as to the prev `Node`.
* Create a `LinkedList` class with the following:
  * Instantiates to an empty doubly linked list assigned to the property `head`.
  * A method `insert` that takes in an argument and adds a new `Node` to the head.
  * A method `includes` that takes in an argument and returns true or false if the value exists in the doubly linked list.
  * A method `forwardPrint` that returns a collection of the current values in the doubly linked list in the forward direction (head to tail)
  * A method `backwardPrint` that returns a collection of the current values in the doubly linked list in the backward direction (tail to backward)

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* `insert` - O(1)
* `includes` - O(n)
* `forwardPrint` - O(n)
* `backwardPrint` - O(n)

## API
<!-- Description of each method publicly available to your Linked List -->
* `void DoublyLinkedList.insert(int value)` - Takes in an integer value and adds a new `Node` to the head of the linked list. 

* `boolean DoublyLinkedList.includes(int value)` - Takes in an integer value and returns a true or false if the integer value exists in any of the nodes of the linked list.

* `ArrayList<Integer> DoublyLinkedList.forwardPrint()` - Takes no arguments and returns an array list of all the integer values in the linked list.

* `ArrayList<Integer> DoublyLinkedList.backwardPrint()` - Takes no arguments and returns an array list of all the integer values in the linked list.

## Solution (Code)
<!-- Link to code -->
[Solution Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/CodeChallenges401/src/main/java/CodeChallenges401/DoublyLinkedList.java)
