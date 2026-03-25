package exercise.q09;

/**
 * Q09.
 * 다음 예제의 클래스를 정의하고 결괏값을 출력해 봅시다.
 * 나이가 41살, 이름이 James라는 남자가 있습니다. 이 남자는 결혼을 했고, 자식이 셋 있습니다.
 */
public class Person {
    String name = "James";
    int age = 41;
    boolean isMarried = true;
    int childrenCount = 3;

    public static void main(String[] args) {
        String maritalStatus = "";

        Person person = new Person();

        if (person.isMarried) {
            maritalStatus = "기혼";
        } else {
            maritalStatus = "미혼";
        }

        System.out.println("이름: " + person.name);
        System.out.println("나이: " + person.age);
        System.out.println("결혼 여부: " + maritalStatus);
        System.out.println("자녀 수: " + person.childrenCount);
    }
}
