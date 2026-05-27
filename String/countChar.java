package String;

public class countChar {
    public class Main {
        public static void main(String[] args) {

            String input = "AAABBCDD";
            StringBuilder result = new StringBuilder();

            int count = 1;

            for (int i = 1; i <= input.length(); i++) {

                if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                    count++;
                } else {

                    // Append repeated characters directly from substring
                    result.append(input.substring(i - count, i));
                    result.append(count);

                    count = 1;
                }
            }

            System.out.println(result);
        }
    }
}
