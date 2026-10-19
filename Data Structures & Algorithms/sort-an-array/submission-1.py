class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:

        def merge(arr, left, right, middle):
            leftArr = arr[left:middle+1]
            rightArr = arr[middle+1:right+1]
            l, r, i = 0, 0, left


            while l < len(leftArr) and r < len(rightArr):

                if (leftArr[l] < rightArr[r]):
                    arr[i] = leftArr[l]
                    l+=1
                else:
                    arr[i] = rightArr[r]
                    r+=1
                i+=1

            while l < len(leftArr):
                arr[i] = leftArr[l]
                i+=1
                l+=1

            while r < len(rightArr):
                arr[i] = rightArr[r]
                i+=1
                r+=1
            
            return arr

        def mergeSort(arr : List[int], left: int, right: int):
            if left == right:
                return arr
            
            # Dividiing phase
            middle = (left + right) // 2
            mergeSort(arr, left, middle)
            mergeSort(arr, middle + 1, right)

            #Conquering phase
            merge(arr, left, right, middle)


        
        mergeSort(nums, 0, len(nums)-1)
        return nums