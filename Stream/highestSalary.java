package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class highestSalary {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 25, 8, 45, 32, 45, 18);
        int n = 1;

        Integer salary = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())  //// Sort in descending order
                .skip(n-1)
                .findFirst()
                .orElse(null);

        System.out.println("salary:" + salary);



    }
}
