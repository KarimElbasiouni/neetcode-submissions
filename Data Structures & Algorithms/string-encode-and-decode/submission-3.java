class Solution {
    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for(String str : strs){
            builder.append(str.length());
            builder.append("#");
            builder.append(str);
        }
        return builder.toString();
    }
    
    public List<String> decode(String str) {
        
        List<String>  strList = new ArrayList<>();
        int startsAt = 0;
        int i = 0;
        while(i < str.length()){

            if(str.charAt(i) == '#'){
                int strLength = Integer.parseInt(str.substring(startsAt, i));
                strList.add(str.substring(i+1, i+1+strLength)); // Or i-1
                startsAt = i + 1 + strLength;
                i = startsAt;
                continue;
            }
            i++;

        }
        return strList;
    }
}
