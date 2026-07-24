
/*◆ Find the maximum and minimum number from a List using Streams.
 */

package Stream;

import java.util.ArrayList;
import java.util.Set;

public class minMax {

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

        System.out.println("unFilter:" + list);

//        Integer min = list.stream()
//                .distinct()
//                .sorted()
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("min:"+ min);


        Integer min = list.stream()
                .min(Integer :: compareTo)
                .orElse(null);

        Integer max = list.stream()
                        .max(Integer::compareTo)
                                .orElse(null);


        System.out.println("min:"+ min);
        System.out.println("max:"+ max);






    }
}
