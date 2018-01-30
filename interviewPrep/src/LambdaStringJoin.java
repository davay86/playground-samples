import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStringJoin {
    
    public static void main(String[] args){
        List<String> strings = Arrays.asList("Hello","String","Join","Sample");

        String joinString = strings.stream().collect(Collectors.joining(", "));

        System.out.println(joinString);
    }
}
