class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]);

        for(int i = 1; i < intervals.length; i++){
            int[] prev = output.get(output.size()-1);
            int[] curr = intervals[i];

            if(curr[0] <= prev[1]){
                prev[0] = Math.min(prev[0], curr[0]);
                prev[1] = Math.max(prev[1], curr[1]);
            }else{
                output.add(intervals[i]);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
