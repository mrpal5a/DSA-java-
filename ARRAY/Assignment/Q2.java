package Assignment;

//There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

import java.util.Random;
public class Q2 {
    public static int rotated(int number[]) {
        Random random = new Random();
        int rotate[] = new int[number.length];
        int k = random.nextInt(number.length);
        int num = 7;
        for (int i = 0; i < number.length; i++) {
            if (k >= number.length) {
                k = 0;
            }
            rotate[i] = number[k];
            k++;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(rotate[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < number.length; i++) {
            if (num == rotate[i]) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int number[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(rotated(number));

    }
}
