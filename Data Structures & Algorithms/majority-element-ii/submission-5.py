class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        
        count = defaultdict(int)

        for i in range(len(nums)):
            count[nums[i]]+=1
            if len(count) > 2:
                for key in count:
                    count[key]-=1
        
        if len(count) == 0:
            return []

        new_count = {}
        for key in count:
            new_count[key] = 0

        for i in range(len(nums)):
            if nums[i] in new_count:
                new_count[nums[i]] +=1
        res = []
        for num in new_count:
            if new_count[num]> len(nums)//3:
                res.append(num)
    

        return res
        