class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> encountered = new HashSet<>();
        
        int l = 0;
        int r = 0;
        int longest = 0;
        while (r< s.length()){
            
            while(encountered.contains(s.charAt(r))){
                encountered.remove(s.charAt(l));
                l++;
            }           
            encountered.add(s.charAt(r));
            r++;
            longest = Math.max(longest, r-l);

        }

        return longest;
    }
}
