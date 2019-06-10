# Queue With Stacks
<!-- Short summary or background information -->
This is a solo code challenge project that builds upon the lessons learned from linked lists, queues, and stacks.

## Challenge Description
<!-- Description of the challenge -->
The following are the specs for this project:
* Create a `Node` class with a property to the stored value and to the next `Node`.
* Create a `Stack` class with the following:
  * Instantiates an empty node-like structure with the property `top`.
  * A method `push` that takes in an argument and adds a new `Node` to the top of the stack.
  * A method `pop` that does not take in an argument; Removes the top node and returns its value.
  * A method `peek` that does not take in an argument and returns the value of the node at the top of the stack.
* Create a `PseudoQueue` class with the following:
  * Instantiates an empty node-like structure with the property `front`.
  * A method `enqueue` that takes in an argument and adds a new `Node` to the back of the queue.
  * A method `dequeue` that does not take in an argument; Removes the front node and returns its value.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* `push` - O(1)
* `pop` - O(1)
* `enqueue` - O(n); utilizes an underlying stack to store values.
* `dequeue` - O(n); utilizes two stacks to remove a stored value.

## API
<!-- Description of each method publicly available to your Linked List -->
* `void Stack.push(int value)` - Takes in an integer value and adds a new `Node` to the `top` the stack.

* `int Stack.pop()` - Takes no argument, deletes the `node` at the `top` and return the value stored in that `node`.

* `int Stack.peek()` - Takes no argument, returns the value stored in the `node` at the `top` of the stack. 

* `void Queue.enqueue(int value)` - Takes in an integer value and adds a new `Node` to the `back` the queue.

* `int Queue.dequeue()` - Takes no argument, deletes the `node` at the `front` and return the value stored in that `node`.

## Solution (Code)
<!-- Link to code -->
[Stack Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/QueuesWithStacks/src/main/java/QueueWithStacks/QueueWithStacks.java)
