
import java.util.ArrayList;

public class Ex03 {
    public static void printArray (ArrayList < String > myArray ) {
        for ( String str : myArray ) {
            System . out . println ( str ) ;
        }
    }
    public static void main ( String [] args ) {
        ArrayList < String > myArray = new ArrayList < String > ( ) ;
        myArray . add ( " Volvo " ) ;
        myArray . add ( " BMW " ) ;
        myArray . add ( " Ford " ) ;
        myArray . add ( " Mazda " ) ;
        printArray ( myArray ) ;
    }
}
