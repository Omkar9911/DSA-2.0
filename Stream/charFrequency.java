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





/*Step-by-Step Explanation
Step 1: Input String
AAABBCCCCD
Step 2: chars()
str.chars()

Returns an IntStream because characters are represented by their ASCII/Unicode values.

Example:

65
65
65
66
66
67
67
67
67
68

because

A = 65
B = 66
C = 67
D = 68
Step 3: Convert int → Character
.mapToObj(c -> (char) c)

Converts

65 → 'A'
66 → 'B'
67 → 'C'
68 → 'D'

Now the stream contains:

A
A
A
B
B
C
C
C
C
D
Step 4: groupingBy()
Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()
)

Groups identical characters.

Conceptually:

A → [A,A,A]

B → [B,B]

C → [C,C,C,C]

D → [D]
Step 5: counting()

Counts each group.

Result:

A → 3

B → 2

C → 4

D → 1
Final Output
{A=3, B=2, C=4, D=1}
Visual Flow
String

AAABBCCCCD

      │
      ▼

chars()

65
65
65
66
66
67
67
67
67
68

      │
      ▼

mapToObj(c -> (char)c)

A
A
A
B
B
C
C
C
C
D

      │
      ▼

groupingBy()

A → [A,A,A]

B → [B,B]

C → [C,C,C,C]

D → [D]

      │
      ▼

counting()

A=3
B=2
C=4
D=1
What is mapToObj(c -> (char) c)?

Since chars() returns an IntStream, you cannot directly use groupingBy() with Character.

This line converts each integer into a Character.

.mapToObj(c -> (char) c)

Equivalent to:

.mapToObj(value -> Character.valueOf((char) value))
Interview Explanation (30 Seconds)

"I first convert the string into an IntStream using chars(). Since chars() returns integer Unicode values, I convert each value into a Character using mapToObj(c -> (char)c). Then I use Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()) to group identical characters and count their occurrences while preserving the original order."




⭐ Interview Follow-up

If the interviewer asks for the output in this format instead of a Map:

Input:
AAABBCCCCD

Output:
A3B2C4D1

You can use the frequency map and then join the entries:

String result = frequency.entrySet().stream()
        .map(e -> e.getKey() + String.valueOf(e.getValue()))
        .collect(Collectors.joining());

System.out.println(result);

Output:

A3B2C4D1*/
