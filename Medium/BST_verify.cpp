### [98\. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)

Difficulty: **Medium**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Depth-first Search](https://leetcode.com/tag/depth-first-search/), [Recursion](https://leetcode.com/tag/recursion/)


Given the `root` of a binary tree, _determine if it is a valid binary search tree (BST)_.

A **valid BST** is defined as follows:

*   The left subtree of a node contains only nodes with keys **less than** the node's key.
*   The right subtree of a node contains only nodes with keys **greater than** the node's key.
*   Both the left and right subtrees must also be binary search trees.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/12/01/tree1.jpg)

```
Input: root = [2,1,3]
Output: true
```

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg)

```
Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
```

**Constraints:**

*   The number of nodes in the tree is in the range `[1, 10<sup>4</sup>]`.
*   `-2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1`


#### Solution

Language: **C++**

```c++
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isValidBST(TreeNode* root) 
    {
        return helper(root, LONG_MAX, LONG_MIN);    
        
    }
    
    bool helper(TreeNode* root, long max, long min)
    {
        if(root==nullptr)
        {
            return true;
        }
        
        if((root->val <= min) || ( root->val >=max))
        {
            return false;
        }
        else
        {
            return helper(root->left, root->val, min) && helper(root->right, max, root->val);
        }
    }
};
```