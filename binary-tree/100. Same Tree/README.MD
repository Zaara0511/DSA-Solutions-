# 100. Same Tree

## Difficulty

Easy

## Topic

Binary Tree, Recursion, DFS

## Problem

Given the roots of two binary trees `p` and `q`, determine if they are the same tree.

Two binary trees are considered the same if they have the **same structure** and the **same node values**.

### Input

```text
p = [1,2,3]
q = [1,2,3]
```

### Output

```text
true
```

---

## Constraints

* The number of nodes in each tree is in the range `[0, 100]`.
* `-10⁴ <= Node.val <= 10⁴`

---

## Approach

1. Compare the two nodes at the same position in both trees.
2. If both nodes are `null`, they are the same at that position → return `true`.
3. If only one node is `null`, the structures are different → return `false`.
4. If their values are different → return `false`.
5. Recursively compare:

   * Left subtree of `p` with left subtree of `q`.
   * Right subtree of `p` with right subtree of `q`.
6. Both subtrees must be the same, so use `&&`.

---

## Algorithm

1. Start from the roots `p` and `q`.
2. Check if both are `null`.
3. Check if one of them is `null`.
4. Compare their values.
5. Recursively compare their left children.
6. Recursively compare their right children.
7. Return `true` only if both left and right subtrees are identical.

---

## Time Complexity

**O(n)**

Each node is visited once.

## Space Complexity

**O(h)**

Where `h` is the height of the tree due to the recursion stack.
