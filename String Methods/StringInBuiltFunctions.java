
import str.methods.StringFunctions;
import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException;

public class StringInBuiltFunctions {

    public static void main( String[] args ) throws IOException{
        
        BufferedReader read = new BufferedReader( new InputStreamReader( System.in) );
        System.out.println( "Enter Input String ");
        // String input = new String( read.readLine() );
        String input = "jeyasingh alex " ;
        StringFunctions str = new StringFunctions( input );

        System.out.println( "\nString \n" +  input );
        // System.out.println(str.indexOf("alex", 11));
        // System.out.println( "String Length \n" + str.length() );
        // System.out.println( "String to char Array \n {" );
        // char[] array =  str.toCharArray() ;
        // for( char k : array ){
        //     System.out.print( k + "  " );
        // }
        // System.out.println( " }\nCheck the input String is Empty or not " + str.isEmpty() );
        // System.out.println( "\nCheck the Input String contains the char \n enter string : " );
        // // char k  = (char)( read.read() );
        // System.out.println( "\nIs contains char " + 'w' + "  :" + str.contains( 'h' ) ); 
        // System.out.println( "\nGet the char at the given index " +  "11 :" );
        // System.out.println( str.charAt( 11 ) );
        // System.out.println( "\nGet the first occurance char index   " + "a  : "+ str.indexOf( 'a' ) );
        // System.out.println( "\nGet the first occurance char after the index   " + "a  : " + str.indexOf( 'a' , 4 ));
        // System.out.println( "\nGet the first occurance char index form backword " + "a  : "  + str.lastIndexOf( 'a') );
        // System.out.println( "\nGet the first occurance char index before the index form backword " + "a  : "  + str.lastIndexOf( 'a' , 6) );
        // System.out.println( "\nGet the first occurance String index  " + "surya  :" + str.indexOf( "surya" ) );
        // System.out.println( "\nGet the first occurance String index after the index " + "surya  :" + str.indexOf( "surya" , 6 ) );
        System.out.println( "\ncheck string start with subString index " + str.startWith( "jey" ));   
        // System.out.println( "\ncheck string start with subString fromindex " + str.startWith( "surya" , 5 ) );
        // System.out.println( "\ncheck string start with subString index " + str.endsWith( "surya" )); 
        // System.out.println( "\nCompareTo " + "Eswarsurya   " + str.compareTo( "surya" ) );
        // System.out.println( "\nCompareToIgnoreCase  " + "esWarS    " + str.compareToIgnoreCase( "esWarSU" ));
        // byte b = 34 ;
        // short s = 434 ;
        // int in = 532 ;
        // long l = 8723682323l ;
        // System.out.println( "\nvalueOf( byte ) " + str.valueOf( b ));
        // System.out.println( "\nvalueOf( short ) " + str.valueOf( s ));
        // System.out.println( "\nvalueOf( int ) " + str.valueOf( in ));
        // System.out.println( "\nvalueOf( long ) " + str.valueOf( l ));
        // char[] temArray = new char[]{ 'l' , 'i' , 'k' , 'e' };
        // System.out.println( "\nvalueOf( char[] ) " + str.valueOf( temArray ) );
        // System.out.println( "\nConcat   " + str.concat( "anna") );
        // System.out.println("\ntoUpperCase  " + str.toUpperCase() );
        // System.out.println("\ntoLowerCase  " + str.toLowerCase() );
        // // System.out.println( input ) ;
        // System.out.println( "\nsubString " + str.subString( 7 ) );
        // System.out.println( "\nsubString " + str.subString( 5 , 9 ) );

   
    }

}
