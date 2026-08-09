# Q1. Minimum Total Price After Applying Discounts

## Difficulty

Medium

## Topic

Array, Sorting, Greedy

## Problem

Given two integer arrays `prices` and `discounts`, assign discounts to items to minimize the total final price.

* Each discount can be applied to at most one item.
* Each item can receive at most one discount.
* An item may receive no discount.
* A discount of `d%` on an item with price `p` makes its final price:

`p * (100 - d) / 100`

Return the minimum possible total price.

## Examples

### Example 1

```text
Input: prices = [10,30,21], discounts = [50,60]
Output: 32.50000
```

Apply `60%` to `30` and `50%` to `21`.

### Example 2

```text
Input: prices = [100,70], discounts = [10,40,50]
Output: 92.00000
```

Apply `50%` to `100` and `40%` to `70`.

### Example 3

```text
Input: prices = [7,3,9], discounts = [100,100]
Output: 3.00000
```

Apply the two `100%` discounts to `9` and `7`.

## Constraints

* `1 <= prices.length, discounts.length <= 10^5`
* `1 <= prices[i] <= 10^5`
* `1 <= discounts[j] <= 100`

---

## Approach

To minimize the total price, we should maximize the total savings.

The saving from applying a discount `d` to a price `p` is:

`p * d / 100`

Therefore, a larger discount should be applied to a larger price.

1. Sort both `prices` and `discounts` in ascending order.
2. Start from the end of both arrays.
3. Pair the largest price with the largest discount.
4. Continue pairing while discounts are available.
5. If there are more prices than discounts, leave the remaining items unchanged.
6. Use `100.0` instead of `100` to avoid integer division.

## Algorithm

1. Sort `prices`.
2. Sort `discounts`.
3. Initialize `sum = 0`.
4. Use two indices:

   * `i = prices.length - 1`
   * `j = discounts.length - 1`
5. Traverse from right to left:

   * If `j >= 0`, apply `discounts[j]` to `prices[i]`.
   * Otherwise, add the original price.
   * Decrement both indices.
6. Return `sum`.

## Time Complexity

Sorting `prices` takes `O(p log p)`.

Sorting `discounts` takes `O(d log d)`.

The final loop takes `O(p)`.

Overall:

**O(p log p + d log d)**

If both arrays have size `n`, this becomes:

**O(n log n)**

## Space Complexity

**O(1)** auxiliary space.

Only a constant number of variables are used apart from the input arrays.
