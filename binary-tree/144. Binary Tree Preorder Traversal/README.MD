# 144. Binary Tree Preorder Traversal

## Difficulty

**Easy**

## Topic

**Binary Tree, Recursion, Tree Traversal**

## Problem

Given the root of a binary tree, return the **preorder traversal** of its nodes' values.

Preorder traversal follows:

**Root → Left → Right**

### Example 1

**Input**

```text
root = [1,null,2,3]
```

**Output**

```text
[1,2,3]
```

### Example 2

**Input**

```text
root = [1,2,3,4,5,null,8,null,null,6,7,9]
```

**Output**

```text
[1,2,4,5,6,7,3,8,9]
```

### Example 3

**Input**

```text
root = []
```

**Output**

```text
[]
```

### Example 4

**Input**

```text
root = [1]
```

**Output**

```text
[1]
```

## Constraints

* The number of nodes in the tree is in the range `[0, 100]`.
* `-100 <= Node.val <= 100`

---

## Approach

1. Use **recursion** to traverse the binary tree.
2. If the current node is `null`, stop and return.
3. Add the current node's value to the result list.
4. Recursively traverse the **left subtree**.
5. Recursively traverse the **right subtree**.
6. This follows the preorder pattern:
   **Root → Left → Right**

---

## Algorithm

1. Create an empty list to store the traversal.
2. Call the recursive function with the root node.
3. If the current node is `null`, return.
4. Add `node.val` to the list.
5. Call the function for `node.left`.
6. Call the function for `node.right`.
7. Return the list.

---

## Time Complexity

**O(n)**

* Every node in the binary tree is visited exactly once.

## Space Complexity

**O(h)**

* `h` is the height of the tree.
* The recursive call stack can go as deep as the height of the tree.
* In the worst case of a skewed tree, this becomes **O(n)**.
