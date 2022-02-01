import java.util.*;
class Solution {
    public String solution(String new_id) {

        //new_id : 3자 이상 15자 이하.
        //알파벳 소문자, 숫자, 빼기, 밑줄, 마침표.
        //마침표는 처음과 끝 사용x
        String answer = "";
        char[] id = new_id.toCharArray();
        //1단계
        String table = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0 ; i < id.length; i++){
            if(id[i] >= 'A' && id[i] <= 'Z'){
                int index = id[i] - 'A';
                id[i] = table.charAt(index);
            }
        }

        ArrayList<Character> copy_id = new ArrayList<Character>();
        //2단계
        for(int i = 0 ; i < id.length; i++){
            if(((id[i] >= 'a' && id[i] <= 'z') 
               || (id[i] >= '0' && id[i] <= '9')
               || id[i] == '-' || id[i] =='_' || id[i]=='.')){
                copy_id.add(id[i]);
            }
        }

        ArrayList<Character> copy_id2 = new ArrayList<Character>();

        //3단계

        int count = 0;
        while(count < copy_id.size()){
            char content = copy_id.get(count);
            if(copy_id2.size() > 0 && content == '.'){
                if(copy_id2.get(copy_id2.size()-1) == '.'){
                    count++;
                }
                else{
                    copy_id2.add(content);
                }
            }
            else{
                copy_id2.add(content);
                count++;

            }            


        }

        //4단계
        if(copy_id2.get(0) == '.'){
            copy_id2.remove(0);
        }

        if(copy_id2.size() > 0 && copy_id2.get(copy_id2.size() - 1) == '.'){
            copy_id2.remove(copy_id2.size() - 1);
        }


        //5단계
        if(copy_id2.size() == 0){
            copy_id2.add('a');
        }

        //6단계
        int temp = copy_id2.size() - 15;
        if(copy_id2.size() > 0){
            for(int i = 0; i < temp; i++){
                copy_id2.remove(copy_id2.size() - 1);
            }
        }

        if(copy_id2.size() > 0 && copy_id2.get(copy_id2.size() - 1) == '.'){
            copy_id2.remove(copy_id2.size() - 1);
        }

        //7단계

        if(copy_id2.size() <= 2 && copy_id2.size() > 0){
            char temp_ch = copy_id2.get(copy_id2.size()-1);
            while(copy_id2.size()!=3){
                copy_id2.add(temp_ch);
            }
        }

        //System.out.println(copy_id2);
        for(int i = 0 ; i < copy_id2.size(); i++){
            answer += copy_id2.get(i).toString();
        }

        return answer;
    }
}
