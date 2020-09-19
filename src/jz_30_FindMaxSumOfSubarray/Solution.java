package jz_30_FindMaxSumOfSubarray;

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] += array[i - 1] > 0 ? array[i - 1] : 0;
            max = Math.max(max, array[i]);
        }
        return max;
    }
}
