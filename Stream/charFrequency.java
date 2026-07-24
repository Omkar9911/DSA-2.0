package Stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class charFrequency {
    public static void main(String[] args) {

        String str = "AAABBCCCCD";


        Map<Character, Long> frequency =  str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        System.out.println(frequency);

    }
}
