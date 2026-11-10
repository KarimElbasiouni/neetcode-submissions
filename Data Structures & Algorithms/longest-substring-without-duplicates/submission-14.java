class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> encountered = new HashSet<>();
        
        int left = 0;
        int right = 0;
        int longest = 0;
        while (right< s.length()){
            
            if(encountered.contains(s.charAt(right))){
                while(encountered.contains(s.charAt(right)) && left<right){
                    encountered.remove(s.charAt(left));
                    left++;
                }
            }
            encountered.add(s.charAt(right));
            
            
            right++;
            longest = Math.max(longest, right-left);

        }

        return longest;
    }
    // abba
    // [a = 0] , left=0, right =1 longest = 1
    // [a= 0, b =1], left = 0, right = 2; longest = 2
    // [a= 0, b = 2], left = 2, right = 3; longest = 2;
    // [a = 3, b= 2], left = 1, right = 4; longest = 2;
}
