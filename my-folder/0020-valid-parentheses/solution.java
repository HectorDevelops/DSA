class Solution {
        public boolean isValid(String s) {
        // PSEUDOCODE
            // 1. Run a while loop to identify if the String input contains the pairs being looked for
            // 2, If the pairs are found, replace them with an empty space
            // 3. Continue replacing the pairs until the String input is empty
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }
        return s.isEmpty();
    }
}
