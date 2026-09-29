class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = 0;
        int actualSum = 0;
        for(int i=1;i<=n;i++){
            expectedSum += i; 
        }

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}