package finalex;

public class Constant {
    int num = 10;
    final int NUM = 10;

    public static void main(String[] args) {
        Constant constant = new Constant();
        constant.num = 50;
        constant.NUM = 200; // 오류

        System.out.println(constant.num);
        System.out.println(constant.NUM);
    }
}
