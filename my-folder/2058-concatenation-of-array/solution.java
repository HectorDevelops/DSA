import java.util.Arrays;

public class Solution {

    // PSEUDOCODE:
    // 1. Get size of current array
    // 2. Create new arr to set size * 2
    // 3. Iterate original array and add values into new array
    // 4. Iterate original array once again to add values again

    private static int capacity;
    private static int length;

    // Method to handle execution
    static int[] getConcatenation(int[] nums){
        // Finding array's habitating values that are non-zero
        length = nums.length;
        
        // Increasing new arrays capacity
        capacity = nums.length * 2;
        
        // Creating new array to store values
        int[] newArray = new int[capacity];
        for(int i = 0; i < length; i++)
            newArray[i] = nums[i];

        // Second iteration resumes at the last filled index to add original array once again
        for(int i = 0; i < capacity - length; i++)
            newArray[i + length] = nums[i];
            
        // Returning new array at twice the capacity (new dynamic array)
        return newArray;
    }

    public static void main(String[] args){
        int[] nums = {1, 2, 1};
        int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
