package exercise.q05;

public class CafeTest {
    public static void main(String[] args) {
        Person kim = new Person("김가나", 50000);
        Person lee = new Person("이다라", 70000);
        Cafe starCafe = new Cafe("별다방", "아메리카노");
        Cafe beanCafe = new Cafe("콩다방", "카페라떼");

        kim.buyCoffee(starCafe, 4000);
        lee.buyCoffee(beanCafe, 4500);

        kim.showInfo();
        lee.showInfo();
        starCafe.showInfo();
        beanCafe.showInfo();
    }
}

