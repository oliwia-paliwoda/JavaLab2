package pierwszy_program;

import java.util.List;
import java.util.Random;
import java.util.stream.*;

public class Main2 {

    public static void main (String[] args){

        Stream<Integer> randStream = Stream.generate(()-> new Random().nextInt(10)).limit(10);
        List<Integer> filteredList2 = randStream.filter(e -> e > 5).collect(Collectors.toList());
        System.out.println(filteredList2);
    }
}
