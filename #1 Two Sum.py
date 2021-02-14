# Python Two Sum
class Solution(object):
    def twoSum(self, nums, target):
        lib = {} # make a hashmap -> (k,v)
        for i, n in enumerate(nums):
            if n in lib:
                return (lib[n],i)
            lib[target - n] = i
        return []