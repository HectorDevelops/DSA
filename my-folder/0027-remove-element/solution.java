class Solution {
    static int removeElement(int[] nums, int val){
        // Declaring counter variable for indexes not equal to val
        int count = 0;

        // Time Complexity of O(n)
        for(int i = 0; i < nums.length; i++){
            // If-conditional to start shifting value at count index
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
            int[] nums = {3, 2, 2, 3};
            int value = 3;

            // Storing method's return value into result for output
            int result = removeElement(nums, value);
            System.out.println(result);

            for(int i = 0; i < result; i++){
                System.out.print(nums[i]);

            }
    }
}
