
/*◆ Find unique elements from a List using Streams. */

package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueStream {

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

        System.out.println("unfliter:" + list);

        List<Integer> uni = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("uni" + uni);




    }

}
