import java.util.Arrays;

public class TestSort {

    public static void testSort() {
        int[] list = new int[]{1, 64, 52, 6, 7, 8, 9};
        System.out.println("Тест метода сортировки массива в убывающем порядке: " + Arrays.toString(Sort.reverseSort(list)));
    }

    }



