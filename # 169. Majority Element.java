class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) &&
                map.get(nums[i]) + 1 > nums.length/2) {
                return nums[i];
            } else {
                map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            }
        }
        return -1;
    }
}

// Enhanced for loop
class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        
        // for-each element
        for (int i: nums) {
            if (map.containsKey(i) &&
                // add 1 means add the current occurence
                map.get(i) + 1 > nums.length/2) {
                return i;
            } else {
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }
        return -1;
    }
}