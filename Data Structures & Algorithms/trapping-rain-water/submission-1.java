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
        */
        int total =  0;
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];
        int left = 0;
        int right = height.length-1;
        int maxHeightL = 0;
        int maxHeightR = 0;
        while(!(left == height.length-1 && right == 0)){
            left++;
            maxHeightL = Math.max(maxHeightL, height[left-1]);
            prefix[left-1] = maxHeightL;

            right--;
            maxHeightR = Math.max(maxHeightR, height[right+1]);
            suffix[right+1]  = maxHeightR;
        }

        for(int i = 0; i < height.length; i++){

            total += Math.max(Math.min(prefix[i], suffix[i]) - height[i],0);
        }
        return total;
    }
}
