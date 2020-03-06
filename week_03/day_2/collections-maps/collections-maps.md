# Maps (HashMaps)


## What is a Map?
* Maps are sometimes called _dictionaries_ or _associative arrays_.
* Maps store associated <u>pairs</u> of objects, or _key-value pairs_.
  * The key object is used to look up the value object.
  * Each pair is of type `Map.Entry`.
    * `Map.Entry` has a `key` and `value` which can be retrieved by `getKey()`, and `getValue()`
* Map is not `Iterable`; Values can be iterated over by retrieving the key-set from calling `keySet()`.


## Using Maps
* Elements are pairs of objects, called _keys and values_
* _keys_ are used to lookup _values_
* Add key-value pairs with `put(key, value)`
* Get values with `get(key)`
* Keys are stored in a `Set`, retrievable with `keySet()`


## Map.Entry Interface
* nested interface of the `Map` interface
* Used to store a single key-value pair.
* A `Set` of `Map.Entry` allows access to each `key` and `value` independently.


## Map Interface

```java
public interface Map<KeyType, ValueType> {
  void clear();
  boolean containsKey(Object);
  boolean containsValue(Object);
  Set<Map.Entry<KeyType, ValueType>> entrySet();
  ValueType get(Object);
  ValueType getOrDefault(Object);
  boolean isEmpty();
  Set<KeyType> keySet();
  ValueType put(KeyType, ValueType);
  void putAll(Map<KeyType, ValueType>);
  ValueType remove(Object);
  ValueType replace(KeyType, ValueType);
  int size();
  Collection<ValueType> values();
}
```


## Types of Maps

* | `HashMap`         | Hashes keys for quick access
* | `HashTable`       | synchronous operations
* | `TreeMap`         | entries are ordered by key
* | `EnumMap`         | Has key type of specified enum map
* | `LinkedHashMap`   | Hashes keys, preserves order with `LinkedList`
* | `WeakHashMap`     | Has `WeakReference` key-types
* | `IdentityHashMap` | Uses `System.identityHashCode()` and `==` for storage and retrieval


## HashMap

* `HashMap` **is a** `Map`
* Hashes keys for quick access
* asynchronous operations (bad for multithreading)
* no ordering on keys nor values.

### HashMap Example

```java
public void demo() {
    Map<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    map.put("Five", 4);
    System.out.println(map.entrySet());
}
```

Output
```
[Five=4, One=1, Four=4, Two=2, Three=3]
```


## put(KeyType, ValueType)
* `ValueType put(KeyType, ValueType)`
  * populates the `Map` with a new `Entry` of the respective values.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.put("Three", 3);
  System.out.println(map.entrySet());
}
```

Output
```
[One=1, Two=2, Three=3]
```


## `putAll(Map<KeyType, ValueType>)`
* Puts all values from one HashMap into another


```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  Map<String, Integer> newMap = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.put("Three", 3);
  newMap.putAll(map);
  System.out.println(newMap.entrySet());
}
```

Output
```
[One=1, Two=2, Three=3]
```

## `ValueType get(KeyType)`
  * fetches the value of an `Entry` with a respective key.
  * Returns a value for the given key

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  System.out.println(map.get("Two")); // prints 2
}
```

Output
```
2
```

## `ValueType replace(KeyType, ValueType)`

  * replaces the `Entry` for the specified key, if currently mapped to the specified value.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.replace("Two", 3);
  System.out.println(map.get("Two")) // prints 3
}
```

Output
```
3
```

## `ValueType remove(Object)`
  * removes the mapping for a key from map if it is present
  * Returns that value

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.remove("Two");
  System.out.println(map.get("Two")) // prints null
}
```

Output
```
null
```

## `boolean containsKey(Object)`
  * Return true if `Map` contains a mapping for specified key.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  System.out.println(map.containsKey("One")); //prints true
}
```

Output
```
true
```

## `boolean containsValue(Object)`
  * Return true if `Map` contains a mapping for specified value.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  System.out.println(map.containsValue(1)); //prints true
}
```

Output
```
true
```

##  `int size()`
  * Returns the number of elements in the `Map`.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.put("Three", 3);
  System.out.println(map.size()); //prints 3
}
```

Output
```
3
```

## `boolean isEmpty()`
  * returns `true` if the size of the `Map` is `0`, else returns `false`.


```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  System.out.println(map.size()); //prints 0
  System.out.println(map.isEmpty()); //prints true
  map.put("One", 1);
  System.out.println(map.isEmpty()); //prints false
  System.out.println(map.size()); //prints 1
}
```

Output
```
0
true
false
1
```

## `Set<Entry<KeyType, ValueType>> entrySet()`
  * returns a `Set` view of the mappings in the `Map`.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.put("Three", 3);
  System.out.println(map.entrySet());
}
```

Output
```
[One=1, Two=2, Three=3]
```

## `Set<KeyType> keySet()`
* returns a `Set` view of the keys contained in this map

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.put("Two", 2);
  map.put("Three", 3);
  System.out.println(map.keySet()); // prints null
}
```

Output
```
[One, Two, Three]
```

## `void clear()`
* Removes all elements from the `Map`.

```java
public void demo() {
  Map<String, Integer> map = new HashMap<>();
  map.put("One", 1);
  map.clear();
  System.out.println(map.isEmpty()); // prints true
}
```

Output
```
true
```



### TreeMap
* Is implemented based on _red-black_ tree structure.
* Is ordered by the key


### TreeMap Example

```java
public void demo() {
    Map<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    map.put("Five", 4);
    System.out.println(map.entrySet());
}
```

Output
```
[Five=4, Four=4, One=1, Three=3, Two=2]
```

### LinkedHashMap
* preserves the insertion order

### LinkedHashMap Example

```java
public void demo() {
    Map<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    map.put("Five", 4);
    System.out.println(map.entrySet());
}
```

Output
```
[One=1, Two=2, Three=3, Four=4, Five=4]
```
