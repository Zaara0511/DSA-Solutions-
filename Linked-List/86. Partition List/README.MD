# 86 . Partition List


## Difficulty
Medium

## Topic
Linked List

## Problem
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
You should preserve the original relative order of the nodes in each of the two partitions.

**Input**

```text
head = [1,4,3,2,5,2], x = 3
```

**Output**

```text
[1,2,2,4,3,5]
```

### Example 2

**Input**

```text
head = [2,1], x = 2
```

**Output**

```text
[1,2]
```

## Constraints:

- `0 <= Number of Nodes <= 200`
- `-100 <= Node.val <= 100`
- `-200 <= x <= 200`

---

## Approach

1. Create two dummy linked lists:
   - One for nodes with values `< x`.
   - One for nodes with values `>= x`.
2. Traverse the original linked list once.
3. Append each node to the appropriate list.
4. Connect the smaller list to the larger list.
5. Return the head of the merged list.

---

## Algorithm

1. Initialize two dummy nodes.
2. Maintain two pointers (`left` and `right`).
3. Traverse the original list.
4. Append each node to the correct partition.
5. Set the last node of the right partition to `null`.
6. Connect the two partitions.
7. Return the head of the new list.

---

## Time Complexity

**O(n)**

Each node is visited exactly once.

---

## Space Complexity

**O(1)**

Only a few extra pointers are used.
