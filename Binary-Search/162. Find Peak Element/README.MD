# 162. Find Peak Element

## Difficulty

Medium

## Topic

Binary Search

## Problem

A peak element is an element that is strictly greater than its neighbors.

Given an integer array `nums`, find a peak element and return its index. If the array contains multiple peaks, return the index of any peak.

You may assume that `nums[-1] = nums[n] = -∞`.

### Example 1

**Input**

```text
nums = [1,2,3,1]
```

**Output**

```text
2
```

### Example 2

**Input**

```text
nums = [1,2,1,3,5,6,4]
```

**Output**

```text
5
```

## Constraints

* `1 <= nums.length <= 1000`
* `-2³¹ <= nums[i] <= 2³¹ - 1`
* `nums[i] != nums[i + 1]` for all valid `i`

---

## Approach

1. Use binary search to find a peak element efficiently.
2. Calculate the middle index `mid`.
3. Compare `nums[mid]` with `nums[mid + 1]` to determine the direction of the slope.
4. If `nums[mid] < nums[mid + 1]`, the array is increasing at `mid`, so a peak must exist on the right side. Move `low` to `mid + 1`.
5. Otherwise, the array is decreasing at `mid`, so a peak exists at `mid` or somewhere on the left side. Move `high` to `mid`.
6. Continue until `low == high`.
7. Return `low`, which represents the index of a peak element.

---

## Algorithm

1. Initialize `low = 0` and `high = nums.length - 1`.
2. While `low < high`:

   * Calculate `mid`.
   * If `nums[mid] < nums[mid + 1]`, move `low` to `mid + 1`.
   * Otherwise, move `high` to `mid`.
3. When `low == high`, return `low`.

---

## Time Complexity

**O(log n)**

* Binary search eliminates approximately half of the search space in every iteration.

## Space Complexity

**O(1)**

* Only a constant amount of extra space is used.
