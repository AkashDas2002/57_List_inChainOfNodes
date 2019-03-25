/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes_whileStyle{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes_whileStyle() {
	headReference = null;
    }
     

    /**
      @return the number of elements in this list
     */
    public int size() {
	Node head = headReference;
	int count = 0;
	while (head != null) {
	    count++;
	    head = headReference.getReferenceToNextNode();
	}
        return count;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
	Node head = headReference;
	String result = "[";
	while(head != null) {
	    result += head;
	    head = headReference.getReferenceToNextNode();
	}
	result += "]";
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
