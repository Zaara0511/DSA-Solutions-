# Missing Multiple

## Difficulty

Easy

## Topic

HashSet, Arrays

## Problem

Given an integer array `nums` and an integer `k`, find the **smallest positive multiple of `k` that is not present in `nums`**.

### Input

```text
nums = [2, 3, 4, 6, 8]
k = 2
```

### Output

```text
10
```

### Explanation

The multiples of `2` are `2, 4, 6, 8, 10...`.

`2`, `4`, `6`, and `8` are present in the array, while `10` is missing. Therefore, the answer is `10`.

---

## Constraints

* `1 <= nums.length <= 100`
* `1 <= nums[i] <= 100`
* `1 <= k <= 100`

---

## Approach

1. Store all elements of the array in a HashSet.
2. Start checking from `k`.
3. If the current multiple exists in the set, move to the next multiple by adding `k`.
4. Continue until a multiple is not found.
5. Return the first missing multiple.

---

## Algorithm

1. Create a HashSet containing all elements of `nums`.
2. Initialize the answer as `k`.
3. While the answer exists in the HashSet, increase it by `k`.
4. Return the answer.

---

## Time Complexity

**O(n)** average.

## Space Complexity

**O(n)**.
