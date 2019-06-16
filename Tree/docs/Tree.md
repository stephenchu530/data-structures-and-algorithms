# Queue With Stacks
<!-- Short summary or background information -->
This is a solo code challenge project to learn how to work with trees.

## Challenge Description
<!-- Description of the challenge -->
The following are the specs for this project:
* `TreeNode` class with the following properties:
  * `value` property: generic type
  * `left` property: pointer to the left node
  * `right` property: pointer to the right node
  * `parent` property: pointer to the parent node
* `BinaryTree` class with the following properties and methods:
  * `root` property: pointer to the first node in the tree
  * `preOrder` method: returns an array of the tree's values pre-order
  * `inOrder` method: returns an array of the tree's values in-order
  * `postOrder` method: returns an array of the tree's values post-order
* `BinarySearchTree` class with the following methods:
  * `add` method: adds a new `TreeNode` with a given `value` to the `BinarySearchTree`
  * `contains` method: accepts a `value` and returns a `boolean` whether or not the tree contains that `value`

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* `preOrder` - O(n)
* `inOrder` - O(n)
* `postOrder` - O(n)
* `add` - O(lg(n))
* `contains` - O(lg(n))

## API
<!-- Description of each method publicly available to your Linked List -->
* `ArrayList<T> BinaryTree.preOrder()` - returns an array of the tree's values pre-order

* `ArrayList<T> BinaryTree.inOrder()` - returns an array of the tree's values in-order

* `ArrayList<T> BinaryTree.postOrder()` - returns an array of the tree's values post-order

* `void BinarySearchTree.add(T value` - adds a new `TreeNode` with a given `value` to the `BinarySearchTree`

* `Boolean BinarySearchTree.contains(T value)` - accepts a `value` and returns a `boolean` whether or not the tree contains that `value`
## Solution (Code)
<!-- Link to code -->
[Tree Node Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/Tree/src/main/java/Tree/TreeNode.java)

[Binary Tree Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/Tree/src/main/java/Tree/BinaryTree.java)

[Binary Search Tree Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/Tree/src/main/java/Tree/BinarySearchTree.java)
