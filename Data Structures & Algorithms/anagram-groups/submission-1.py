class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagram_dict = defaultdict(list)

        for string in strs:
            char_count = [0] * 26
            print(string)
            for char in string:
                idx = ord(char) - ord('a')
                print(idx)
                char_count[idx] += 1
            print(char_count)
            anagram_dict[tuple(char_count)].append(string)


        return anagram_dict.values()   
        
        
