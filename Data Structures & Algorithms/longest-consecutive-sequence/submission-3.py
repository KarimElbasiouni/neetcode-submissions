class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        numSet = set(nums)
        # Use this^^^ instead of looping through the array to add each item to the set

        longest = 0
        start = 0
        end = 0
        for num in numSet:
            if num-1 not in numSet:
                start = num
                curr_num = num
                while(curr_num in numSet):
                    curr_num +=1
                
                end = curr_num

                longest = max(longest, end-start) # use this instead of using an if statement to check whether there end-start is greater


        return longest                    
                
            