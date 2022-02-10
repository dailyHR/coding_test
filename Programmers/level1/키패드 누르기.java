import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        //(0,0) (0,1) (0,2)
        //(1,0) (1,1) (1,2)
        //(2,0) (2,1) (2,2)
        //(3,0) (3,1) (3,2)

        int left = '*'; int right = '#';
        for(int i = 0 ; i < numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] ==7){
                answer += 'L';
                left = numbers[i];
            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] ==9){
                answer += 'R';
                right = numbers[i];
            }
            else{
                if(func(left, numbers[i]) < func(right,numbers[i])){
                    answer += 'L';
                    left = numbers[i];
                }
                else if(func(left, numbers[i]) > func(right,numbers[i])){
                    answer += 'R';
                    right = numbers[i];
                }
                else{
                    if(hand.equals("right")){
                        answer += 'R';
                        right = numbers[i];
                    }
                    else{
                        answer += 'L';
                        left = numbers[i];
                    }
                }
            }
        }
        return answer;
    }
    
    public static int func(int a, int b){
        int[][] key = {{1,2,3},{4,5,6},{7,8,9},{'*',0,'#'}};
        int left_1 =0;
        int right_1 =0;
        for(int i = 0; i < 4; i++){
            for(int j = 0 ; j < 3; j++){
                if(a == key[i][j]){
                    left_1 = i;
                    right_1 = j;
                    break;
                }
            }
        }
        int left_2 =0;
        int right_2 =0;
        for(int i = 0; i < 4; i++){
            for(int j = 0 ; j < 3; j++){
                if(b == key[i][j]){
                    left_2 = i;
                    right_2 = j;
                    break;
                }
            }
        }
        int temp = Math.abs(left_1 - left_2) + Math.abs(right_1-right_2);
        //System.out.print(temp);
        return temp;
    }
}
