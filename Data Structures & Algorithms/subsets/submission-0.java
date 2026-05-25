class Solution {

    private List<List<Integer>> res;

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> cur = new ArrayList<>();
        res = new ArrayList<>();
        backtrack(nums, cur, 0);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> cur, int index){

        if(index >= nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }

        cur.add(nums[index]);
        backtrack(nums, cur, index+1);
        cur.remove(cur.size() - 1);
        backtrack(nums, cur, index+1);
    }
}
