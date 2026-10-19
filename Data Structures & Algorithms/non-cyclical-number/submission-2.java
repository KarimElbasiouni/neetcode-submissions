class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int num;
        String str;
        while(n!=1){
            str = Integer.toString(n);
            num = 0;
            for(int i = 0; i<str.length();i++){
                num+= Math.pow(Integer.valueOf(str.substring(i,i+1)),2);
            }
            n = num;
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;
    }
}
