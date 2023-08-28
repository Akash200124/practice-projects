
import java.util.Arrays;

public class reverseArray {

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8,9, 10 };

        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] array)

    {
        int start = 0;
        int end = array.length-1;

        while(end > start)
            {
       
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;

        }

    }
}
