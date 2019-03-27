/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes() {
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
	    List_inChainOfNodes newList = new List_inChainOfNodes();
	    newList.headReference = head.getReferenceToNextNode();
	    return newList.size() + 1;
	}
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() { //this is from solutionHolmes
	String result = size() + " elements [";
	for( Node node = headReference
           ; node != null
           ; node = node.getReferenceToNextNode() )
            result += node.getCargoReference() + ",";
        return result + "]";
    }
    
    
    /**
      Append @value to the head of this list.
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean addAsHead( Object val) {
	 // Node prevHead = headReference;
	 //headReference = new Node(val, prevHead);
	 add(0, val);
	 return true;
     }

    public void add(int index, Object newValue) {
	if (index == 0) {
	    Node oldHead = headReference;
	    headReference = new Node(newValue, oldHead);
	}
	else {
	    Node node = headReference;
	    for( int i = 0; i < index - 1; i++) {
		node = node.getReferenceToNextNode();
	    }
	    Node ref = node.getReferenceToNextNode();
	    node.setReferenceToNextNode(new Node(newValue, ref));
        }
    }

    public Object set(int index, Object newValue) {
	/*
	if (index == 0) {
	    Node oldHead = headReference;
	    headReference = new Node(newValue, oldHead.getReferenceToNextNode());
	    return oldHead.getCargoReference();
	}
	else {
	    Node node = headReference;
	    for( int i = 0; i < index - 1; i++) {
		node = node.getReferenceToNextNode();
	    }
	    Node ref = node.getReferenceToNextNode().getReferenceToNextNode();
	    node.setReferenceToNextNode(new Node(newValue, ref));
	    return node.getReferenceToNextNode().getCargoReference();
	}
	*/
	Object a = remove(index);
	add(index, newValue);
	return a;
    }


    public Object get(int index) {
	if (index == 0) {
	    return headReference.getCargoReference();
	}
	else {
	    List_inChainOfNodes newList = new List_inChainOfNodes();
	    newList.headReference = headReference.getReferenceToNextNode();
	    return newList.get(index -  1);
	}
	
    }

    public Object remove( int index) {
	if (index == 0) {
	    Object obj = get(0);
	    headReference = headReference.getReferenceToNextNode();
	    return obj;
	}
	else {
	    Object obj = get(index);
	    Node node = headReference;
	    for( int i = 0; i < index - 1; i++) {
		node = node.getReferenceToNextNode();
	    }
	    
	    node.setReferenceToNextNode(node.getReferenceToNextNode().getReferenceToNextNode() );
	    return obj;
	}
    }	
	
}
