class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0;
        int r = s1.length();
        int[] targetCount = new int[26];
        for (int i = 0; i< s1.length(); i++) {
            targetCount[s1.charAt(i) - 'a']++;
        }
        int[] count = new int[26];
        while(r <= s2.length()){

            for(int i = l; i<r; i++){
                count[s2.charAt(i)- 'a']++;
            }
            if (Arrays.equals(targetCount, count)){
                return true;
            }
            for(int i = l; i<r; i++){
                count[s2.charAt(i)- 'a']--;
            }

            l++;
            r++;
        }
        return false;
    }
}
