# 102. Binary Tree Level Order Traversal

## Difficulty

Medium

## Topic

Binary Tree, Breadth-First Search (BFS), Queue

## Problem

Given the root of a binary tree, return the level order traversal of its nodes' values. This means visiting the nodes from left to right, level by level.

### Input

```text
root = [3,9,20,null,null,15,7]
```

### Output

```text
[[3],[9,20],[15,7]]
```

## Constraints

* The number of nodes in the tree is in the range `[0, 2000]`.
* `-1000 <= Node.val <= 1000`

---

## Approach

1. Use a **Queue** to perform Breadth-First Search (BFS).
2. Add the root node to the queue.
3. While the queue is not empty:

   * Store the current queue size. This represents the number of nodes in the current level.
   * Create a list to store the values of the current level.
   * Process exactly that many nodes.
   * Add each node's value to the current level list.
   * Add its left and right children to the queue if they exist.
4. Add the current level list to the final result.
5. Continue until all nodes have been processed.

## Algorithm

```text
1. Create an empty result list.
2. Create a queue and add the root.
3. If root is null, return the empty result.
4. While the queue is not empty:
   a. Get the current queue size.
   b. Create an empty list for the current level.
   c. Process exactly `size` nodes:
      - Remove a node from the queue.
      - Add its value to the current level.
      - Add its left child if it exists.
      - Add its right child if it exists.
   d. Add the current level to the result.
5. Return the result.
```

## Time Complexity

**O(n)** — Every node is visited and processed exactly once.

## Space Complexity

**O(n)** — The queue and result can require O(n) space in the worst case.
