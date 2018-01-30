import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceStream {

    public static void main(String[] args){
        List<String> strings = Arrays.asList("Hello","World","Reduce","Sample");

        String reduce = strings.stream().peek(System.out::println).reduce("", String::concat);

        System.out.println(reduce);
    }
}
