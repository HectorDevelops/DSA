class Solution {
       static int removeDuplicates(int[] nums){
        int numsLength = nums.length;

        // Adding edge case
        if(numsLength < 1)
            return 0;

        // Counter for each unique value in array
        int count = 0;

        // Using array to loop and compare
        for(int i = 0; i < numsLength; i++){
            if(nums[i] != nums[count]){
                // Incrementing count of each unique values
                count++;
                // Once a new values has been found, it is adding them in sorder
                nums[count] = nums[i];
            }
        }
        // Returning count + 1 to account for index 0
        return count + 1;
    }
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7};

        // Invoking method
        int result = removeDuplicates(nums);
        System.out.println(result);
    }
}
