package jz_30_FindMaxSumOfSubarray;

public class Test {
    public static void main(String[] args) {
        int [] array = {6,-3,-2,7,-15,1,2,2};
        Solution solution = new Solution();
        int sum = solution.FindGreatestSumOfSubArray(array);
        System.out.println("连续子数组最大和为"+sum);
    }
}
