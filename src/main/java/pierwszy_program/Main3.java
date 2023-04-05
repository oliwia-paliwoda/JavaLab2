package pierwszy_program;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main3 {

    public static void main (String[] args){
        List<Integer> filteredList3 =
                Stream.generate(() -> new Random().nextInt(10)).limit(10).filter(e -> e > 5).map(e -> e*2).collect(Collectors.toList());

        List<Integer> filteredList3x =
                Stream.generate(() -> new Random().nextInt(10)).limit(10).filter(e -> e > 5).map(e -> e*2).toList();

        System.out.println(filteredList3);
        System.out.println(filteredList3x);
        //usuwaja sie duplikaty
    }
}
