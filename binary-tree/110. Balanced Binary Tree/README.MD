# 110. Balanced Binary Tree

## Difficulty

Easy

## Topic

Binary Tree, Recursion, Postorder Traversal, Height

## Problem

Given the root of a binary tree, determine if the tree is height-balanced.

A binary tree is balanced if, for every node, the difference between the heights of its left and right subtrees is at most `1`.

### Input

```text id="q1m7sv"
root = [3,9,20,null,null,15,7]
```

### Output

```text id="0h9lq4"
true
```

## Constraints

* The number of nodes in the tree is in the range `[0, 5000]`.
* `-10^4 <= Node.val <= 10^4`

---

## Approach

1. Use **recursion with postorder traversal** because we need the height of both subtrees before checking the current node.
2. For every node, recursively calculate the height of its left and right subtrees.
3. If either subtree is already unbalanced, return `-1` immediately.
4. Check the difference between the left and right subtree heights.
5. If the difference is greater than `1`, return `-1`.
6. Otherwise, return the height of the current subtree:
   `max(leftHeight, rightHeight) + 1`
7. Finally, if the returned value is `-1`, the tree is unbalanced; otherwise, it is balanced.

## Algorithm

```text id="h4m8a2"
1. Call rec(root).

2. In rec(node):
   - If node is null, return 0.
   - Recursively find the height of the left subtree.
   - Recursively find the height of the right subtree.

3. If either left or right returns -1:
   - Return -1 because the subtree is already unbalanced.

4. If |leftHeight - rightHeight| > 1:
   - Return -1.

5. Otherwise:
   - Return max(leftHeight, rightHeight) + 1.

6. In isBalanced():
   - If rec(root) == -1, return false.
   - Otherwise, return true.
```

## Time Complexity

**O(n)** — Every node is visited once.

## Space Complexity

**O(h)** — The recursion stack uses space proportional to the height of the tree.
