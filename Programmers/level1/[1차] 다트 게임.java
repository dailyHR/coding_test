import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] array = new int[11];
        for(int i = 0 ; i < array.length; i++){
            array[i] = 0;
        }

        int number = 0;
        int index = 0;
        for(int i = 0 ; i < dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            if(ch >= '0' && ch <= '9' && dartResult.charAt(i+1) != '0'){
                number = dartResult.charAt(i) - '0';
                index += 1;
                array[index] = number;
            }
            else if(ch == '1' && dartResult.charAt(i+1) == '0'){
                index += 1;
                array[index] = 10;
                i += 1;
            }
            else if(ch == 'S' || ch == 'D' || ch=='T'){
                array[index] = func(array[index], ch);
            }
            else if(ch == '*'){
                if(index == 1){
                    array[index] = array[index] * 2;
                }
                else{
                    array[index] = array[index] * 2;
                    array[index-1] = array[index-1] *2;
                }
            }
            else if(ch == '#'){
                array[index] = array[index] * (-1);
            }
            
        }
        
        int sum = 0;
        for(int numb : array){ sum += numb; }
        
        
        return answer = sum;
    }
    
    public static int func(int a, char b){
        if(b == 'S'){
            return (int)Math.pow(a, 1);
        }
        else if(b == 'D'){
            return (int)Math.pow(a, 2);
        }
        else{
            return (int)Math.pow(a,3);
        }
    }
    

}
