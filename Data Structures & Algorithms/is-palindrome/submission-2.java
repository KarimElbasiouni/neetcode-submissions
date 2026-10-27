class Solution {
    public boolean isPalindrome(String s) {


        int left = 0;
        int right = s.length();
        while(left<right){
            String leftChar = s.substring(left,left+1);
            String rightChar = s.substring(right-1, right);

            if(!leftChar.matches("[0-9a-zA-Z]")){
                left++;
                continue;
            }
            if(!rightChar.matches("[0-9a-zA-Z]")){
                right--;
                continue;
            }
            if(!rightChar.toLowerCase().equals(leftChar.toLowerCase())){
                return false;
            }
            
            left++;
            right--;
        }
    
        return true;

    }
}
