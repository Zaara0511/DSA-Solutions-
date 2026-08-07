# 189. Rotate Array

## Difficulty

Medium

## Topic

Array, Two Pointers

## Problem

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example 1

**Input**

```
nums = [1,2,3,4,5,6,7], k = 3
```

**Output**

```
[5,6,7,1,2,3,4]
```

### Example 2

**Input**

```
nums = [-1,-100,3,99], k = 2
```

**Output**

```
[3,99,-1,-100]
```

## Constraints

- `1 <= nums.length <= 10⁵`
- `-2³¹ <= nums[i] <= 2³¹ - 1`
- `0 <= k <= 10⁵`

---

## Approach

1. Calculate `k % n` to handle cases where `k` is greater than the array length.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n - k` elements.
5. The array is now rotated to the right by `k` positions.

---

## Algorithm

1. Find the length of the array `n`.
2. Update `k = k % n`.
3. Reverse the complete array.
4. Reverse the subarray from index `0` to `k - 1`.
5. Reverse the subarray from index `k` to `n - 1`.
6. The resulting array is the required rotated array.

---

## Time Complexity

**O(n)**

- Reversing the entire array takes **O(n)**.
- Reversing the first `k` elements takes **O(k)**.
- Reversing the remaining `n-k` elements takes **O(n-k)**.

Overall:

- **O(n + k + (n-k)) = O(2n) = O(n)**

---

## Space Complexity

**O(1)**

- The array is rotated in-place using only a temporary variable for swapping.