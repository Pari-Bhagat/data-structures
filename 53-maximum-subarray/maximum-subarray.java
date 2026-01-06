class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            curr = curr + num;
            if(curr > maxi) maxi = curr;
            if(curr < 0) curr = 0;
        }
        return maxi;
    }
}