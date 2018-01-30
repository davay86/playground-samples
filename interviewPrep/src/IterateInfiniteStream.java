import java.util.stream.Stream;

public class IterateInfiniteStream {

    public static void main(String[] args){
        Stream.iterate("hello", msg -> msg += "o").limit(20).forEach(System.out::println);
    }
}
