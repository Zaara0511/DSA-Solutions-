# 1482. Minimum Number of Days to Make m Bouquets

## Difficulty

Medium

## Topic

Array, Binary Search

## Problem

You are given an integer array `bloomDay`, where `bloomDay[i]` represents the day the `ith` flower will bloom.

You need to make `m` bouquets. Each bouquet requires exactly `k` **adjacent flowers**, and each flower can be used in only one bouquet.

Return the minimum number of days you need to wait to make `m` bouquets.

If it is impossible to make `m` bouquets, return `-1`.

### Example 1

**Input**

```text
bloomDay = [1,10,3,10,2], m = 3, k = 1
```

**Output**

```text
3
```

### Example 2

**Input**

```text
bloomDay = [1,10,3,10,2], m = 3, k = 2
```

**Output**

```text
-1
```

### Example 3

**Input**

```text
bloomDay = [7,7,7,7,12,7,7], m = 2, k = 3
```

**Output**

```text
12
```

## Constraints

* `bloomDay.length == n`
* `1 <= n <= 10^5`
* `1 <= bloomDay[i] <= 10^9`
* `1 <= m <= 10^6`
* `1 <= k <= n`

---

## Approach

1. The answer is a **number of days**, so use binary search on the possible number of days.
2. The smallest possible day is `1`.
3. The largest possible day is the maximum value in `bloomDay`.
4. For a particular `mid` day, check whether at least `m` bouquets can be made.
5. While checking, a flower is considered available if `bloomDay[i] <= mid`.
6. Maintain a count of consecutive bloomed flowers.
7. Whenever the consecutive count reaches `k`, form one bouquet and reset the count because each flower can only be used once.
8. If an unbloomed flower is encountered, reset the consecutive count because the flowers must be adjacent.
9. If the number of bouquets is at least `m`, `mid` is a possible answer, so search for fewer days.
10. Otherwise, search for more days.
11. If `m * k > n`, there are not enough flowers to make the required bouquets, so return `-1`.

---

## Algorithm

1. If `m * k > bloomDay.length`, return `-1`.
2. Set `low = 1`.
3. Find the maximum value in `bloomDay` and set it as `high`.
4. While `low <= high`:

   * Calculate `mid`.
   * Use `check()` to determine whether `m` bouquets can be made by day `mid`.
   * If possible:

     * Store `mid` as the current answer.
     * Search the left half by setting `high = mid - 1`.
   * Otherwise:

     * Search the right half by setting `low = mid + 1`.
5. Return `ans`.

### Check Function

1. Initialize `flowers = 0` and `bouquets = 0`.
2. Traverse the `bloomDay` array.
3. If `bloomDay[i] <= mid`, increment the consecutive flower count.
4. If `flowers == k`, one bouquet can be formed:

   * Increment `bouquets`.
   * Reset `flowers` to `0`.
5. If `bloomDay[i] > mid`, reset `flowers` to `0` because adjacency is broken.
6. Return `true` when `bouquets >= m`.

---

## Time Complexity

**O(n log(max(bloomDay)))**

* Each binary-search iteration scans the entire array: `O(n)`.
* Binary search takes `O(log(max(bloomDay)))` iterations.

## Space Complexity

**O(1)**

* Only a few variables are used regardless of the input size.
