import java.util.ArrayList;

public class Ex06 {
    public static void sequence(int nbr){
        if (nbr < 0) {
            return;
        }
        ArrayList<String> cauet = new ArrayList<String>();
        cauet.add("1");
        for(int i = 0; i < nbr; i++){
            String current = cauet.get(i);
            StringBuilder next = new StringBuilder();
            int count = 1;
            for(int j = 0; j < current.length(); j++){
                if(j + 1 < current.length() && current.charAt(j) == current.charAt(j + 1)){
                    count++;
                } else {
                    next.append(count).append(current.charAt(j));
                    count = 1;
                }
            }
            cauet.add(next.toString());
        }

        for (String s : cauet) {
            System.out.println(s);
        }
    }
}