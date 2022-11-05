package day04.checkdate;

import java.util.Arrays;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private int[] day31 = {1, 3, 5, 7, 8, 10, 12};
    private int[] day30 = {4, 6, 9, 11};

    public MyDate(int inputDay, int inputMonth, int inputYear) {
        this.day = inputDay;
        this.month = inputMonth;
        this.year = inputYear;
    }

    private boolean day31Search() {
        for (int i = 0; i < day31.length; i++) {
            if (this.month == day31[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean day30Search() {
        for (int i = 0; i < day30.length; i++) {
            if (this.month == day30[i]) {
                return true;
            }
        }
        return false;
    }
    private boolean fastCheck() {
        if (this.month < 1 || this.month > 12) {
            return false;
        }
        if (this.day < 1 || this.day > 31) {
            return false;
        }
        return true;
    }

    private boolean checkNormalDay() {
        if (day31Search() && this.day <= 31) {
            return true;
        }
        if (day30Search() && this.day <= 30) {
            return true;
        }
        return false;
    }

    private boolean checkFeburary() {
        if (this.month == 2 && this.day <= 28) {
            return true;
        }
        if (this.month == 2 && this.day == 29) {
            if (checkLeapYear()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean checkLeapYear() {
        if ((this.year % 400 == 0) || ((this.year % 4 == 0) && (this.year % 100 != 0))) {
            return true;
        }
        return false;
    }

    private boolean checkDate() {
        if (!fastCheck()) {
            return false;
        }
        if (this.month == 2) {
            return checkFeburary();
        }
        if (!checkNormalDay()) {
            return false;
        }
        return true;
    }

    public String isValid() {
        if (checkDate()) {
            return this.year + "년 " + this.month + "월 " + this.day + "일은 "
                    + "유효한 날짜 입니다.";
        }
        return this.year + "년 " + this.month + "월 " + this.day + "일은 "
                + "유효하지 않은 날짜 입니다.";
    }
}
