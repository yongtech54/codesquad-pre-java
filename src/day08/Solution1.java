/*
* 프로그래머스 12910. 나누어 떨어지는 숫자 배열
* https://school.programmers.co.kr/learn/courses/30/lessons/12910
* */

package day08;

class Solution1 {
    public int[] solution(int[] arr, int divisor) {
        // 배열 생성 및 초기화
        int[] sample = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < sample.length; i++) {
            if (arr[i] % divisor == 0) {
                sample[cnt] = arr[i];
                cnt++;
            }
        }

        // 없는 경우
        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        }

        // 정답 배열 생성 및 초기화
        int[] answer = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            answer[i] = sample[i];
        }

        // 오름차순 정렬
        int temp;

        for (int i = 0; i < cnt - 1; i++) {
            for (int j = 0; j < cnt - 1; j++) {
                if (answer[j] > answer[j + 1]) {
                    temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }

        return answer;
    }
}