import java.util.*;

class Solution{
    public int solution(String s){
        int result = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.size()==0) stack.push(s.charAt(i));
            else if(stack.peek()==s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }
        if (stack.size()==0) result = 1;
        return result;
    }
}