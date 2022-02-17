import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        
        for(int i = 0 ; i < progresses.length; i++){
            int value = progresses[i];
            int sp = speeds[i];
            int count = 0; //작업에 걸리는 날 count
            while(value < 100){
                count ++; 
                value += sp;
            }
            if(!queue.isEmpty()){
                int temp = queue.peek();
                if(count > temp){
                    list.add(queue.size());
                    while(!queue.isEmpty()){
                        queue.remove();
                    }
                }
            }
            queue.add(count);
            
        }
        list.add(queue.size());
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        //System.out.println(list);
        return answer;
    }
}
