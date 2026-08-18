# 705. Design HashSet

## Difficulty

Easy

## Topic

ArrayList, HashSet Design

## Problem

Design a HashSet without using any built-in hash table libraries.

Implement the `MyHashSet` class with the following operations:

* `add(key)` — Inserts the value `key` into the HashSet.
* `remove(key)` — Removes the value `key` from the HashSet if it exists.
* `contains(key)` — Returns `true` if the value `key` exists in the HashSet, otherwise returns `false`.

Each key should appear at most once in the set.

## Examples

**Input**

```text
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
```

**Output**

```text
[null, null, null, true, false, null, true, null, false]
```

## Constraints

* `0 <= key <= 10^6`
* At most `10^4` calls will be made to `add`, `remove`, and `contains`.
* Duplicate keys should not be stored.

---

## Approach

1. Use an `ArrayList<Integer>` to store the elements of the HashSet.
2. For `add`, first check whether the key already exists using `contains()`.
3. If the key does not exist, add it to the list.
4. For `remove`, traverse the list and find the key.
5. If the key is found, remove it and stop searching.
6. For `contains`, traverse the list and return `true` when the key is found.
7. If the key is not found after traversing the list, return `false`.

---

## Algorithm

1. Initialize an empty `ArrayList`.
2. **Add:**

   * Check whether the key already exists.
   * If it does not exist, add it.
3. **Remove:**

   * Traverse the list.
   * If the key is found, remove it and break the loop.
4. **Contains:**

   * Traverse the list.
   * Return `true` if the key is found.
   * Otherwise return `false`.

---

## Time Complexity

**O(n)**

* `contains()` performs a linear search.
* `add()` uses `contains()`, so it is also `O(n)`.
* `remove()` may need to traverse the entire list.
* `n` is the number of elements currently stored.

## Space Complexity

**O(n)**

* The `ArrayList` stores all unique keys.
