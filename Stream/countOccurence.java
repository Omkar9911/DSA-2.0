

/*◆ Count the occurrence of each element in a List using Streams.
 */

package Stream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class countOccurence {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple", "Banana", "Apple", "Orange", "Banana", "Apple");

        Map<String, Long> countOcc = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));


        System.out.println(countOcc);



    }
}
