### [5\. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

Difficulty: **Medium**  

Related Topics: [String](https://leetcode.com/tag/string/), [Dynamic Programming](https://leetcode.com/tag/dynamic-programming/)


Given a string `s`, return _the longest palindromic substring_ in `s`.

**Example 1:**

```
Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.
```

**Example 2:**

```
Input: s = "cbbd"
Output: "bb"
```

**Example 3:**

```
Input: s = "a"
Output: "a"
```

**Example 4:**

```
Input: s = "ac"
Output: "a"
```

**Constraints:**

*   `1 <= s.length <= 1000`
*   `s` consist of only digits and English letters (lower-case and/or upper-case),


#### Solution

Language: **Java**

```java
class Solution {
    public String longestPalindrome(String s) {
        
        int len = s.length();
        
        if(len==0)
        {
            return "";
        }
        
        String longest_pal = "";
        
        boolean[][] isPalindrome = new boolean[len][len];
        
        for(int i=len-1; i>=0; i--)
        {
            for(int j=i; j<len; j++)
            {
               if(s.charAt(i)==s.charAt(j))
               {
                   if(j-i <=2)
                   {
                      isPalindrome[i][j]=true;
                      
                       if((j-i+1)>= longest_pal.length())
                       {
                           longest_pal = s.substring(i,j+1);
                       }
                   }
                   else if(isPalindrome[i+1][j-1])
                   {
                      isPalindrome[i][j]=true;  
                      if((j-i+1)>= longest_pal.length())
                       {
                           longest_pal = s.substring(i,j+1);
                       }
                   }
                   else
                   {
                       isPalindrome[i][j]=false;
                   }
                   
               }
               else
               {
                  isPalindrome[i][j] = false; 
               }
                
            }
        }
        
        return longest_pal;
        
        
    }
}
```