package Lessons;

public class Bubble {

    public static void executeMe() {

        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int a, b, t;

        System.out.print("Default massive: ");
        for (int i : nums) {System.out.print(i + " ");}
        System.out.println();

        for (a = 1; a < nums.length; a++){
            for (b = nums.length-1; b >= a; b--){
                if (nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.print("Sorted massive: ");
        for (int i : nums){System.out.print(i + " ");}
        System.out.println();

    }

}
