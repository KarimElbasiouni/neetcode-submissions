class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char currS = s.charAt(i);
            if(sMap.get(currS)==null){
                sMap.put(currS,1);  
            }
            sMap.replace(currS, sMap.get(currS)+1);
    
        }

        for(int i = 0; i<t.length(); i++){
            char currT = t.charAt(i);
            if(tMap.get(currT)==null){
                tMap.put(currT,1);  
            }
            tMap.replace(currT, tMap.get(currT)+1);
        }

        return sMap.equals(tMap);
    }
}
