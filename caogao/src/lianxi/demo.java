package lianxi;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int [] nums = {-1,-100,3,99};
        fun(nums,2);
    }
    public static void fun(int [] nums,int k){
        int i = 0;
        int v = nums.length - 1;
        while(i < v) {
            int temp = nums[i];
            nums[i++] = nums[v];
            nums[v--] = temp;
        }
        int num = k;
        for (int j = 0; j + 1 < num--; j++) {
            int temp = nums[j];
            nums[j] = nums[num];
            nums[num] = temp;
        }
        int n = nums.length - 1;
        int m = k;
        while(m < n){
            int temp = nums[m];
            nums[m++] = nums[n];
            nums[n--] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
