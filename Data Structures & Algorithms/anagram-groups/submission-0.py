class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        res = defaultdict(list) # mapping character frequency to list of words (i.e. Char Freq : Group of Anagrams)

        for string in strs:
            freq = [0]*26
            for char in string:
                freq[ord(char) - ord('a')]+=1
            res[tuple(freq)].append(string)


        return res.values()




        
        
        
