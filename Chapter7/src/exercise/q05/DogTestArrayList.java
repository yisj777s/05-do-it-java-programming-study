package exercise.q05;
import java.util.List;
import java.util.ArrayList;

public class DogTestArrayList {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("뽀삐", "진돗개"));
        dogs.add(new Dog("초코", "푸들"));
        dogs.add(new Dog("망고", "골든리트리버"));
        dogs.add(new Dog("콩이", "말티즈"));
        dogs.add(new Dog("보리", "시바견"));

        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).showDogInfo());
        }

        System.out.println("========== for-each ==========");

        for (Dog dog : dogs) {
            System.out.println(dog.showDogInfo());
        }
    }
}
