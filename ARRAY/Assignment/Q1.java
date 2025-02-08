package Assignment;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
public class Q1 {
    public static boolean valueCheck(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int numb = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numb == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 1, 1, 3, 3, 2, 3, 4 };
        System.out.println(valueCheck(numbers));
    }
}
