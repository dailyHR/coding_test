package grammar;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        /* 스택 */
        //먼저 들어간 자료가 나중에 나오는 LIFO구조
        //그래프의 깊이우선탐색(DFS)에서 사용

        //값 추가 : push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //값 삭제
        stack.pop();

        //stack 전체 값 제거(초기화)
        stack.clear();

        //** 가장 상단의 값 출력 **
        stack.peek();
        stack.size(); //stack의 크기 출력
        stack.empty(); //stack이 비어있는지
        stack.contains(1); //stack에 1이 있는지 check
    }
}
