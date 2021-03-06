### [73\. Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)

Difficulty: **Medium**  

Related Topics: [Array](https://leetcode.com/tag/array/)


Given an `_m_ x _n_` matrix. If an element is **0**, set its entire row and column to **0**. Do it .

**Follow up:**

*   A straight forward solution using O(_m__n_) space is probably a bad idea.
*   A simple improvement uses O(_m_ + _n_) space, but still not the best solution.
*   Could you devise a constant space solution?

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/08/17/mat1.jpg)

```
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/08/17/mat2.jpg)

```
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
```

**Constraints:**

*   `m == matrix.length`
*   `n == matrix[0].length`
*   `1 <= m, n <= 200`
*   `-2<sup>31</sup> <= matrix[i][j] <= 2<sup>31</sup> - 1`


#### Solution

Language: **Python**

```python
class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        setofrows = set({})
        setofcols = set({})
        
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    setofrows.add(i)
                    setofcols.add(j)
        
        for i in setofrows:
            for j in range(len(matrix[i])):
                matrix[i][j]=0
        
        for i in setofcols:
            for j in range(len(matrix)):
                matrix[j][i]=0
        
        
```