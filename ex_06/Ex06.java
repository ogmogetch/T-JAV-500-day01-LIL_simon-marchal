
public class Ex06 {
    public static void sequence(int nbr){
        String str = "1";
        for (int i = 0; i < nbr; i++) {
            System.out.println(str);
            String tmp = "";
            int count = 1;
            for (int j = 0; j < str.length(); j++) {
                if (j+1 < str.length() && str.charAt(j) == str.charAt(j+1)) {
                    count++;
                } else {
                    tmp += count;
                    tmp += str.charAt(j);
                    count = 1;
                }
            }
            str = tmp;
        }
    }
//    public static void main ( String [] args ) {
 //       sequence(10);
   // }
}
