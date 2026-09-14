package exercise.q08.sorting;

public class QuickSort implements Sort {
    @Override
    public int[] ascending(int[] arr) {
        System.out.println("BubbleSort ascending");
        return arr;
    }

    @Override
    public int[] descending(int[] arr) {
        System.out.println("BubbleSort descending");
        return arr;
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}
