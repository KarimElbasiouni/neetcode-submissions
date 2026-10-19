class Solution:
    def sortColors(self, nums: List[int]) -> None:
        

        countZero = 0
        countOne = 0
        countTwo = 0

        for i in range(len(nums)):
            if nums[i] == 0 :
                countZero+=1
            elif nums[i] == 1:
                countOne+=1
            else:
                countTwo+=1

        for j in range (len(nums)):
            if countZero>0:
                nums[j] = 0
                countZero-=1
            elif countOne>0:
                nums[j] = 1
                countOne-=1
            else:
                nums[j] = 2
        """
        Do not return anything, modify nums in-place instead.
        """
        