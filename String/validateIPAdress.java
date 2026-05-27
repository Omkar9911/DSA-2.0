/*

Validate IP Address
        Solved
Medium
        Topics
premium lock icon
        Companies
Given a string queryIP, return "IPv4" if IP is a valid IPv4 address, "IPv6" if IP is a valid IPv6 address or "Neither" if IP is not a correct IP of any type.

A valid IPv4 address is an IP in the form "x1.x2.x3.x4" where 0 <= xi <= 255 and xi cannot contain leading zeros. For example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses while "192.168.01.1", "192.168.1.00", and "192.168@1.1" are invalid IPv4 addresses.

A valid IPv6 address is an IP in the form "x1:x2:x3:x4:x5:x6:x7:x8" where:

        1 <= xi.length <= 4
xi is a hexadecimal string which may contain digits, lowercase English letter ('a' to 'f') and upper-case English letters ('A' to 'F').
Leading zeros are allowed in xi.
For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses, while "2001:0db8:85a3::8A2E:037j:7334" and "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6 addresses.



Example 1:

Input: queryIP = "172.16.254.1"
Output: "IPv4"
Explanation: This is a valid IPv4 address, return "IPv4".
Example 2:

Input: queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
Output: "IPv6"
Explanation: This is a valid IPv6 address, return "IPv6".
Example 3:

Input: queryIP = "256.256.256.256"
Output: "Neither"
Explanation: This is neither a IPv4 address nor a IPv6 address.
*/




package String;

public class validateIPAdress {

    public String validIPAddress(String queryIP) {

        // IPv4 Check
        if (queryIP.contains(".")) {

            String[] parts = queryIP.split("\\.", -1);

            if (parts.length != 4) {
                return "Neither";
            }

            for (int i = 0; i < parts.length; i++) {

                String part = parts[i];

                // Empty check
                if (part.length() == 0) {
                    return "Neither";
                }

                // Leading zero check
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return "Neither";
                }

                // More than 3 digits cannot be valid IPv4
                if (part.length() > 3) {
                    return "Neither";
                }

                // Digit check
                for (int j = 0; j < part.length(); j++) {

                    char ch = part.charAt(j);

                    if (!Character.isDigit(ch)) {
                        return "Neither";
                    }
                }

                int num = Integer.parseInt(part);

                // Range check
                if (num < 0 || num > 255) {
                    return "Neither";
                }
            }

            return "IPv4";
        }

        // IPv6 Check
        if (queryIP.contains(":")) {

            String[] parts = queryIP.split(":", -1);

            if (parts.length != 8) {
                return "Neither";
            }

            String hex = "0123456789abcdefABCDEF";

            for (int i = 0; i < parts.length; i++) {

                String part = parts[i];

                // Length check
                if (part.length() == 0 || part.length() > 4) {
                    return "Neither";
                }

                // Hex character check
                for (int j = 0; j < part.length(); j++) {

                    char ch = part.charAt(j);

                    if (hex.indexOf(ch) == -1) {
                        return "Neither";
                    }
                }
            }

            return "IPv6";
        }

        return "Neither";
    }
}
