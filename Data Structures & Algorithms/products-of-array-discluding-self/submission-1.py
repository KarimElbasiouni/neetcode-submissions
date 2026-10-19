class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        prefix, suffix = [], []
        pre_prod, suff_prod = 1, 1
        for i in range (len(nums)):
            prefix.append(pre_prod)
            suffix.append(suff_prod) 
            pre_prod *= nums[i]
            suff_prod *= nums[len(nums)-1-i]
            
        # print(prefix, suffix)
        productArr = []

        for p in range (len(nums)):
            s = len(nums)-1-p
            pre_element = prefix[p]
            suf_element = suffix[s]
            # print(pre_element, suf_element)
            # print(p,s)
            productArr.append(pre_element*suf_element)

        return productArr