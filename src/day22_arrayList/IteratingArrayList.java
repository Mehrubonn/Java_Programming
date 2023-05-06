package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        nums.add(3,255);
        System.out.println(nums);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        System.out.println("------------------------------------------------");

        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.println(nums.get(i));
        }

        System.out.println("------------------------------------------------");

        for (Integer num : nums) {
            System.out.println(num);
        }
        
        
        
        
        
        













    }
}
