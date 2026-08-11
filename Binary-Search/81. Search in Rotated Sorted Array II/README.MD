# 81. Search in Rotated Sorted Array II

## Difficulty

Medium

## Topic

Binary Search

## Problem

You are given an integer array `nums` sorted in non-decreasing order and rotated at an unknown position.

The array may contain duplicates.

Given a target value, return `true` if the target exists in the array. Otherwise, return `false`.

### Example 1

**Input**

```text
nums = [2,5,6,0,0,1,2], target = 0
```

**Output**

```text
true
```

### Example 2

**Input**

```text
nums = [2,5,6,0,0,1,2], target = 3
```

**Output**

```text
false
```

## Constraints

* `1 <= nums.length <= 5000`
* `-10^4 <= nums[i] <= 10^4`
* `nums` is sorted and rotated at an unknown position.
* `-10^4 <= target <= 10^4`

---

## Approach

1. Use binary search with `left` and `right` pointers.
2. Find the middle index `mid`.
3. If `nums[mid]` is equal to the target, return `true`.
4. If `nums[left]`, `nums[mid]`, and `nums[right]` are all equal, it is not possible to determine which half is sorted. Move both `left` and `right` inward.
5. Otherwise, check which half of the array is sorted.
6. If the left half is sorted, check whether the target lies within that range.
7. If it does, search the left half; otherwise, search the right half.
8. If the right half is sorted, check whether the target lies within that range and adjust the search boundaries accordingly.
9. Continue until the target is found or the search range becomes empty.

---

## Algorithm

1. Initialize `left = 0` and `right = nums.length - 1`.
2. While `left <= right`:

   * Calculate `mid`.
   * If `nums[mid] == target`, return `true`.
   * If `nums[left] == nums[mid] == nums[right]`, increment `left` and decrement `right`.
   * Otherwise, check if the left half is sorted.
   * If the left half is sorted:

     * If the target lies between `nums[left]` and `nums[mid]`, move `right` to `mid - 1`.
     * Otherwise, move `left` to `mid + 1`.
   * If the right half is sorted:

     * If the target lies between `nums[mid]` and `nums[right]`, move `left` to `mid + 1`.
     * Otherwise, move `right` to `mid - 1`.
3. If the loop ends without finding the target, return `false`.

---

## Time Complexity

**O(n)** in the worst case

* Normally, binary search reduces the search space by half, giving `O(log n)`.
* However, when many duplicate elements are present, `left` and `right` may need to be moved one step at a time.
* Therefore, the worst-case time complexity is `O(n)`.

---

## Space Complexity

**O(1)**

* Only `left`, `right`, and `mid` variables are used.
* No additional data structures are required.
