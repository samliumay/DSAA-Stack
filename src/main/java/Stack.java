/*
- linkedList class -
- So we implemented the datastructure itself at here. 
- I will be explaining all the functions one by one. It will be not do detailed. At videos we will be looking for the functions and their complexity more deeply.  
- For any errors or problems, please mail: samliumay965@gmail.com
*/
public class Stack {
  // Reference variable for the head Node.
  private Node top;

  // Variable to follow the size of linkedlist.
  private int size;

  // Constructor of the Linkedlist. We will be creating the Linkedlist by creating
  // the first node based on the value itself. Then we will be referencing the
  // head and tail nodes to this first node. Becaouse the first and the last node
  // is same when the size of list is 1. Then we set the size of linkedlist to 1.
  public Stack(int value) {
    Node newNode = new Node(value);
    top = newNode;
    size = 1;
  }

  // Setters and getters
  public int getSize() {
    return size;
  }

  public Node getHead() {
    return top;
  }

  // Function to insert a value to begining of the Linkedlist. As you can see the
  // complexity of the function is O(1).
  public void push(int value) {
    Node newNode = new Node(value);

    if (size == 0) {
      top = newNode;
    } else{
      newNode.setNext(top);
      top = newNode;
    }
    size++;
  }

  // Function to remove the first value of the list. Complexity is O(1).
  public Node pop() {

    if (size == 0) {
      return null;
    }
    Node temp = top;
    top = top.getNext();
    temp.setNext(null);
    size--;
    return temp;

  }

  // Function to print the list in a proper way. Not to relevant.
  public void printStack() {
    
    Node temp = top;
    while (temp != null) {
      System.out.print(temp.getValue() + " -> ");
      temp = temp.getNext();
    }
    System.out.print("null \n");

}
}