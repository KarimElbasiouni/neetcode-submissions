class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for(int num : nums){
            count.putIfAbsent(num,0);
            count.replace(num, count.get(num) + 1);
        }

        for(int i = 0; i < buckets.length; i++){
            buckets[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            int idx = entry.getValue();

            buckets[idx].add(entry.getKey());
        }

        int[] result = new int[k];
        int j = 0;
        for(int i = buckets.length - 1; i>0; i--){
            for(int val : buckets[i]){
                result[j++] = val;
                if(j==k){
                    return result;
                }
            }
        }
        return result;

    }
}
