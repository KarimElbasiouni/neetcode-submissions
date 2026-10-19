class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
    
        # Come across one of the sum values, look for the other sum value, if not found, add the first sum value

        nums_dict = {} # num : idx

        for idx in range(len(nums)):
            currVal = nums[idx]
            otherVal = target - nums[idx]
            if otherVal in nums_dict:
                i = nums_dict[otherVal]
                j = idx
                return [i,j]
            nums_dict[currVal] = idx