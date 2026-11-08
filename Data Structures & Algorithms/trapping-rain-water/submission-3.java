class Solution {
    public int trap(int[] height) {
        
        
        /**
            In order to determine the amount of water that can be trapped at a given index i, we must know whether
            there are walls that can be used to trap water between, as well as the height of those walls on either side of i. 
            
            We can see that the bottleneck in how much water we can trap is the shorter of the two walls
            (i.e. min(height[left], height[right]) ). left/right do not always refer to the immediate left/right wall (i-1, i+1). It 
            refers to the maximum height on the left/right encountered at any given moment. In order to figure that out, we can use a
            prefix/suffix pattern. 
            
            The prefix array would start from the left side, and iterate from left to right, storing the
            maximum left wall height encountered up until that index. 
            
            The suffix array would start from the right side, and iterate
            from right to left side, storing the maximum wall height encountered up until that index (storing the values from right 
            to left). 
            
            From that point on, we run one final loop, iterating through both prefix, suffix, and original array
            simultaneously, following the formula sum += max(min( prefix[i] , suffix[i] ) - height[i], 0) 


            SECOND SOLUTION: Instead of using a prefix/suffix pattern, we could just use two-pointers with if conditions.
            Since we need a wall on the left and right to store water, what we can do is say the following. 
            
            If we place two pointers at either end of the array, iterating such that so long as the left wall is shorter, we will
            iterate the left pointer, since our bottleneck is always the shorter wall. While doing so, we keep track of the max wall
            height, and subtract the max wall height from the height at the current index to see how much water can be trapped at that
            index.

            If the left wall is taller than the right wall, then we iterate the right pointer, keep track of max wall height, and find
            how much water can be trapped (maxRightHeight - height[right]). 
            
        */
        
        int total =  0;
        int left = 0;
        int right = height.length-1;
        int maxRightHeight = height[right];
        int maxLeftHeight= height[left];
        while (left < right){

            if(height[left]<height[right]){
                left++;
                maxLeftHeight=Math.max(maxLeftHeight, height[left]);
                total+= maxLeftHeight - height[left];
            }else{
                right--;
                maxRightHeight=Math.max(maxRightHeight, height[right]);
                total+= maxRightHeight - height[right];
            }
        }
        return total;
    }
}
