class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] map = new int[128]; // ASCII characters
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            map[c]++;

            while (map[c] > 1) {
                map[s.charAt(left)]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }
}