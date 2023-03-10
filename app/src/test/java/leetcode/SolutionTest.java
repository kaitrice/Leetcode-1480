/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package leetcode;

import org.junit.jupiter.api.Test;

import leetcode.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();
    @Test void case1() {
        int[] input = {1,2,3,4};
        int[] expected = {1,3,6,10};
        assertArrayEquals(expected, s.runningSum(input));
    }
    @Test void case2() {
        int[] input = {1,1,1,1,1};
        int[] expected = {1,2,3,4,5};
        assertArrayEquals(expected, s.runningSum(input));
    }
    @Test void case3() {
        int[] input = {3,1,2,10,1};
        int[] expected = {3,4,6,16,17};
        assertArrayEquals(expected, s.runningSum(input));
    }
    @Test void case4() {
        int[] input = {1,2};
        int[] expected = {1,3};
        assertArrayEquals(expected, s.runningSum(input));
    }
    @Test void case5() {
        int[] input = {5,10,15,30};
        int[] expected = {5,15,30,60};
        assertArrayEquals(expected, s.runningSum(input));
    }
}
