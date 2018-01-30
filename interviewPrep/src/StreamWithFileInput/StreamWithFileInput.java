package StreamWithFileInput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;

public class StreamWithFileInput {

    public static void main(String[] args) throws IOException {
        Consumer<String> toUpperCase = String::toUpperCase;
        Files.lines(Paths.get("/Users/davidronaldson/Documents/development/interviewPrep/src/StreamWithFileInput/file.txt")).distinct().forEach(System.out::println);
    }
}
