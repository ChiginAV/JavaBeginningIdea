package Lessons;

public class QuickSort {

    static void qSort(char[] items) {
        sortChar(items, 0, items.length - 1);
    }

    private static void sortChar(char[] items, int left, int right) {
        int l = left;
        int r = right;

        char pivot = items[(left + right) / 2]; // Выбирается опорный элемент из середины массива

        do {
            while ((items[l] < pivot) && (l < right)) l++; // Перебираем элементы от начала, пока не найдем значение больше опорного
            while ((items[r] > pivot) && (r > left)) r--; // Перебираем элементы с конца, пока не найдем значение меньше опорного

            if (l <= r){
                swapElements(items, l, r);
                l++; r--;
            }
        } while (l <= r);

        // recursive calls
        if (left < r)
            sortChar(items, left, r);

        if (right > l)
            sortChar(items, l, right);

    }

    private static void swapElements(char[] items, int index1, int index2){
        char tmp = items[index1];

        items[index1] = items[index2];
        items[index2] = tmp;
    }

}
