/**
  Represent a node that holds...
  o  cargo of interest to the user
  o  reference to the next node in the list
 */

public class Node_whileStyle {
    private Object cargoReference;
    private Node_whileStyle   referenceToNextNode;


    /**
      Construct an instance
     */
    public Node_whileStyle( Object cargoReference) {
		this.cargoReference = cargoReference;
    }
    
    public Node_whileStyle( Object cargoReference, Node_whileStyle referenceToNextNode) {
    /* For incremental development with the skeleton's UserOfNode,
       postpone writing this constructor until after the accessors.
       Then remove this comment, of course.
     */
       	this(cargoReference);
       	this.referenceToNextNode = referenceToNextNode;
    }

    public Object getCargoReference() {
	return cargoReference;
    }

    /**
      @return a string representation of this instance
     */
    public String toString() {
        String result =
            cargoReference.toString()  // polymorphically use appropriately toString!
          + " id " // include a usually-unique identifier for this node
	  + super.toString()
          ;

        // Show rest of chain of nodes
	Node_whileStyle nextNode = referenceToNextNode;
        while(nextNode != null) {
	    result += " --> " + nextNode;
	    nextNode = nextNode.referenceToNextNode;
	}
	result += " [no next]";
        return result;
    }

    // classic accessor and mutator
    public Node_whileStyle getReferenceToNextNode() {
	return referenceToNextNode;
    }

    public void setReferenceToNextNode( Node_whileStyle referenceToNextNode) {
	this.referenceToNextNode = referenceToNextNode;
    }
}
