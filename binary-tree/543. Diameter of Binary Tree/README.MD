# 543. Diameter of Binary Tree

## Difficulty

Easy

## Topic

Binary Tree, Recursion, Postorder Traversal, Tree Depth

## Problem

Given the root of a binary tree, return the length of the diameter of the tree.

The diameter is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

### Input

```text id="r8w2kp"
root = [1,2,3,4,5]
```

### Output

```text id="1j5v8x"
3
```

## Constraints

* The number of nodes in the tree is in the range `[1, 10^4]`.
* `-100 <= Node.val <= 100`

---

## Approach

1. Use **recursion with postorder traversal** because the height of the left and right subtrees is required before calculating the diameter at the current node.
2. For every node, recursively calculate the height of its left and right subtrees.
3. The longest path passing through the current node is:
   `left height + right height`
4. Update the global diameter `d` with the maximum of its current value and `left + right`.
5. Return the height of the current subtree:
   `max(left, right) + 1`
6. After processing the entire tree, return the global diameter.

## Algorithm

```text id="b3qj4x"
1. Initialize d = 0.

2. Call rec(root).

3. In rec(node):
   - If node is null, return 0.
   - Recursively find the height of the left subtree.
   - Recursively find the height of the right subtree.

4. Calculate the diameter passing through the current node:
   leftHeight + rightHeight.

5. Update d with the maximum diameter found.

6. Return max(leftHeight, rightHeight) + 1.

7. Return d.
```

## Time Complexity

**O(n)** — Every node is visited exactly once.

## Space Complexity

**O(h)** — The recursion stack requires space proportional to the height of the tree.
