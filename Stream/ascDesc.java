package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ascDesc {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(14);
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

        Set<Integer> ascDesc = list.stream()
                .sorted(Comparator.reverseOrder())  // .sorted -> ASC Order
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("ascDesc:" + ascDesc);





    }
}
