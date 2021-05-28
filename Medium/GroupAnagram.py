### [49\. Group Anagrams](https://leetcode.com/problems/group-anagrams/)

Difficulty: **Medium**  

Related Topics: [Hash Table](https://leetcode.com/tag/hash-table/), [String](https://leetcode.com/tag/string/)


Given an array of strings `strs`, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

**Example 2:**

```
Input: strs = [""]
Output: [[""]]
```

**Example 3:**

```
Input: strs = ["a"]
Output: [["a"]]
```

**Constraints:**

*   `1 <= strs.length <= 10<sup>4</sup>`
*   `0 <= strs[i].length <= 100`
*   `strs[i]` consists of lower-case English letters.


#### Solution

Language: **Python**

```python
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        
        GroupedAnagrams = []
        visited = []
        hashmap = {}
        
        for i in range(len(strs)):
            curr_temp =list(strs[i])
            curr_temp.sort()
            curr = ""
            curr = curr.join(curr_temp)
            
            if(curr in hashmap):
                hashmap[curr].append(strs[i])
            else:
                hashmap[curr]= []
                hashmap[curr].append(strs[i])
        
        for key in hashmap:
            AGroup = hashmap[key]
            GroupedAnagrams.append(AGroup)
        
        return GroupedAnagrams
        
                
                
                
            
                
                
```