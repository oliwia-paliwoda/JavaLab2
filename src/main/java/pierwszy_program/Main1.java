package pierwszy_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main1 {
    public static void main (String[] args){

        List<Integer> dane = new ArrayList<Integer>();
        Random random = new Random();
        for (int i=0; i<10; i++){

            int rand = random.nextInt(10);
            dane.add(rand);
        }

        List<Integer> filteredList = new ArrayList<Integer>();
        for (Integer e : dane){
            if (e>5){
                filteredList.add(e);
            }
        }
        System.out.println(filteredList);
    }

}
