package thisex.builder;

public class Student {
    public static void main(String[] args) {
        Student student = new Student.Builder(1234567, "임원상")
                .grade(3)
                .major("컴퓨터공학")
                .phoneNumber("123-4567-8910")
                .build();

        student.showInfo();
    }

    private int id;
    private String name;
    private int grade;
    private String major;
    private String phoneNumber;

    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.grade = builder.grade;
        this.major = builder.major;
        this.phoneNumber = builder.phoneNumber;
    }

    public static class Builder {
        private int id;
        private String name;
        private int grade;
        private String major;
        private String phoneNumber;

        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder major(String major) {
            this.major = major;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public void showInfo() {
        System.out.println("학번: " + id);
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
        System.out.println("전공: " + major);
        System.out.println("전화번호: " + phoneNumber);
    }
}
