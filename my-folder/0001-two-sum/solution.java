class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    System.out.println(nums[i] + nums[j]);
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

}
