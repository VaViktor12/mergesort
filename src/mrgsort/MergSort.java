package mrgsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergSort {
    public static void main(String[] args) {
        Msort test = new Msort();
        System.out.println(Arrays.toString(test.sort(new int[]{1,61, 12, 122, 425, 13, 34, 55, 111, 6, 12, 22, 453, 123, 24, 55, 11, 2, 6, 1, 2})));
    }
}

class Msort {

    public int[] sort(int[] arrentry) {
        int[] arr = arrentry;
        int[] arrLeft;
        int[] arrRight;
        int[] result = new int[arr.length];
        if (arr.length > 2) {
            arrLeft = sort(Arrays.copyOfRange(arr, 0, arr.length / 2));
            arrRight = sort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
        } else {
            arrLeft = (Arrays.copyOfRange(arr, 0, arr.length / 2));
            arrRight = (Arrays.copyOfRange(arr, arr.length / 2, arr.length));
        }
        int i = 0;
        int j = 0;
        int n = arrLeft.length;
        int m = arrRight.length;
        while (i < n || j < m) {
            result[i + j] = ((i < n && (j == m || arrLeft[i] < arrRight[j])) ? arrLeft[i++] : arrRight[j++]);
        }
        return result;
    }
}
