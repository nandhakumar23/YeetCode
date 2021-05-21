### [1696\. Jump Game VI](https://leetcode.com/problems/jump-game-vi/)

Difficulty: **Medium**  

Related Topics: [Dequeue](https://leetcode.com/tag/dequeue/)


You are given a **0-indexed** integer array `nums` and an integer `k`.

You are initially standing at index `0`. In one move, you can jump at most `k` steps forward without going outside the boundaries of the array. That is, you can jump from index `i` to any index in the range `[i + 1, min(n - 1, i + k)]` **inclusive**.

You want to reach the last index of the array (index `n - 1`). Your **score** is the **sum** of all `nums[j]` for each index `j` you visited in the array.

Return _the **maximum score** you can get_.

**Example 1:**

```
Input: nums = [1,-1,-2,4,-7,3], k = 2
Output: 7
Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
```

**Example 2:**

```
Input: nums = [10,-5,-2,4,0,3], k = 3
Output: 17
Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
```

**Example 3:**

```
Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
Output: 0
```

**Constraints:**

*   `1 <= nums.length, k <= 10<sup>5</sup>`
*   `-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>`


#### Solution

Language: **Java**

```java
​
class Solution {
    public int maxResult(int[] nums, int kj) {
        
        int[] OPT = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)
        {
            if(i<kj)
            {
                int sol_max = -2147483648;
                for(int k=0; k<i ; k++)
                {
                    if(OPT[k] > sol_max)
                    {
                        sol_max=OPT[k];
                    }
                }
                
                if(sol_max==-2147483648)
                {
                    OPT[i] = nums[i];
                    System.out.println("My OPT for OPT[ " + i +" ] is: " + OPT[i]);
                }
                else
                {
                    OPT[i] = sol_max + nums[i];
                    System.out.println("My OPT for OPT[ " + i +" ] is: " + OPT[i]);
                }
                
                
            }
            else
            {
                int sol_max = -2147483648;
                for(int k=Math.max(0, i-kj); k<i ; k++)
                {
                    if(OPT[k] > sol_max)
                    {
                        sol_max=OPT[k];
                    }
                }
                OPT[i] = sol_max + nums[i];
                System.out.println("My OPT for OPT[ " + i +" ] is: " + OPT[i]);
            }
            
        }
        
        return OPT[nums.length -1];
            
    }
}
```