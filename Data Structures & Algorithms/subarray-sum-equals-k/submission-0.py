class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        res = 0
        curSum = 0
        prefixSums = {0 : 1} # prefixSum : count

        for num in nums:
            curSum+=num
            prefix = curSum - k

            if (prefix in prefixSums):
                res += prefixSums[prefix]

            prefixSums[curSum] = 1 + prefixSums.get(curSum, 0)

        return res