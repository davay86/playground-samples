import java.util.stream.Stream;

public class GenerateInfintiteStream {

    public static void main(String[] args){
        Stream.generate(Math::random).limit(2).forEach(System.out::println);
    }
}
