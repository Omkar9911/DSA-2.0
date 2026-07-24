package Stream;
import java.util.*;


public class longestString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java",
                "Spring",
                "Microservices",
                "Docker",
                "AWS"
        );

       String longest = list.stream()
               .max(Comparator.comparing(String::length))
               .orElse(null);

       System.out.println(longest);



    }
}
