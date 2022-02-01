package grammar;

import java.util.Arrays;

public class set_map_string {
    public static void main(String[] args) {

        //String

        //대 -> 소문자 변경 : toLowerCase()
        String str = "ABC";
        str = str.toLowerCase();

        //소 -> 대문자 변경 : toUpperCase()
        str = str.toUpperCase();

        //!!!!! String to Array : 스트링명.split() !!!!!
        str = "가나다라마";
        String[] str_array = str.split("");
        System.out.println(Arrays.toString(str_array));
        System.out.println(str_array[0]);

        //문자열 자르기(substring) : 스트링명.substring()
        //스트링명.substring(index) : index를 포함한 위치부터 문자열 끝까지 추출
        //스트링명.substring(시작값, 끝 값) : 시작값부터 끝 값 - 1까지 추출
        str = "123456";
        String sub_str1 = str.substring(3);
        String sub_str2 = str.substring(2,4);
        System.out.println(sub_str1);
        System.out.println(sub_str2);

        //문자열 뒤집기 : StringBuilder(문자열).reverse().toString()
        str = "Reverse";
        str = new StringBuilder(str).reverse().toString();
        System.out.println(str);

        //length : 문자열명.length() -> array는 length로 차이가 있다.
        System.out.println(str.length());



    }
}
