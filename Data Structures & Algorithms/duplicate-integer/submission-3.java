class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int countOfNum;
        for(int num: nums){
            if(hm.get(num) == null){
                hm.put(num,1);
                continue;
            }
            return true;
            
        }
        return false;
    
    }
}