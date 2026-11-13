public class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];

        int l = 0;
        int longest = 0;
        int maxf = 0;
        for (int r = 0; r<s.length(); r++){
            count[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, count[s.charAt(r) - 'A']);
            while (r-l +1 - maxf > k){
                count[s.charAt(l) - 'A']--;
                l++;  
            }
            //System.out.println(s.substring(l, r+1));
            longest = Math.max(longest, r - l + 1);

        }

        return longest;
    }
}