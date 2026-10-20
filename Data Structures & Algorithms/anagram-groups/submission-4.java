class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        Map<String, List<String>> hm = new HashMap<>();
        
        for(int i = 0; i < strs.length; i++){
            int[] charCount = new int[26];
            String currStr = strs[i];

            for(int j = 0; j < currStr.length(); j++){
                
                char strChar = currStr.charAt(j);
                charCount[strChar-'a']+=1;
            }
            
            String strCount = Arrays.toString(charCount);

            if(!hm.containsKey(strCount)){
                hm.put(strCount, new ArrayList<>());
            }
            hm.get(strCount).add(currStr);
            

        }
        return new ArrayList<>(hm.values());
  
    }
}
