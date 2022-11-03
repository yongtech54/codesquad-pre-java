/*
 * Mission #2 - 4.
 *
 *
 * access modifier 고민
 * 코딩컨벤션 준수
 * 객체지향 생활체조 준수
 * 1. 한 메서드에는 두 단계 이내의 들여쓰기
 * 2. else 지양
 * 5. 축약 금지
 * 메소드 크기는 20줄 이내
 * 한 메소드는 한 가지 기능 담당
 * */

package day04.checkdate;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int inputDay, int inputMonth, int inputYear) {
        this.day = inputDay;
        this.month = inputMonth;
        this.year = inputYear;
    }

    private boolean checkDate() {
        if (this.month < 1 || this.month > 12) {
            return false;
        }
        if (this.day < 1 || this.day > 31) {
            return false;
        }
        if (this.month == 2 && this.day > 29) {
            return false;
        }
        return true;
    }

    public String isValid() {
        if (this.checkDate()) {
            return this.year + "년 " + this.month + "월 " + this.day + "일은 "
                    + "유효한 날짜 입니다.";
        }
        return this.year + "년 " + this.month + "월 " + this.day + "일은 "
                + "유효하지 않은 날짜 입니다.";
    }
}
