class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> operand = new ArrayList<>();
        int a = 0;
        int b = 0;
        for(String next: tokens){
            if(next.equals("+")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b + a);
            }else if(next.equals("-")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b - a);
            }else if(next.equals("*")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b * a);
            }else if(next.equals("/")){
                a = stack.pop();
                b = stack.pop();
                stack.push(b / a);
            }else{
                stack.push(Integer.parseInt(next));
            }
        }
        return stack.peek();
    }
}