package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class uppercase {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "java",
                "spring",
                "docker",
                "aws"
        );


        List<String> upper = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                ;

        System.out.println(upper);

    }
}
