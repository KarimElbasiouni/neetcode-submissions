class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        
        m = int(len(nums)/2)
        num_count = defaultdict(int)
        for i in range(len(nums)):
            num_count[nums[i]] += 1

        return [key for key, val in num_count.items() if val > m][0]