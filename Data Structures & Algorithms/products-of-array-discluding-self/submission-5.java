class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int postfix = nums.length - 2;

        int[] products = new int[nums.length];
        Arrays.fill(products,1);
        int prefixProduct = 1;
        int postfixProduct = 1;
        while(prefix <= nums.length && postfix >= 0){

            prefixProduct*= nums[prefix-1];
            postfixProduct*=nums[postfix+1];
            products[prefix]*= prefixProduct;
            products[postfix]*= postfixProduct;
            prefix++;
            postfix--;
        }
        return products;
    }
}  
