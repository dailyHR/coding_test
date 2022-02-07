import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] temp = new int[n];
        for(int i = 0 ; i < n ; i++){
            temp[i] = arr1[i] | arr2[i];
        }
        
        for(int i = 0 ; i < n; i++){
            answer[i] = func(n, temp[i]);
        }
        
        return answer;
    }
    
    public static String func(int n, int number){
        String temp = "";
        char tempCh = 'a';
        Stack<Character> stack = new Stack<Character>();
        while(number > 0){
            int a = number % 2;
            tempCh = (a==1) ? '#' : ' ';
            stack.push(tempCh);
            number /= 2;
        }
        
        if(stack.size() != n){
            int s = n-stack.size();
            
            while(s>0){
                stack.push(' ');
                s -= 1;
            }
        }
        
        while(!stack.isEmpty()){
            temp += stack.pop();
        }
        
        return temp;
    }
}
