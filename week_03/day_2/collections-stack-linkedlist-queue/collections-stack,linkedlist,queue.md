# Collections


## What is a `Collection`?
`Collection` is an interface which ensures a class has the ability to hold a series of objects.

# Stack, LinkedList, Queue

## What is a Stack?
* Stack in Java is a special kind of data structure which can thought of as similar to an ArrayList. In a stack data structure however, can only add and remove items from the "top" of the stack.

Java Stack is the legacy Collection class. It extends the Vector class with five operations to support the LIFO(Last In First Out) operations. It is available in the Collection API since Java 1.0. As a Vector implements List, Stack class is also the List implementation class but does NOT support all the operations of Vector or List. As Stack supports LIFO, it is also known as LIFO Lists.

Consider this example and its output;

```
import java.util.Stack;

class StackDemo {
    public static void main(String a[]){
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty stack : "  + stack);
        System.out.println("Empty stack : "  + stack.isEmpty());

        stack.push(100);
        stack.push(102);
        stack.push(103);
        stack.push(104);
        System.out.println("Stack elements are : "  + stack);
        System.out.println("Stack: Pop Operation : "  + stack.pop());
        System.out.println("Stack: After Pop Operation : "  + stack);
        System.out.println("Stack : search() Operation : "  + stack.search(1002));
        System.out.println("If Stack is empty : "  + stack.isEmpty());
    }
}
```

Output:

```
Empty stack : []
Empty stack : true
Stack elements are : [100, 102, 103, 104]
Stack : Pop operation : 104
Stack : After pop operation : [100, 102, 103]
Stack : Search() Operation : -1
If stack is empty : false
```

* Models a real-life stack.
* Gives client access to a `Stack` with only the top-most card accessible.
	* FIFO
* Insertions can only be to the top of the `Stack`
	* The indices of other elements in the stack are shifted up 1.
* Removals can only be from the top of the `Stack`
	* The indices of other elements in the stack are shifted down 1.



## Stack interface
	* pop
	* push
	* peek
	* isEmpty


### `isEmpty`
* returns true if `Stack` contains no elements


### `isEmpty` example

```java
@Test
public void demo() {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.isEmpty()); // prints true
}
```

Output
```
true
```

### `push`
* populates the `Stack` with the respective argument
* newly inserted element is considered to be the `head` or top-of-stack


### `push` example

```java
@Test
public void demo() {
		Stack<String> stack = new Stack<>();
		stack.push("Hello world");
		System.out.println(stack.isEmpty()); // prints false
}
```

Output
```
false
```

### `peek`
* views the most recently added item


### `peek` example

```java
@Test
public void demo() {
		Stack<String> stack = new Stack<>();
		stack.push("Hello world");
		System.out.println(stack.peek());
}
```

Output

```
Hello world
```

### `pop`
* removes and returns the most recently added element


### `pop` example

```java
@Test
public void demo() {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.isEmpty()); // prints true
		stack.push("Hello world");
		System.out.println(stack.isEmpty()); // prints false
		String topValue = stack.pop();
		System.out.println(topValue); //prints "Hello World"
		String topValue2 = stack.pop(); // throws EmptyStackException
}
```

Output

```
true
false
Hello world

java.util.EmptyStackException
	at java.base/java.util.Stack.peek(Stack.java:102)
```


## LinkedList

A linked list is a linear data structure where each element is a separate object.
Each element (we will call it a node) of a list is comprising of two items - the data and a reference to the next node. The last node has a reference to null. The entry point into a linked list is called the head of the list. It should be noted that head is not a separate node, but the reference to the first node. If the list is empty then the head is a null reference.

A linked list is a dynamic data structure. The number of nodes in a list is not fixed and can grow and shrink on demand. Any application which has to deal with an unknown number of objects will need to use a linked list.

One disadvantage of a linked list against an array is that it does not allow direct access to the individual elements. If you want to access a particular item then you have to start at the head and follow the references until you get to that item.


* `LinkedList` is quicker than `ArrayList` at removal/insertion of elements in the middle of the list.
* `LinkedList` values are stored as `Node` objects.
	* Each `Node` is a separate object with a `data` and `next` field.


### Node
```
class Node<DataType> {
	DataType data;
	Node next;

	Node(DataType d) {
		data = d;
		next = null;
	}
}
```

### LinkedList

```java
class LinkedList<DataType> {
  Node<DataType> head;
}
```


### LinkedList
* Iterating a linked list
* Requires client to continually check if `next` is null, if not `this.head = next`


# Queue Interface
* Specifies that you can
	* add elements at the tail end of the queue,
	* remove elements at the head,
	* find out how many elements are in the queue.
* LIFO implementation


### Minimal Form of a Queue Interface
* The interface describes the intent without detailing the implementation

```java
// a simplified form of the interface in the standard library
public interface Queue<E> {
	void add(E element);
	E remove();
	E peek();
	int size();
}
```

### Queue API Structure
* There are 3 primary types of Queue-Operations
	* Adding: `add(e)` /  `offer(e)`
	* Removing: `remove()` / `poll()`
	* Viewing: `element()` / `peek()`


## Queue API Structure: Adding

### Queue API Structure<br>`add(e)`
* Adds an element to the tail of the Queue.
* Has potential to throw `IllegalStateException`
	* `IllegalStateException` if the element cannot be added at this time due to capacity restrictions
	* `ClassCastException` if the class of the specified element prevents it from being added to this queue
	* `NullPointerException` if the specified element is null and this queue does not permit null elements
	* `IllegalArgumentException` if some property of this element prevents it from being added to this queue


### Queue API Structure<br>`offer(e)`
* Adds an element to the tail of the Queue.
* Does not have potential to throw `IllegalStateException`
	* `ClassCastException` if the class of the specified element prevents it from being added to this queue
	* `NullPointerException` if the specified element is null and this queue does not permit null elements
	* `IllegalArgumentException` if some property of this element prevents it from being added to this queue


## Queue API Structure: Removing

### Queue API Structure<br>`remove()`
* Removes element at the head of the Queue.
* Has potential to throw an exception.
	* `NoSuchElementException` if this queue is empty


### Queue API Structure<br>`poll()`
* Removes element at the head of the Queue.
* Throws no exceptions


## Queue API Structure: Viewing

### Queue API Structure<br>`element()`
* Retrieves, but does not remove, the head of the queue.
* Has the potential to throw an exception
	* `NoSuchElementException` if this queue is empty


### Queue API Structure<br>`peek()`
* Retrieves, but does not remove, the head of the queue.
* Throws no exceptions


### Queues, Deques, and Stacks

- Queue -- Adds elements to one end and removes from the other (FIFO)
- Stack -- Adds elements to one end and removes them from the same (LIFO)
- Deque -- "double-ended queue" adds and removes elements at both ends

Note: `Deque` is often used for stacks as well


### All About Queues
* Read more [here](http://www.codejava.net/java-core/collections/java-queue-collection-tutorial-and-examples)

