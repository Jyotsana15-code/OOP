package com.Day5;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            // If the number already exists in the set, duplicate found
            if (set.contains(num)) {
                return true;
            }
            // Otherwise, add the number to the set
            set.add(num);
        }

        // No duplicates found
        return false;
    }

    public static void main(String[] args) {
        // Example test case
        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate? " + result);
    }
}

