// Maggie Xia
// APCS2 pd1
// HW19--Generically Speaking...
// 2017-03-17

/*****************************************************
 * class LList
 * skeleton
 * Implements a linked list of LLNodes.
 *****************************************************/

public class LList implements List 
{ //your homemade List.java must be in same dir

    //instance vars
    private DLLNode _head;
    private int _size;

    // constructor -- initializes instance vars
    public LList( ) {
	_head = new LLNode( null, null );
    }


    //--------------v  List interface methods  v--------------

    public boolean add( Object x ) {
	DLLNode d = _head;
	//shifts all nodes back one to make space for x at the front of new linked node
	while ( d.getCargo() != null ){
	    d = d.getNext();
	}
	d.setCargo(x);
	d.setNext( new DLLNode( null, null ) );
	_size += 1;
	return true;
    }
    
    public Object get( int i ){
	if ( i > _size - 1 ) {
	    return "Nonexistent";
	}
	DLLNode d = _head;
	int counter = 0;
	while ( counter < i ){//counter tells which node to stop at
	    d = d.getNext();
	    counter += 1;
	}
	return d.getCargo();//returns cargo at counter = i
    }

    public Object set( int i, Object o ){
	DLLNode d = _head;
	int counter = 0;
	while ( d.getCargo() != null) {
	    while ( counter < i ){
		d = d.getNext();
		counter += 1;
	    }
	}
	Object s = d.getCargo();
	d.setCargo( o );
	return s;
    }

    //return number of nodes in list
    public int size() {
	return _size;
    } 

    //--------------^  List interface methods  ^--------------

    //more methods
    public void add( int index, Object newVal ){
        DLLNode d = _head;
	int t = 0;
	while ( d.getCargo() != null && t < index - 1 ){
	    d = d.getNext();
	    t += 1;
	}
	DLLNode m = new DLLNode ( newVal, d.getNext());
	d.setNext(m);
    }

    //remove node at pos index, return its cargo
    public Object remove( int index ) {
	index -= 1;
	DLLNode d = _head;
	int t = 0;
	while ( d.getCargo() != null && t < index ){
	    d = d.getNext();
	    t += 1;
	}
	Object s = d.getCargo();
	d.setNext( d.getNext().getNext() );
	return s;
    }

    // override inherited toString
    public String toString() { 
	String retStr = "HEAD->";
	DLLNode tmp = _head; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args ) 
    {
	  LList james = new LList();

	  System.out.println( james );
	  System.out.println( "size: " + james.size() );

	  james.add("beat");
	  System.out.println( james );
	  System.out.println( "size: " + james.size() );

	  james.add("a");
	  System.out.println( james );
	  System.out.println( "size: " + james.size() );

	  james.add("need");
	  System.out.println( james );
	  System.out.println( "size: " + james.size() );

	  james.add("I");
	  System.out.println( james );
	  System.out.println( "size: " + james.size() );

	  System.out.println( "2nd item is: " + james.get(1) );

	  james.set( 1, "got" );
	  System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

	  System.out.println( james );

    }

}//end class LList



