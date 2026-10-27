class Solution {
    public boolean isPalindrome(String s) {

        String modifiedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(modifiedStr);
        int left = 0;
        int right = modifiedStr.length()-1;
        while(left<right){
            if(modifiedStr.charAt(left) != modifiedStr.charAt(right)){
                return false;
            }

            left++;
            right--;
        }
    
        return true;

    }
}
