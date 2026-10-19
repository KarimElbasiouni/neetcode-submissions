class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        if (len(s)!= len(t)):
            return False

        s_count = {} # char : count
        t_count = {} # char : count

        for char in s:
            if char not in s_count:
                s_count[char] = 1;
                continue
            s_count[char]+=1
            
        for char in t:
            if char not in t_count:
                t_count[char] = 1;
                continue
            t_count[char]+=1

        return t_count==s_count
                