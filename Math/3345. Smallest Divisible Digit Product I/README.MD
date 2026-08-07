
# 3345. Smallest Divisible Digit Product I

## Difficulty

Easy

## Topic

Math, Brute Force

## Problem

You are given two integers `n` and `t`.

Find the smallest integer greater than or equal to `n` such that the **product of its digits** is divisible by `t`.

Return that integer.

### Example 1

**Input**

```
n = 10, t = 2
```

**Output**

```
10
```

### Example 2

**Input**

```
n = 15, t = 3
```

**Output**

```
16
```

## Constraints

- `1 <= n <= 100`
- `1 <= t <= 10`

---

## Approach

1. Start checking from the given number `n`.
2. Calculate the product of all digits of the current number.
3. If the product is divisible by `t`, return the current number.
4. Otherwise, increment the number and repeat the process until a valid number is found.

---

## Algorithm

1. Initialize the current number as `n`.
2. Repeat until a valid number is found:
   - Store the current number in a temporary variable.
   - Calculate the product of all its digits.
   - Check if the product is divisible by `t`.
   - If yes, return the current number.
   - Otherwise, increment the current number.
3. Continue until the answer is found.

---

## Time Complexity

**O(k × d)**

- `k` = Number of integers checked before finding the answer.
- `d` = Number of digits in each integer.

---

## Space Complexity

**O(1)**

- Only a few extra variables are used.