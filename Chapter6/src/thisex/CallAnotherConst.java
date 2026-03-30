package thisex;

/**
 * 생성자에서 다른 생성자를 호출하는 this.
 * this로 다른 생성자 호출하기
 */
public class CallAnotherConst {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person() {
        this("이름 없음", 1);
    }
}