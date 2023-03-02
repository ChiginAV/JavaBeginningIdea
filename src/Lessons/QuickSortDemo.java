package Lessons;

public class QuickSortDemo {

    public static void executeMe() {

        char[] demoArray = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.print("Source array: ");
        for (char elem: demoArray){
            System.out.print(elem + ", ");
        }
        System.out.println();

        QuickSort.qSort(demoArray);

        System.out.print("Sorted array: ");
        for (char elem: demoArray) {
            System.out.print(elem + ", ");
        }

    }

}
