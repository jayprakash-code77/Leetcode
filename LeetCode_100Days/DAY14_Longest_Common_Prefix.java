package Leetcode.LeetCode_100Days;
class Solution14 {
    // public String longestCommonPrefix(String[] strs) {
    public static String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = strings[0];

        // Iterate through the rest of the strings
        for (int i = 1; i < strings.length; i++) {
            int j = 0;
            // Compare characters in the prefix and the current string
            while (j < prefix.length() && j < strings[i].length() && prefix.charAt(j) == strings[i].charAt(j)) {
                j++;
            }

            // Update the prefix to the common characters found so far
            prefix = prefix.substring(0, j);

            // If no common prefix is found, break the loop
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    // }
}

public class DAY14_Longest_Common_Prefix {
    public static void main(String[] args) {
        // Example
        String[] str = { "flower", "flow", "flight" };
        System.out.println(Solution14.longestCommonPrefix(str));
    }
}
