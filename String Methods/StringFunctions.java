package str.methods ;

import java.io.StringReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.ArrayIndexOutOfBoundsException;

public class StringFunctions {
    private String input = new String();
    private int length ;
    private char[] charArray ;
    private int strLength ;

    public StringFunctions( String str ){
        this.input = str ;
        this.readString( this.input );
    }

    public void readString( String str ){
        StringReader readStr = new StringReader( str );
        this.strLength = 10 ;
        char[] temArray = new char[ Integer.valueOf( this.strLength ) ];
        int i = 0 ;
        int value ;
        try{
            value = readStr.read();
            while(  value >= 0 && value <= 127 ){
                if( i < this.strLength ){
                    char ch = (char) value ;
                    temArray[i] = ch ;
                    value = readStr.read();
                    i++;
                }
                else{
                    this.strLength = this.strLength + this.strLength ;
                    temArray = new char[ Integer.valueOf( this.strLength )];
                    i = 0 ;
                    readStr = new StringReader( str );
                    value = readStr.read() ;
                }
            }
        }catch( IOException ex ){
            ex.getStackTrace();
        }
        this.length = i ;
        this.charArray = new char[ Integer.valueOf( i )];
        for( i = 0 ; i < this.length ; i++ ){
            this.charArray[i] = temArray[i] ;
        }

        
    }

    public String getstring(){
        return this.input ;
    }

    public int length(){
        return this.length ;
    }

    public char[] toCharArray(){
        return this.charArray ;
    }

    public boolean isEmpty(){
        if( this.length == 0 ){
            return true ;
        }
        else{
            return false ;
        }
    }

    public boolean contains( char searchChar ){
        for( char key : this.charArray ){
            if( key == searchChar )
                return true ;
        }
        return false ;
    }

    public char charAt( int index ){
        try{ 
           if( 0 <= index &&  index <= this.length ){
               return charArray[ index ];
           }
           else{
               throw new ArrayIndexOutOfBoundsException( "ArrayIndexOutofBound" );
           }
        }catch( ArrayIndexOutOfBoundsException ex ){
            ex.getStackTrace();
            return '\0' ;
        }
        
    }

    public int indexOf( char searchChar ){
        return this.indexOf( searchChar , 0 );
    }

    public int indexOf( char searchChar , int fromIndex ){
        try{
            if( 0 <= fromIndex &&  fromIndex <= this.length ){
                for( int i = fromIndex ; i < this.length ; i++ ){
                    if( this.charArray[i] == searchChar ){
                        return i ;
                    }
                }
            }
            else{
                throw new ArrayIndexOutOfBoundsException( "ArrayIndexOutofBound" );
            }
        }catch( ArrayIndexOutOfBoundsException ex ){
            ex.getStackTrace();
            return '\0' ; 
        }
        
        return -1 ;
    }

    public int lastIndexOf( char searchChar ){
        return this.lastIndexOf( searchChar , this.length - 1 );
    }

    public int lastIndexOf( char searchChar , int fromIndex ){
        for( int i = fromIndex  ; i > 0 ; i-- ){
            if( this.charArray[i] == searchChar ){
                return i ;
            }
        }
        return -1 ;
    }

    public int indexOf( String searchFor ){
        return this.indexOf( searchFor , 0 );
    }

    public int indexOf( String searchFor , int fromIndex ){
        StringFunctions key = new StringFunctions( searchFor ); 
        if( this.length < key.length() ){
            return -1 ;
        }
        try{ 
            if( !( 0 <= fromIndex &&  fromIndex <= this.length ) ){
                throw new ArrayIndexOutOfBoundsException( "ArrayIndexOutofBound" );
            }
         }catch( ArrayIndexOutOfBoundsException ex ){
             ex.getStackTrace();
             return -1 ;
         }

        char[] tem = key.toCharArray();
        int i = fromIndex ;
        while( i < this.length  ){
            int temIndex = 0 ;
            while( temIndex < key.length() && i < this.length ){
                if( this.charArray[i] == tem[ temIndex ] ){
                    i++ ;
                    temIndex++ ;
                }
                else 
                    break;
            }
            if( temIndex != key.length() ){
                temIndex = 0 ; 
                i++;
                continue;
            }
            if( temIndex == key.length() ){
                return i - key.length() ;
            }
        }
        return -1 ;
    }

    public boolean startWith( String prefix ){
        return this.startWith( prefix , 0 );
     }
 
     public boolean startWith( String prefix , int indexFrom ){
         StringFunctions key = new StringFunctions( prefix ); 
         if( this.length < key.length() ){
             return false ;
         }
         char[] tem = key.toCharArray();
         int index = indexFrom ;
         for( int i = 0 ; i < key.length() ; i++){
             if( this.charArray[ index ] != tem[i] ){
                 return false ;
             }
             index++;
         }
         return true ;
     }
 
