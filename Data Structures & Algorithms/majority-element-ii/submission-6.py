class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        
        count = defaultdict(int)

        for i in range(len(nums)):
            count[nums[i]]+=1
            if len(count) <= 2:
                continue

            new_count = defaultdict(int)
            for k, c in count.items():
                if c > 1:
                    new_count[k] = c-1
            count = new_count
        res = []
        for key in count:
            if nums.count(key) > len(nums)//3:
                res.append(key)
        return res
        