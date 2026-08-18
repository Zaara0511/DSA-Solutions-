# 2064. Minimized Maximum of Products Distributed to Any Store

## Difficulty

Medium

## Topic

Array, Binary Search

## Problem

You are given `n` stores and an integer array `quantities`, where `quantities[i]` represents the number of products of the `ith` type.

You need to distribute all products among the `n` stores such that:

* Each store can receive products of at most one type.
* All products must be distributed.
* The goal is to minimize the maximum number of products given to any single store.

Return the minimum possible maximum number of products in any store.

### Example 1

**Input**

```text
n = 6
quantities = [11,6]
```

**Output**

```text
3
```

### Example 2

**Input**

```text
n = 7
quantities = [15,10,10]
```

**Output**

```text
5
```

## Constraints

* `1 <= n <= 10^5`
* `1 <= quantities.length <= 10^5`
* `1 <= quantities[i] <= 10^5`
* `quantities.length <= n`
* All products must be distributed.

---

## Approach

1. The answer represents the **maximum number of products allowed in any store**, so we can binary search on this value.
2. The smallest possible maximum is `1`.
3. The largest possible maximum is the largest value in `quantities`.
4. For a candidate `mid`, calculate how many stores are required if each store can hold at most `mid` products.
5. For each product type, the number of required stores is:
   `ceil(quantity / mid)`.
6. In integer arithmetic, ceiling division can be calculated using:
   `(quantity + mid - 1) / mid`.
7. Add the required stores for every product type.
8. If the total required stores is at most `n`, `mid` is possible, so try a smaller maximum.
9. Otherwise, `mid` is too small, so increase it.
10. The smallest feasible `mid` is the answer.

---

## Algorithm

1. Set `low = 1`.
2. Find the maximum value in `quantities` and set it as `high`.
3. While `low <= high`:

   * Calculate `mid`.
   * Call `check()` to determine whether all products can be distributed using at most `n` stores when each store holds at most `mid` products.
   * If `check()` returns `true`:

     * Store `mid` as `ans`.
     * Search the smaller values by setting `high = mid - 1`.
   * Otherwise:

     * Search larger values by setting `low = mid + 1`.
4. Return `ans`.

### Check Function

1. Initialize `sum = 0` to track the number of stores required.
2. For every quantity:

   * Calculate the number of stores needed using ceiling division.
   * Add it to `sum`.
3. Return `true` if `sum <= n`.
4. Otherwise, return `false`.

---

## Time Complexity

**O(q log M)**

* `q` is the number of product types (`quantities.length`).
* `M` is the maximum quantity.
* Each binary-search iteration scans all product types: `O(q)`.
* Binary search takes `O(log M)` iterations.

## Space Complexity

**O(1)**

* Only a constant number of variables are used.
