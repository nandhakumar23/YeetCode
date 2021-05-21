### [1\. Two Sum](https://leetcode.com/problems/two-sum/)

Difficulty: **Easy**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Hash Table](https://leetcode.com/tag/hash-table/)


Given an array of integers `nums` and an integer `target`, return _indices of the two numbers such that they add up to `target`_.

You may assume that each input would have **_exactly_ one solution**, and you may not use the _same_ element twice.

You can return the answer in any order.

**Example 1:**

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```

**Example 2:**

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

**Example 3:**

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

**Constraints:**

*   `2 <= nums.length <= 10<sup>4</sup>`
*   `-10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>`
*   `-10<sup>9</sup> <= target <= 10<sup>9</sup>`
*   **Only one valid answer exists.**

**Follow-up: **Can you come up with an algorithm that is less than `O(n<sup>2</sup>) `time complexity?

#### Solution

Language: **C++**

```c++
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
/* Brute force
        
        for(int i=0; i<nums.size(); i++)
        {
            for(int j=i+1; j<nums.size(); j++)
            {
                
                if(nums[i] + nums[j] == target)
                {
                    vector<int> sol;
                    sol.push_back(i);
                    sol.push_back(j);
                    return sol;
                }
            }
        }
        
        return nums;
*/
        
// HashMap
​
        unordered_map<int, int> Hashmap; //nums[i]-key, i-value
        
        for(int i=0; i<nums.size(); i++)
        {
            int addup = target - nums[i];
            if(Hashmap.find(addup) == Hashmap.end())
            {
                Hashmap[nums[i]] = i;
            }
            else
            {
                vector<int> sol;
                sol.push_back(i);
                sol.push_back(Hashmap[addup]);
                return sol;
            }
        }
        
        return nums;
        
    }
};
```