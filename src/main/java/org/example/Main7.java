package org.example;

public class Main7 {
    public static void main(String[] args) {
        String [] strs = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0]; // first prefix
        for (int i = 1; i < strs.length; i++) { // for loop for 3 strs
            while (strs[i].indexOf(prefix)!= 0) { // check flower and flow if = nothing
                prefix = prefix.substring(0, prefix.length() - 1); // substring by 1
                if (prefix.isEmpty()) { // if substring till empty
                    return ""; // no common prefix
                }
            }
        }
        return prefix;
    }
}
