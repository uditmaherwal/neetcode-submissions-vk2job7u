class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int stone : stones) {
            arr.add(stone);
        }
        while(arr.size() > 1){
            Collections.sort(arr);
            int cur = arr.remove(arr.size() - 1) - arr.remove(arr.size() - 1);
            if(cur != 0){
                arr.add(cur);
            }
        }

        return arr.isEmpty() ? 0 : arr.get(0);

    }
}
