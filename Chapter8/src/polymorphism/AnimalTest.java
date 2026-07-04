package polymorphism;

import java.util.List;
import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니댜.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunt() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void fly() {
        System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
    }
}

public class AnimalTest {
    List<Animal> animalList = new ArrayList<>();

    public void addAnimal() {
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunt();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            } else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.addAnimal();
        System.out.println("===== 원래 형으로 다운 캐스팅 =====");
        animalTest.testCasting();
    }
}