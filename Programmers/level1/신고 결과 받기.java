import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashSet<String> set = new HashSet<String>();
        for(String s : report) set.add(s);
        //System.out.println(set);
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0 ; i < id_list.length; i++){
            map.put(id_list[i], 0);
        }
        
        HashSet<String> list = new HashSet<String>();
        for(String s : set){
            String[] arr = s.split(" ");
            String user = arr[0];
            String reportUser = arr[1];
            int num = map.get(reportUser);
            num += 1;
            map.put(reportUser, num);
            if(num >= k){
                list.add(reportUser);
            }
        }
        //map : ("신고 당한 사람", 신고 당한 횟수)
         //System.out.println(list);
        for(int i = 0 ; i < id_list.length; i++){
            map.put(id_list[i], 0);
        }
        
        for(String s : set){
            String[] arr = s.split(" ");
            String user = arr[0];
            String reportUser = arr[1];
            
            for(String temp : list){
                if(temp.equals(reportUser)){
                    int num = map.get(user);
                    num += 1;
                    map.put(user, num);
                }
            }
        }
        
        //System.out.println(map);
        
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = map.get(id_list[i]);
        }
        return answer;
    }
}
