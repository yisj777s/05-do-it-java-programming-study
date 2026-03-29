package thisex;

public class ThisExample {
    public static void main(String[] args) {
        Birthday birthday = new Birthday();
        birthday.setYear(2026);

        System.out.println(birthday);
        birthday.printThis();
    }
}

class Birthday {
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }
}

