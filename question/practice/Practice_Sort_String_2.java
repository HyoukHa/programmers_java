package practice;

// 문자열 정렬하기 (2)

/**
 * 문제 설명
 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
 * my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 */

import java.util.Arrays;
import java.util.Locale;

/**
 * 제한사항
 * 0 < my_string 길이 < 100
 */

public class Practice_Sort_String_2 {
    public static void main(String[] args) {
        System.out.println(solution("AcDb"));
    }

    public static String solution(String my_string) {
        char[] arr = my_string.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

//    public static String solution(String my_string) {
//        return my_string
//                .toLowerCase()
//                .chars()
//                .sorted()
//                .collect(StringBuilder::new,
//                        StringBuilder::appendCodePoint,
//                        StringBuilder::append)
//                .toString();
//    }
}