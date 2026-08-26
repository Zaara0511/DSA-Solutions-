# 560. Subarray Sum Equals K

## Difficulty

Medium

## Topic

Prefix Sum, HashMap

## Problem

Given an integer array `nums` and an integer `k`, find the total number of **subarrays** whose sum is equal to `k`.

### Input

```text
nums = [1, 1, 1]
k = 2
```

### Output

```text
2
```

There are two subarrays with sum `2`:

```text
[1, 1]
[1, 1]
```

## Constraints

* `1 <= nums.length <= 2 * 10^4`
* `-1000 <= nums[i] <= 1000`
* `-10^7 <= k <= 10^7`

---

## Approach

1. Use **Prefix Sum** to keep track of the sum of elements seen so far.
2. Store each prefix sum and its **frequency** in a `HashMap`.
3. For every element, calculate the current prefix sum.
4. To find a subarray with sum `k`, check whether:

   ```text
   sum - k
   ```

   has appeared before.
5. If it exists, add its frequency to the answer:

   ```text
   c += map.get(sum - k)
   ```
6. Store the current prefix sum in the map.
7. Initialize the map with:

   ```text
   map.put(0, 1)
   ```

   This handles subarrays that start from index `0`.

---

## Algorithm

1. Create a `HashMap` to store `prefixSum → frequency`.
2. Put `0 → 1` into the map.
3. Initialize `sum = 0` and `c = 0`.
4. Traverse the array.
5. Add the current element to `sum`.
6. Check if `sum - k` exists in the map.
7. If it exists, add its frequency to `c`.
8. Increase the frequency of the current `sum`.
9. Return `c`.

---

## Time Complexity

**O(n)** — We traverse the array once.

## Space Complexity

**O(n)** — The HashMap can store up to `n` different prefix sums.
