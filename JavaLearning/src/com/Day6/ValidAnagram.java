package com.Day6;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // If lengths differ, not an anagram
        if (s.length() != t.length()) {
            return false;
        }

        // Create HashMaps to count character frequency
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // Count characters for string s
        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // Count characters for string t
        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // Compare both maps
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        boolean result = isAnagram(s1, s2);

        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + result);
    }
}

