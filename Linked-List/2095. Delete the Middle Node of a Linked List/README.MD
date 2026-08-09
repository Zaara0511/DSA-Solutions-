# 2095. Delete the Middle Node of a Linked List

## Difficulty

Medium

## Topic

Linked List, Two Pointers, Slow and Fast Pointers

## Problem

Given the head of a singly linked list, delete the **middle node** of the linked list and return the head of the modified list.

For a list with an even number of nodes, the **second middle node** is considered the middle node.

## Examples

### Example 1

```text
Input: head = [1,3,4,7,1,2,6]
Output: [1,3,4,1,2,6]
```

The middle node `7` is removed.

### Example 2

```text
Input: head = [1,2,3,4]
Output: [1,2,4]
```

The second middle node `3` is removed.

### Example 3

```text
Input: head = [2,1]
Output: [2]
```

The second middle node `1` is removed.

## Constraints

* `1 <= number of nodes <= 10^5`
* `1 <= Node.val <= 10^5`

---

## Approach

Use the **slow and fast pointer technique**.

* `fast` moves two nodes at a time.
* `slow` moves one node at a time.
* When `fast` reaches the end, `slow` will be positioned just **before the middle node**.

This allows us to remove the middle node directly using:

```java
slow.next = slow.next.next;
```

For a single-node list, there is no node after the head, so simply return `null`.

## Algorithm

1. If the list contains only one node, return `null`.
2. Initialize `slow` and `fast` to `head`.
3. Move:

   * `slow` one step.
   * `fast` two steps.
4. Continue while `fast.next != null` and `fast.next.next != null`.
5. At the end, `slow.next` is the middle node.
6. Remove it using:

   ```java
   slow.next = slow.next.next;
   ```
7. Return `head`.

## Time Complexity

The fast pointer traverses the linked list, so the list is traversed once.

**Time Complexity: O(n)**

## Space Complexity

Only two pointers are used, regardless of the size of the linked list.

**Space Complexity: O(1)**
