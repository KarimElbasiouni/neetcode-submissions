class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        count_dict = defaultdict(int)
        for num in nums:
            count_dict[num]+=1
        
        print(count_dict) #///DEBUG////
        arr = [[] for i in range(len(nums)+1)]
        print(arr)
        for key in count_dict:

            #count of the number(key) in count_dict, which for the array would equal the index
            val = count_dict[key] 
            arr[val].append(key)

            print(val, arr[val]) #///DEBUG////
            print(arr)

        
        res = []
        n = k
        idx = len(nums)
        print("WHILE LOOP")
        while idx > 0:
            print("before for", idx)
            for j in range(len(arr[idx])): 
                print("after for", idx)
                #The added two arguments -1, -1 allow us to iterate backwards
                #(start, stop, step) so we start at len, stop at -1, and move 1 step backwards each iteration
                if n > 0:
                    # print(idx)
                    # print(arr[idx])
                    res.append(arr[idx][j])
                    n-=1
                

            idx-=1
        
        return res

