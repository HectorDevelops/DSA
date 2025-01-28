class Solution {
    static int lengthOfLastWord(String str){
        String[] brokenSentence = str.split(" ");

        // Adding an edge case
        if(brokenSentence.length < 1){
            return -1;
        }
        // Storing the size of the word at the last index of array of strings
        int lengthOfLast = brokenSentence[brokenSentence.length - 1].length();
        return lengthOfLast;
    }


    public static void main(String[] args){
        String str = "luffy is still joyboy";

        System.out.println(lengthOfLastWord("The length of the last word is: " + str));
    }
}
