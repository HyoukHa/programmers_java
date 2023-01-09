package practice;

// 369게임

/**
 * 문제 설명
 * 머쓱이는 친구들과 369게임을 하고 있습니다.
 * 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
 * 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
 */

/**
 * 제한사항
 * 1 ≤ order ≤ 1,000,000
 */

public class Practice_369 {
    public static void main(String[] args) {

    }

    public static int solution(int order) {
        int answer = 0;
        String numStr = String.valueOf(order);

        for(int i = 0 ; i < numStr.length() ; i++) {
            int temp = Integer.valueOf(Character.toString(numStr.charAt(i)));
            if(temp == 3 || temp == 6 || temp == 9) {
                answer++;
            }
        }

        return answer;
    }
}
