class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagram_dict = defaultdict(list)

        for string in strs:
            char_count = [0] * 26
            for char in string:
                idx = ord(char) - ord('a')
                char_count[idx] += 1
            anagram_dict[tuple(char_count)].append(string)


        return anagram_dict.values()   
        
        
