package thisex;

public class CallAnotherConst {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

        Person p = person.returnItSelf();
        System.out.println(p);
        System.out.println(person);
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

    Person returnItSelf() {
        return this;
    }
}