class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();
        for(String str: strs){
            enc.append(str.length()).append('#').append(str);
        }
        return enc.toString();
    }

    public List<String> decode(String str) {
        List<String> dec = new ArrayList<>();

        int i = 0;
        while (i<str.length()){
            int j = i;

            while (str.charAt(j)!='#')j++;

            int length = Integer.valueOf(str.substring(i,j));
            i = j + 1 + length;
            dec.add(str.substring(j+1, i));
        }
        return dec;
    }
}
