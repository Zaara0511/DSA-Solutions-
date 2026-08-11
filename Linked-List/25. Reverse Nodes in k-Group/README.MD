# 25. Reverse Nodes in k-Group

## Difficulty

Hard

## Topic

Linked List, Recursion

## Problem

Given the head of a linked list, reverse the nodes of the list `k` at a time and return the modified list.

If the number of nodes remaining is less than `k`, those nodes should remain in their original order.

You must reverse the nodes by changing their links, not by changing their values.

### Example 1

**Input**

```text
head = [1,2,3,4,5], k = 2
```

**Output**

```text
[2,1,4,3,5]
```

### Example 2

**Input**

```text
head = [1,2,3,4,5], k = 3
```

**Output**

```text
[3,2,1,4,5]
```

## Constraints

* `1 <= k <= n <= 5000`
* `0 <= Node.val <= 1000`

---

## Approach

1. Start from the current `head` and check whether at least `k` nodes are available.
2. If fewer than `k` nodes are available, return the current `head` without reversing them.
3. If `k` nodes are available, reverse the first `k` nodes using a separate reversal function.
4. After reversing the group, the original `head` becomes the last node of that group.
5. Recursively process the remaining nodes starting from the node after the current group.
6. Connect the last node of the current reversed group to the result of the recursive call.
7. Return the new head of the reversed group.

---

## Algorithm

1. Initialize a pointer `check` at `head` and count the next `k` nodes.
2. If the count is less than `k`, return `head`.
3. Reverse the first `k` nodes using three pointers: `prev`, `curr`, and `next`.
4. Store the new head of the reversed group.
5. Recursively call the function for the remaining list.
6. Connect the original `head` to the recursively processed list.
7. Return the new head.
8. Repeat this process for every group of `k` nodes.

---

## Time Complexity

**O(n)**

* Each node is checked and reversed a constant number of times.
* Therefore, the overall time complexity is `O(n)`.

---

## Space Complexity

**O(n/k)**

* The reversal itself uses `O(1)` extra space.
* The recursive calls create one stack frame for each group of `k` nodes.
* Therefore, the recursion stack uses `O(n/k)` space.
