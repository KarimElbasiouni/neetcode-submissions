class Solution:

    def encode(self, strs: List[str]) -> str:
        
        for i in range(len(strs)):
            strs[i] = str(len(strs[i])) + "#" + strs[i]
        
        
        
        return "".join(strs)

    def decode(self, s: str) -> List[str]:
        arr = []
        j = 0
  
        while j < len(s):
            string_len = ""
            while (s[j] != '#'):
                string_len+= s[j]
                j+=1
            
            string_len = int(string_len)
            arr.append(s[j+1:j+1+string_len])
            j = j+1+string_len

        return arr
