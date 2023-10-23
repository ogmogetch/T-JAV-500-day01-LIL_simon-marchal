
import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var){
        ArrayList<String> myArray = new ArrayList<String>();
        for (String str : var) {
            myArray.add(str);
        }
        return myArray;
    }
 /*  public static void main ( String [] args ) {
        ArrayList<String> myArray = myGetArgs("Volvo", "BMW", "Ford", "Mazda");
        System.out.println(myArray);
    }*/
}
