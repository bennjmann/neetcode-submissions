class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        int len = strs[0].length();

        for (int i=0; i < len; i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) return ans;
            }
            ans += strs[0].charAt(i);
        }
        
        return ans;
    }
}