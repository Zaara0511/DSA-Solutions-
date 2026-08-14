# 33. Search in Rotated Sorted Array

## Difficulty

Medium

## Topic

Binary Search

## Problem

Given a rotated sorted array of distinct integers and a target value, search for the target in the array. Return its index if the target exists; otherwise, return `-1`.

The array was originally sorted in ascending order and then rotated at an unknown position.

### Example 1

**Input**

```text
nums = [4,5,6,7,0,1,2]
target = 0
```

**Output**

```text
4
```

### Example 2

**Input**

```text
nums = [4,5,6,7,0,1,2]
target = 3
```

**Output**

```text
-1
```

## Constraints

* `1 <= nums.length <= 5000`
* `-10⁴ <= nums[i] <= 10⁴`
* All values of `nums` are unique.
* `nums` is sorted and rotated at an unknown position.
* `-10⁴ <= target <= 10⁴`

---

## Approach

1. Use binary search with `low`, `high`, and `mid`.
2. If `nums[mid]` equals the target, return `mid`.
3. At every iteration, identify which half of the array is sorted.
4. If the left half is sorted, check whether the target lies within the range of the left half.
5. If the target is in the left sorted half, search left; otherwise, search right.
6. If the right half is sorted, check whether the target lies within the range of the right half.
7. If the target is in the right sorted half, search right; otherwise, search left.
8. If the target is not found after the binary search, return `-1`.

---

## Algorithm

1. Initialize `low = 0` and `high = n - 1`.
2. While `low <= high`:

   * Calculate `mid`.
   * If `nums[mid] == target`, return `mid`.
   * Check whether the left half is sorted.
   * If the left half is sorted:

     * Check whether the target lies between `nums[low]` and `nums[mid]`.
     * If yes, move `high` to `mid - 1`.
     * Otherwise, move `low` to `mid + 1`.
   * Otherwise, the right half is sorted:

     * Check whether the target lies between `nums[mid]` and `nums[high]`.
     * If yes, move `low` to `mid + 1`.
     * Otherwise, move `high` to `mid - 1`.
3. Return `-1` if the target is not found.

---

## Time Complexity

**O(log n)**

* Binary search eliminates approximately half of the search space in every iteration.

## Space Complexity

**O(1)**

* Only constant extra variables are used.
