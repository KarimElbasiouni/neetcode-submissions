class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        prefix, suffix = [], []
        pre_prod, suff_prod = 1, 1
        for i in range (len(nums)):
            pre_prod *= nums[i]
            suff_prod *= nums[len(nums)-1-i]
            
            prefix.append(pre_prod)
            suffix.append(suff_prod)

        # print(prefix, suffix)
        productArr = []

        for p in range (len(nums)):
            s = len(nums)-2-p
            pre_element =(prefix[p-1] if  (p-1)>-1 else 1)
            suf_element = (suffix[s] if s>-1 else 1)
            # print(pre_element, suf_element)
            # print(p,s)
            productArr.append(pre_element*suf_element)

        return productArr