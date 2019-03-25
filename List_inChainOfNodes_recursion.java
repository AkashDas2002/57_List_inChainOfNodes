/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_recursion{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_recursion() {
	headReference = null;
    }
     

    /**
      @return the number of elements in this list
     */
    public int size() {
	if (headReference == null) {
	    return 0;
	}
	else {
	    Node head = headReference;
	    List_inChainOfNodes_recursion newList = new List_inChainOfNodes_recursion();
	    newList.headReference = head.getReferenceToNextNode();
	    return newList.size() + 1;
	}
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
	String result = "[";
	if (headReference == null) {
	    result += "]";
	}
	else {
	   Node head = headReference;
	   List_inChainOfNodes_recursion newList = new List_inChainOfNodes_recursion();
	   newList.headReference = head.getReferenceToNextNode();
	   result += head + "," + newList.toString();
	}
	return result;
    }
    
    
    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	 Node prevHead = headReference;
	 headReference = new Node(val, prevHead);
         return true;
     }
}
