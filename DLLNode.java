// Maggie Xia
// APCS2 pd1
// HW18a--On The DLL
// 2017-03-16

/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 *****************************************************/

public class DLLNode {

    private Object _cargo;    
    private DLLNode _before;
    private DLLNode _after; 

    // constructor -- initializes instance vars
    public DLLNode( Object value, DLLNode before, DLLNode after ) {
	_cargo = value;
	_before = prev;
	_after = next;
    }


    //--------------v  ACCESSORS  v--------------
    public Object getCargo() {
	return _cargo;
    }    

    public DLLNode getBefore() {
	return _before;
    }
    
    public DLLNode getAfter() {
	return _after;
    }
    
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( Object o ) {
	Object prev = _cargo;
	_cargo = o;
	return prev;
    }

    public DLLNode setBefore( DLLNode d ) {
	DLLNode prev = _before;
	_before = d;
	return prev;
    }

    public DLLNode setAfter( DLLNode d ) {
	DLLNode prev = _after;
	_after = d;
	return prev;
    }    
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    public static void main( String[] args ) {
	//Below is an exercise in creating a linked list...

	//Create a node
	DLLNode first = new DLLNode( "cat", null, null );

	//Create a new node after the first
	first.setNext( new DLLNode( "dog", null ) );

	//Create a third node after the second
	first.getAfter().setNext( new DLLNode( "cow", null, this ) );
	
	/*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	
	while( first != null ) {
	    System.out.println( first );
	    first = first.getAfter();
	}
	

	//Q: When head ptr moves to next node in list, what happens to the node it just left?
	//A: The node it just left is ignored
    
    }//end main

}//end class DLLNode
