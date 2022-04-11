### Describe Linked Lists

- The LinkList acts as a dynamic array and we do not have to specify the size while creating it, the size of the list automatically increases when we dynamically add and remove items. And also, the elements are not stored in a continuous fashion. Internally, the LinkedList is implemented using the doubly linked list data structure. The main difference between a normal linked list and a doubly LinkedList is that a doubly linked list contains an extra pointer, typically called the previous pointer, together with the next pointer and data which are there in the singly linked list.
money

<img width="562" alt="Screen Shot 2022-03-21 at 9 31 11 AM" src="https://user-images.githubusercontent.com/72888867/159308204-541b67a1-f8ed-48ca-a3da-224e41042a31.png">

### Describe Java Generic T
- Generics means parameterized types. The idea is to allow type (Integer, String, … etc., and user-defined types) to be a parameter to methods, classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.

- The Object is the superclass of all other classes, and Object reference can refer to any object. These features lack type safety. Generics add that type of safety feature. We will discuss that type of safety feature in later examples. Generics in Java are similar to templates in C++. For example, classes like HashSet, ArrayList, HashMap, etc., use generics very well. There are some fundamental differences between the two approaches to generic types

<img width="471" alt="Screen Shot 2022-03-21 at 9 31 45 AM" src="https://user-images.githubusercontent.com/72888867/159308639-36c62758-130e-4baa-bba7-0a7e3db902ce.png">

### Queue Add and Delete

- The Queue interface present in the java.util package and extends the Collection interface is used to hold the elements about to be processed in FIFO(First In First Out) order. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.

- The remove() method of Queue Interface returns and removes the element at the front the container. It deletes the head of the container. The method throws an NoSuchElementException when the Queue is empty. 

<img width="478" alt="Screen Shot 2022-03-21 at 9 32 30 AM" src="https://user-images.githubusercontent.com/72888867/159309145-266a2ce4-995b-490f-8e16-ccf9daeddb53.png">

- In order to add an element in a queue, we can use the add() method. The insertion order is not retained in the PriorityQueue. The elements are stored based on the priority order which is ascending by default. 

<img width="491" alt="Screen Shot 2022-03-21 at 9 33 31 AM" src="https://user-images.githubusercontent.com/72888867/159309643-c47c3b62-af6e-441f-be56-8b57d0ccb934.png">

### Merge 2 Queues

 - In order to merge 2 queues there is a list of steps you must go through:
1. Make pointers for both of the queues.
2. Make another queue, add the node having least value from the other two queues(the pointer's node having the smallest value) to it and move that pointer to the next node.
3. Again compare the node's values and add the node having the smallest value to the queue and move that pointer to the next node.
4. Keep doing this until rear of both the queues are reached.
bear

<img width="378" alt="Screen Shot 2022-03-21 at 9 34 03 AM" src="https://user-images.githubusercontent.com/72888867/159310073-dd8aaf20-c22b-4591-9b60-dbea12b3584b.png">

### Reversing a Queue

- For reversing the queue one approach could be to store the elements of the queue in a temporary data structure in a manner such that if we re-insert the elements in the queue they would get inserted in reverse order. So now our task is to choose such data-structure which can serve the purpose. According to the approach, the data-structure should have the property of ‘LIFO’ as the last element to be inserted in the data structure should actually be the first element of the reversed queue. The stack could help in approaching this problem. This will be a two-step process:
1. Pop the elements from the queue and insert into the stack. (Topmost element of the stack is the last element of the queue)
2. Pop the elements of the stack to insert back into the queue. (The last element is the first one to be inserted into the queue)
duck

![today](https://user-images.githubusercontent.com/72888867/159310367-55ef528c-0a3b-40cf-9d6a-d847ab08ed51.png)
### Build Stack

- There is a multitude of different functions one can perform with a stack, and with these are pretty much endless possibilities as to what you can do with these functions:
1. push (to add a new item to the top)
2. pop (to remove the most top item)
3. peek (to get the most top item)
4. isEmpty (to check whether the stack is empty)
5. size (to get the size of the stack)
6. search (to search for objects)
- Here's an example of some functions above at work: deer

<img width="577" alt="Screen Shot 2022-03-21 at 9 35 18 AM" src="https://user-images.githubusercontent.com/72888867/159310446-0fa0f5e9-3a94-4018-8d02-f708b657284f.png">

