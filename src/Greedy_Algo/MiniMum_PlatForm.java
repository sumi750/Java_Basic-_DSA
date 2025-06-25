package Greedy_Algo;

import java.util.Arrays;

public class MiniMum_PlatForm {
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};

        System.out.println("Minimum number of platform " + platform(arr, dep));

        int[] start = {1,5,9};
        int[] end = {3,10,11};

        System.out.println("Minimum Laptop Required " + platform(start, end));
    }

    public static int platform(int[] arr, int[] dep) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int plat_need = 0, maxPlat = 0;
        int i = 0, j = 0;

        while (i < arr.length) {
            if (arr[i] <= dep[j]) {
                plat_need++;
                i++;
                maxPlat = Math.max(maxPlat, plat_need);
            } else {
                plat_need--;
                j++;
            }

        }
        return maxPlat;
    }
}
