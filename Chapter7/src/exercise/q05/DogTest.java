package exercise.q05;

public class DogTest {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("뽀삐", "진돗개");
        dogs[1] = new Dog("초코", "푸들");
        dogs[2] = new Dog("망고", "골든리트리버");
        dogs[3] = new Dog("콩이", "말티즈");
        dogs[4] = new Dog("보리", "시바견");

        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].showDogInfo());
        }

        System.out.println("========== for-each ==========");

        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
