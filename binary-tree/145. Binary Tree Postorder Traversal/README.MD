# 145. Binary Tree Postorder Traversal

## Difficulty

**Easy**

## Topic

**Binary Tree, Recursion, Tree Traversal**

## Problem

Given the root of a binary tree, return the **postorder traversal** of its nodes' values.

Postorder traversal follows:

**Left → Right → Root**

### Example 1

**Input**

```text
root = [1,null,2,3]
```

**Output**

```text
[3,2,1]
```

### Example 2

**Input**

```text
root = []
```

**Output**

```text
[]
```

### Example 3

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
3. Recursively traverse the **left subtree**.
4. Recursively traverse the **right subtree**.
5. Add the current node's value to the result list.
6. This follows the postorder pattern:
   **Left → Right → Root**

---

## Algorithm

1. Create an empty list to store the traversal.
2. Call the recursive function with the root node.
3. If the current node is `null`, return.
4. Recursively call the function for `node.left`.
5. Recursively call the function for `node.right`.
6. Add `node.val` to the list.
7. Return the list.

---

## Time Complexity

**O(n)**

* Every node is visited exactly once.

## Space Complexity

**O(h)**

* `h` is the height of the binary tree.
* The recursive call stack can go as deep as the height of the tree.
* In the worst case, for a skewed tree, this becomes **O(n)**.
