### [15\. 3Sum](https://leetcode.com/problems/3sum/)

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/), [Two Pointers](https://leetcode.com/tag/two-pointers/)


Given an integer array nums, return all the triplets `[nums[i], nums[j], nums[k]]` such that `i != j`, `i != k`, and `j != k`, and `nums[i] + nums[j] + nums[k] == 0`.

Notice that the solution set must not contain duplicate triplets.

**Example 1:**

```
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

**Example 2:**

```
Input: nums = []
Output: []
```

**Example 3:**

```
Input: nums = [0]
Output: []
```

**Constraints:**

*   `0 <= nums.length <= 3000`
*   `-10<sup>5</sup> <= nums[i] <= 10<sup>5</sup>`


#### Solution

Language: **Java**

```java
class Solution {
    public List<List<Integer>> threeSum(int[] A) {
    List<List<Integer>>res = new ArrayList<List<Integer>>();
    if (A == null || A.length == 0)
        return res;
    Arrays.sort(A);
    for (int i = 0; i < A.length; i++) {
        if (i - 1 >= 0 && A[i] == A[i - 1]) continue;// Skip equal elements to avoid duplicates
          
        int left = i + 1, right = A.length - 1; 
        while (left < right) {// Two Pointers
            int sum = A[i] + A[left] + A[right];
            if (sum == 0) { 
                res.add(Arrays.asList(A[i], A[left], A[right]));
                while (left + 1 < right && A[left] == A[left+1])// Skip equal elements to avoid duplicates
                    left++;
                while (right -1 > left && A[right] == A[right-1])// Skip equal elements to avoid duplicates
                    right--;
                left++; 
                right--;
            } else if (sum < 0) { 
                left++;
            } else {
                right--;
            }
        }
    }
    return res;
}
}
​
​
```