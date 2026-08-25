# 27. Remove Element

## Difficulty

Easy

## Topic

Array, Two Pointers

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` **in-place**.

Return the number of elements that are not equal to `val`.

The order of the remaining elements does not matter.

### Example 1

**Input**

```text
nums = [3,2,2,3], val = 3
```

**Output**

```text
2
```

### Example 2

**Input**

```text
nums = [0,1,2,2,3,0,4,2], val = 2
```

**Output**

```text
5
```

## Constraints

* `0 <= nums.length <= 100`
* `0 <= nums[i] <= 50`
* `0 <= val <= 100`

---

## Approach

1. Use a pointer `c` to track the position where the next valid element should be placed.
2. Traverse the array using pointer `i`.
3. If `nums[i]` is **not equal** to `val`, copy it to `nums[c]`.
4. Increment `c`.
5. If `nums[i] == val`, simply skip it.
6. At the end, `c` represents the number of elements remaining.

---

## Algorithm

1. Initialize `c = 0`.
2. Loop through every element of `nums`.
3. If the current element is not `val`:

   * Store it at `nums[c]`.
   * Increment `c`.
4. Return `c`.

---

## Time Complexity

**O(n)**

* The array is traversed once.

## Space Complexity

**O(1)**

* No extra data structure is used; modification is done in-place.
