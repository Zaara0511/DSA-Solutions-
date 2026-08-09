# 83. Remove Duplicates from Sorted List

## Difficulty

Easy

## Topic

Linked List

## Problem

Given the head of a **sorted** linked list, delete all duplicate nodes so that each value appears only once.

Return the modified linked list.

## Examples

### Example 1

```text
Input: head = [1,1,2]
Output: [1,2]
```

### Example 2

```text
Input: head = [1,1,2,3,3]
Output: [1,2,3]
```

## Constraints

* The number of nodes is in the range `[0, 300]`.
* `-100 <= Node.val <= 100`
* The linked list is sorted in non-decreasing order.

---

## Approach

Since the linked list is already **sorted**, duplicate values will always be next to each other.

Use a `curr` pointer to traverse the list.

* If `curr.val == curr.next.val`, the next node is a duplicate, so skip it using:

  ```java
  curr.next = curr.next.next;
  ```
* If the values are different, move `curr` to the next node.

When deleting a duplicate, we **do not move `curr`**, because there could be more duplicates immediately after it.

For example:

```text
1 → 1 → 1 → 2
↑
curr
```

After removing the first duplicate:

```text
1 → 1 → 2
↑
curr
```

We check again before moving forward.

## Algorithm

1. If the list is empty or has only one node, return `head`.
2. Initialize `curr = head`.
3. Traverse while `curr` and `curr.next` are not `null`.
4. If `curr.val == curr.next.val`:

   * Remove the duplicate using `curr.next = curr.next.next`.
5. Otherwise:

   * Move `curr` to `curr.next`.
6. Return `head`.

## Time Complexity

Each node is visited at most once.

**Time Complexity: O(n)**

## Space Complexity

Only one pointer `curr` is used.

**Space Complexity: O(1)**
