import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartintioningByLambda {

    public static void main(String[] args){
        List<String> strings = Arrays.asList("Ahello","Aworld","Bhello","Bworld");
        Map<Boolean, List<String>> groupedMap = strings.stream().collect(Collectors.partitioningBy(e -> e.contains("A")));

        List<String> trueStrings = groupedMap.get(true);
        List<String> falseStrings = groupedMap.get(false);

        System.out.println("====TRUE====\n" + groupedMap.get(true) );

        System.out.println("====FALSE====");
        falseStrings.stream().forEach(System.out::println);
    }

}
