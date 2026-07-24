package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class nonRepeatingEle {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(4, 5, 1, 2, 0, 4, 1, 2);


        Integer firstNonRepeating = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() ==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

        System.out.println(firstNonRepeating);

    }
}




/*Step-by-Step Explanation
Step 1: Input List
[4, 5, 1, 2, 0, 4, 1, 2]
Step 2: Create Stream
list.stream()
Step 3: Count Occurrences
.collect(Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()))
Why LinkedHashMap?

A normal HashMap does not preserve insertion order.

LinkedHashMap preserves the order in which elements first appeared.

The map becomes:

{
4=2,
5=1,
1=2,
2=2,
0=1
}

Notice the order is the same as the original list.

Step 4: Convert Map to Stream
.entrySet().stream()

Now the stream contains:

4=2
5=1
1=2
2=2
0=1
Step 5: Filter Non-Repeating Elements
.filter(entry -> entry.getValue() == 1)

Keep only entries whose count is 1.

Result:

5=1
0=1
Step 6: Extract Keys
.map(Map.Entry::getKey)

Now the stream contains:

5
0
Step 7: Get the First Element
.findFirst()

Returns:

5
Step 8: Handle Empty Result
.orElse(null)

If no non-repeating element exists, it returns null.

Visual Flow
Original List

[4,5,1,2,0,4,1,2]
        │
        ▼
groupingBy()
        │
        ▼
{
4=2,
5=1,
1=2,
2=2,
0=1
}
        │
        ▼
entrySet().stream()
        │
        ▼
filter(value == 1)
        │
        ▼
5=1
0=1
        │
        ▼
map(getKey)
        │
        ▼
5
0
        │
        ▼
findFirst()
        │
        ▼
5
Why Use LinkedHashMap?

Suppose you use a HashMap:

Collectors.groupingBy(
    Function.identity(),
    Collectors.counting())

The output order is not guaranteed.

Example:

{
1=2,
4=2,
0=1,
5=1,
2=2
}

Now findFirst() might return 0 instead of 5.

That's why LinkedHashMap is important when the question asks for the first non-repeating element.

Interview Explanation (30 Seconds)

"I first count the frequency of each element using Collectors.groupingBy() and Collectors.counting(). I use a LinkedHashMap to preserve the insertion order. Then I stream over the map entries, filter the entries with a count of 1, map them to their keys, and use findFirst() to get the first non-repeating element."



Time Complexity
Counting frequencies: O(n)
Filtering the map: O(n)

Overall: O(n)

*/
