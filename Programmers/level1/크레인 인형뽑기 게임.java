import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        int number = board.length-1;
        int count = 0;
        for(int i = 0 ; i < moves.length; i++){
            int index = moves[i] - 1;
            int pick = 0;
            int k = 0;
            while(board[k][index] == 0){
                k++;
                if(k == number) break;
            }

            pick = board[k][index];
            board[k][index] = 0;

            if(pick != 0){
                if(!stack.isEmpty()){
                    int temp = stack.pop();
                    if(temp == pick){
                        count ++;
                    }
                    else{
                        stack.push(temp);
                        stack.push(pick);
                    }
                }
                else{
                    stack.push(pick);
                }
            }
            
        }
        
        return answer = count*2;
    }
}
