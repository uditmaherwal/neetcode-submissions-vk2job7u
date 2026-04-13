class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; 
        int prod = 1;
        int zerosCount = 0;
        for(int i : nums){
            if(i != 0){
                prod *= i;
            }else{
                zerosCount++;
            }
        }

        if(zerosCount > 1){
            return new int[n];
        }

        int[] results = new int[n];

        for(int i = 0; i < n; i++){
            if(zerosCount == 1){
                if(nums[i] == 0){
                    results[i] = prod;
                }else{
                    results[i] = 0;
                }
            }else{
                results[i] = prod/nums[i];
            }
        }
        return results;
    }
}  