     public boolean endsWith( String suffix ){
         StringFunctions key = new StringFunctions( suffix ); 
         if( this.length < key.length() ){
             return false ;
         }
         char[] tem = key.toCharArray();
         int indexFrom = this.length - key.length();
         int i = indexFrom;
         while( i < key.length() ){
             if( this.charArray[ indexFrom ] != tem[i] ){
                 return false ;
             }
             i++;
             indexFrom++;
         }
         return true ;
     } 

     public int compareTo( String anotherString ){
        
        StringFunctions key = new StringFunctions( anotherString ); 
        char[] tem = key.toCharArray();
        int i = 0 ;
        while( i < this.length &&  i < key.length() ){
            int diff = this.charArray[ i ] - tem[i] ;
            if( diff != 0 ){
                return this.charArray[i] - tem[i];
            }
            i++;
        }
        if( this.length != key.length() ){
            return this.length - key.length() ;
        }
        return 0 ;

    }

    public int compareToIgnoreCase( String anotherString ){
        
        StringFunctions key = new StringFunctions( anotherString ); 
        char[] tem = key.toCharArray();
        
        int i = 0 ;
        int difference ;
          while( i < this.length && i < key.length() ){
              difference = this.charArray[i] - tem[i] ;
              boolean isAlphabet1 = this.charArray[i] >= 65 && this.charArray[i] <= 90 || this.charArray[i] >= 97 && this.charArray[i] <= 122 ;
              boolean isAlphabet2 = tem[i] >= 65 && tem[i] <= 90 || tem[i] >= 97 && tem[i] <= 122 ; 
     
              if( isAlphabet1 && isAlphabet2 ){   
                  if( difference == 0 || difference == 32 || difference == -32 ){
                      i++ ;
                      continue ;
                  }
                  else{
                      return difference ;
                  }
              }
              else if( charArray[i] - tem[i] != 0 ){
                  return difference ;
              }
              i++;
          }
          if( charArray.length != tem.length ){
              return this.length - key.length() ;
          }
          return 0 ;
       
    }

    public String valueOf( byte numValue ){
        return this.valueOf( (long) numValue );
    }
    
    public String valueOf( short numValue ){
        return this.valueOf( (long) numValue );
    }

    public String valueOf( int numValue ){
        return this.valueOf( (long) numValue ) ;
    }

    public String valueOf( long numValue ){
        String newString = new String("");
        long val = numValue ;
        while( val > 0 ){
            int remainder = (int) val % 10 ; 
            newString = new String(  (char) (remainder + '0' ) + newString ) ;
            val = (long ) val / 10 ;
        }
        return newString ;
        
    }

    public String valueOf( char[] charArrayToString ){
        String temString = new String( "" );
        int i = 0 ;
        while( i < charArrayToString.length ){
            temString = new String ( temString + charArrayToString[i] );
            i++;
        } 
        return temString ;
   }

   public String concat( String str ){
        StringFunctions key = new StringFunctions( str );
        char[] newString = key.toCharArray() ;
        int newStringLength = this.length + key.length() ;

        char[] tem = new char[ Integer.valueOf( newStringLength ) ];
        int i = 0 ; 
        while( i < this.length ){
            tem[i] = this.charArray[i];
            i++;
        }
        int j = 0 ;
        while( i < newStringLength ){
            tem[i] = newString[j];
            i++;
            j++;
        }
        return this.valueOf( tem ) ; 
    
    } 

    public String toUpperCase(){
        char[] tem = this.charArray ;
        int i = 0 ;
        while( i < this.length ){
            boolean isAlphabet = this.charArray[i] >= 97 && this.charArray[i] <= 122  ;
            if( isAlphabet ){
                char k = (char) (tem[i] - 32 );
                tem[i] = k ;
            }
            i++;
        }
        return this.valueOf( tem );
    }

    public String toLowerCase(){
        char[] tem = this.charArray ;
        int i = 0 ;
        while( i < this.length ){
            boolean isAlphabet = this.charArray[i] >= 65 && this.charArray[i] <= 90  ;
            if( isAlphabet ){
                tem[i] = (char) (tem[i] + 32 ) ;
            }
            i++;
        }
        return this.valueOf( tem );
    }

    public String subString( int beginIndex  ){
        return this.subString( beginIndex  , this.length );
    }

    public String subString( int beginIndex , int endIndex ){
        
        try{ 
            if( !( 0 <= beginIndex &&  beginIndex <= this.length ) && !( 0 <= endIndex &&  endIndex <= this.length ) ){
                throw new ArrayIndexOutOfBoundsException( "ArrayIndexOutofBound" );
            }
            if( endIndex - beginIndex < 0 ){
                throw new ArrayIndexOutOfBoundsException( "ArrayIndexOutofBound" );
            }
        }catch( ArrayIndexOutOfBoundsException ex ){
            ex.getStackTrace();
            return "" ;
        }

        char[] tem = new char[ Integer.valueOf( endIndex - beginIndex ) ] ;
        int i = 0 ;
        int j = beginIndex ;
        while( j < endIndex ){
            tem[i] = this.charArray[j]  ;
            i++;
            j++;
        }
        return this.valueOf( tem );
    }


}
