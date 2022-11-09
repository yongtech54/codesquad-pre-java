package day08;

public class Solution3 {
    public static void main(String[] args) {
        String result = solution(5, 26);
        System.out.println(result);
    }
    public static String solution(int a, int b) {
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String answer = "";
        // 월요일 시작
        if (a == 2 || a == 8) {
            int i = 1;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        // 화요일 시작
        if (a == 3 || a == 11) {
            int i = 2;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        // 수요일 시작
        if (a == 6) {
            int i = 3;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        // 목요일 시작
        if (a == 9 || a == 12) {
            int i = 4;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        // 금요일 시작
        if (a == 1 || a == 4 || a == 7) {
            int i = 5;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        // 토요일 시작
        if (a == 10) {
            int i = 6;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        // 일요일 시작
        if (a == 5) {
            int i = 0;
            int cnt = 1;

            while (true) {
                if (cnt == b) {
                    answer = day[i];
                    return answer;
                }

                cnt++;
                i++;

                if (i == 7) {
                    i = 0;
                }
            }
        }

        return answer;
    }
}