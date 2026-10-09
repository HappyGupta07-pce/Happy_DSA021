import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    for(String op : operations){
        switch(op){
            case "C" :
              stack.pop();
              break;
            case "D" :
              stack.push(2 * stack.peek());
              break;
            case "+" :
                int last = stack.pop();
                int newScore = last + stack.peek();
                stack.push(last);
                stack.push(newScore);
                break;
            default :
            stack.push(Integer.parseInt(op));
        }
    }
    int sum = 0;
    for(int score : stack){
        sum = score + sum ;
    }
    return sum;
    }
}