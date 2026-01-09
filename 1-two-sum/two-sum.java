class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Use a HashMap pair index for element as key and index as value to be returned
        Map<Integer, Integer> pairIdx = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(pairIdx.containsKey(target - num)){
                return new int[] {i, pairIdx.get(target - num)};
            }
            pairIdx.put(num, i);
        }
        return new int[]{};   
    }
}