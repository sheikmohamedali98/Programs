package datastructure ;


public class LinkedList < T >{    
        
    class Node < T >{    
        T data;    
        Node< T > next;    
            
        public Node( T data) {    
            this.data = data;    
            this.next = null;    
        }    
    }    
     
    public Node< T > head = null;    
    public Node< T > tail = null; 
    private int size = -1 ;
        
    public void addNode(T data) {    
        Node< T > newNode = new Node < T >(data);    
            
        if(head == null) {    
            head = newNode;    
            tail = newNode;    
            size++;
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;   
            size++; 
        }    
    }    

    public void addNodefirst(T data) {    
        Node< T > newNode = new Node < T >(data);    
            
        if(head == null) {    
            head = newNode;    
            tail = newNode;  
            size++;  
        }    
        else {    
            newNode.next = head;    
            head = newNode;  
            size++;  
        }    
    }   

    public void removefirst() {  
  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            if(head != tail) {  
                head = head.next; 
                size--; 
            }  
            else {  
                head = tail = null;  
                size--;
            }  
        }  
    }  
  
        
    public int size() { 
        return this.size+1 ;       
    }    
            
    public T get( int index ){
        Node< T > newNode = head;  

        for( int i = 0 ; i <= this.size ; i++ ){
            newNode = newNode.next ;
            if( i == index ){
                return newNode.data ;
            }
        }
        return null ;
    }
          
} 