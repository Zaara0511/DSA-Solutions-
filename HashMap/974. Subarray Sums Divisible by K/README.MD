# 974. Subarray Sums Divisible by K

## Difficulty

Medium

## Topic

Prefix Sum, HashMap, Remainder

## Problem

Given an integer array `nums` and an integer `k`, return the number of non-empty subarrays whose sum is divisible by `k`.

### Input

```text
nums = [4, 5, 0, -2, -3, 1]
k = 5
```

### Output

```text
7
```

## Constraints

* `1 <= nums.length <= 3 * 10^4`
* `-10^4 <= nums[i] <= 10^4`
* `2 <= k <= 10^4`

---

## Approach

1. Use **Prefix Sum** to calculate the running sum.
2. Instead of storing the complete prefix sum, store its **remainder when divided by `k`**.
3. If two prefix sums have the same remainder:

   ```text
   prefix1 % k == prefix2 % k
   ```

   then their difference is divisible by `k`:

   ```text
   (prefix2 - prefix1) % k == 0
   ```
4. Store the frequency of each remainder in a `HashMap`.
5. For every new remainder:

   * If it already exists in the map, add its frequency to the answer.
   * Then increase its frequency.
6. Java can produce negative remainders, so if:

   ```text
   r < 0
   ```

   add `k`:

   ```text
   r += k
   ```
7. Initialize:

   ```text
   map.put(0, 1)
   ```

   to handle subarrays starting from index `0`.

---

## Algorithm

1. Create a `HashMap` to store `remainder → frequency`.
2. Put `0 → 1` in the map.
3. Initialize `sum = 0` and `c = 0`.
4. Traverse every number in `nums`.
5. Add the number to `sum`.
6. Calculate:

   ```text
   r = sum % k
   ```
7. If `r` is negative, add `k`.
8. If `r` exists in the map, add its frequency to `c`.
9. Store/increase the frequency of `r`.
10. Return `c`.

---

## Key Logic

```text
Same remainder
      ↓
Difference of prefix sums is divisible by K
      ↓
That difference represents a valid subarray
```

## Time Complexity

**O(n)** — We traverse the array once.

## Space Complexity

**O(k)** — The HashMap stores at most `k` different remainders.
