class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        sequences = defaultdict(list)
        num_set = set()

        for num in nums:
            num_set.add(num)
        longest = 0
        start = 0
        end = 0
        for num in num_set:
            if(num-1 not in num_set):
                start = num
                curr_num = num
                while(curr_num in num_set):
                    curr_num +=1
                
                end = curr_num

                if (end-start> longest):
                    longest = end-start


        return longest                    
                
            