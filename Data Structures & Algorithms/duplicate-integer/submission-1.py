class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
         
        numCount = {}
        
        for num in nums:
            if num in numCount:
                return True
            numCount[num] = 1
        
        return False