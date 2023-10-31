### Hash Tables in Java

#### Definition
- **Hash Table**: A data structure that implements an associative array abstract data type, a structure that can map keys to values. It uses a hash function to compute an index into an array of buckets, from which the desired value can be found.

#### Basic Concepts
- **Key-Value Pair**: Hash tables store data in key-value pairs, where each key is unique.
- **Hash Function**: A hash function is used to compute an index from the key. It ensures uniform distribution of keys across the table.
- **Bucket**: Each index in the hash table array is called a bucket. Each bucket stores a linked list of key-value pairs.
- **Load Factor**: The load factor determines when to resize the hash table. It's the ratio of the number of stored elements to the size of the table. A higher load factor reduces space overhead but increases the chance of collisions.

#### Implementation in Java
- **HashMap class**: The `HashMap` class in Java implements hash tables. It is part of the Java Collections Framework.
  ```java
  HashMap<KeyType, ValueType> hashMap = new HashMap<>();
  ```
- **HashTable vs HashMap**: `Hashtable` is synchronized (thread-safe) whereas `HashMap` is not. For most cases, `HashMap` is preferred due to its performance unless synchronization is needed.
  ```java
  Hashtable<KeyType, ValueType> hashtable = new Hashtable<>();
  ```

#### Operations
- **Insertion**: Adding a key-value pair to the hash table.
  ```java
  hashMap.put(key, value);
  ```
- **Retrieval**: Getting the value associated with a specific key.
  ```java
  ValueType value = hashMap.get(key);
  ```
- **Deletion**: Removing a key-value pair from the hash table.
  ```java
  hashMap.remove(key);
  ```
- **Iteration**: Iterating over the key-value pairs in the hash table.
  ```java
  for (KeyType key : hashMap.keySet()) {
      ValueType value = hashMap.get(key);
      // Process key-value pair
  }
  ```

#### Collision Resolution
- **Chaining**: Each bucket contains a linked list of key-value pairs. Collisions are resolved by appending new elements to the linked list.
- **Open Addressing**: When a collision occurs, the algorithm searches for the next open slot in the hash table.

#### Performance
- **Time Complexity**: Average-case time complexity for search, insertion, and deletion operations is O(1) when the hash function distributes the keys uniformly.
- **Space Complexity**: Space complexity is O(n), where n is the number of key-value pairs stored in the hash table.

#### Use Cases
- **Fast Data Retrieval**: Hash tables are efficient for retrieving values based on keys.
- **Caching**: Hash tables can be used for caching frequently accessed data.
- **Symbol Tables**: Hash tables are used in compilers and interpreters to implement symbol tables for identifiers in programming languages.

Remember, understanding hash functions and collision resolution methods is crucial for efficient usage of hash tables in Java.