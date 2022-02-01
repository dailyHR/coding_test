//import java.util.*; -> 하나만 선언해도 대부분 라이브러리 사용 가능.

import java.util.*;

public class ArrayList_Test {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<Integer>();
        ArrayList<Integer> copy_array = new ArrayList<Integer>();
        array.add(5);
        array.add(2);
        //깊은 복사 : 리스트명.addAll()
        copy_array.addAll(array);

        //sort : 리스트명.sort()
        array.sort(null);
        System.out.print(array);

        //arrayList의 크기 : 리스트명.size()
        System.out.print(array.size());

        
    }
}
