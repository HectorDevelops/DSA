class Solution {
     // Method to encapsulate
    public static boolean isPalindrome(int x){
        // Convert to string
        String intToStr = Integer.toString(x);

        // If the parameter's length is 1 - return true
        if(intToStr.length() == 1)
            return true;
        // If the parameter is less than zero, return false as negative is not a Palindrome
        if(x < 0)
            return false;

        for(int i = 0; i < intToStr.length() / 2; i++){

            char frontC = intToStr.charAt(i);
            char backC = intToStr.charAt(intToStr.length() - 1 - i);

            if(frontC != backC)
                return false;
        }
        return true;

    }

    public static void main(String[] args){
        int x = -121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
