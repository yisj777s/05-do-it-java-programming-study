package interfaceex;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myclass = new MyClass();

        X xClass = myclass;
        xClass.x();

        Y yClass = myclass;
        yClass.y();

        MyInterface iClass = myclass;
        iClass.myMethod();
        iClass.x();
        iClass.y();
    }
}
