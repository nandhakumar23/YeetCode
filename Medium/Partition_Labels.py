### [763\. Partition Labels](https://leetcode.com/problems/partition-labels/)

Difficulty: **Medium**  

Related Topics: [Two Pointers](https://leetcode.com/tag/two-pointers/), [Greedy](https://leetcode.com/tag/greedy/)


A string `s` of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

**Example 1:**

```
Input: s = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
```

**Note:**

*   `s` will have length in range `[1, 500]`.
*   `s` will consist of lowercase English letters (`'a'` to `'z'`) only.


#### Solution

Language: **Python**

```python
class Solution(object):
    def partitionLabels(self, s):
        """
        :type s: str
        :rtype: List[int]
        """
        lastPos = {}
        partions  =[]
        
        for i in range(len(s)):
            lastPos[s[i]]=i
        
        start=0
        last=0
        for i in range(len(s)):
            last = max(last,lastPos[s[i]])
            if last==i:
                length = last - start + 1
                start = last + 1
                partions.append(length)
        
        return partions
        
        
        
```