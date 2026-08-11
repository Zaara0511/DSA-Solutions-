# 540. Single Element in a Sorted Array

## Difficulty

Medium

## Topic

Binary Search

## Problem

You are given a sorted array where every element appears exactly twice, except for one element that appears only once.

Return the element that appears only once.

The solution must run in `O(log n)` time and use `O(1)` extra space.

### Example 1

**Input**

```text
nums = [1,1,2,3,3,4,4,8,8]
```

**Output**

```text
2
```

### Example 2

**Input**

```text
nums = [3,3,7,7,10,11,11]
```

**Output**

```text
10
```

## Constraints

* `1 <= nums.length <= 10^5`
* `0 <= nums[i] <= 10^5`
* Every element appears exactly twice except for one element.
* `nums` is sorted in non-decreasing order.

---

## Approach

1. Use binary search with two pointers, `low` and `high`.
2. Find the middle index `mid`.
3. Make `mid` even because duplicate elements normally occur at an even index followed by an odd index.
4. Compare `nums[mid]` with `nums[mid + 1]`.
5. If they are equal, the pair is correct, so the single element must be on the right side.
6. Otherwise, the pairing pattern is broken, so the single element is at `mid` or somewhere on the left side.
7. Continue the binary search until `low` and `high` point to the same index.
8. Return `nums[low]`.

---

## Algorithm

1. Initialize `low = 0` and `high = nums.length - 1`.
2. While `low < high`:

   * Calculate `mid`.
   * If `mid` is odd, decrease it by `1` to make it even.
   * If `nums[mid] == nums[mid + 1]`, move `low` to `mid + 2`.
   * Otherwise, move `high` to `mid`.
3. When `low == high`, return `nums[low]`.

---

## Time Complexity

**O(log n)**

* Binary search reduces the search range by approximately half in every iteration.
* Therefore, the overall time complexity is `O(log n)`.

---

## Space Complexity

**O(1)**

* Only a few variables such as `low`, `high`, and `mid` are used.
* No additional data structures are required.
