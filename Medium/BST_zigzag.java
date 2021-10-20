### [103\. Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

Difficulty: **Medium**  

Related Topics: [Tree](https://leetcode.com/tag/tree/), [Breadth-First Search](https://leetcode.com/tag/breadth-first-search/), [Binary Tree](https://leetcode.com/tag/binary-tree/)


Given the `root` of a binary tree, return _the zigzag level order traversal of its nodes' values_. (i.e., from left to right, then right to left for the next level and alternate between).

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg)

```
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]
```

**Example 2:**

```
Input: root = [1]
Output: [[1]]
```

**Example 3:**

```
Input: root = []
Output: []
```

**Constraints:**

*   The number of nodes in the tree is in the range `[0, 2000]`.
*   `-100 <= Node.val <= 100`


#### Solution

Language: **Java**

```java
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            zigzagList.add(newrootsvals);
​
            zag(zigzagList, newroots);
            }
        }
    }
​
    public void zag(List<List<Integer>> zigzagList, List<TreeNode> roots)
    {
        if(roots.size() != 0)
        {
            List<TreeNode> newroots = new ArrayList<TreeNode>();
            List<Integer> newrootsvals = new ArrayList<Integer>();
            for(int i=roots.size()-1; i>=0 ; i--)
            {
                
                if(roots.get(i).right!=null)
                {
                    newroots.add(roots.get(i).right);
                    newrootsvals.add(roots.get(i).right.val);
                } 
                
                if(roots.get(i).left!=null)
                {
                    newroots.add(roots.get(i).left);
                    newrootsvals.add(roots.get(i).left.val);
                }  
​
            }
            
            if(newroots.size()!=0)
            {
            
            zigzagList.add(newrootsvals);
​
            zig(zigzagList, newroots);
            }
        }
    }
​
    
}
```