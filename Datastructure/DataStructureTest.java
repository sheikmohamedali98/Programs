
import datastructure.Stack ;
import datastructure.Queue;
import datastructure.LinkedList;

public class DataStructureTest {

    public static void main( String[] args ){

        Stack < Integer > stack = new Stack < Integer >(20);

        System.out.println( "pop  " + stack.pop() );
        for( int i = 0 ; i < 22 ; i++ ){
            stack.push( i );
        }
        System.out.println( "pop  " + stack.pop() );
        System.out.println( "peek  " + stack.peek() );
        System.out.println( "empty  " + stack.empty() );
        System.out.println( "search  " +stack.search( 16 )) ;

        System.out.println( " size " + stack.size() );

        // Queue< Integer > queue = new Queue< Integer >(15);

        // for( int i = 0 ; i < 14 ; i++ )
        //     queue.add( i );
            
        // System.out.println( queue.element() );
        // System.out.println( queue.peek() );
        // System.out.println( queue.offer( 2 ) );
        // System.out.println( queue.poll() );
        // System.out.println( queue.remove() );
        // System.out.println( queue.size() );

        // LinkedList< Integer > list = new LinkedList< Integer >();

        // list.addNode( 2 ) ;
        // list.addNode( 5 ) ;
        // list.addNode( 4 ) ;
        // list.addNodefirst( 3 ) ;
        // // System.out.println( list.add( 4 ) );
        // // System.out.println( list.add( 5 ) );
        // // System.out.println( list.add( 6 ) );
        // // System.out.println( list.add( 7 ) );
        // // System.out.println( list.add( 8 ) );
        // System.out.println( list.get( 2 ) );
        // // for( int i = 0 ; i < list.size() -1 ; i++ )
        // // list.removefirst();
        // System.out.println( list.size() );

    }

}