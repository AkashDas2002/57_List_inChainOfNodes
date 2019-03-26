/**
 Test list features.
 */
public class UserOfList {
    public static void main( String[] args ) {
        List_inChainOfNodes list = new List_inChainOfNodes();

        System.out.println( "number of elements: " + list.size() );
        
        // the spec requests that toString include the size
        System.out.println( "empty list: " + list
                          + System.lineSeparator());

        /* Populate the list with elements.
           // Create the test data in an array, for the programming
           // convenience of being able to loop through it.
        */
        String[] elements = new String[]{"y","u","t","S",};
            /* convenient syntax      ^^^^^^^^^^^^^^^^^^^^
            for convenient way to init an array of Strings */
        int elemIndex;
        for( String elem : elements ) {
            list.addAsHead( elem);
            System.out.println( "number of elements: " + list.size() );
        }
        System.out.println( "populated list: " + list
                          + System.lineSeparator());

	list.add(3, "d");
	System.out.println( "populated list: " + list
                          + System.lineSeparator());
        Object a = list.set(3, "p");
	System.out.println( "populated list: " + list + " replaced object: " + a
                          + System.lineSeparator());

	System.out.println("element 2 is " + list.get(2));

	System.out.println("element 3: " + list.remove(3) + " has been removed. Here is the new list: " + list + System.lineSeparator());
    }
}
