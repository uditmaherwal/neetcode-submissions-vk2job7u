class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        for(int i = 0; i < n; i++){
            int prod = 1;
            for(int j = 0; j < n; j++){
                if(i != j){
                    prod *= nums[j];
                }
            }
            results[i] = prod;
        }
        return results;
    }
}  
