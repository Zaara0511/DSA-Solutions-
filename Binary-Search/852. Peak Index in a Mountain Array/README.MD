# 852. Peak Index in a Mountain Array

## Difficulty

Medium

## Topic

Array, Binary Search

## Problem

You are given an integer array `arr` that is guaranteed to be a **mountain array**.

A mountain array has the following properties:

* `arr.length >= 3`
* There exists an index `i` such that:

  * `arr[0] < arr[1] < ... < arr[i]`
  * `arr[i] > arr[i+1] > ... > arr[arr.length - 1]`

Return the index of the peak element.

### Example 1

**Input**

```text
arr = [0,1,0]
```

**Output**

```text
1
```

### Example 2

**Input**

```text
arr = [0,2,1,0]
```

**Output**

```text
1
```

### Example 3

**Input**

```text
arr = [0,10,5,2]
```

**Output**

```text
1
```

## Constraints

* `3 <= arr.length <= 10^5`
* `0 <= arr[i] <= 10^6`
* `arr` is guaranteed to be a mountain array.

---

## Approach

1. Since the array first increases and then decreases, the peak can be found using binary search.
2. Select the middle index `mid`.
3. Compare `arr[mid]` with `arr[mid + 1]`.
4. If `arr[mid] < arr[mid + 1]`, we are on the **increasing side**, so the peak must be to the right.
5. Therefore, move `low` to `mid + 1`.
6. Otherwise, `arr[mid] > arr[mid + 1]`, meaning we are on the **decreasing side** or at the peak.
7. Therefore, the peak can be at `mid` or somewhere to its left, so move `high` to `mid`.
8. When `low == high`, both pointers point to the peak index.

---

## Algorithm

1. Set `low = 0`.
2. Set `high = arr.length - 1`.
3. While `low < high`:

   * Calculate `mid = low + (high - low) / 2`.
   * If `arr[mid] < arr[mid + 1]`:

     * Set `low = mid + 1`.
   * Otherwise:

     * Set `high = mid`.
4. Return `low`.

---

## Time Complexity

**O(log n)**

* Binary search eliminates approximately half of the search space in every iteration.

## Space Complexity

**O(1)**

* Only `low`, `high`, and `mid` variables are used.
