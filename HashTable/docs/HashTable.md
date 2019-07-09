# HashTable
<!-- Short summary or background information -->
This is a solo code challenge project to learn how to implement a Hash Table

## Challenge Description
<!-- Description of the challenge -->
The following are the specs for this project:
* Implement a `HashTable` class with the following methods:
  * `add`: takes in a `key` and `value` then adds the pair to the hash table; Handle collisions as needed
  * `get`: takes in a `key` and returns the `value`
  * `contains`: takes in a `key` and returns a boolean indicating if the `key` exists in the table
  * `hash`: takes in a `key` and returns an `index`

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* `add` - O(n)
* `get` - O(n)
* `contains` - O(n)
* `hash` - O(1)

## API
<!-- Description of each method publicly available to your Linked List -->
* `void add(String key, T value)` - takes in a `key` and `value` then adds the pair to the hash table; Handle collisions as needed

* `T get(String key)` - takes in a `key` and returns the `value`

* `Boolean contains(String key)` - takes in a `key` and returns a boolean indicating if the `key` exists in the table

* `int hash(String key)` - takes in a `key` and returns an `index`

## Solution (Code)
<!-- Link to code -->
[Hash Table Code](https://github.com/stephenchu530/data-structures-and-algorithms/blob/master/HashTable/src/main/java/HashTable/HashTable.java)
