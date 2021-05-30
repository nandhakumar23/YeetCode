### [217\. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/)


Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

**Example 1:**

```
Input: nums = [1,2,3,1]
Output: true
```

**Example 2:**

```
Input: nums = [1,2,3,4]
Output: false
```

**Example 3:**

```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

**Constraints:**

*   `1 <= nums.length <= 10<sup>5</sup>`
*   `-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>`


#### Solution

Language: **Python**

```python
class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        hashmap = {}
        
        for number in nums:
            if number in hashmap:
                return True
            else:
                hashmap[number]=1
                
        return False
```