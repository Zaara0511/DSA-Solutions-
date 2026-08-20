# 104. Maximum Depth of Binary Tree

## Difficulty

Easy

## Topic

Binary Tree, Recursion, Depth-First Search (DFS)

## Problem

Given the root of a binary tree, return its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

### Input

```text
root = [3,9,20,null,null,15,7]
```

### Output

```text
3
```

## Constraints

* The number of nodes in the tree is in the range `[0, 10^4]`.
* `-100 <= Node.val <= 100`

---

## Approach

1. Use **recursion** to traverse the binary tree.
2. Maintain a `depth` variable representing the current depth.
3. Whenever we visit a node, increment `depth`.
4. Update the global `max` value with the current depth.
5. Recursively traverse the left and right subtrees.
6. When the node is `null`, stop that recursive path.
7. The maximum value reached during traversal is the maximum depth of the tree.

## Algorithm

```text
1. Initialize max = 0.
2. Start recursion from the root with depth = 0.
3. If the current node is null, return.
4. Increment depth.
5. Update max with the current depth.
6. Recursively visit the left subtree.
7. Recursively visit the right subtree.
8. Return max.
```

## Time Complexity

**O(n)** — Every node in the binary tree is visited exactly once.

## Space Complexity

**O(h)** — The recursion stack can contain at most `h` nodes, where `h` is the height of the tree.
