package ua.epam.javacore.lesson_05;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            while(nums[num-1] != num){
                int temp = nums[num-1];
                nums[num-1] = num;
                num = temp;
            }

        }

        List<Integer> missingNums = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                missingNums.add(i+1);
            }
        }
        return missingNums;
    }
}
