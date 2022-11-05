package day04.checkdate;

import java.util.Arrays;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private static int[] day31 = {1, 3, 5, 7, 8, 10, 12};
    private static int[] day30 = {4, 6, 9, 11};

    MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private boolean day31Search() {
        for (int i = 0; i < day31.length; i++) {
            if (month == day31[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean day30Search() {
        for (int i = 0; i < day30.length; i++) {
            if (month == day30[i]) {
                return true;
            }
        }
        return false;
    }
    private boolean fastCheck() {
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        return true;
    }

    private boolean checkNormalDay() {
        if (day31Search() && day <= 31) {
            return true;
        }
        if (day30Search() && day <= 30) {
            return true;
        }
        return false;
    }

    private boolean checkFeburary() {
        if (month == 2 && day <= 28) {
            return true;
        }
        if (month == 2 && day == 29) {
            if (checkLeapYear()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean checkLeapYear() {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        }
        return false;
    }

    private boolean checkDate() {
        if (!fastCheck()) {
            return false;
        }
        if (month == 2) {
            return checkFeburary();
        }
        if (!checkNormalDay()) {
            return false;
        }
        return true;
    }

    String isValid() {
        if (checkDate()) {
            return year + "년 " + month + "월 " + day + "일은 "
                    + "유효한 날짜 입니다.";
        }
        return year + "년 " + month + "월 " + day + "일은 "
                + "유효하지 않은 날짜 입니다.";
    }
}
