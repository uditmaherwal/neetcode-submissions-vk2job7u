class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> set = new HashMap<>();
        for(int i = 0; i < n; i++){
            int temp = target - nums[i];
            if(set.containsKey(temp)){
                return new int[]{set.get(temp), i};
            }
            set.put(nums[i], i);
        }
        return new int[]{};
    }
}
