
/*Find duplicate elements from a List using Streams.
 */

package Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class findDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(5);
        list.add(8);

        System.out.println("unfliter:"+ list);

        Set<Integer> unique = new HashSet<>();

        Set<Integer> duplicate = list.stream()
                .filter(n -> !unique.add(n))
                .collect(Collectors.toSet());

        System.out.println("duplicates:" + duplicate);




    }

}
