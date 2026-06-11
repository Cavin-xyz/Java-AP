class Solution {
    public static int firstUniqChar(String s) {
        // Since we only have lowercase 'a'-'z', an array of size 26 is perfect
        int[] freq = new int[26];

        // Step 1: Count occurrences
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 2: Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]) {

        String s = "lllfdklfm";
        System.out.println(firstUniqChar(s));
    }
}