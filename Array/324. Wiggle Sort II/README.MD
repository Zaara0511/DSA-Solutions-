# 324. Wiggle Sort II

## Difficulty

Medium

## Topic

Array, Sorting, Two Pointers

## Problem

Given an integer array `nums`, reorder it such that:

```
nums[0] < nums[1] > nums[2] < nums[3]...
```

You may assume the input array always has a valid answer.

### Example 1

**Input**

```
nums = [1,5,1,1,6,4]
```

**Output**

```
[1,6,1,5,1,4]
```

One possible correct output is shown above.

### Example 2

**Input**

```
nums = [1,3,2,2,3,1]
```

**Output**

```
[2,3,1,3,1,2]
```

## Constraints

- `1 <= nums.length <= 5 × 10⁴`
- `0 <= nums[i] <= 5000`
- It is guaranteed that a valid answer exists.

---

## Approach

1. Sort the given array.
2. Split the sorted array into two halves.
3. Traverse both halves from the end.
4. Place elements from the end of the first half at even indices.
5. Place elements from the end of the second half at odd indices.
6. This ensures the required wiggle order while correctly handling duplicate values.

---

## Algorithm

1. Create a copy of the original array.
2. Sort the copied array.
3. Initialize:
   - `left = (n - 1) / 2` (last element of the first half)
   - `right = n - 1` (last element of the second half)
4. Traverse the original array from index `0` to `n - 1`:
   - If the index is even, place `arr[left]` and decrement `left`.
   - Otherwise, place `arr[right]` and decrement `right`.
5. The array is now arranged in wiggle order.

---

## Time Complexity

**O(n log n)**

- Sorting the array takes **O(n log n)**.
- Filling the result takes **O(n)**.

Overall:

- **O(n log n)**

---

## Space Complexity

**O(n)**

- An extra array is used to store the sorted elements.