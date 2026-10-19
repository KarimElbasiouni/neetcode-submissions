class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        
        longest_prefix = strs[0]

        for idx, string in enumerate(strs):
            if (idx == 0):
                continue
            temp_prefix = ""
            for i in range(min(len(longest_prefix),len(string))):
                if string[i] == longest_prefix[i]:
                    temp_prefix += string[i]
                else: 
                    break
            longest_prefix = temp_prefix
        
        return longest_prefix
                

