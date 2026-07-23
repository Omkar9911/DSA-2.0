package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamEven {

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

        List<Integer> even = list.stream()
                .filter(n -> n % 2 ==0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("even : "+ even);



    }
}
