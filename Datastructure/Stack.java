package datastructure ;

import java.lang.IllegalStateException;
import datastructure.LinkedList ;
import java.util.List;

public class Stack < T > {
    
    private int size = 0 ;
    private int top = -1 ;
    private LinkedList< T > stackAarray ;
    private int popAt = 0 ;
    
    public Stack(){
        new Exception(" Need to declare the stack size ").printStackTrace() ;
    }

    public Stack( int size ){
        this.size = size ;
        this.stackAarray = new LinkedList< T >();
    }

    public T peek(){
        if( this.top > -1 )
            return this.stackAarray.get( popAt );
        else{
            new IllegalStateException(" empty stack" ).printStackTrace() ;
            return null ;
        }
    }

    public T pop(){
        if( this.top > -1 ){
            T popElement = this.stackAarray.get( popAt ) ;
            this.stackAarray.removefirst() ;
            this.top = this.top - 1 ;
            return popElement;
        }
        else{
            new Exception(" StackUnderFlow ").printStackTrace() ;
            return null ;
        }
    }

    public T push( T element ){
        if( this.top == this.size ){
            new Exception(" StackOverFlow ").printStackTrace() ;
            return null ;
        }
        else{
            this.stackAarray.addNodefirst( element ) ;
            this.top = this.top + 1 ;
            return element ;
        }
    }

    public boolean empty(){
        if( this.top == -1 )
            return true;
        else
            return false;
    }

    public int search( T searchFor ){
        int i = 0 ;
        while( i < this.top ){
            if( this.stackAarray.get( i ) == searchFor ){
                return i ;
            }
            i++;
        }
        return -1 ;
    }

    public int size(){
        return this.top ;
    }

} 
