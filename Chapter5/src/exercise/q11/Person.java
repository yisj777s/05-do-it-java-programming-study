package exercise.q11;

/**
 * Q11.
 * 152쪽에서 person 클래스에 이미 추가된 생성자 외에 이름, 키, 몸무게를 매개변수로 받는 생성자를 추가하세요. 그리고 PersonTest.java에서 추가된 생성자를 사용하여 객체를 생성해보세요.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void showPersonInfo() {
        System.out.println("이름: " + name);
        System.out.println("키: " + height);
        System.out.println("몸무게: " + weight);
    }

    @Override
    public String toString() {
        return "이름: " + name +
                ", 키: " + height +
                ", 몸무게: " + weight;
    }
}
