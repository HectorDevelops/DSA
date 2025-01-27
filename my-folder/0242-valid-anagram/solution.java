class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arrayS = s.toCharArray();
        Arrays.sort(arrayS);
        s = new String(arrayS);

        char[] arrayT = t.toCharArray();
        Arrays.sort(arrayT);
        t = new String(arrayT);

        if(s.equals(t)){
            System.out.println("Strings are equal");
            return true;
        }
        return false;
    }
}
