# Linked List
<!-- Short summary or background information -->
This is a solo project to showcase the linked list data structure in Java 8.

## Challenge Description
<!-- Description of the challenge -->
The following are the specs for this project:
* Create a `Node` class with a property to the stored value and to the next `Node`.
* Create a `LinkedList` class with the following:
  * Instantiates to an empty linked list assigned to the property `head`.
  * A method `insert` that takes in an argument and adds a new `Node` to the head.
  * A method `includes` that takes in an argument and returns true or false if the value exists in the linked list.
  * A method `print` that returns a collection of the current values in the linked list.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* `insert` - O(1)
* `includes` - O(n)
* `print` - O(n)

## API
<!-- Description of each method publicly available to your Linked List -->
* `void LinkedList.insert(int value)` - Takes in an integer value and adds a new `Node` to the head of the linked list. 

* `boolean LinkedList.includes(int value)` - Takes in an integer value and returns a true or false if the integer value exists in any of the nodes of the linked list.

* `ArrayList<Integer> LinkedList.print()` - Takes no arguments and returns an array list of all the integer values in the linked list.


## Solution (Code)
<!-- Link to code -->
[Solution Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/CodeChallenges401/src/main/java/CodeChallenges401/LinkedList.java)
