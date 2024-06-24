

public class Main {
  public static void main(String[] args) {
    
    System.out.println("Testing our stack data.");
    System.out.println("Creating stack.");
    Stack stack = new Stack(1);
    System.out.println("Printing stack.");
    stack.printStack();
    System.out.println("");
    
    System.out.println("Testing our push function.");
    System.out.println("Pushin 2.");
    stack.push(2);
    System.out.println("Printing stack.");
    stack.printStack();
    System.out.println("");

    System.out.println("Testing our pop function.");
    System.out.println("poping.");
    stack.pop();
    System.out.println("Printing stack.");
    stack.printStack();
    System.out.println("");
    
  }

}