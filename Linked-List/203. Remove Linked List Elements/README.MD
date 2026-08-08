# 203. Remove Linked List Elements

## Difficulty

Easy

## Topic

Linked List

## Problem

Given the head of a linked list and an integer `val`, remove all the nodes of the linked list that have `Node.val == val`, and return the new head.

### Example 1

**Input**

```text
head = [1,2,6,3,4,5,6]
val = 6
```

**Output**

```text
[1,2,3,4,5]
```

### Example 2

**Input**

```text
head = []
val = 1
```

**Output**

```text
[]
```

### Example 3

**Input**

```text
head = [7,7,7,7]
val = 7
```

**Output**

```text
[]
```

## Constraints

* `0 <= number of nodes <= 10⁴`
* `1 <= Node.val <= 50`
* `0 <= val <= 50`

---

## Approach

1. Create a dummy node before the head of the linked list.
2. Connect `dummy.next` to `head`.
3. Use a `curr` pointer starting from the dummy node.
4. Check `curr.next` instead of `curr`, so that the previous node is available when a node needs to be deleted.
5. If `curr.next.val` is equal to `val`, skip that node using `curr.next = curr.next.next`.
6. Otherwise, move `curr` to the next node.
7. Continue until `curr.next` becomes `null`.
8. Return `dummy.next` as the new head.

---

## Algorithm

1. Initialize a dummy node with value `-1`.
2. Set `dummy.next = head`.
3. Initialize `curr = dummy`.
4. Traverse the linked list while `curr.next != null`.
5. If `curr.next.val == val`:

   * Remove the node by setting `curr.next = curr.next.next`.
6. Otherwise:

   * Move `curr` to `curr.next`.
7. Return `dummy.next`.

---

## Time Complexity

**O(n)**

* The linked list is traversed once.
* Each node is checked at most once.

Overall:

* **O(n)**

---

## Space Complexity

**O(1)**

* Only the `dummy` and `curr` pointers are used.
* No extra data structure depending on the size of the linked list is created.

Overall:

* **O(1)**
