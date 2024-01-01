package array;

public class _1295FindNumberswithEvenNumberofDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (hasEventNumberSecondSolution(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int hasEventNumberFirstSolution(int num) {
        return Integer.toString(num).length();
    }

    public static int hasEventNumberSecondSolution(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}


/*
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 * 1295. Find number with event number of digits
 * Given an array nums of integers, return how many of them contain an event number of ditgits.
 * Example:
 * - Input: nums = [12, 345, 2, 6, 7896]
 * - Output: 2
 * - Explanation:
 * + 12 contains 2 digits (event number of digits)
 * + 345 contains 3 digits (odd number of digits)
 * + 2 contains 1 digit (odd number of digits)
 * + 6 contains 1 digit (odd number of digits)
 * + 7896 contains 2 digits (event number of digits)
 */