# 209. Minimum Size Subarray Sum

## Difficulty

Medium

## Topic

Array, Binary Search, Sliding Window

## Problem

Given an array of positive integers `nums` and an integer `target`, find the **minimum length** of a contiguous subarray whose sum is greater than or equal to `target`.

If no such subarray exists, return `0`.

### Input

```text
target = 7
nums = [2,3,1,2,4,3]
```

### Output

```text
2
```

---

## Constraints

* `1 <= target <= 10⁹`
* `1 <= nums.length <= 10⁵`
* `1 <= nums[i] <= 10⁴`

---

## Approach

1. Binary search on the **length of the subarray**.
2. Let `mid` represent the current subarray length.
3. Use a fixed-size sliding window to check whether any subarray of length `mid` has sum `>= target`.
4. If such a subarray exists:

   * `mid` is a possible answer.
   * Search for a smaller length.
5. If no such subarray exists:

   * We need a larger length.
6. Return the minimum valid length found.

---

## Algorithm

1. Set `l = 1` and `h = nums.length`.
2. Calculate `mid`.
3. Check whether any window of size `mid` has sum `>= target`.
4. If yes:

   * Store `mid` in `ans`.
   * Move left: `h = mid - 1`.
5. If no:

   * Move right: `l = mid + 1`.
6. Continue until `l > h`.
7. Return `ans`.

---

## Time Complexity

**O(n log n)**

* Binary search: `O(log n)`
* Each `check()` takes `O(n)`

## Space Complexity

**O(1)**
