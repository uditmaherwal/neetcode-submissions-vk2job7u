class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int storedWater = 0;

        for(int i = 0; i < height.length; i++){
            while(!stack.isEmpty() && height[i] >= height[stack.peek()]){
                int mid = height[stack.pop()];
                if(!stack.isEmpty()){
                    int right = height[i];
                    int left = height[stack.peek()];
                    int h = Math.min(right, left) - mid;
                    int w = i - stack.peek() - 1;
                    storedWater += h * w;
                }
            }
            stack.push(i);
        }
        return storedWater;
        /*
    

    3 => peek : number present => number = current => current.pop - add this number to stack | stack : 3
    1 => peek : number present => number > current => water store : number - current => 3-1 = 2 | stack : 3
    0 => peek : number present => number > current => water store : number - current => 3-0 = 3 | stack : 3
    1 => peek : number present => number > current => water store : number - current => 3-1 = 2 | stack : 3
    3 => peek : number present => number < current => current - pop.number | stack : 3
    0 => peek : number present => add water = peek() - current => 2-0=2 | Stack : 2
    2 => peek : no number present => non zero => add to stack | Stack : 2
    0 => peek : no number present | stack : empty

    */
    }
}
