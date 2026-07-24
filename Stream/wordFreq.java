
/*◆ Count the occurrence of each word in a sentence using Streams.
 */

package Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;


public class wordFreq {


    public static void main(String[] args) {

        String sentence = "Java is easy Java is powerful";

        Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));


        System.out.println(wordCount);



    }
}




/*Step-by-Step Explanation
Step 1: Input Sentence
Java is easy Java is powerful
Step 2: Split the Sentence
sentence.split(" ")

Output:

["Java", "is", "easy", "Java", "is", "powerful"]
Step 3: Convert Array to Stream
Arrays.stream(sentence.split(" "))

Now the stream contains:

Java
is
easy
Java
is
powerful
Step 4: groupingBy()
Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()
)

Groups identical words.

Conceptually:

Java      → [Java, Java]

is        → [is, is]

easy      → [easy]

powerful  → [powerful]
Step 5: counting()

Counts each group.

Java      → 2

is        → 2

easy      → 1

powerful  → 1
Final Output
{Java=2, is=2, easy=1, powerful=1}
Visual Flow
Sentence

Java is easy Java is powerful

          │
          ▼

split(" ")

["Java","is","easy","Java","is","powerful"]

          │
          ▼

Arrays.stream()

Java
is
easy
Java
is
powerful

          │
          ▼

groupingBy()

Java      → [Java, Java]
is        → [is, is]
easy      → [easy]
powerful  → [powerful]

          │
          ▼

counting()

Java=2
is=2
easy=1
powerful=1
Interview Explanation (30 Seconds)

"I first split the sentence into words using split(" "). Then I convert the array into a stream using Arrays.stream(). Finally, I use Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()) to group identical words and count their occurrences while preserving the insertion order."

Time Complexity
split() → O(n)
groupingBy() → O(n)

Overall: O(n)

Case-Insensitive Counting

If the interviewer asks to ignore case:

Map<String, Long> wordCount = Arrays.stream(sentence.toLowerCase().split(" "))
        .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()
        ));

Input:

Java java JAVA is Is

Output:

{java=3, is=2}
Handle Multiple Spaces

Instead of:

split(" ")

use:

split("\\s+")

This handles one or more whitespace characters (multiple spaces, tabs, etc.).

Quick Revision
Operation	Purpose
split("\\s+")	Split sentence into words
Arrays.stream()	Convert array to stream
groupingBy()	Group same words
Function.identity()	Use the word as the key
LinkedHashMap::new	Preserve insertion order
counting()	Count occurrences
Formula to Remember
Map<String, Long> map = Arrays.stream(sentence.split("\\s+"))
        .collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting()));

This is the standard Java Streams solution that interviewers typically expect for counting the occurrence of each word in a sentence.*/


