public class KadaneAlgorithm {
    public int maxSubArray(int[] nums) {
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            curSum = curSum + nums[i];
            if(maxSum < curSum) maxSum = curSum;
            if(curSum < 0) curSum = 0;
        }
        return maxSum;
    }
}
