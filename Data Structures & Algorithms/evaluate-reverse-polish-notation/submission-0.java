class Solution {
    public int evalRPN(String[] tokens) {
        
        List<String> tokenList = new ArrayList<>(Arrays.asList(tokens));
        Stack<Integer> stack = new Stack<>();

        for(String s : tokenList){
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }else if(s.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(s.equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }else{
                stack.push(Integer.parseInt(s));
            }
        }

        return stack.peek();
    }
}
