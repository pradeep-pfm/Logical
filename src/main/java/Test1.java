import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {


        //How to count each element/word from the String ArrayList in Java8? //List<String> names = Arrays.asList("AA", "BB", "AA", "CC"); Ans- {CC=1, BB=1, AA=2}

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC"); //Ans- {CC=1, BB=1, AA=2}


        Map<String, Long> newList = names.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(newList);

    }
   // List<Integer> newList=Arrays.stream(names)
//    Create Procedure
//
//           Begin
//    END;


}
