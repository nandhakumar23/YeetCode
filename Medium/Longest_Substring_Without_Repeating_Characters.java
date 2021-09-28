### [3\. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)

Difficulty: **Medium**  

Related Topics: [Hash Table](https://leetcode.com/tag/hash-table/), [String](https://leetcode.com/tag/string/), [Sliding Window](https://leetcode.com/tag/sliding-window/)


Given a string `s`, find the length of the **longest substring** without repeating characters.

**Example 1:**

```
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
```

**Example 2:**

```
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**

```
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

**Example 4:**

```
Input: s = ""
Output: 0
```

**Constraints:**

*   `0 <= s.length <= 5 * 10<sup>4</sup>`
*   `s` consists of English letters, digits, symbols and spaces.


#### Solution

Language: **Java**

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character> (); 
        int start=0;
        int end = 0;
        int maxLength=0;
​
        while(end < s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                maxLength = Math.max(maxLength,set.size());
                end++;
            }   
            else
            {
                set.remove(s.charAt(start));    
                start++;  
            }
        }
​
        return maxLength;
    }
}
```