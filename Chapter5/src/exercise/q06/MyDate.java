package exercise.q06;

/**
 * Q06.
 * 165쪽 예시로 나온 MyDate와 MyDateTest 클래스를 완성해 봅시다.
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValid() {
        if (month < 1 || month > 12) {
            return false;
        } else {
            if (month == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    if (day < 1 || day > 29) {
                        return false;
                    }
                } else {
                    if (day < 1 || day > 28) {
                        return false;
                    }
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                // 30일 달 처리
                if (day < 1 || day > 30) {
                    return false;
                }
            } else {
                // 나머지 31일 달 처리
                if (day < 1 || day > 31) {
                    return false;
                }
            }
        }
        return true;
    }
}
